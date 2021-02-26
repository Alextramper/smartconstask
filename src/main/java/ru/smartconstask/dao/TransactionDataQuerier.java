package ru.smartconstask.dao;

public class TransactionDataQuerier {
    /**
     * SQL-запрос для вставки в БД информации о платеже
     */
    protected static final String INSERT_INTO_TRANSACTION_DATA_VALUES = "INSERT INTO TASKDB.TASK_DB.TRANSACTION_DATA (FROM_ACCOUNT, TARGET_ACCOUNT, SUM, DATE) VALUES (?, ?, ?, ?)";

    /**
     * SQL-запрос для получения из БД информации о всех
     */
    protected static final String SELECT_ALL_TRANSACTIONS = "SELECT * FROM TASKDB.TASK_DB.TRANSACTION_DATA";


    protected static final String DELETE_TRANSACTION = "DELETE FROM TASKDB.TASK_DB.TRANSACTION_DATA WHERE ID = ?";
}
