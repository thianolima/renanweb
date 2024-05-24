package br.com.renanweb.dao;

import br.com.renanweb.jdbc.ConnectionFactory;
import br.com.renanweb.model.Usuarios;

import java.sql.*;

public class UsuariosDAO {
	
	public Usuarios inserir(Usuarios usuarios){

		try{
			Connection conexao = ConnectionFactory.getConnection();
			String sql = "insert into usuarios (id, nome, email, senha) values(?, ? , ? , ?)";
			PreparedStatement statement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setInt(1, usuarios.getId());
			statement.setString(2, usuarios.getNome());
			statement.setString(3, usuarios.getEmail());
			statement.setString(4, usuarios.getSenha());

			var estadoOperacao =  statement.executeUpdate() > 0;

			if(estadoOperacao) {
				ResultSet result = statement.getGeneratedKeys();
				if(result.next()) {
					int id = result.getInt(1);
					usuarios.setId(id);
				}
			}
			else {
				throw new SQLException("Falha ao tentar inserir usuario!");
			}
			statement.close();
			conexao.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return usuarios;
	}
}
