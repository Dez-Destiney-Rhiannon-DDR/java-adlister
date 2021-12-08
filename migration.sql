USE mangatrader_db;

DROP TABLE IF EXISTS mangas;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240) NOT NULL,
    email VARCHAR(240) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE mangas (
    title VARCHAR(240) NOT NULL,
    author VARCHAR(255) NOT NULL,
    year INT UNSIGNED NOT NULL,
    genre VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    image BLOB NOT NULL,
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
        ON DELETE CASCADE
);
