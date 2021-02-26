package ru.smartconstask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.smartconstask.beans.TransactionData;
import ru.smartconstask.dao.TransactionDataDAO;

import java.util.List;

@Service
public class TransactionDataServices implements Services<TransactionData> {


    TransactionDataDAO transactionDataDAO;

    @Autowired
    public void setTransactionDataDAO(TransactionDataDAO transactionDataDAO) {
        this.transactionDataDAO = transactionDataDAO;
    }

    @Override
    public void insert(TransactionData transactionData) {
        transactionDataDAO.insert(transactionData);
    }

    @Override
    public List<TransactionData> getAll() {
        return transactionDataDAO.getAll();
    }

    @Override
    public void delete(int id) {
        transactionDataDAO.delete(id);
    }

}
