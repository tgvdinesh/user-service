# User Management
This project is all about user management. 
For example 
1. Authentication & Authorization
2. Profile management. Ex: Modifying personal data
3. Role based authentication
4. Admin page for user management.

# Pre requisites
1. Make sure you have docker up and running
2. Run init script

~~~
sh ./metaData/script/init.sh 
mvn clean install spring-boot:run
~~~

# Road map
- [X] Add Spring Boot dependency
- [X] Add Database dependency
- [X] Add MySQL JPA
- [X] Add init script for unix
- [X] Add [Swagger API Documentation](http://localhost:8080/swagger-ui.html)
- [ ] Use [new Swagger implementation](https://springfox.github.io/springfox/docs/current/) 
- [ ] Use [Petstore Swagger UI](http://petstore.swagger.io/)
- [ ] [Move Swagger configuration to yml file](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#info-object-example)
- [ ] Authenticate & Authorize of Swagger API
- [ ] Authentication
- [ ] Authorization
- [ ] OAuth
- [ ] Add ELK for logging
- [ ] [Elastic search node replica](http://chrissimpson.co.uk/elasticsearch-yellow-cluster-status-explained.html)
- [ ] Add test case for getting user
- [ ] Admin -> Pagination to get user data
- [ ] [Docker structure](https://github.com/deviantony/docker-elk)
- [ ] Create user API