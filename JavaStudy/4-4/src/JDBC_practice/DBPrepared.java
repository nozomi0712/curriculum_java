package JDBC_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBPrepared {

	private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
	private static final String JBDC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";
	private static final String USER = "postgres";
	private static final String PASS = "postgres";

	public static void main (String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(POSTGRES_DRIVER);
			connection = DriverManager.getConnection(JBDC_CONNECTION, USER, PASS);
			statement = connection.createStatement();

			String SQL = "SELECT * FROM tb_shohin WHERE shohin_id = ? OR shohin_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);

			preparedStatement.setString(1, "001");
			preparedStatement.setString(2, "020");

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
                String column1 = resultSet.getString("SHOHIN_ID");
                String column2 = resultSet.getString("SHOHIN_NAME");
                int column3 = resultSet.getInt("TANKA");

                System.out.print(column1 + ",");
                System.out.print(column2 + ",");
                System.out.println(column3);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}