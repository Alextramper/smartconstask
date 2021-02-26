package ru.smartconstask.dao;

public class ClientQuerier {
    /**
     * SQL-запрос для вставки в БД информации о клиенте
     */
    protected static final String INSERT_INTO_CLIENT_VALUES = "INSERT INTO TASKDB.TASK_DB.CLIENT (LOGIN, PSSWD, FIRSTNAME, SURNAME) VALUES (?,?,?,?)";
    /**
     * SQL-запрос для получения из БД информацию со списком всех клиентов
     */
    protected static final String SELECT_ALL_CLIENTS = "SELECT * FROM TASKDB.TASK_DB.CLIENT";
    /**
     * SQL-запрос для удаления из БД клиента по id
     */
    protected static final String DELETE_CLIENT_BY_ID = "DELETE FROM TASKDB.TASK_DB.CLIENT WHERE ID = ?";
}
