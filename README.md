# Getting Started
* Create project  https://start.spring.io/
  * Project : Maven
  * Language : Java
  * Spring Boot : 3.3.4
  * Packaging : Jar
  * Java : 23
  * Dependencies
    * MySQL Driver
    * Spring Data JPA

* Setting database : resources → application.properties
  * spring.datasource.url=jdbc:mysql://address:port/(database_name)
  * spring.datasource.username=root
  * spring.datasource.password=
  * spring.jpa.hibernate.ddl-auto=update

#### Checkpoint : Run application, if application does not show error that mean application can connect the database

* Create Entity Class
  * Create entity package
  * Create entity class
    * Add @Entity
    * Add @Table(name = 'account') above class
    * Add class property
      * Id, email, balance
    * Add default Constructor & Constructor with field
    * Add Getter & Setter & ToString() method
* Create Repository Class
  * Create repository package
  * Create repository structure (interface) : DAO
    * Method
      * create
      * get & getAll
      * update
      * delete
  * Create repository class by use implement abstract method DAO
    * Add @Repository above class name
    * Add EntityManager & Add constructor
    * Add @Transactional if method affect to database
