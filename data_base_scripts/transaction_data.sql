CREATE TABLE IF NOT EXISTS taskdb.task_db.transaction_data
(
    id serial NOT NULL
        CONSTRAINT transaction_data_pk
            PRIMARY KEY,
    from_account integer NOT NULL
        CONSTRAINT transaction_data_client_id_fk
            REFERENCES taskdb.task_db.client(id)
            on delete cascade,
    target_account varchar NOT NULL ,
    sum numeric NOT NULL ,
    date timestamp NOT NULL
);

COMMENT ON TABLE taskdb.task_db.transaction_data IS 'Таблица, содержащая информацию об оплатах';

COMMENT ON COLUMN taskdb.task_db.transaction_data.id IS 'Идентификатор оплаты';

COMMENT ON COLUMN taskdb.task_db.transaction_data.from_account IS 'Идентификатор клиента';

COMMENT ON COLUMN taskdb.task_db.transaction_data.target_account IS 'Целевой счет';

COMMENT ON COLUMN taskdb.task_db.transaction_data.sum IS 'Сумма оплаты';

COMMENT ON COLUMN taskdb.task_db.transaction_data.date IS 'Дата/время оплаты';

ALTER TABLE taskdb.task_db.transaction_data OWNER TO postgres;

CREATE UNIQUE INDEX IF NOT EXISTS transaction_data_id_uindex
    ON taskdb.task_db.transaction_data (id);