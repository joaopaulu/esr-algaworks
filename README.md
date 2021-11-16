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