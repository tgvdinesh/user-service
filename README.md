# User Management
This project is all about user management. 
For example 
1. Authentication & Authorization
2. Profile management. Ex: Photo change etc
3. Role based authentication
4. Admin page for user management.

# Pre requisites
1. Make sure you have docker up and running
2. Run init script
3. Database 
~~~
docker stop mysql-user-management
docker rm mysql-user-management
docker-compose up -d
mvn clean install spring-boot:run
~~~

# Road map
- [X] Add Spring Boot dependency
- [X] Add Database dependency
- [X] Add MySQL JPA
- [X] Add Swagger API Documentation
- [X] Add init script for unix
- [ ] Pagination to get user data
- [ ] Add ELK for logging
- [ ] Use [Petstore Swagger UI](http://petstore.swagger.io/)
- [ ] [Move Swagger configuration to yml file](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#info-object-example)
- [ ] Add test case for getting user
- [ ] [Docker structure](https://github.com/deviantony/docker-elk)
- [ ] Create user API
- [ ] Authentication
- [ ] Authorization
- [ ] OAuth
- [ ] Authenticate & Authorize Swagger API