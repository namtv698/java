CREATE SCHEMA auth

CREATE TABLE auth.user(
    id SERIAL,
    user_name varchar(50) NOT NULL UNIQUE ,
    password varchar(50) NOT NULL,
    is_deleted boolean DEFAULT FALSE,
    permission int NOT NULL,
    created_by int,
    created_at timestamp,
    updated_by int,
    updated_at timestamp,
    deleted_by int,
    CONSTRAINT auth_user_pkey PRIMARY KEY (id)
);

CREATE TABLE auth.m_permission (
    id SERIAL,
    permission varchar(50),
    description text,
    CONSTRAINT auth_permission_pkey PRIMARY KEY (id)
);

INSERT INTO auth.m_permission(permission, description) VALUES ('ADMIN', 'Administrator'), ('USER', 'User');