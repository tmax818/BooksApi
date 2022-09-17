# Books API

## Models

> the Model is responsible for managing the application's business logic and data.

- Model(is in the M of MVC) consists of the **Service Layer (SL)** and the **Persistence Layer (PL)**

## JPA - Java Persistence API

>you only need to add two new dependencies for this:
> - Spring Boot Spring Data JPA starter (JPA)
> - Java Mysql Connector (MySQL)

## Connecting to MySQL
- adding this:

```
spring.datasource.url=jdbc:mysql://localhost:3306/book_schema
spring.datasource.username=root
spring.datasource.password=rootroot
spring.jpa.hibernate.ddl-auto=update
```

to [application.properties](./src/main/resources/application.properties) allowed app to start w/o error

- added:

```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency> 
```

to [pom.xml](pom.xml) jic

## Domain Model

>The domain model is simply a Java Bean that represents our "business data," or the information that we want about a particular thing.

- create a model class: [Book.java](./src/main/java/tylermaxwell/booksapi/models/Book.java)

## Repositories

>Data repositories are where we gain access to all our data once we start talking with the database.

- create an interface: [BookRepository](src/main/java/tylermaxwell/booksapi/repositories/BookRepository.java)

## Services

> Services are the business logic of our application. For example: a controller should never be doing something like creating 5 books.