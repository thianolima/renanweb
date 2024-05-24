package br.com.renanweb;

import br.com.renanweb.dao.UsuariosDAO;
import br.com.renanweb.jdbc.ConnectionFactory;
import br.com.renanweb.model.Usuarios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        UsuariosDAO dao = new UsuariosDAO();
        dao.inserir(new Usuarios(1, "usuario 1", "usuario1@renanweb.com", "123"));
        dao.inserir(new Usuarios(2, "usuario 2", "usuario2@renanweb.com", "123"));
        dao.inserir(new Usuarios(3, "usuario 3", "usuario3@renanweb.com", "123"));
        dao.inserir(new Usuarios(4, "usuario 4", "usuario4@renanweb.com", "123"));
        dao.inserir(new Usuarios(5, "usuario 5", "usuario5@renanweb.com", "123"));

        Connection conexao = ConnectionFactory.getConnection();
        Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id, nome, email, senha FROM usuarios");

        while(rs.next()){
            System.out.println(
                 new Usuarios(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("senha")
                 )
            );
        }
    }
}