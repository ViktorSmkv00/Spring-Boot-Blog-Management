# Blog Management System

A blog management system built using Java, Spring Boot and MySQL, allowing users to create, retrieve, delete, update and search blog posts.

## Features

- **Create New Posts**: Users can create new blog posts with a title, content, and tags.
- **Retrieve All Posts**: Users can view all existing blog posts.
- **Delete Posts**: Users can delete a post by its unique identifier.
- **Search Posts**: Users can search for posts based on the presence of specific text within the content.
- **Update Posts**: Users can update a post by its unique identifier.

## Technologies Used

- **Java**
- **Spring Boot**
- **MySQL**
- **RESTful API**: Implemented RESTful APIs to enable communication with the application.
- **Postman**: Tested CRUD operations using Postman for API testing.


### Usage


1. Use Postman or any other API testing tool to interact with the application.

   - **Create New Post**: Send a `POST` request to `http://localhost:8080/posts` with the post details in the request body.
   - **Retrieve All Posts**: Send a `GET` request to `http://localhost:8080/posts`.
   - **Delete Post by ID**: Send a `DELETE` request to `http://localhost:8080/posts/{postId}`.
   - **Search Posts by Content**: Send a `GET` request to `http://localhost:8080/posts/content/{content}`.
   - **Update Posts by ID**: Send a `PUT` request to `http://localhost:8080/posts/{postId}`.

