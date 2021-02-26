package ru.smartconstask.beans;

import javax.persistence.*;

/**
 * Класс для описания объекта "Счет"
 */
public class Account {

    /**
     * Идентификатор счета
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * Идентификатор клиента
     */
    private int clientId;
    /**
     * Номер счета
     */
    private int accountNumber;
    /**
     * Сумма счета
     */
    private int sum;

    /**
     * Конструктор
     * @param clientId идентификатор счета
     * @param accountNumber номер счета
     * @param sum
     */
    public Account(int clientId, int accountNumber, int sum) {
        this.clientId = clientId;
        this.accountNumber = accountNumber;
        this.sum = sum;
    }

    public Account(int clientId, int accountNumber) {
        this.clientId = clientId;
        this.accountNumber = accountNumber;
    }

    public Account() {};

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getClientId() { return clientId; }

    public void setClientId(int clientId) { this.clientId = clientId; }

    public int getAccountNumber() { return accountNumber; }

    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }

    public int getSum() { return sum; }

    public void setSum(int sum) { this.sum = sum; }


    @Override
    public boolean equals(Object object) {
        Account account = (Account) object;
        return this.accountNumber == account.getAccountNumber();
    }

    @Override
    public String toString() {
        return String.join(" | ", String.valueOf(accountNumber), String.valueOf(sum));
    }
}
