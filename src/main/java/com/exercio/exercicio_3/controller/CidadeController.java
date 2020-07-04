package com.exercio.exercicio_3.controller;

import com.exercio.exercicio_3.controller.dto.CidadeRq;
import com.exercio.exercicio_3.controller.dto.CidadeRs;
import com.exercio.exercicio_3.model.Cidade;
import com.exercio.exercicio_3.repository.CidadeRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    private final CidadeRepository cidadeRepository;

    public CidadeController(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    @GetMapping(value="/",produces= MediaType.APPLICATION_XML_VALUE)
    public List<CidadeRs> findAll() {
        List<Cidade> cidades = cidadeRepository.findAll();
        return cidades
                .stream()
                .map(CidadeRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping(value="/estado/{estado}",produces=MediaType.APPLICATION_XML_VALUE)
    public List<CidadeRs> findByNome(@PathVariable("estado") String estado) {
        List<Cidade> cidades = cidadeRepository.findByEstado(estado);
        return cidades
                .stream()
                .map(CidadeRs::converter)
                .collect(Collectors.toList());
    }

    @PostMapping("/")
    public void savePerson(@RequestBody CidadeRq cidadeRq) {
        Cidade cidade = new Cidade();
        cidade.setNome(cidadeRq.getNome());
        cidade.setEstado(cidadeRq.getEstado());
        cidadeRepository.save(cidade);
    }

}
