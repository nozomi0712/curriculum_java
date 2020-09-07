package JDBC_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelect {
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

			String SQL = "SELECT * FROM tb_shohin WHERE shohin_id IN('001', '020')";
			resultSet = statement.executeQuery(SQL);

			while (resultSet.next()) {
				String column1 = resultSet.getString("shohin_id");
				String column2 = resultSet.getString("shohin_name");
				int column3 = resultSet.getInt("TANKA");

				System.out.print(column1 + ",");
				System.out.print(column2 + ",");
				System.out.print(column3 + "\n");
			}

		} catch(ClassNotFoundException e) {
			e.printStackTrace();

		} catch(SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					resultSet.close();
				}
				if (connection != null) {
					resultSet.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
