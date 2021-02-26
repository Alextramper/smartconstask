package ru.smartconstask.enums;

/**
 * Перечисление, содержащее данные клиента
 */
enum ClientInfo {
    /**
     * Идентификатор
     */
    ID("id"),
    /**
     * Имя
     */
    FIRST_NAME("firstname"),
    /**
     * Фамилия
     */
    SURNAME("surname"),
    /**
     * Логин
     */
    LOGIN("login"),
    /**
     * Пароль
     */
    PSSWD("psswd");


    /**
     * Аутентификационные данные
     */
    private String clientInfo;

    /**
     * Конструктор с полем аутентификационных данных
     * @param clientInfo аутентификационные данные
     */
    ClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    /**
     * Геттер аутентификационных данных
     * @return аутентификационные данные
     */
    public String getClientInfo() {
        return clientInfo;
    }
}
