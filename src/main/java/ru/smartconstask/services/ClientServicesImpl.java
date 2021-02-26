package ru.smartconstask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.smartconstask.beans.Client;
import ru.smartconstask.dao.ClientDAO;

import java.util.List;

@Service
public class ClientServicesImpl implements Services<Client> {

    ClientDAO clientDAO;


    @Autowired
    public void setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }


    @Override
    public void insert(Client client) {
        clientDAO.insert(client);
    }

    @Override
    public List<Client> getAll() {
        return clientDAO.getAll();
    }

    @Override
    public void delete(int id) {
        clientDAO.delete(id);
    }
}
