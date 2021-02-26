CREATE TABLE IF NOT EXISTS taskdb.task_db.client
(
    id serial NOT NULL
        CONSTRAINT client_pk
            PRIMARY KEY,
    login varchar NOT NULL,
    pswd varchar NOT NULL,
    firstname varchar NOT NULL,
    surname varchar NOT NULL,
);

COMMENT ON TABLE taskdb.task_db.client IS 'Таблица клиентов';

COMMENT ON COLUMN taskdb.task_db.client.id IS 'Идентификатор';

ALTER TABLE taskdb.task_db.client OWNER TO postgres;

CREATE UNIQUE INDEX IF NOT EXISTS client_id_uindex
    ON taskdb.task_db.client (id);

CREATE UNIQUE INDEX client_login_uindex
    ON taskdb.task_db.client (login);

