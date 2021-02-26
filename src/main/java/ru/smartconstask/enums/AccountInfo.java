package ru.smartconstask.enums;

/**
 * Перечисление, содержащее данные счета
 */
enum AccountInfo {
    /**
     * Идентификатор
     */
    ID("id"),
    /**
     * Номер счета
     */
    ACCOUNT_NUMBER("account_number"),
    /**
     * Сумма на счете
     */
    SUM("sum"),
    /**
     * ID клиента (держателя)
     */
    CLIENT_ID("client_id"),
    /**
     * Сумма пополнения
     */
    REPLENISH_SUM("replenish_sum"),
    /**
     * Сумма снятия
     */
    WITHDRAWAL_SUM("withdrawal_sum");

    private String accountInfo;

    AccountInfo(String accountInfo) {
        this.accountInfo = accountInfo;
    }

    public String getAccountInfo() {
        return accountInfo;
    }
}
