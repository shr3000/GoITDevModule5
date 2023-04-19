package dbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args){
        Connection connection = Database.getInstance().getConnection();
        try {
            PreparedStatement statement = connection.
                    prepareStatement(ReaderQuery.readQueryFromFile("./src/main/java/sql/populate_db.sql"));
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
