package ru.smartconstask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.smartconstask.beans.Account;
import ru.smartconstask.dao.AccountDAO;

import java.util.List;


@Service
public class AccountServices implements Services<Account> {


    AccountDAO accountDAO;


    @Autowired
    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void insert(Account account) {
        accountDAO.insert(account);
    }

    @Override
    public List getAll() {
        return accountDAO.getAll();
    }

    @Override
    public void delete(int id) {
        accountDAO.delete(id);
    }

}
