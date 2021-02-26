package ru.smartconstask.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.smartconstask.beans.Client;


import java.util.List;

@Component
public class ClientDAO implements DAO<Client> {

    private JdbcTemplate jdbcTemplate;
    private static final Logger log = LoggerFactory.getLogger(ClientDAO.class);

    RowMapper<Client> rowMapper = ((resultSet, i) -> {
        Client client = new Client();
        client.setId(resultSet.getInt("id"));
        client.setLogin(resultSet.getString("login"));
        client.setPsswd(resultSet.getString("psswd"));
        client.setFirstname(resultSet.getString("firstname"));
        client.setSurname(resultSet.getString("surname"));
        return client;
    });

    @Autowired
    public ClientDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Client client) {
        String sql = ClientQuerier.INSERT_INTO_CLIENT_VALUES;
        int rowCount = jdbcTemplate.update(sql, client.getLogin(),client.getPsswd(), client.getFirstname(), client.getSurname());
        if(rowCount==1) {
            log.info("Client " + client.getFirstname() + " is added, login  = " + client.getFirstname());
        }
    }

    @Override
    public List<Client> getAll() {
        String sql = ClientQuerier.SELECT_ALL_CLIENTS;
        return jdbcTemplate.query(sql, rowMapper);
    }


    @Override
    public void delete(int id) {
        String sql = ClientQuerier.DELETE_CLIENT_BY_ID;
        int rowCount = jdbcTemplate.update(sql, id);
        if(rowCount==1) {
            log.info("Client " + id + " deleted");
        }
    }
}
