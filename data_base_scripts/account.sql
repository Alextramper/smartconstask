CREATE TABLE taskdb.task_db.account
(
    id integer NOT NULL PRIMARY KEY,
    client_id integer NOT NULL REFERENCES
        taskdb.task_db.client(id)
        on delete cascade,
    account_number integer           NOT NULL,
    sum            integer DEFAULT 0 NOT NULL

);
COMMENT ON TABLE taskdb.task_db.account IS 'Таблица, содержащая счета клиентов';

COMMENT ON COLUMN taskdb.task_db.account.id IS 'Идентификатор';

COMMENT ON COLUMN taskdb.task_db.account.client_id IS 'Идентификатор клиента';

COMMENT ON COLUMN taskdb.task_db.account.account_number IS 'Номер счета';

COMMENT ON COLUMN taskdb.task_db.account.sum IS 'Сумма на счете';

ALTER TABLE taskdb.task_db.account OWNER TO postgres;

CREATE UNIQUE INDEX IF NOT EXISTS account_number_uindex
    ON taskdb.task_db.account (account_number);

CREATE UNIQUE INDEX IF NOT EXISTS account_id_uindex
    ON taskdb.task_db.account (id);