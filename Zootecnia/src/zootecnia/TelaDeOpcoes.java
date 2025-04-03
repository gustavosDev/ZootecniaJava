package zootecnia;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDeOpcoes extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaDeOpcoes frame = new TelaDeOpcoes();
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
    public TelaDeOpcoes() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 670, 389);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Bem-Vindo!");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel.setBounds(0, 43, 666, 34);
        contentPane.add(lblNewLabel);

        JButton btnCadastroDeLote = new JButton("Cadastrar novo lote");
        btnCadastroDeLote.setBackground(new Color(255, 255, 255));
        btnCadastroDeLote.setForeground(Color.BLACK);
        btnCadastroDeLote.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnCadastroDeLote.setBounds(237, 109, 182, 34);
        contentPane.add(btnCadastroDeLote);

        JButton btnGestaoDeLotes = new JButton("Gestão de lotes");
        btnGestaoDeLotes.setForeground(Color.BLACK);
        btnGestaoDeLotes.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnGestaoDeLotes.setBackground(new Color(255, 255, 255));
        btnGestaoDeLotes.setBounds(237, 153, 182, 34);
        contentPane.add(btnGestaoDeLotes);

        JButton btnCadastrarAlimentacao = new JButton("Cadastrar alimentação");
        btnCadastrarAlimentacao.setForeground(Color.BLACK);
        btnCadastrarAlimentacao.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnCadastrarAlimentacao.setBackground(Color.WHITE);
        btnCadastrarAlimentacao.setBounds(237, 197, 182, 34);
        contentPane.add(btnCadastrarAlimentacao);

        JButton btnRelatorioEAnalise = new JButton("Relatórios e análise");
        btnRelatorioEAnalise.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ação para abrir a tela de relatórios e análise
            }
        });
        btnRelatorioEAnalise.setForeground(Color.BLACK);
        btnRelatorioEAnalise.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnRelatorioEAnalise.setBackground(Color.WHITE);
        btnRelatorioEAnalise.setBounds(237, 241, 182, 34);
        contentPane.add(btnRelatorioEAnalise);

        // Ação para o botão "Cadastrar novo lote"
        btnCadastroDeLote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroDeLote cadastroDeLote = new CadastroDeLote();
                cadastroDeLote.setVisible(true); // Abre a tela de cadastro de lote
            }
        });

 
        // Ação para o botão "Cadastrar alimentação"
        btnCadastrarAlimentacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroDeAlimentacao   CadastroDeAlimentacao = new   CadastroDeAlimentacao();
        CadastroDeAlimentacao.setVisible(true); // Abre a tela de cadastrar alimentação
            }
        });

        // Ação para o botão "Relatórios e análise"
        btnRelatorioEAnalise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Relatorios Relatorios = new Relatorios();
                Relatorios.setVisible(true); // Abre a tela de relatórios e análise
            }
        });
    }
}