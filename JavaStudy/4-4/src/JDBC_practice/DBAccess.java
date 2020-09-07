package JDBC_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {

	private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
	private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";
	private static final String USER = "postgres";
	private static final String PASS = "postgres";

	public static void main (String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(POSTGRES_DRIVER);
			connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
			statement = connection.createStatement();

			String SQL = "SELECT * FROM tb_shohin";
			resultSet = statement.executeQuery(SQL);

			while (resultSet.next()) {
				String column1 = resultSet.getString("SHOHIN_id");
				String column2 = resultSet.getString("SHOHIN_NAME");
				int column3 = resultSet.getInt("TANKA");

				System.out.print(column1 + ",");
				System.out.print(column2 + ",");
				System.out.print(column3 + "\n");
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
