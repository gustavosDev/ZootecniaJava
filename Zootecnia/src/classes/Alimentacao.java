package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import zootecnia.ConexaoDB;

public class Alimentacao {

    private String nome;
    private double proteinaPorKg;
    private double custoPorKg;

    public Alimentacao(String nome, double proteinaPorKg, double custoPorKg) {
        this.nome = nome;
        this.proteinaPorKg = proteinaPorKg;
        this.custoPorKg = custoPorKg;
    }

    public void salvarNoBanco() throws SQLException {
        Connection conn = ConexaoDB.getConnection();
        String sql = "INSERT INTO alimentacoes (nome, proteina_por_kg, custo_por_kg) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, this.nome);
            stmt.setDouble(2, this.proteinaPorKg);
            stmt.setDouble(3, this.custoPorKg);
            stmt.executeUpdate();
        } finally {
            conn.close();
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProteinaPorKg() {
        return proteinaPorKg;
    }

    public void setProteinaPorKg(double proteinaPorKg) {
        this.proteinaPorKg = proteinaPorKg;
    }

    public double getCustoPorKg() {
        return custoPorKg;
    }

    public void setCustoPorKg(double custoPorKg) {
        this.custoPorKg = custoPorKg;
    }

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
}