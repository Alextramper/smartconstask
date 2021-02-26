package ru.smartconstask.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.smartconstask.beans.Account;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


@Component
public class AccountDAO implements DAO<Account> {

    JdbcTemplate jdbcTemplate;
    private static final Logger log = LoggerFactory.getLogger(AccountDAO.class);

    RowMapper<Account> rowMapper = ((resultSet, i) -> {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setAccountNumber(resultSet.getInt("account_number"));
        account.setClientId(resultSet.getInt("client_id"));
        account.setSum(resultSet.getInt("sum"));
        return account;
    });

    @Autowired
    public AccountDAO (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Account account) {
        int accountNumber = ThreadLocalRandom.current().nextInt(10000, 99999);
        String sqlQuery = AccountQuerier.INSERT_ACCOUNT;
        int rowCount = jdbcTemplate.update(sqlQuery, accountNumber, account.getClientId(), account.getSum());
        if(rowCount==1) {
            log.info("Account with client id:" + account.getClientId() + " is added");
        }
    }

    @Override
    public List<Account> getAll() {
        String sql = AccountQuerier.SELECT_ALL_ACCOUNT;
        return  jdbcTemplate.query(sql, rowMapper);

    }

    @Override
    public void delete(int id) {
        String sql = AccountQuerier.DELETE_ACCOUNT;
        int rowCount = jdbcTemplate.update(sql, id);
        if(rowCount==1) { log.info("Account " + id + " deleted"); }
    }


    }

