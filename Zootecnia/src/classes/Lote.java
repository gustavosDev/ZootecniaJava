package classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import zootecnia.ConexaoDB;

public class Lote {

    private String id;
    private String nome;
    private String raca;
    private double pesoInicial;
    private double pesoAtual;
    private String dataCompra;
    private long alimentacao;
    private int idade;
	private double pesoInicial2;
	private String diaSelecionado;
	private String mesSelecionado;
	private String anoSelecionado;

    public Lote() {
		// TODO Auto-generated constructor stub
	}

	public void cadastrarLote(String id, String nome, double pesoInicial2, double pesoInicial, double pesoAtual,
			String dataCompra, String raca, long alimentacao, int idade ) {
    	this.id= id;
    	this.nome= nome;
    	this.setPesoInicial2(pesoInicial2);
    	this.raca = raca;
    	this.pesoInicial = pesoInicial;
    	this.pesoAtual= pesoAtual;
    	this.dataCompra = dataCompra;
    	this.alimentacao = alimentacao;
    	this.idade = idade;
    	
    	
    }
    
	public void inserirDados() {
	    try (Connection con = ConexaoDB.getConnection()) { 
	        // SQL corrigido com número correto de parâmetros
	        String sql = "INSERT INTO lotes ( raca, peso_inicial, peso_atual, data_compra, alimentacao_id, nome, idade) VALUES (?, ?, ?, ?, ?, ?, ?)";
	        PreparedStatement pst = con.prepareStatement(sql);


	        // Atribuir valores aos parâmetros
	    
	        pst.setString(1, raca);
	        pst.setDouble(2, pesoInicial);
	        pst.setDouble(3, pesoAtual);
	        pst.setString(4, dataCompra); // Usando data válida
	        pst.setLong(5, alimentacao);
	        pst.setString(6, nome);
	        pst.setInt(7, idade);

	        // Executar a inserção
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
	    } catch (SQLException ex) {
	        JOptionPane.showMessageDialog(null, "Erro nas operações no banco de dados: " + ex.getMessage());
	    } catch (IllegalArgumentException ex) {
	        JOptionPane.showMessageDialog(null, "Erro nos dados fornecidos: " + ex.getMessage());
	        return; // Interrompe a execução do método ao capturar IllegalArgumentException
	    }
	}
   
    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public long getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(long alimentacao) {
        this.alimentacao = alimentacao;
    }

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMesSelecionado() {
		return mesSelecionado;
	}

	public void setMesSelecionado(String mesSelecionado) {
		this.mesSelecionado = mesSelecionado;
	}

	public String getAnoSelecionado() {
		return anoSelecionado;
	}

	public void setAnoSelecionado(String anoSelecionado) {
		this.anoSelecionado = anoSelecionado;
	}

	public double getPesoInicial2() {
		return pesoInicial2;
	}

	public void setPesoInicial2(double pesoInicial2) {
		this.pesoInicial2 = pesoInicial2;
	}

	public void cadastrarLote(String nome2, String raca2, double pesoInicial3, int idade2, int alimentacao2,
			Date sqlDate) {
		// TODO Auto-generated method stub
		
	}

	public void cadastrarLote(String nome2, String raca2, double pesoInicial3, double d,  String dataCompra, int alimentacao2,
			int idade2) {
		// TODO Auto-generated method stub
		
	}
}

	