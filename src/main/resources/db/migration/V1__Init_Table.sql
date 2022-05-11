CREATE TABLE user
(
    id          BIGINT(50)      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    email       VARCHAR(255)    NOT NULL,
    name        VARCHAR(255)    NOT NULL,
    password    VARCHAR(255)    NOT NULL
) ENGINE = InnoDb;

CREATE TABLE role
(
    id      BIGINT(50)      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(255)    NOT NULL
) ENGINE = InnoDb;

CREATE TABLE users_roles
(
    user_id BIGINT(50),
    role_id BIGINT(50),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES user(id),
    CONSTRAINT fk_role FOREIGN KEY (role_id) REFERENCES role(id)
) ENGINE = InnoDb;

CREATE TABLE customers
(
    id              BIGINT(50)                          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name            VARCHAR(255)                        NOT NULL,
    email           VARCHAR(255)                        NOT NULL UNIQUE,
    company_name    VARCHAR(255)                        NOT NULL,
    country         VARCHAR(255)                        NOT NULL,
    address         LONGTEXT                            NOT NULL,
    post_code       VARCHAR(255)                        NOT NULL,
    phone_number    VARCHAR(255)                        NOT NULL,
    added_date      TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
) ENGINE = InnoDb;

INSERT INTO customers (id, name, email, company_name, country, address, post_code, phone_number, added_date)
VALUES (1, 'Muhammad Dapos', 'dapos@gmail.com', 'ITS', 'Indonesia', 'Sidoarjo', '999999', '08123456789', '2020-03-29 07:52:34'),
       (2, 'Albert Kosimp', 'kosimp@gmail.com', 'UP3', 'Jepang', 'Shibuya', '696969', '08123456789', '2020-03-29 08:18:59'),
       (3, 'Aksel Gans', 'aksel@gmail.com', 'Pegi-pegi', 'Korea', 'Bandung', '111111', '08123456789', '2020-03-29 08:18:59'),
       (4, 'Willyem', 'will@gmail.com', 'Suitmedia', 'Indonesia', 'Jakarta', '212121', '08123456789', '2020-03-29 08:18:59'),
       (5, 'Wishu', 'wishu@gmail.com', 'Blibli', 'Indonesia', 'Bojonegoro', '999999', '08123456789', '2020-03-29 08:18:59');