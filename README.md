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
- [ ] Add init script for unix
- [ ] Use [Petstore Swagger UI](http://petstore.swagger.io/)
- [ ] Add test case for getting user
- [ ] Create user API
- [ ] Authentication
- [ ] Authorization
- [ ] OAuth
- [ ] Authenticate & Authorize Swagger API