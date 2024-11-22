# Keycloak SPI Project

This project is a Keycloak Service Provider Interface (SPI) implementation.

## Prerequisites

- Java 21
- Maven
- Docker

## Building the project

To build the project, run:

```bash
   mvn clean package
```

## Running the Project with Docker

To run the project using Docker, follow these steps:

### Build the Docker image:

```sh
   docker build -t keycloak-spi:latest .
```

Start the services using Docker Compose:

```sh 
    docker-compose up -d
```