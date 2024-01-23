## Credit request

### Project frameworks and tools

#### Make sure you have installed the following software and tools in order to run the project successfully

- Java 17
- PostgresSQL 16
- Docker v19.03 or higher
  - you can also run the project using maven instead.
    - add environmets variables to success execution
- IDE

### 1 Set the database

- Port: `5432`
- Schema: `request`
- User: user
- password: password

### 2 Docker

- use the docker-compose file to configure the proyect
- use the environment variables to success execution

## Export environment variables:

|            VARIABLE             |              VALUE              |                                           DESCRIPTION                                            | MANDATORY |
| :-----------------------------: | :-----------------------------: | :----------------------------------------------------------------------------------------------: | :-------: |
|            `DB_URL`             | `jdbc:postgresql://localhost:5432/request`|                   `It is used to configure database connection.`                       |     X     |
|            `DB_USER`            |              `user`             |             `It is used to initialize the user to the database configuration.`                   |     X     | 
|           `DB_PASSWORD`         |        `kiana@gmail.com`        |           `It is used to initialize the user passowrd to the database configuration.`            |     X     |
|           `DB_NAME`             |        `kiana@gmail.com`        |           `It is used to initialize the database name to the database configuration.`            |     X     |

### Env file
- use the .env.template file as a template for the environment variables
    - generate a .env file to add environment variables
