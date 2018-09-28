package ProjetoV2;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class AppCorrida extends javax.swing.JFrame {

    public AppCorrida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAdicionarCarro = new javax.swing.JDialog();
        jPanelPainelAdicionarCarro = new javax.swing.JPanel();
        jPanelEcra = new javax.swing.JPanel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelCondutor = new javax.swing.JLabel();
        jComboBoxCondutor = new javax.swing.JComboBox<>();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonFecharCarro = new javax.swing.JButton();
        jDialogVerListaCondutorCarro = new javax.swing.JDialog();
        jPanelLista = new javax.swing.JPanel();
        jScrollPaneLista = new javax.swing.JScrollPane();
        jTableListaCarrosCondutor = new javax.swing.JTable();
        jButtonRemover = new javax.swing.JButton();
        jButtonFecharCarros = new javax.swing.JButton();
        jButtonAddCarro = new javax.swing.JButton();
        jDialogPartida = new javax.swing.JDialog();
        jPanelPainel3 = new javax.swing.JPanel();
        jPanelEcraResultados = new javax.swing.JPanel();
        jLabelResultados = new javax.swing.JLabel();
        jButtonPartir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonConfg = new javax.swing.JButton();
        jPanelEcraVencedor = new javax.swing.JPanel();
        jDialogAdicionarCondutor = new javax.swing.JDialog();
        jPanelPainel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonAdicionarCondutor = new javax.swing.JButton();
        jTextFieldIdade = new javax.swing.JTextField();
        jButtonFecharCondutor = new javax.swing.JButton();
        jDialogConfiguracoes = new javax.swing.JDialog();
        jPanelConfiguracoes = new javax.swing.JPanel();
        jButtonGuardarVencedor = new javax.swing.JButton();
        jButtonLimparEcra = new javax.swing.JButton();
        jButtonVoltarInicio = new javax.swing.JButton();
        jButtonMudarFundo = new javax.swing.JButton();
        jLabelImagen2 = new javax.swing.JLabel();
        jButtonListaVencedores = new javax.swing.JButton();
        jDialogListaVencedores = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaVencedores = new javax.swing.JTable();
        jButtonImprimirListaVencedores = new javax.swing.JButton();
        jButtonFecharListaVencedor = new javax.swing.JButton();
        jPanelPainel = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jPanelBoasVindas = new javax.swing.JPanel();
        jLabelBenVindas = new javax.swing.JLabel();
        jMenuBarListaMenu = new javax.swing.JMenuBar();
        jMenuAplicacao = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuCentroCorridas = new javax.swing.JMenu();
        jMenuItemAdicionarCO = new javax.swing.JMenuItem();
        jMenuItemAdicionarCA = new javax.swing.JMenuItem();
        jMenuItemVerLI = new javax.swing.JMenuItem();
        jMenuItemIniPartidas = new javax.swing.JMenuItem();

        jDialogAdicionarCarro.setTitle("Adicionar Carro");
        jDialogAdicionarCarro.setMinimumSize(new java.awt.Dimension(700, 500));

        jPanelPainelAdicionarCarro.setBackground(new java.awt.Color(153, 153, 255));
        jPanelPainelAdicionarCarro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelEcra.setBackground(new java.awt.Color(255, 204, 102));
        jPanelEcra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Carro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabelPlaca.setText("Matricula:");

        jLabelModelo.setText("Modelo:");

        jLabelMarca.setText("Marca:");

        jTextFieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaActionPerformed(evt);
            }
        });

        jLabelCondutor.setText("Condutor:");

        javax.swing.GroupLayout jPanelEcraLayout = new javax.swing.GroupLayout(jPanelEcra);
        jPanelEcra.setLayout(jPanelEcraLayout);
        jPanelEcraLayout.setHorizontalGroup(
            jPanelEcraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEcraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelEcraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelPlaca)
                    .addComponent(jLabelCondutor))
                .addGap(22, 22, 22)
                .addGroup(jPanelEcraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMarca)
                    .addComponent(jTextFieldModelo)
                    .addComponent(jTextFieldMatricula)
                    .addComponent(jComboBoxCondutor, 0, 365, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        jPanelEcraLayout.setVerticalGroup(
            jPanelEcraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEcraLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelEcraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEcraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelo)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEcraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlaca)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEcraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCondutor)
                    .addComponent(jComboBoxCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jButtonAdicionar.setBackground(new java.awt.Color(51, 255, 102));
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonFecharCarro.setBackground(new java.awt.Color(255, 51, 51));
        jButtonFecharCarro.setText("Fechar");
        jButtonFecharCarro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFecharCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPainelAdicionarCarroLayout = new javax.swing.GroupLayout(jPanelPainelAdicionarCarro);
        jPanelPainelAdicionarCarro.setLayout(jPanelPainelAdicionarCarroLayout);
        jPanelPainelAdicionarCarroLayout.setHorizontalGroup(
            jPanelPainelAdicionarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPainelAdicionarCarroLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFecharCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanelPainelAdicionarCarroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanelEcra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanelPainelAdicionarCarroLayout.setVerticalGroup(
            jPanelPainelAdicionarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelAdicionarCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEcra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPainelAdicionarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharCarro)
                    .addComponent(jButtonAdicionar))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jDialogAdicionarCarroLayout = new javax.swing.GroupLayout(jDialogAdicionarCarro.getContentPane());
        jDialogAdicionarCarro.getContentPane().setLayout(jDialogAdicionarCarroLayout);
        jDialogAdicionarCarroLayout.setHorizontalGroup(
            jDialogAdicionarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAdicionarCarroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanelPainelAdicionarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jDialogAdicionarCarroLayout.setVerticalGroup(
            jDialogAdicionarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAdicionarCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPainelAdicionarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jDialogVerListaCondutorCarro.setTitle("Ver Lista");
        jDialogVerListaCondutorCarro.setBackground(new java.awt.Color(255, 204, 204));
        jDialogVerListaCondutorCarro.setMinimumSize(new java.awt.Dimension(600, 700));

        jPanelLista.setBackground(new java.awt.Color(153, 153, 153));
        jPanelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Carros e Condutores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        jTableListaCarrosCondutor.setBackground(new java.awt.Color(255, 153, 153));
        jTableListaCarrosCondutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carros", "Condutores"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneLista.setViewportView(jTableListaCarrosCondutor);

        jButtonRemover.setBackground(new java.awt.Color(51, 102, 255));
        jButtonRemover.setText("Remover");
        jButtonRemover.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonFecharCarros.setBackground(new java.awt.Color(255, 51, 51));
        jButtonFecharCarros.setText("Fechar");
        jButtonFecharCarros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFecharCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharCarrosActionPerformed(evt);
            }
        });

        jButtonAddCarro.setBackground(new java.awt.Color(51, 255, 51));
        jButtonAddCarro.setText("Adicionar");
        jButtonAddCarro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jButtonAddCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButtonFecharCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneLista, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneLista, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddCarro)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonFecharCarros))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jDialogVerListaCondutorCarroLayout = new javax.swing.GroupLayout(jDialogVerListaCondutorCarro.getContentPane());
        jDialogVerListaCondutorCarro.getContentPane().setLayout(jDialogVerListaCondutorCarroLayout);
        jDialogVerListaCondutorCarroLayout.setHorizontalGroup(
            jDialogVerListaCondutorCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogVerListaCondutorCarroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jDialogVerListaCondutorCarroLayout.setVerticalGroup(
            jDialogVerListaCondutorCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogVerListaCondutorCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jDialogPartida.setTitle("Partidas");
        jDialogPartida.setMinimumSize(new java.awt.Dimension(700, 400));

        jPanelPainel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanelPainel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelEcraResultados.setBackground(new java.awt.Color(255, 153, 153));
        jPanelEcraResultados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelEcraResultadosLayout = new javax.swing.GroupLayout(jPanelEcraResultados);
        jPanelEcraResultados.setLayout(jPanelEcraResultadosLayout);
        jPanelEcraResultadosLayout.setHorizontalGroup(
            jPanelEcraResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEcraResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEcraResultadosLayout.setVerticalGroup(
            jPanelEcraResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEcraResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonPartir.setBackground(new java.awt.Color(51, 255, 51));
        jButtonPartir.setText("Partir");
        jButtonPartir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPartirActionPerformed(evt);
            }
        });

        jButtonFechar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonFechar.setText("Fechar");
        jButtonFechar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonConfg.setBackground(new java.awt.Color(51, 102, 255));
        jButtonConfg.setText("Configurações");
        jButtonConfg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonConfg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfgActionPerformed(evt);
            }
        });

        jPanelEcraVencedor.setBackground(new java.awt.Color(153, 255, 153));
        jPanelEcraVencedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelEcraVencedorLayout = new javax.swing.GroupLayout(jPanelEcraVencedor);
        jPanelEcraVencedor.setLayout(jPanelEcraVencedorLayout);
        jPanelEcraVencedorLayout.setHorizontalGroup(
            jPanelEcraVencedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelEcraVencedorLayout.setVerticalGroup(
            jPanelEcraVencedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPainel3Layout = new javax.swing.GroupLayout(jPanelPainel3);
        jPanelPainel3.setLayout(jPanelPainel3Layout);
        jPanelPainel3Layout.setHorizontalGroup(
            jPanelPainel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEcraResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPainel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonConfg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jButtonPartir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanelPainel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEcraVencedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPainel3Layout.setVerticalGroup(
            jPanelPainel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEcraResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPainel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonPartir)
                    .addComponent(jButtonConfg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEcraVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogPartidaLayout = new javax.swing.GroupLayout(jDialogPartida.getContentPane());
        jDialogPartida.getContentPane().setLayout(jDialogPartidaLayout);
        jDialogPartidaLayout.setHorizontalGroup(
            jDialogPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPainel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogPartidaLayout.setVerticalGroup(
            jDialogPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPainel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogAdicionarCondutor.setTitle("Adicionar Condutor");
        jDialogAdicionarCondutor.setMinimumSize(new java.awt.Dimension(500, 300));

        jPanelPainel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanelPainel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Condutor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabelNome.setText("Nome:");

        jLabelIdade.setText("Idade:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jButtonAdicionarCondutor.setBackground(new java.awt.Color(102, 255, 102));
        jButtonAdicionarCondutor.setText("Adicionar");
        jButtonAdicionarCondutor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAdicionarCondutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarCondutorActionPerformed(evt);
            }
        });

        jTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeActionPerformed(evt);
            }
        });
        jTextFieldIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdadeKeyTyped(evt);
            }
        });

        jButtonFecharCondutor.setBackground(new java.awt.Color(255, 51, 51));
        jButtonFecharCondutor.setText("Fechar");
        jButtonFecharCondutor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFecharCondutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharCondutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelIdade)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addComponent(jButtonAdicionarCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFecharCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionarCondutor)
                    .addComponent(jButtonFecharCondutor)))
        );

        javax.swing.GroupLayout jPanelPainel4Layout = new javax.swing.GroupLayout(jPanelPainel4);
        jPanelPainel4.setLayout(jPanelPainel4Layout);
        jPanelPainel4Layout.setHorizontalGroup(
            jPanelPainel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelPainel4Layout.setVerticalGroup(
            jPanelPainel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogAdicionarCondutorLayout = new javax.swing.GroupLayout(jDialogAdicionarCondutor.getContentPane());
        jDialogAdicionarCondutor.getContentPane().setLayout(jDialogAdicionarCondutorLayout);
        jDialogAdicionarCondutorLayout.setHorizontalGroup(
            jDialogAdicionarCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAdicionarCondutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPainel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogAdicionarCondutorLayout.setVerticalGroup(
            jDialogAdicionarCondutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAdicionarCondutorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPainel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDialogConfiguracoes.setTitle("Configurações");

        jPanelConfiguracoes.setBackground(new java.awt.Color(204, 204, 204));
        jPanelConfiguracoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonGuardarVencedor.setBackground(new java.awt.Color(255, 153, 153));
        jButtonGuardarVencedor.setText("Guardar Vencedor");
        jButtonGuardarVencedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonLimparEcra.setBackground(new java.awt.Color(102, 255, 102));
        jButtonLimparEcra.setText("Limpar Campo do Ecra");
        jButtonLimparEcra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonVoltarInicio.setBackground(new java.awt.Color(153, 153, 255));
        jButtonVoltarInicio.setText("Voltar ao Inicio");
        jButtonVoltarInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVoltarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarInicioActionPerformed(evt);
            }
        });

        jButtonMudarFundo.setBackground(new java.awt.Color(153, 153, 153));
        jButtonMudarFundo.setText("Mudar fundo do Ecra");
        jButtonMudarFundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Carros1.jpg"))); // NOI18N
        jLabelImagen2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonListaVencedores.setBackground(new java.awt.Color(255, 102, 102));
        jButtonListaVencedores.setText("Lista Vencedores");
        jButtonListaVencedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonListaVencedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaVencedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConfiguracoesLayout = new javax.swing.GroupLayout(jPanelConfiguracoes);
        jPanelConfiguracoes.setLayout(jPanelConfiguracoesLayout);
        jPanelConfiguracoesLayout.setHorizontalGroup(
            jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListaVencedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                        .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVoltarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGuardarVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMudarFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLimparEcra, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, Short.MAX_VALUE))
        );
        jPanelConfiguracoesLayout.setVerticalGroup(
            jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                        .addComponent(jLabelImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelConfiguracoesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButtonLimparEcra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonMudarFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonGuardarVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonListaVencedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonVoltarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );

        javax.swing.GroupLayout jDialogConfiguracoesLayout = new javax.swing.GroupLayout(jDialogConfiguracoes.getContentPane());
        jDialogConfiguracoes.getContentPane().setLayout(jDialogConfiguracoesLayout);
        jDialogConfiguracoesLayout.setHorizontalGroup(
            jDialogConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jDialogConfiguracoesLayout.setVerticalGroup(
            jDialogConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jDialogListaVencedores.setTitle("Lista Vencedores");
        jDialogListaVencedores.setBackground(new java.awt.Color(0, 153, 204));

        jTableListaVencedores.setBackground(new java.awt.Color(0, 102, 102));
        jTableListaVencedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Carro", "Marca", "Modelo", "Condutor", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListaVencedores);

        jButtonImprimirListaVencedores.setBackground(new java.awt.Color(51, 204, 0));
        jButtonImprimirListaVencedores.setText("Imprimir");
        jButtonImprimirListaVencedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonFecharListaVencedor.setBackground(new java.awt.Color(255, 51, 51));
        jButtonFecharListaVencedor.setText("Fechar");
        jButtonFecharListaVencedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFecharListaVencedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharListaVencedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogListaVencedoresLayout = new javax.swing.GroupLayout(jDialogListaVencedores.getContentPane());
        jDialogListaVencedores.getContentPane().setLayout(jDialogListaVencedoresLayout);
        jDialogListaVencedoresLayout.setHorizontalGroup(
            jDialogListaVencedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaVencedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jDialogListaVencedoresLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButtonImprimirListaVencedores, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFecharListaVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jDialogListaVencedoresLayout.setVerticalGroup(
            jDialogListaVencedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaVencedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogListaVencedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonImprimirListaVencedores, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jButtonFecharListaVencedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App Corridas");
        setBackground(new java.awt.Color(102, 153, 255));

        jPanelPainel.setBackground(new java.awt.Color(51, 153, 255));
        jPanelPainel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPainel.setForeground(new java.awt.Color(51, 255, 51));

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Carros.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelPainelLayout = new javax.swing.GroupLayout(jPanelPainel);
        jPanelPainel.setLayout(jPanelPainelLayout);
        jPanelPainelLayout.setHorizontalGroup(
            jPanelPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPainelLayout.setVerticalGroup(
            jPanelPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPainelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBoasVindas.setBackground(new java.awt.Color(51, 153, 255));
        jPanelBoasVindas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelBenVindas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelBenVindas.setForeground(new java.awt.Color(0, 102, 102));
        jLabelBenVindas.setText("Bem-vindo a App Corrida de Carros");

        javax.swing.GroupLayout jPanelBoasVindasLayout = new javax.swing.GroupLayout(jPanelBoasVindas);
        jPanelBoasVindas.setLayout(jPanelBoasVindasLayout);
        jPanelBoasVindasLayout.setHorizontalGroup(
            jPanelBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBoasVindasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBenVindas)
                .addGap(64, 64, 64))
        );
        jPanelBoasVindasLayout.setVerticalGroup(
            jPanelBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoasVindasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBenVindas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBarListaMenu.setBackground(new java.awt.Color(255, 102, 102));
        jMenuBarListaMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBarListaMenu.setForeground(new java.awt.Color(240, 240, 240));

        jMenuAplicacao.setBackground(new java.awt.Color(255, 204, 204));
        jMenuAplicacao.setText("Aplicação");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 0, 51));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAplicacao.add(jMenuItem1);

        jMenuBarListaMenu.add(jMenuAplicacao);

        jMenuCentroCorridas.setBackground(new java.awt.Color(153, 255, 255));
        jMenuCentroCorridas.setText("Gestão de Corrida");
        jMenuCentroCorridas.setBorderPainted(true);

        jMenuItemAdicionarCO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAdicionarCO.setBackground(new java.awt.Color(153, 255, 102));
        jMenuItemAdicionarCO.setText("Adicionar Condutor");
        jMenuItemAdicionarCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarCOActionPerformed(evt);
            }
        });
        jMenuCentroCorridas.add(jMenuItemAdicionarCO);

        jMenuItemAdicionarCA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAdicionarCA.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItemAdicionarCA.setText("Adicionar Carro");
        jMenuItemAdicionarCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarCAActionPerformed(evt);
            }
        });
        jMenuCentroCorridas.add(jMenuItemAdicionarCA);

        jMenuItemVerLI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemVerLI.setBackground(new java.awt.Color(153, 153, 153));
        jMenuItemVerLI.setText("Ver Lista de Carros");
        jMenuItemVerLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerLIActionPerformed(evt);
            }
        });
        jMenuCentroCorridas.add(jMenuItemVerLI);

        jMenuItemIniPartidas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemIniPartidas.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItemIniPartidas.setText("Iniciar Partida");
        jMenuItemIniPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniPartidasActionPerformed(evt);
            }
        });
        jMenuCentroCorridas.add(jMenuItemIniPartidas);

        jMenuBarListaMenu.add(jMenuCentroCorridas);

        setJMenuBar(jMenuBarListaMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelBoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemAdicionarCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarCAActionPerformed
        //Buscar todos condutores da base de dados
        String url = "jdbc:sqlite:Condutores.db";
        Connection con;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select distinct nome from Condutor");

            //Ler os nomes da base dados para a Combobox 
            jComboBoxCondutor.removeAllItems();
            jComboBoxCondutor.addItem("-- Escolha Aqui o Condutor --");
            while (rs.next()) {
                String nome = rs.getString("nome");
                jComboBoxCondutor.addItem(nome);
            }
            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        jDialogAdicionarCarro.setSize(560, 350);
        jDialogAdicionarCarro.setLocationRelativeTo(null);
        jDialogAdicionarCarro.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdicionarCAActionPerformed

    private void jMenuItemVerLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerLIActionPerformed
        jDialogVerListaCondutorCarro.setSize(500, 600);
        jDialogVerListaCondutorCarro.setLocationRelativeTo(null);
        jDialogVerListaCondutorCarro.setVisible(true);
    }//GEN-LAST:event_jMenuItemVerLIActionPerformed

    private void jMenuItemIniPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniPartidasActionPerformed
        jDialogPartida.setSize(650, 600);
        jDialogPartida.setLocationRelativeTo(null);
        jDialogPartida.setVisible(true);
    }//GEN-LAST:event_jMenuItemIniPartidasActionPerformed

    private void jMenuItemAdicionarCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarCOActionPerformed
        jDialogAdicionarCondutor.setLocationRelativeTo(null);
        jDialogAdicionarCondutor.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdicionarCOActionPerformed

    private void jTextFieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        jDialogPartida.setVisible(false);

    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonFecharCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharCarrosActionPerformed
        jDialogVerListaCondutorCarro.setVisible(false);
    }//GEN-LAST:event_jButtonFecharCarrosActionPerformed

    private void jButtonAdicionarCondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarCondutorActionPerformed
        String Nome = jTextFieldNome.getText();
        int Idade = Integer.parseInt(jTextFieldIdade.getText());

        // Inserir dados nestas variaveis na base de dados
        String url = "jdbc:sqlite:Condutores.db";
        Connection con;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO Condutor (Nome, Idade)"
                    + "VALUES ('" + Nome + "',"
                    + Idade + ")");

            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        // Fim Inserir BD
        this.limpaCamposCondutor();
        JOptionPane.showMessageDialog(this, "Condutor Adicionado com sucesso!");
    }//GEN-LAST:event_jButtonAdicionarCondutorActionPerformed

    private void jButtonAddCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCarroActionPerformed
        jDialogAdicionarCarro.setLocationRelativeTo(null);
        jDialogAdicionarCarro.setVisible(true);
    }//GEN-LAST:event_jButtonAddCarroActionPerformed

    private void jButtonFecharCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharCarroActionPerformed
        jDialogAdicionarCarro.setVisible(false);
    }//GEN-LAST:event_jButtonFecharCarroActionPerformed

    private void jButtonFecharCondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharCondutorActionPerformed
        jDialogAdicionarCondutor.setVisible(false);    }//GEN-LAST:event_jButtonFecharCondutorActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        String marca = jTextFieldMarca.getText();
        String modelo = jTextFieldModelo.getText();
        String matricula = jTextFieldMatricula.getText();
        String condutor = jComboBoxCondutor.getItemAt(WIDTH);
        L.guardaCarros(marca, modelo, matricula, condutor);
        this.limpaCamposCarro();
        JOptionPane.showMessageDialog(this, "Carro Adicionado com sucesso!");
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void jTextFieldIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdadeKeyTyped
        //Valida ate 2 numeros
        int k = evt.getKeyChar();
        if ((k > 47 && k < 58)) {
            if (jTextFieldIdade.getText().length() == 2) {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            }
        } else {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
        String caracteres = "0987654321";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldIdadeKeyTyped

    private void jTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeActionPerformed

    private void jButtonPartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPartirActionPerformed

        ArrayList<Carro> carros = new ArrayList();

        Random r = new Random();

        for (int i = 0; i < 2; i++) {
            System.out.println("Etapa " + (i + 1) + " Da Corrida. ");
            System.out.println("Tempo da volta: ");
            if (i == 0) {
                for (int x = 0; x < 20; x++) {
                    for (Carro b : carros) {
                        double a = r.nextDouble() * 20;
                        b.addTempo(a);
                    }
                }
                for (Carro b : carros) {
                    System.out.println("Carro " + b.getId() + " tempo " + b.getTempo());
                }
                getWinnerFase1(carros);
            }
            if (i == 2) {
                for (Carro b : carros) {
                    double a = r.nextDouble() * 20;
                    b.addTempo(a);
                }
            }
            System.out.println("*****************************");
        }

    }

    public static void getWinnerFase1(ArrayList<Carro> carros) {

        Carro winner = new Carro(99);
        winner.setTempo(99999);

        for (Carro b : carros) {
            if (b.getTempo() < winner.getTempo()) {
                winner = b;
            }
        }

        System.out.println("Vencedor: " + winner);
    }

    public static ArrayList<Carro> initCarros() throws IOException {

        ArrayList<Carro> tmp = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            tmp.add(new Carro(i));
        }

        return tmp;
    }//GEN-LAST:event_jButtonPartirActionPerformed

    private void jButtonConfgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfgActionPerformed
        jDialogConfiguracoes.setSize(650, 600);
        jDialogConfiguracoes.setLocationRelativeTo(null);
        jDialogConfiguracoes.setVisible(true);
    }//GEN-LAST:event_jButtonConfgActionPerformed

    private void jButtonVoltarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarInicioActionPerformed
        jDialogConfiguracoes.setVisible(false);
        jDialogAdicionarCarro.setVisible(false);
        jDialogAdicionarCondutor.setVisible(false);
        jDialogPartida.setVisible(false);
        jDialogVerListaCondutorCarro.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarInicioActionPerformed

    private void jButtonListaVencedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaVencedoresActionPerformed
        jDialogListaVencedores.setSize(490, 530);
        jDialogListaVencedores.setLocationRelativeTo(null);
        jDialogListaVencedores.setVisible(true);
    }//GEN-LAST:event_jButtonListaVencedoresActionPerformed

    private void jButtonFecharListaVencedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharListaVencedorActionPerformed
        jDialogListaVencedores.setVisible(false);
    }//GEN-LAST:event_jButtonFecharListaVencedorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppCorrida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCarro;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAdicionarCondutor;
    private javax.swing.JButton jButtonConfg;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonFecharCarro;
    private javax.swing.JButton jButtonFecharCarros;
    private javax.swing.JButton jButtonFecharCondutor;
    private javax.swing.JButton jButtonFecharListaVencedor;
    private javax.swing.JButton jButtonGuardarVencedor;
    private javax.swing.JButton jButtonImprimirListaVencedores;
    private javax.swing.JButton jButtonLimparEcra;
    private javax.swing.JButton jButtonListaVencedores;
    private javax.swing.JButton jButtonMudarFundo;
    private javax.swing.JButton jButtonPartir;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonVoltarInicio;
    private javax.swing.JComboBox<String> jComboBoxCondutor;
    private javax.swing.JDialog jDialogAdicionarCarro;
    private javax.swing.JDialog jDialogAdicionarCondutor;
    private javax.swing.JDialog jDialogConfiguracoes;
    private javax.swing.JDialog jDialogListaVencedores;
    private javax.swing.JDialog jDialogPartida;
    private javax.swing.JDialog jDialogVerListaCondutorCarro;
    private javax.swing.JLabel jLabelBenVindas;
    private javax.swing.JLabel jLabelCondutor;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelImagen2;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelResultados;
    private javax.swing.JMenu jMenuAplicacao;
    private javax.swing.JMenuBar jMenuBarListaMenu;
    private javax.swing.JMenu jMenuCentroCorridas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAdicionarCA;
    private javax.swing.JMenuItem jMenuItemAdicionarCO;
    private javax.swing.JMenuItem jMenuItemIniPartidas;
    private javax.swing.JMenuItem jMenuItemVerLI;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBoasVindas;
    private javax.swing.JPanel jPanelConfiguracoes;
    private javax.swing.JPanel jPanelEcra;
    private javax.swing.JPanel jPanelEcraResultados;
    private javax.swing.JPanel jPanelEcraVencedor;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JPanel jPanelPainel;
    private javax.swing.JPanel jPanelPainel3;
    private javax.swing.JPanel jPanelPainel4;
    private javax.swing.JPanel jPanelPainelAdicionarCarro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneLista;
    private javax.swing.JTable jTableListaCarrosCondutor;
    private javax.swing.JTable jTableListaVencedores;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    Carro L = new Carro();

    private void limpaCamposCondutor() {
        jTextFieldNome.setText("");
        jTextFieldIdade.setText("");
    }

    private void limpaCamposCarro() {
        jTextFieldMarca.setText("");
        jTextFieldModelo.setText("");
        jTextFieldMatricula.setText("");
        jComboBoxCondutor.removeAllItems();
    }
}
