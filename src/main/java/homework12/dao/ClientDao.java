package homework12.dao;

import homework12.database.Database;
import homework12.entities.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {

    private static final String INSERT =
            "INSERT INTO clients (name,email,phone,about) VALUES (?,?,?,?)";
    private static final String CLIENTS = "SELECT * FROM clients ORDER BY id";
    private static final String UPDATE =
            "UPDATE clients SET name=?, email=?, phone=?, about=? WHERE id=?";
    private static final String DELETE_CLIENT = "DELETE FROM clients WHERE id=?";
    private static final String CLIENTS_BY_PHONE = "SELECT * FROM clients WHERE phone=?";
    private static final String CLIENTS_BY_ID_JOIN =
            "SELECT * FROM clients INNER JOIN accounts ON (clients.id = accounts.client_id)";

    public List<Client> findAllClients() {
        List<Client> resultList = new ArrayList<>();

        try (Connection connection = Database.getConnection()) {
            assert connection != null;
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(CLIENTS);

                while (resultSet.next()) {
                    Client client = new Client();
                    client.setId(resultSet.getInt("id"));
                    client.setName(resultSet.getString("name"));
                    client.setEmail(resultSet.getString("email"));
                    client.setPhone(resultSet.getLong("phone"));
                    client.setAbout(resultSet.getString("about"));

                    resultList.add(client);
                }

            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return resultList;
    }

    public void save(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setString(1, client.getName());
            statement.setString(2, client.getEmail());
            statement.setLong(3, client.getPhone());
            statement.setString(4, client.getAbout());
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    public void update(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE)) {
            statement.setString(1, client.getName());
            statement.setString(2, client.getEmail());
            statement.setLong(3, client.getPhone());
            statement.setString(4, client.getAbout());
            statement.setInt(5, client.getId());
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_CLIENT)) {
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public Client findByPhone(Long phone) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(CLIENTS_BY_PHONE)) {
            statement.setLong(1, phone);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));

                return client;
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public List<Client> findAllClientsByIdJoin() {
        List<Client> resultList1 = new ArrayList<>();

        try (Connection connection = Database.getConnection()) {
            assert connection != null;
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(CLIENTS_BY_ID_JOIN);

                while (resultSet.next()) {
                    Client client = new Client();
                    client.setId(resultSet.getInt("id"));
                    client.setName(resultSet.getString("name"));
                    client.setEmail(resultSet.getString("email"));
                    client.setPhone(resultSet.getLong("phone"));
                    client.setAbout(resultSet.getString("about"));

                    resultList1.add(client);
                }

            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return resultList1;
    }


}
