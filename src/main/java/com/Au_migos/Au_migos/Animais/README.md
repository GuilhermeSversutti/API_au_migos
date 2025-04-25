# API de Cadastro de Animais

📝 **Descrição**  
Esta API permite o gerenciamento de informações sobre animais, incluindo funcionalidades como cadastro, listagem, atualização e remoção. Foi construída utilizando Java com Spring Boot, com persistência em banco de dados local H2.

---

🚀 **Tecnologias Utilizadas**  
- Java 17  
- Spring Boot  
- Maven  
- H2 Database (local)

---

🎯 **Objetivo**  
Gerenciar dados de animais, como nome, espécie, raça, idade, sexo, entre outras informações, com persistência em banco de dados e estrutura organizada em camadas.

---

🧱 **Estrutura do Projeto**

src/  
├── controller/  
│   └── ControllerAnimais.java  
├── dto/  
│   └── CadastroAnimaisDTO.java  
├── mapper/  
│   └── AnimaisMapper.java  
├── model/  
│   └── ModelCadastro.java  
├── repository/  
│   └── RepositoryAnimal.java  
├── service/  
│   ├── AnimalService.java  
│   └── impl/  
│       └── AnimalServiceImpl.java  

---

📦 **Componentes do Projeto**

### Controller

- `ControllerAnimais.java`: Expõe os endpoints da API e lida com as requisições HTTP.

### DTO

- `CadastroAnimaisDTO.java`: Objeto usado para transportar os dados dos animais entre as camadas.

### Mapper

- `AnimaisMapper.java`: Responsável pela conversão entre `CadastroAnimaisDTO` e `ModelCadastro`.

### Model

- `ModelCadastro.java`: Entidade mapeada para o banco de dados. Contém os seguintes campos:

```java
private Long id;
private String nameAnimal;
private String tipoDeAnimal;
private String racaDoAnimal;
private int idadeAnimal;
private char sexoAnimal;
private int pesoAnimal;
private String corAnimal;
private String dataDeAdoacao;
private boolean vacina;
private boolean castrado;
private String notaAnimal;
```

### Repository

- `RepositoryAnimal.java`: Interface que estende JpaRepository, responsável pela comunicação com o banco de dados.

### Service

- `AnimalService.java`: Interface com as definições dos métodos de serviço.  
- `AnimalServiceImpl.java`: (localizado em `service/impl`) Implementação dos métodos da interface com a lógica de negócio.

---

💾 **Banco de Dados H2**

A API utiliza banco de dados em memória H2.