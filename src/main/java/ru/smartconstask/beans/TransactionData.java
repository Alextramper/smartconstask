package ru.smartconstask.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Класс для описания оплаты
 */
public class TransactionData {

    /**
     * * Клиент
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int fromAccount;
    /**
     * Целевой счет
     */
    private int targetAccount;
    /**
     * Сумма
     */
    private int sum;
    /**
     * Дата/время
     */
    private Date date;

    public TransactionData(int fromAccount, int targetAccount, int sum, Date date) {
        this.fromAccount = fromAccount;
        this.targetAccount = targetAccount;
        this.sum = sum;
        this.date = date;
    }

    public TransactionData(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(int fromAccount) {
        this.fromAccount = fromAccount;
    }

    public int getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(int targetAccount) {
        this.targetAccount = targetAccount;
    }

    public int getSum() { return sum; }

    public void setSum(int sum) { this.sum = sum; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public String toString() {
        return ("from" + fromAccount + " to " + targetAccount) ;
    }
}

