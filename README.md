# ROLE AND PERMISSIONS BASED API WITH SPRING BOOT

A spring boot application project that has roles with each role assigned different permissions and jwt authenticated REST APIs, with a mysql database

##### Requirements
For building and running the application you need:

* JDK 11
* Maven
* MySql

##### Running the application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the com.samdev.mulikevs.RolebasedJwtApplication class from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:

Build the project using ``` mvn clean install ```

Run using ``` mvn spring-boot:run ```

The application is accessible via localhost:8080


##### ROLES
The API has the below ROLES;
* USER,
* ADMIN,
* API

###### API Credentials
* USER
> email: user@test.com
> password: test123

* ADMIN
> email: admin@test.com
> password: test123

* API
> email: api@test.com
> password: test123

###### JWT
* Sample JWT that is received on login

> eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkB0ZXN0LmNvbSIsInJvbGUiOiJBRE1JTklTVFJBVE9SX1JPTEUiLCJleHAiOjE2Nzc3NDI2MzksImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iLCJST0xFX1VTRVJNR01UIl0sInVzZXJuYW1lIjoiQWRtaW4ifQ.qL_N1XMHQDHjKEZwR-bA3NcDsM_py5R-IFpXRwDTE5o

* Broken down JWT Response

 > {"header": {"typ":"JWT","alg":"HS256"}, "payload": {"sub":"admin@test.com","role":"ADMINISTRATOR_ROLE","exp":1677742639,"authorities":["ROLE_ADMIN","ROLE_USERMGMT"],"username":"Admin"}}


