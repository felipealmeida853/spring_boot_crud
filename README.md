# spring_boot_crud
Repositório com CRUD feito utilizando o freamework Spring Boot.

#Instruções para executar o projeto.

Requirements:
Docker
Docker-Compose
Maven

Para rodar o ambiente execute:
mvn clean install

Espere o build do .jar e rode:
docker-compose up --build --force-recreate


Se quiser debugar pelo ide da intellij crie um ambiente de debug remoto e conecte o mesmo na porta 5005.



Obs.
Provavelmente não precisará executar o script de banco, pois estou enviando o volume do banco compartilhado.

Na pasta tambem contem uma collection do postman que pode ser utilizada para testar as rotas.
