package br.com.renanweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException {
		String stringJDBC = "jdbc:mysql://localhost:3306/renanweb";
		String usuario = "root";
		String senha = "123abc";
		return DriverManager.getConnection(stringJDBC, usuario, senha);
	}
}
