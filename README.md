# User Management
This project is all about user management. 
For example 
1. Authentication & Authorization
2. Profile management. Ex: Photo change etc
3. Role based authentication
4. Admin page for user management.

# Database
Make sure you have docker up and running. Manually import the DDL from resources directory

~~~
docker stop mysql-user-management
docker rm mysql-user-management
docker-compose up -d
~~~

# Road map
- [X] Add Spring Boot dependency
- [X] Add Database dependency
- [ ] Create user API
- [ ] Authentication
- [ ] Authorization
- [ ] OAuth