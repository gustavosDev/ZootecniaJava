package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import zootecnia.ConexaoDB;

public class Usuario {

    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void salvarNoBanco() throws SQLException {
        Connection conn = ConexaoDB.getConnection();
        String sql = "INSERT INTO usuarios (username, password) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, this.username);
            stmt.setString(2, this.password);
            stmt.executeUpdate();
        } finally {
            conn.close();
        }
    }

    // Getters e Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean validarSenha(String password) {
        return this.password.equals(password);
    }
}
