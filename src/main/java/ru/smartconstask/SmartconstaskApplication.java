package ru.smartconstask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import ru.smartconstask.beans.Account;
import ru.smartconstask.beans.Client;
import ru.smartconstask.dao.AccountDAO;
import ru.smartconstask.dao.DAO;

import java.util.List;

@SpringBootApplication
@Component("ru.smartconstask.controllers")
public class SmartconstaskApplication {

    /*private static DAO<Client> dao;

    private static DAO<Account> daoA;


    public SmartconstaskApplication(DAO<Client> dao, DAO<Account> daoA) { this.dao = dao; this.daoA = daoA; }*/

    public static void main(String[] args) {
        SpringApplication.run(SmartconstaskApplication.class, args);
    }

}
