#Spring REST pagination

Добавляем пагинацию данных в REST контроллер 

Проверить

GET запрос по адрессу
~~~
http://localhost:8080/pagination?page=1&size=10
~~~

Получаем

~~~
{
    "content": [
        {
            "id": 1,
            "name": "name",
            "description": "description"
        },
        {
            "id": 2,
            "name": "name",
            "description": "description"
        },
        {
            "id": 3,
            "name": "name",
            "description": "description"
        },
        {
            "id": 4,
            "name": "name",
            "description": "description"
        },
        {
            "id": 5,
            "name": "name",
            "description": "description"
        },
        {
            "id": 6,
            "name": "name",
            "description": "description"
        },
        {
            "id": 7,
            "name": "name",
            "description": "description"
        },
        {
            "id": 8,
            "name": "name",
            "description": "description"
        },
        {
            "id": 9,
            "name": "name",
            "description": "description"
        },
        {
            "id": 10,
            "name": "name",
            "description": "description"
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 10,
        "pageNumber": 1,
        "pageSize": 10,
        "unpaged": false,
        "paged": true
    },
    "last": false,
    "totalPages": 5,
    "totalElements": 41,
    "size": 10,
    "number": 1,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": false,
    "numberOfElements": 10,
    "empty": false
}
~~~

DataBase PostgreSQL
~~~SQL
CREATE TABLE IF NOT EXISTS item
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(128) NOT NULL,
    description VARCHAR(500) NOT NULL
);
INSERT INTO item (name, description)
VALUES ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description'),
       ('name', 'description');
~~~
