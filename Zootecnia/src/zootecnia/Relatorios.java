package zootecnia;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Relatorios extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Relatorios frame = new Relatorios();
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
    public Relatorios() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 747, 501);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Campo de texto para buscar o lote
        textField = new JTextField();
        textField.setBounds(25, 93, 166, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        // Label para o campo de busca
        JLabel lblNewLabel = new JLabel("Procurar lote:");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel.setBounds(25, 73, 117, 19);
        contentPane.add(lblNewLabel);

        // Título da tela
        JLabel lblNewLabel_1 = new JLabel("Relatórios e Análise");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 19));
        lblNewLabel_1.setBounds(0, 25, 733, 30);
        contentPane.add(lblNewLabel_1);

        // Botão de pesquisar
        JButton btnPesquisarLote = new JButton("Pesquisar");
        btnPesquisarLote.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnPesquisarLote.setBounds(197, 92, 107, 19);
        contentPane.add(btnPesquisarLote);

        // Área de exibição dos resultados
        JTextArea textAreaResultados = new JTextArea();
        textAreaResultados.setEditable(false); // Evitar edição
        JScrollPane scrollPane = new JScrollPane(textAreaResultados);
        scrollPane.setBounds(25, 150, 680, 300);
        contentPane.add(scrollPane);

        // Ação ao clicar no botão "Pesquisar"
        btnPesquisarLote.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeLote = textField.getText().trim();

                // Simulando uma busca (substitua por uma consulta ao banco de dados)
                if (nomeLote.equalsIgnoreCase("Lote1")) {
                    textAreaResultados.setText(
                        "Nome do Lote: Lote1\n" +
                        "Data de Chegada: 01/01/2022\n" +
                        "Peso Médio: 500kg\n" +
                        "Idade Média: 2 anos\n" +
                        "Tipo de Alimentação: Pasto"
                    );
                } else if (nomeLote.isEmpty()) {
                    textAreaResultados.setText("Por favor, insira o nome ou ID de um lote para pesquisa.");
                } else {
                    textAreaResultados.setText("Lote não encontrado.");
                }
            }
        });
    }
}