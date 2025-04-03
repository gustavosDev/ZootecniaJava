package zootecnia;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Lote;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class CadastroDeLote extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tfNomeDoLote;
    private JTextField tfPesoM;
    private JTextField tfIdadeM;
    JTextField tfRaca;
    
    private String raca;
    private double pesoInicial;
    private double pesoAtual;
    private String dataCompra;
    private int alimentacao;
    private String nome;
    private int idade;
   

    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CadastroDeLote frame = new CadastroDeLote();
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
    public CadastroDeLote() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 758, 454);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Cadastre o novo lote");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 19));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(254, 21, 236, 30);
        contentPane.add(lblNewLabel);
        
        tfNomeDoLote = new JTextField();
        tfNomeDoLote.setBounds(269, 84, 221, 19);
        contentPane.add(tfNomeDoLote);
        tfNomeDoLote.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Nome do lote:");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1.setBounds(323, 61, 98, 13);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Data de chegada:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_1.setBounds(323, 113, 98, 13);
        contentPane.add(lblNewLabel_1_1);
        
        JComboBox<String> cbDia = new JComboBox<>();
        cbDia.setModel(new DefaultComboBoxModel<>(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        cbDia.setBounds(269, 140, 55, 21);
        contentPane.add(cbDia);
        
        JComboBox<String> cbMes = new JComboBox<>();
        cbMes.setModel(new DefaultComboBoxModel<>(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        cbMes.setBounds(333, 140, 73, 21);
        contentPane.add(cbMes);
        
        JComboBox<String> cbAno = new JComboBox<>();
        cbAno.setModel(new DefaultComboBoxModel<>(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        cbAno.setBounds(416, 140, 74, 21);
        contentPane.add(cbAno);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Peso médio:");
        lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_1_1.setBounds(0, 175, 744, 13);
        contentPane.add(lblNewLabel_1_1_1);
        
        tfPesoM = new JTextField();
        tfPesoM.setColumns(10);
        tfPesoM.setBounds(269, 198, 221, 19);
        contentPane.add(tfPesoM);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("Tipo de alimentação:");
        lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_1_1_1.setBounds(304, 279, 132, 13);
        contentPane.add(lblNewLabel_1_1_1_1);

        // Criando o JComboBox com opções
        JComboBox<String> cbTipoDeAlimentacao = new JComboBox<>();
        cbTipoDeAlimentacao.addItem("Selecione uma opção"); // Opção inicial
        cbTipoDeAlimentacao.addItem("01");
        cbTipoDeAlimentacao.addItem("03");
        cbTipoDeAlimentacao.addItem("04");

        cbTipoDeAlimentacao.setBounds(269, 302, 221, 21);
        contentPane.add(cbTipoDeAlimentacao);

   
        
        JLabel lblNewLabel_1_1_1_2 = new JLabel("Idade média:");
        lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_1_1_2.setBounds(0, 227, 744, 13);
        contentPane.add(lblNewLabel_1_1_1_2);
        
        tfIdadeM = new JTextField();
        tfIdadeM.setColumns(10);
        tfIdadeM.setBounds(269, 250, 221, 19);
        contentPane.add(tfIdadeM);
        
        JButton btnCadastrarLote = new JButton("Cadastrar lote");
        btnCadastrarLote.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnCadastrarLote.setBounds(294, 386, 174, 21);
        
    
        btnCadastrarLote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Capturar dados do formulário
                    String nome = tfNomeDoLote.getText().trim();
                    String raca = tfRaca.getText().trim();
                    String pesoTexto = tfPesoM.getText().trim();
                    String idadeTexto = tfIdadeM.getText().trim();

                    // Validar campos obrigatórios
                   

                    double pesoInicial = Double.parseDouble(pesoTexto);
                    int idade = Integer.parseInt(idadeTexto);
                    int alimentacao = Integer.parseInt(cbTipoDeAlimentacao.getSelectedItem().toString());

                    // Obter valores da data
                    String diaSelecionado = (String) cbDia.getSelectedItem();
                    String mesSelecionado = (String) cbMes.getSelectedItem();
                    String anoSelecionado = (String) cbAno.getSelectedItem();

                    // Validar se todos os campos de data foram selecionados
                    if (diaSelecionado == null || mesSelecionado == null || anoSelecionado == null) {
                        JOptionPane.showMessageDialog(contentPane, "Por favor, selecione todos os campos da data.");
                        return;
                    }

                    // Formatar data no formato esperado
                    String diaFormatado = String.format("%02d", Integer.parseInt(diaSelecionado));
                    String mesFormatado = String.format("%02d", Integer.parseInt(mesSelecionado));
                    String dataFormatada = anoSelecionado + "-" + mesFormatado + "-" + diaFormatado;
                    // Captura o valor da raça

                 // Validar campos obrigatórios
                 if (nome.isEmpty() ||  pesoTexto.isEmpty() || idadeTexto.isEmpty()) {
                     JOptionPane.showMessageDialog(contentPane, "Todos os campos são obrigatórios. Por favor, preencha todos.");
                     return;
                 }


                    // Criar o objeto Lote
                    Lote cadastro = new Lote();
                    cadastro.cadastrarLote(nome, raca, pesoInicial, 0.0, dataFormatada, alimentacao, idade);

                    // Inserir os dados
                    cadastro.inserirDados();

                    JOptionPane.showMessageDialog(contentPane, "Lote cadastrado com sucesso!");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(contentPane, "Erro ao converter número. Verifique os valores de peso e idade.");
                    ex.printStackTrace();
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(contentPane, "Erro no formato da data. Verifique os valores selecionados.");
                    ex.printStackTrace();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(contentPane, "Erro inesperado: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
        		
        	
        contentPane.add(btnCadastrarLote);
        
    
      
        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Raça:");
        lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_1_1_1_1.setBounds(304, 333, 132, 13);
        contentPane.add(lblNewLabel_1_1_1_1_1);

        tfRaca = new JTextField();
        tfRaca.setColumns(10);
        tfRaca.setBounds(269, 356, 221, 19); // Apenas uma instância e um setBounds
        contentPane.add(tfRaca);
     
        
        
        
        
        
    
    }
        }
    