package dbService;

import dbService.Database;
import dbService.ReaderQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) {
        Connection connection = Database.getInstance().getConnection();
        try {
            PreparedStatement statement = connection.
                    prepareStatement(ReaderQuery.readQueryFromFile("./src/main/java/sql/init_db.sql"));
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
