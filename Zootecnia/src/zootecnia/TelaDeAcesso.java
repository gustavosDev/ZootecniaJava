package zootecnia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaDeAcesso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeAcesso frame = new TelaDeAcesso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaDeAcesso() {
		setResizable(false);
		setTitle("Tela de Acesso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setBounds(73, 80, 71, 28);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(84, 133, 71, 28);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblSenha);
		
		tfUsuario =    new JTextField();
		tfUsuario.setBounds(159, 81, 156, 28);
		tfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(159, 133, 156, 28);
		contentPane.add(pfSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				    // Corrigindo a chamada da conexão
				    Connection con = ConexaoDB.getConnection();
				    
				    // Corrigindo a consulta SQL e o uso de PreparedStatement
				    String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
				    PreparedStatement stmt = con.prepareStatement(sql);
				    stmt.setString(1, tfUsuario.getText());  // Obtendo o texto do campo de usuário
				    stmt.setString(2, new String(pfSenha.getPassword()));  // Obtendo a senha do campo de senha
				    
				    ResultSet rs = stmt.executeQuery();
				    
				    if (rs.next()) {
				        // Exibindo a tela de opções
				        TelaDeOpcoes exibir = new TelaDeOpcoes();
				        exibir.setVisible(true);
				        
				        // Fechando a tela de login
				        setVisible(false);
				    } else {
				        JOptionPane.showMessageDialog(null, "Esse usuário não existe");
				    }
				    
				    // Fechando os recursos
				    stmt.close();
				    con.close();

				} catch (SQLException e1) {
				    e1.printStackTrace();
				}
				
				
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEntrar.setBounds(181, 183, 117, 28);
		contentPane.add(btnEntrar);
	}
}
