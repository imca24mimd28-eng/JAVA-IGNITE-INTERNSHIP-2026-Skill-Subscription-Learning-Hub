# Viva / Interview Questions

##  Basic

- What is Spring Boot?
- Spring Boot is a Java framework used to create web applications quickly with less configuration.
- What is MVC architecture?
MVC stands for Model, View, and Controller.

Model → Handles data
View → Displays data
Controller → Handles user requests
---

##  Intermediate

- What is Service layer?
- Service Layer contains business logic and acts as a bridge between Controller and Repository.
- What is Repository in Spring Data JPA?
- Repository is used to interact with the database and perform CRUD operations.
- Difference between GET and POST?
- | GET                 | POST                         |
| ------------------- | ---------------------------- |
| Used to fetch data  | Used to save data            |
| Data is sent in URL | Data is sent in request body |
| More secure         | Less visible in URL          |


---

##  Advanced (Project Based)

- How does subscription flow work?
- User selects a subscription → Request goes to Controller → Service processes it → Repository saves it in Database → Response is returned to user.
- How do you link User and SkillPack?
- Using relationships like @OneToMany or @ManyToOne in JPA.
- Why do we use Service layer?
- To keep business logic separate from Controller and make code easier to manage.
- How does JSP get data from Controller?
- Controller sends data using Model object, and JSP displays that data on the web page.
