package com.exercio.exercicio_3.controller;

import com.exercio.exercicio_3.controller.dto.ClienteRs;
import com.exercio.exercicio_3.controller.dto.ClienteRq;
import com.exercio.exercicio_3.model.Cliente;
import com.exercio.exercicio_3.repository.ClienteRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository ) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping(value = "/",produces=MediaType.APPLICATION_XML_VALUE)
    public List<ClienteRs> findAll() {
         List<Cliente> pessoas = clienteRepository.findAll();
        return pessoas
                .stream()
                .map(ClienteRs::converter)
                .collect(Collectors.toList());
    }


    @GetMapping(value="/{id}",produces=MediaType.APPLICATION_XML_VALUE)
    public ClienteRs findById(@PathVariable("id") Long id) {
         Cliente cliente = clienteRepository.getOne(id);
        return ClienteRs.converter(cliente);
    }


    @GetMapping(value="/find/{nome}",produces=MediaType.APPLICATION_XML_VALUE )
    public List<ClienteRs> findByNome(@PathVariable("nome") String nome) {
        List<Cliente> clientes = clienteRepository.findByNome(nome);
        return clientes
                .stream()
                .map(ClienteRs::converter)
                .collect(Collectors.toList());
    }

    @PostMapping("/")
    public void savePerson(@RequestBody ClienteRq pessoa) {
        Cliente cliente = new Cliente();
        cliente.setNome(pessoa.getNome());
        cliente.setSobrenome(pessoa.getSobrenome());
        cliente.setEndereco(pessoa.getEndereco());
        cliente.setCidade_id(pessoa.getCidade_id());
        cliente.setEndereco(pessoa.getEndereco());
        cliente.setData_nascimento(pessoa.getData_nascimento());
        cliente.setLimite_credito(pessoa.getLimite_credito());
        clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody ClienteRq pessoa) throws Exception {
        Optional<Cliente> cliente = clienteRepository.findById(id);

        if (cliente.isPresent()) {
            Cliente clienteSave = cliente.get();
            clienteSave.setNome(pessoa.getNome());
            clienteSave.setSobrenome(pessoa.getSobrenome());
            clienteSave.setCidade_id(pessoa.getCidade_id());
            clienteSave.setEndereco(pessoa.getEndereco());
            clienteSave.setData_nascimento(pessoa.getData_nascimento());
            clienteSave.setLimite_credito(pessoa.getLimite_credito());
            clienteRepository.save(clienteSave);
        } else {
            throw new Exception("Cliente Não encontrado");
        }
    }

    @DeleteMapping("/{id}")
    public void  deletePerson(@PathVariable("id") Long id) {
        clienteRepository.deleteById(id);
    }
}
