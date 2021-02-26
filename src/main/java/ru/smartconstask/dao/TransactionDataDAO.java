package ru.smartconstask.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import ru.smartconstask.beans.TransactionData;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Component
public class TransactionDataDAO implements DAO<TransactionData> {


    JdbcTemplate jdbcTemplate;
    private static final Logger log = LoggerFactory.getLogger(AccountDAO.class);

    RowMapper<TransactionData> rowMapper = ((resultSet, i) -> {
        TransactionData transactionData = new TransactionData();
        transactionData.setId(resultSet.getInt("id"));
        transactionData.setFromAccount(resultSet.getInt("from_account"));
        transactionData.setTargetAccount(resultSet.getInt("target_account"));
        transactionData.setSum(resultSet.getInt("sum"));
        transactionData.setDate(resultSet.getDate("date"));
        return transactionData;
    });

    @Autowired
    public TransactionDataDAO (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(TransactionData transactionData) {

       /* String sum1 = "SELECT SUM FROM TASKDB.TASK_DB.ACCOUNT WHERE ACCOUNT_NUMBER = :fromAccount";
        String sum2 = "SELECT SUM FROM TASKDB.TASK_DB.ACCOUNT WHERE ACCOUNT_NUMBER = :toAccount";

        String firstParam = String.valueOf(transactionData.getFromAccount());
        String secondParam = String.valueOf(transactionData.getFromAccount());

        String sqlInsertQuery = TransactionDataQuerier.INSERT_INTO_TRANSACTION_DATA_VALUES;


        int fromAccSum = jdbcTemplate.query(sum1, new Object[]{transactionData.getFromAccount()});
        int targetAccSum = jdbcTemplate.query(sum2, new MapSqlParameterSource().addValue("fromAccount", secondParam));

        int rowCount = jdbcTemplate.update(sqlInsertQuery, transactionData.getFromAccount(),
                transactionData.getTargetAccount(), transactionData.getSum(), new Timestamp(new Date().getTime()));
        if (rowCount == 1) {
            log.info("Registred transfer:" + transactionData.toString());
        }*/
    }

    @Override
    public List<TransactionData> getAll() {
        String sql = TransactionDataQuerier.SELECT_ALL_TRANSACTIONS;
        return  jdbcTemplate.query(sql, rowMapper);

    }

    @Override
    public void delete(int id) {
        String sql = TransactionDataQuerier.DELETE_TRANSACTION;
        int rowCount = jdbcTemplate.update(sql, id);
        if(rowCount==1) { log.info("Transaction " + id + " deleted"); }
    }

    }
