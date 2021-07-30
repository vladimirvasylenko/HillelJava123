package homework12.dao;

import homework12.database.Database;
import homework12.entities.Client;
import homework12.entities.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatusDao {

    private static final String INSERT =
            "INSERT INTO statuses (alias,description) VALUES (?,?)";
    private static final String STATUS = "SELECT * FROM statuses ORDER BY id";
    private static final String UPDATE =
            "UPDATE statuses SET alias=?, description=? WHERE id=?";
    private static final String DELETE_STATUS = "DELETE FROM statuses WHERE id=?";


    public List<Status> findAllStatuses() {
        List<Status> resultList = new ArrayList<>();

        try (Connection connection = Database.getConnection()) {
            assert connection != null;
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(STATUS);

                while (resultSet.next()) {
                    Status status = new Status();
                    status.setId(resultSet.getInt("id"));
                    status.setAlias(resultSet.getString("alias"));
                    status.setDescription(resultSet.getString("description"));

                    resultList.add(status);
                }

            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return resultList;
    }

    public void save(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setString(1, status.getAlias());
            statement.setString(2, status.getDescription());
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void update(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE)) {
            statement.setString(1, status.getAlias());
            statement.setString(2, status.getDescription());
            statement.setInt(3, status.getId());
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_STATUS)) {
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
