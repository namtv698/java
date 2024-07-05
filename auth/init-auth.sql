CREATE SCHEMA auth

CREATE TABLE auth.user(
    id SERIAL,
    user_name varchar(50) NOT NULL UNIQUE ,
    password varchar(50) NOT NULL,
    is_deleted boolean DEFAULT FALSE,
    permission int NOT NULL,
    created_by int,
    created_at timestamp DEFAULT NOW(),
    updated_by int default NULL,
    updated_at timestamp DEFAULT NULL,
    deleted_by int DEFAULT NULL,
    CONSTRAINT auth_user_pkey PRIMARY KEY (id)
);

INSERT INTO auth.user (user_name, password, is_deleted, permission, created_by)
VALUES ('namtv', 'password', false, 1, 1) ,('admin', 'admin', false, 1, 1), ('user', 'user', false, 1, 1);
CREATE TABLE auth.m_permission (
    id SERIAL,
    permission varchar(50),
    description text,
    CONSTRAINT auth_permission_pkey PRIMARY KEY (id)
);

INSERT INTO auth.m_permission(permission, description) VALUES ('ADMIN', 'Administrator'), ('USER', 'User');