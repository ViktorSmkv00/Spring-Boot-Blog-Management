# Blog Management System

A blog management system built using Spring Boot, allowing users to create, retrieve, delete, and search blog posts. Features include RESTful APIs, Tomcat hosting, and integration with Postman for testing CRUD operations. 

## Features

- **Create New Posts**: Users can create new blog posts with a title, content, and tags.
- **Retrieve All Posts**: Users can view all existing blog posts.
- **Delete Posts**: Users can delete a post by its unique identifier.
- **Search Posts**: Users can search for posts based on the presence of specific text within the content.

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

### Installation

1. Clone this repository to your local machine:


2. Navigate to the project directory:


3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

### Usage

1. Run the Spring Boot application:

   

   The application will be hosted on Tomcat at [http://localhost:8080](http://localhost:8080).

2. Use Postman or any other API testing tool to interact with the application.

   - **Create New Post**: Send a `POST` request to `http://localhost:8080/posts` with the post details in the request body.
   - **Retrieve All Posts**: Send a `GET` request to `http://localhost:8080/posts`.
   - **Delete Post by ID**: Send a `DELETE` request to `http://localhost:8080/posts/{postId}`.
   - **Search Posts by Content**: Send a `GET` request to `http://localhost:8080/posts/search?text={searchText}`.

### Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork this repository.
2. Create a new branch for your feature or bug fix: `git checkout -b feature-name`.
3. Make your changes and commit them: `git commit -m "Description of your changes"`.
4. Push your changes to your fork: `git push origin feature-name`.
5. Submit a pull request to the main repository.

### Acknowledgments

- This project showcases my skills in Java, Spring Boot, RESTful APIs, and Tomcat server deployment.
- Special thanks to the Spring Boot community for providing excellent resources and documentation.

