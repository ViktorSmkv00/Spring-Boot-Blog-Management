# Blog Management System

 A REST API built with Spring Boot used for managing a blog, allowing users to create, retrieve, delete and search blog posts. Features include REST APIs, Tomcat hosting, and integration with Postman for testing CRUD operations. 
 
- **Create New Posts**: 
- **Retrieve All Posts**:
- **Delete Posts**: 
- **Search Posts**: 

## Technologies Used

- **Java**: Developed using Java programming language.
- **Spring Boot**: Leveraged Spring Boot framework for rapid application development.
- **Tomcat**: Hosted the application on Tomcat server.
- **RESTful API**: Implemented RESTful APIs to enable communication with the application.
- **Postman**: Tested CRUD operations using Postman for API testing.

## Getting Started

### Prerequisites

- Java JDK 8 or higher installed on your system
- Maven build tool installed
- Apache Tomcat installed

   The application will be hosted on Tomcat at [http://localhost:8080](http://localhost:8080).

2. Use Postman or any other API testing tool to interact with the application.

   - **Create New Post**: Send a `POST` request to `http://localhost:8080/api/posts` with the post details(title and content) in the request body.
   - **Retrieve All Posts**: Send a `GET` request to `http://localhost:8080/api/posts`.
   - **Delete Post by ID**: Send a `DELETE` request to `http://localhost:8080/api/posts/{postId}`.
   - **Search Posts by Content**: Send a `GET` request to `http://localhost:8080/api/posts/content{content}`.

## Instructions for Use

1. Clone the repository to your local machine.
2. Ensure you have Java installed.
3. Compile and run the application.
4. Follow the on-screen prompts to interact with the application and manage animal data.

### Acknowledgments

- This project showcases my skills in Java, Spring Boot, RESTful APIs, and Tomcat server deployment.


