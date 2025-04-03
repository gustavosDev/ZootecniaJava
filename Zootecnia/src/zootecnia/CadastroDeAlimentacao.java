package zootecnia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroDeAlimentacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeAlimentacao frame = new CadastroDeAlimentacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CadastroDeAlimentacao() {
		setForeground(new Color(240, 240, 240));
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastre uma nova alimentação");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 45, 782, 23);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 19));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Proteina:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(0, 101, 792, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(299, 124, 205, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Carboidrato:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(0, 155, 792, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(299, 178, 205, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Alimento base:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(0, 209, 792, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(299, 232, 205, 21);
		contentPane.add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Vitaminas e minerais:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(0, 263, 792, 13);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(299, 286, 205, 21);
		contentPane.add(comboBox_1_1_1);
		
		JButton btnCadastrarAlimentao = new JButton("Cadastrar alimentação");
		btnCadastrarAlimentao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastrarAlimentao.setBounds(299, 331, 205, 21);
		contentPane.add(btnCadastrarAlimentao);
	}

}
