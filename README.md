# Especialista Spring REST

## Conteúdo programático 📖

### 1. Introdução
1.1. Introdução ao treinamento
1.2. Como usar o suporte da AlgaWorks
1.3. Por que desenvolver REST APIs?
1.4. Conhecendo o modelo de domínio do projeto do curso
1.5. Preparando o ambiente de desenvolvimento: JDK e STS for Eclipse

### 2. Spring e Injeção de Dependências
2.1. Por que aprender e usar Spring?
2.2. Conhecendo o ecossistema Spring
2.3. Spring vs Jakarta EE (Java EE)
2.4. Conhecendo o Spring Boot
2.5. Criando um projeto Spring Boot com Spring Initialize
2.6. Conhecendo o Maven e o pom.xml de um projeto Spring Boot
2.7. Criando um controller com Spring MVC
2.8. Restart mais rápido da aplicação com DevTools
2.9. O que é injeção de dependências?
2.10. Conhecendo o IoC Container do Spring
2.11. Definindo beans com @Component
2.12. Injetando dependências (beans Spring)
2.13. Usando @Configuration e @Bean para definir beans
2.14. Conhecendo os pontos de injeção e a anotação @Autowired
2.15. Dependência opcional com @Autowired
2.16. Ambiguidade de beans e injeção de lista de beans
2.17. Desambiguação de beans com @Primary
2.18. Desambiguação de beans com @Qualifier
2.19. Desambiguação de beans com anotação customizada
2.20. Mudando o comportamento da aplicação com Spring Profiles
2.21. Criando métodos de callback do ciclo de vida dos beans
2.22. Publicando e consumindo eventos customizados
2.23. Configurando projetos Spring Boot com o application.properties
2.24. Substituindo propriedades via linha de comando e variáveis de ambiente
2.25. Criando e acessando propriedades customizadas com @Value
2.26. Acessando propriedades com @ConfigurationProperties
2.27. Alterando a configuração do projeto dependendo do ambiente (com Spring Profiles)
2.28. Ativando o Spring Profile por linha de comando e variável de ambient

### 3. Introdução ao JPA e Hibernate
3.1. Instalando o MySQL Server e MySQL Workbench
3.2. O que é JPA e Hibernate?
3.3. Adicionando JPA e configurando o Data Source
3.4. Mapeando entidades com JPA
3.5. Criando as tabelas do banco a partir das entidades
3.6. Mapeando o id da entidade para autoincremento
3.7. Importando dados de teste com import.sql
3.8. Consultando objetos do banco de dados
3.9. Adicionando um objeto no banco de dados
3.10. Buscando um objeto pelo id no banco de dados
3.11. Atualizando um objeto no banco de dados
3.12. Excluindo um objeto do banco de dados
3.13. Conhecendo o padrão Aggregate do DDD
3.14. Conhecendo e implementando o padrão Repository
3.15. Conhecendo e usando o Lombok
3.16. Desafio: Lombok e repositório de restaurantes
3.17. Mapeando relacionamento com @ManyToOne
3.18. A anotação @JoinColumn
3.19. Propriedade nullable de @Column e @JoinColumn
3.20. Desafio: mapeando entidades

### 4. REST com Spring
4.1. O que é REST?
4.2. Conhecendo as constraints do REST
4.3. Diferença entre REST e RESTful
4.4. Desenvolvedores de REST APIs puristas e pragmáticos
4.5. Conhecendo o protocolo HTTP
4.6. Usando o protocolo HTTP
4.7. Instalando e testando o Postma
4.8. Entendendo o que são Recursos REST
4.9. Identificando recursos REST
4.10. Modelando e requisitando um Collection Resource com GET
4.11. Desafio: collection resource de estados
4.12. Representações de recursos e content negotiation
4.13. Implementando content negotiation para retornar JSON ou XML
4.14. Consultando Singleton Resource com GET e @PathVariable
4.15. Customizando as representações XML e JSON com @JsonIgnore, @JsonProperty e @JsonRootName
4.16. Customizando a representação em XML com Wrapper e anotações do Jackson1
4.17. Conhecendo os métodos HTT
4.18. Conhecendo os códigos de status HTTP
4.19. Definindo o status da resposta HTTP com @ResponseStatus
4.20. Manipulando a resposta HTTP com ResponseEntity1
4.21. Corrigindo o Status HTTP para resource inexistente
4.22. Status HTTP para collection resource vazia: qual usar?
4.23. Modelando e implementando a inclusão de recursos com POST
4.24. Negociando o media type do payload do POST com Content-Type
4.25. Modelando e implementando a atualização de recursos com PUT1
4.26. Modelando e implementando a exclusão de recursos com DELETE
4.27. Implementando a camada de domain services (e a importância da linguagem ubíqua)
4.28. Refatorando a exclusão de cozinhas para usar domain services
4.29. Desafio: modelando e implementando a consulta de recursos de restaurantes
4.30. Modelando e implementando a inclusão de recursos de restaurantes2
4.31. Desafio: Modelando e implementando a atualização de recursos de restaurante
4.32. Desafio: implementando serviços REST de cidades e estados
4.33. Analisando solução para atualização parcial de recursos com PATCH1
4.34. Finalizando a atualização parcial com a API de Reflections do Spring
4.35. Introdução ao Modelo de Maturidade de Richardson (RMM)
4.36. Conhecendo o nível 0 do RMM
4.37. Conhecendo o nível 1 do RMM
4.38. Conhecendo o nível 2 do RMM
4.39. Conhecendo o nível 3 do RMM

### 5. Super poderes do Spring Data JPA
5.1. Implementando consultas JPQL em repositórios
5.2. Conhecendo o projeto Spring Data JPA (SDJ)
5.3. Criando um repositório com Spring Data JPA (SDJ)
5.4. Refatorando o código do projeto para usar o repositório do SDJ
5.5. Desafio: refatorando todos os repositórios para usar SDJ
5.6. Criando consultas com query methods
5.7. Usando as keywords para definir critérios de query methods
5.8. Conhecendo os prefixos de query methods
5.9. Usando queries JPQL customizadas com @Query
5.10. Externalizando consultas JPQL para um arquivo XML
5.11. Implementando um repositório SDJ customizado
5.12. Implementando uma consulta dinâmica com JPQL
5.13. Implementando uma consulta simples com Criteria API
5.14. Adicionando restrições na cláusula where com Criteria API
5.15. Tornando a consulta com Criteria API com filtros dinâmicos
5.16. Conhecendo o uso do padrão Specifications (DDD) com SDJ
5.17. Implementando Specifications com SDJ
5.18. Criando uma fábrica de Specifications
5.19. Injetando o próprio repositório na implementação customizada e a anotação @Lazy
5.20. Estendendo o JpaRepository para customizar o repositório

### 6. Explorando mais do JPA e Hibernate
6.1. Mapeando relacionamento bidirecional com @OneToMany
6.2. Mapeando relacionamento muitos-para-muitos com @ManyToMany
6.3. Analisando o impacto do relacionamento muitos-para-muitos na REST API
6.4. Mapeando classes incorporáveis com @Embedded e @Embeddable8
6.5. Testando e analisando o impacto da incorporação de classe na REST API
6.6.  propriedades com @CreationTimestamp e @UpdateTimestamp
6.7. Desafio: mapeando relacionamento muitos-para-um
6.8. Desafio: mapeando relacionamento um-para-muitos
6.9. Desafio: mapeando relacionamentos muitos-para-muitos5
6.10. Entendendo o Eager Loading
6.11. Entendendo o Lazy Loading
6.12. Alterando a estratégia de fetching para Lazy Loading
6.13. Alterando a estratégia de fetching para Eager Loading
6.14. Resolvendo o Problema do N+1 com fetch join na JPQL

### 7. Pool de conexões e Flyway
7.1. Entendendo o funcionamento de um pool de conexões
7.2. Conhecendo o Hikari: a solução padrão de pool de conexões no Spring Boot
7.3. Configurando o pool de conexões do Hikari
7.4. Schema generation em produção não é uma boa prática
7.5. Flyway: ferramenta de versionamento de schemas de banco de dados
7.6. Adicionando o Flyway no projeto e criando a primeira migração
7.7. Evoluindo o banco de dados com novas migrações
7.8. Criando migrações complexas com remanejamento de dados
7.9. Criando migração a partir de DDL gerado por schema generation
7.10. Adicionando dados de testes com callback do Flyway
7.11. Reparando migrações com erros
7.12. Desafio: Criando migrações e mapeando as entidades Pedido e ItemPedido

### 8. Tratamento e modelagem de erros da API
8.1. Introdução ao tratamento e modelagem de erros
8.2. Lançando exceções customizadas anotadas com @ResponseStatus
8.3. Lançando exceções do tipo ResponseStatusException
8.4. Estendendo ResponseStatusException
8.5. Simplificando o código com o uso de @ResponseStatus em exceptions
8.6. Desafio: refatorando os serviços REST
8.7. Analisando os impactos da refatoração
8.8. Criando a exception NegocioException
8.9. Desafio: usando a exception NegocioException
8.10. Afinando a granularidade e definindo a hierarquia das exceptions de negócios
8.11. Desafio: lançando exceptions de granularidade fina
8.12. Tratando exceções em nível de controlador com @ExceptionHandler
8.13. Tratando exceções globais com @ExceptionHandler e @ControllerAdvi
8.14. Desafio: implementando exception handle
8.15. Criando um exception handler global com ResponseEntityExceptionHandle
8.16. Customizando o corpo da resposta padrão de ResponseEntityExceptionHandler
8.17. Conhecendo a RFC 7807 (Problem Details for HTTP APIs)
8.18. Padronizando o formato de problemas no corpo de respostas com a RFC 780
8.19. Desafio: usando o formato de problemas no corpo de resposta
8.20. Customizando exception handlers de ResponseEntityExceptionHandle
8.21. Tratando a exception InvalidFormatException na desserialização
8.22. Habilitando erros na desserialização de propriedades inexistentes ou ignorada
8.23. Desafio: tratando a PropertyBindingException na desserializaçã
8.24. Lançando exception de desserialização na atualização parcial (PATCH)
8.25. Desafio: tratando exception de parâmetro de URL inválid
8.26. Desafio: tratando a exceção NoHandlerFoundExceptio
8.27. Desafio: tratando outras exceções não capturada
8.28. Estendendo o formato do problema para adicionar novas propriedades
8.29. Desafio: estendendo o formato do problema

### 9. Validações com Bean Validation
9.1. Validação do modelo com Bean Validation
9.2. Adicionando constraints e validando no controller com @Valid
9.3. Desafio: tratando exception de violação de constraints de validação
9.4. Estendendo o Problem Details para adicionar as propriedades com constraints violadas
9.5. Conhecendo e adicionando mais constraints de validação no modelo
9.6. Validando as associações de uma entidade em cascata
9.7. Agrupando e restringindo constraints que devem ser usadas na validação
9.8. Convertendo grupos de constraints para validação em cascata com @ConvertGroup
9.10. Desafio: adicionando constraints de validação no modelo
9.11. Customizando mensagens de validação na anotação da constraint
9.12. Customizando e resolvendo mensagens de validação globais em Resource Bundle
9.13. Desafio: customizando mensagens de validação
9.14. Resolvendo mensagens de validação com Resource Bundle do Bean Validation
9.15. Usando o Resource Bundle do Spring como Resource Bundle do Bean Validation
9.16. Criando constraints de validação customizadas usando composição
9.17. Criando constraints de validação customizadas com implementação de ConstraintValidator
9.18. Criando constraints de validação customizadas em nível de classe
9.19. Ajustando Exception Handler para adicionar mensagens de validação em nível de classe
9.20. Executando processo de validação programaticamente
9.21. Desafio: tratando a exception customizada de validações programáticas

### 10. Testes de integração
10.1. Introdução aos Testes de Integração e Testes de APIs
10.2. Preparando o projeto para testes de integração
10.3. Criando e rodando um teste de integração com Spring Boot, JUnit e AssertJ
10.4. Escrevendo bons nomes de testes
10.5. Desafio: escrevendo testes de integração
10.6. Rodando os testes pelo Maven
10.7. Configurando Maven Failsafe Plugin no projeto
10.8. Implementando Testes de API com REST Assured e validando o código de status HTTP
10.9. Validando o corpo da resposta HTTP
10.10. Criando um método para fazer setup dos testes
10.11. Entendendo o problema da ordem de execução dos testes
10.12. Voltando o estado inicial do banco de dados para cada execução de teste com callback do Flyway
10.13. Configurando um banco de testes e usando @TestPropertySource
10.14. Limpando e populando o banco de dados de teste
10.15. Testando endpoint passando parâmetro de URL
10.16. Desafio: refatorando o código de testes
10.17. Desafio: escrevendo testes de API