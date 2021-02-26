package ru.smartconstask.dao;

public class AccountQuerier {
        /**
         * SQL-запрос для получения из БД информации о счете по идентификатору
         */
        protected static final String SELECT_SUM_BY_ACCOUNT_NUM = "SELECT SUM FROM TASKDB.TASK_DB.ACCOUNT WHERE ACCOUNT_NUMBER = :?";
        /**
         * SQL-запрос для получения из БД информации о всех счетах
         */
        protected static final String SELECT_ALL_ACCOUNT = "SELECT * FROM TASKDB.TASK_DB.ACCOUNT";

        /**
         * SQL-запрос для вставки в БД информации о счете
         */
        protected static final String INSERT_ACCOUNT = "INSERT INTO TASKDB.TASK_DB.ACCOUNT " +
                "(client_id, account_number, sum) VALUES (?,?,?)";
        /**
         * SQL-запрос для обновления в БД информации о сумме на счете по идентификатору
         */
        protected static final String UPDATE_ACCOUNT_SUM = "UPDATE TASKDB.TASK_DB.ACCOUNT SET SUM = ? WHERE ACCOUNT_NUMBER = ?";

        protected static final String DELETE_ACCOUNT = "DELETE FROM TASKDB.TASK_DB.ACCOUNT WHERE ID = ?";
}
