/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.aed.freecell.model;

import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class Freecell extends javax.swing.JFrame {

    /**
     * Creates new form Freecell
     */
    private Baralho baralho;

    public Freecell() {
        initComponents();
        novoJogo();
    }

    private void novoJogo() {
        baralho = new Baralho();
        baralho.embaralhar();
        bRetirarEspaco1.setEnabled(false);
        bRetirarEspaco2.setEnabled(false);
        bRetirarEspaco3.setEnabled(false);
        bRetirarEspaco4.setEnabled(false);
        atualizar();
    }

    private void atualizar() {
        if (venceu()) {
            JOptionPane.showMessageDialog(this, "Parabéns!\nVocê venceu!");
        }
        txtPilha1.setText(baralho.getPrimeiraPilha().imprimeCartas());
        txtPilhaDois.setText(baralho.getSegundaPilha().imprimeCartas());
        txtPilhaTres.setText(baralho.getTerceiraPilha().imprimeCartas());
        txtPilhaQuatro.setText(baralho.getQuartaPilha().imprimeCartas());
        txtPilhaCinco.setText(baralho.getQuintaPilha().imprimeCartas());
        txtPilhaSeis.setText(baralho.getSextaPilha().imprimeCartas());
        txtPilhaSete.setText(baralho.getSetimaPilha().imprimeCartas());
        txtPilhaOito.setText(baralho.getOitavaPilha().imprimeCartas());
        txtPilhaBase1.setText(baralho.getPilhaBase1().imprimeTopo());
        txtPilhaBase2.setText(baralho.getPilhaBase2().imprimeTopo());
        txtPilhaBase3.setText(baralho.getPilhaBase3().imprimeTopo());
        txtPilhaBase4.setText(baralho.getPilhaBase4().imprimeTopo());
        txtEspaco1.setText(baralho.getEspaco1().imprimeTopo());
        txtEspaco2.setText(baralho.getEspaco2().imprimeTopo());
        txtEspaco3.setText(baralho.getEspaco3().imprimeTopo());
        txtEspaco4.setText(baralho.getEspaco4().imprimeTopo());
    }

    private void mudarPilha(String opcao, Pilha pilha) {
        switch (opcao) {
            case "Pilha 1":
                pilha.mudarDePilha(baralho.getPrimeiraPilha());
                break;
            case "Pilha 2":
                pilha.mudarDePilha(baralho.getSegundaPilha());
                break;
            case "Pilha 3":
                pilha.mudarDePilha(baralho.getTerceiraPilha());
                break;
            case "Pilha 4":
                pilha.mudarDePilha(baralho.getQuartaPilha());
                break;
            case "Pilha 5":
                pilha.mudarDePilha(baralho.getQuintaPilha());
                break;
            case "Pilha 6":
                pilha.mudarDePilha(baralho.getSextaPilha());
                break;
            case "Pilha 7":
                pilha.mudarDePilha(baralho.getSetimaPilha());
                break;
            case "Pilha 8":
                pilha.mudarDePilha(baralho.getOitavaPilha());
                break;
        }
    }

    private boolean venceu() {
        if (baralho.getPilhaBase1().isEmpty() && baralho.getPilhaBase2().isEmpty()
                && baralho.getPilhaBase3().isEmpty() && baralho.getPilhaBase4().isEmpty()) {
            return false;
        } else if ((Integer) baralho.getPilhaBase1().top()[1] == 13
                && (Integer) baralho.getPilhaBase2().top()[1] == 13
                && (Integer) baralho.getPilhaBase3().top()[1] == 13
                && (Integer) baralho.getPilhaBase4().top()[1] == 13) {

        }
        return false;
    }

    private void mudarCarta(String opcao, Pilha carta) {
        switch (opcao) {
            case "Pilha 1":
                carta.mudarDePilha(baralho.getPrimeiraPilha());
                break;
            case "Pilha 2":
                carta.mudarDePilha(baralho.getSegundaPilha());
                break;
            case "Pilha 3":
                carta.mudarDePilha(baralho.getTerceiraPilha());
                break;
            case "Pilha 4":
                carta.mudarDePilha(baralho.getQuartaPilha());
                break;
            case "Pilha 5":
                carta.mudarDePilha(baralho.getQuintaPilha());
                break;
            case "Pilha 6":
                carta.mudarDePilha(baralho.getSextaPilha());
                break;
            case "Pilha 7":
                carta.mudarDePilha(baralho.getSetimaPilha());
                break;
            case "Pilha 8":
                carta.mudarDePilha(baralho.getOitavaPilha());
                break;
            case "Pilha base 1":
                baralho.getPilhaBase1().inserirPilhaBase(carta);
                break;
            case "Pilha base 2":
                baralho.getPilhaBase2().inserirPilhaBase(carta);
                break;
            case "Pilha base 3":
                baralho.getPilhaBase3().inserirPilhaBase(carta);
                break;
            case "Pilha base 4":
                baralho.getPilhaBase4().inserirPilhaBase(carta);
                break;
        }
    }

    private void colocarPilhaBase(String opcao, Pilha pilha) {
        switch (opcao) {
            case "Pilha base 1":
                baralho.getPilhaBase1().inserirPilhaBase(pilha);
                break;
            case "Pilha base 2":
                baralho.getPilhaBase2().inserirPilhaBase(pilha);
                break;
            case "Pilha base 3":
                baralho.getPilhaBase3().inserirPilhaBase(pilha);
                break;
            case "Pilha base 4":
                baralho.getPilhaBase4().inserirPilhaBase(pilha);
                break;
        }
    }

    private void colocarEspacoLivre(String opcao, Pilha pilha) {
        switch (opcao) {
            case "Espaço 1":
                pilha.inserirEspacoPilha(baralho.getEspaco1());
                bRetirarEspaco1.setEnabled(true);
                break;
            case "Espaço 2":
                pilha.inserirEspacoPilha(baralho.getEspaco2());
                bRetirarEspaco2.setEnabled(true);
                break;
            case "Espaço 3":
                pilha.inserirEspacoPilha(baralho.getEspaco3());
                bRetirarEspaco3.setEnabled(true);
                break;
            case "Espaço 4":
                pilha.inserirEspacoPilha(baralho.getEspaco4());
                bRetirarEspaco4.setEnabled(true);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pEspaco1 = new javax.swing.JPanel();
        txtEspaco1 = new javax.swing.JLabel();
        pEspaco2 = new javax.swing.JPanel();
        txtEspaco2 = new javax.swing.JLabel();
        pEspaco4 = new javax.swing.JPanel();
        txtEspaco4 = new javax.swing.JLabel();
        pEspaco3 = new javax.swing.JPanel();
        txtEspaco3 = new javax.swing.JLabel();
        pPilha1 = new javax.swing.JPanel();
        txtPilha1 = new javax.swing.JTextArea();
        bMudarPilha1 = new javax.swing.JButton();
        pPilhaBase1 = new javax.swing.JPanel();
        txtPilhaBase1 = new javax.swing.JLabel();
        pPilhaBase2 = new javax.swing.JPanel();
        txtPilhaBase2 = new javax.swing.JLabel();
        pPilhaBase4 = new javax.swing.JPanel();
        txtPilhaBase4 = new javax.swing.JLabel();
        pPilhaBase3 = new javax.swing.JPanel();
        txtPilhaBase3 = new javax.swing.JLabel();
        bMudarPilha2 = new javax.swing.JButton();
        Pilha2 = new javax.swing.JPanel();
        txtPilhaDois = new javax.swing.JTextArea();
        bMudarPilha3 = new javax.swing.JButton();
        Pilha3 = new javax.swing.JPanel();
        txtPilhaTres = new javax.swing.JTextArea();
        Pilha4 = new javax.swing.JPanel();
        txtPilhaQuatro = new javax.swing.JTextArea();
        bMudarPilha4 = new javax.swing.JButton();
        Pilha5 = new javax.swing.JPanel();
        txtPilhaCinco = new javax.swing.JTextArea();
        MudarPilha5 = new javax.swing.JButton();
        Pilha6 = new javax.swing.JPanel();
        txtPilhaSeis = new javax.swing.JTextArea();
        MudarPilha6 = new javax.swing.JButton();
        Pilha7 = new javax.swing.JPanel();
        txtPilhaSete = new javax.swing.JTextArea();
        MudarPilha7 = new javax.swing.JButton();
        Pilha8 = new javax.swing.JPanel();
        txtPilhaOito = new javax.swing.JTextArea();
        MudarPilha8 = new javax.swing.JButton();
        bRetirarEspaco1 = new javax.swing.JButton();
        bRetirarEspaco2 = new javax.swing.JButton();
        bRetirarEspaco3 = new javax.swing.JButton();
        bRetirarEspaco4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        pEspaco1.setBackground(new java.awt.Color(0, 204, 0));
        pEspaco1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true));

        javax.swing.GroupLayout pEspaco1Layout = new javax.swing.GroupLayout(pEspaco1);
        pEspaco1.setLayout(pEspaco1Layout);
        pEspaco1Layout.setHorizontalGroup(
            pEspaco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspaco1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEspaco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pEspaco1Layout.setVerticalGroup(
            pEspaco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspaco1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEspaco1, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEspaco2.setBackground(new java.awt.Color(0, 204, 0));
        pEspaco2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 245, 245), 2, true));

        javax.swing.GroupLayout pEspaco2Layout = new javax.swing.GroupLayout(pEspaco2);
        pEspaco2.setLayout(pEspaco2Layout);
        pEspaco2Layout.setHorizontalGroup(
            pEspaco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspaco2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEspaco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pEspaco2Layout.setVerticalGroup(
            pEspaco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspaco2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEspaco2, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEspaco4.setBackground(new java.awt.Color(0, 204, 0));
        pEspaco4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true));

        javax.swing.GroupLayout pEspaco4Layout = new javax.swing.GroupLayout(pEspaco4);
        pEspaco4.setLayout(pEspaco4Layout);
        pEspaco4Layout.setHorizontalGroup(
            pEspaco4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspaco4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEspaco4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pEspaco4Layout.setVerticalGroup(
            pEspaco4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspaco4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEspaco4, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEspaco3.setBackground(new java.awt.Color(0, 204, 0));
        pEspaco3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true));

        javax.swing.GroupLayout pEspaco3Layout = new javax.swing.GroupLayout(pEspaco3);
        pEspaco3.setLayout(pEspaco3Layout);
        pEspaco3Layout.setHorizontalGroup(
            pEspaco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspaco3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEspaco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pEspaco3Layout.setVerticalGroup(
            pEspaco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspaco3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEspaco3, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        pPilha1.setBackground(new java.awt.Color(0, 255, 51));
        pPilha1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 0)));

        txtPilha1.setEditable(false);
        txtPilha1.setBackground(new java.awt.Color(0, 255, 51));
        txtPilha1.setColumns(20);
        txtPilha1.setRows(5);

        javax.swing.GroupLayout pPilha1Layout = new javax.swing.GroupLayout(pPilha1);
        pPilha1.setLayout(pPilha1Layout);
        pPilha1Layout.setHorizontalGroup(
            pPilha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilha1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pPilha1Layout.setVerticalGroup(
            pPilha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilha1)
        );

        bMudarPilha1.setText("Mudar");
        bMudarPilha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMudarPilha1ActionPerformed(evt);
            }
        });

        pPilhaBase1.setBackground(new java.awt.Color(0, 204, 0));
        pPilhaBase1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true));

        javax.swing.GroupLayout pPilhaBase1Layout = new javax.swing.GroupLayout(pPilhaBase1);
        pPilhaBase1.setLayout(pPilhaBase1Layout);
        pPilhaBase1Layout.setHorizontalGroup(
            pPilhaBase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPilhaBase1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPilhaBase1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPilhaBase1Layout.setVerticalGroup(
            pPilhaBase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPilhaBase1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPilhaBase1, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        pPilhaBase2.setBackground(new java.awt.Color(0, 204, 0));
        pPilhaBase2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 245, 245), 2, true));

        javax.swing.GroupLayout pPilhaBase2Layout = new javax.swing.GroupLayout(pPilhaBase2);
        pPilhaBase2.setLayout(pPilhaBase2Layout);
        pPilhaBase2Layout.setHorizontalGroup(
            pPilhaBase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPilhaBase2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPilhaBase2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPilhaBase2Layout.setVerticalGroup(
            pPilhaBase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPilhaBase2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPilhaBase2, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        pPilhaBase4.setBackground(new java.awt.Color(0, 204, 0));
        pPilhaBase4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true));

        javax.swing.GroupLayout pPilhaBase4Layout = new javax.swing.GroupLayout(pPilhaBase4);
        pPilhaBase4.setLayout(pPilhaBase4Layout);
        pPilhaBase4Layout.setHorizontalGroup(
            pPilhaBase4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPilhaBase4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPilhaBase4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPilhaBase4Layout.setVerticalGroup(
            pPilhaBase4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPilhaBase4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPilhaBase4, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        pPilhaBase3.setBackground(new java.awt.Color(0, 204, 0));
        pPilhaBase3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 2, true));

        javax.swing.GroupLayout pPilhaBase3Layout = new javax.swing.GroupLayout(pPilhaBase3);
        pPilhaBase3.setLayout(pPilhaBase3Layout);
        pPilhaBase3Layout.setHorizontalGroup(
            pPilhaBase3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPilhaBase3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPilhaBase3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPilhaBase3Layout.setVerticalGroup(
            pPilhaBase3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPilhaBase3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPilhaBase3, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        bMudarPilha2.setText("Mudar");
        bMudarPilha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMudarPilha2ActionPerformed(evt);
            }
        });

        Pilha2.setBackground(new java.awt.Color(0, 255, 51));
        Pilha2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 0)));

        txtPilhaDois.setEditable(false);
        txtPilhaDois.setBackground(new java.awt.Color(0, 255, 51));
        txtPilhaDois.setColumns(20);
        txtPilhaDois.setRows(5);

        javax.swing.GroupLayout Pilha2Layout = new javax.swing.GroupLayout(Pilha2);
        Pilha2.setLayout(Pilha2Layout);
        Pilha2Layout.setHorizontalGroup(
            Pilha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaDois, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Pilha2Layout.setVerticalGroup(
            Pilha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaDois, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );

        bMudarPilha3.setText("Mudar");
        bMudarPilha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMudarPilha3ActionPerformed(evt);
            }
        });

        Pilha3.setBackground(new java.awt.Color(0, 255, 51));
        Pilha3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 0)));

        txtPilhaTres.setEditable(false);
        txtPilhaTres.setBackground(new java.awt.Color(0, 255, 51));
        txtPilhaTres.setColumns(20);
        txtPilhaTres.setRows(5);

        javax.swing.GroupLayout Pilha3Layout = new javax.swing.GroupLayout(Pilha3);
        Pilha3.setLayout(Pilha3Layout);
        Pilha3Layout.setHorizontalGroup(
            Pilha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaTres, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Pilha3Layout.setVerticalGroup(
            Pilha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaTres, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );

        Pilha4.setBackground(new java.awt.Color(0, 255, 51));
        Pilha4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 0)));

        txtPilhaQuatro.setEditable(false);
        txtPilhaQuatro.setBackground(new java.awt.Color(0, 255, 51));
        txtPilhaQuatro.setColumns(20);
        txtPilhaQuatro.setRows(5);

        javax.swing.GroupLayout Pilha4Layout = new javax.swing.GroupLayout(Pilha4);
        Pilha4.setLayout(Pilha4Layout);
        Pilha4Layout.setHorizontalGroup(
            Pilha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Pilha4Layout.setVerticalGroup(
            Pilha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaQuatro)
        );

        bMudarPilha4.setText("Mudar");
        bMudarPilha4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMudarPilha4ActionPerformed(evt);
            }
        });

        Pilha5.setBackground(new java.awt.Color(0, 255, 51));
        Pilha5.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 0)));

        txtPilhaCinco.setEditable(false);
        txtPilhaCinco.setBackground(new java.awt.Color(0, 255, 51));
        txtPilhaCinco.setColumns(20);
        txtPilhaCinco.setRows(5);

        javax.swing.GroupLayout Pilha5Layout = new javax.swing.GroupLayout(Pilha5);
        Pilha5.setLayout(Pilha5Layout);
        Pilha5Layout.setHorizontalGroup(
            Pilha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Pilha5Layout.setVerticalGroup(
            Pilha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaCinco)
        );

        MudarPilha5.setText("Mudar");
        MudarPilha5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarPilha5ActionPerformed(evt);
            }
        });

        Pilha6.setBackground(new java.awt.Color(0, 255, 51));
        Pilha6.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 0)));

        txtPilhaSeis.setEditable(false);
        txtPilhaSeis.setBackground(new java.awt.Color(0, 255, 51));
        txtPilhaSeis.setColumns(20);
        txtPilhaSeis.setRows(5);

        javax.swing.GroupLayout Pilha6Layout = new javax.swing.GroupLayout(Pilha6);
        Pilha6.setLayout(Pilha6Layout);
        Pilha6Layout.setHorizontalGroup(
            Pilha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaSeis, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Pilha6Layout.setVerticalGroup(
            Pilha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaSeis)
        );

        MudarPilha6.setText("Mudar");
        MudarPilha6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarPilha6ActionPerformed(evt);
            }
        });

        Pilha7.setBackground(new java.awt.Color(0, 255, 51));
        Pilha7.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 0)));

        txtPilhaSete.setEditable(false);
        txtPilhaSete.setBackground(new java.awt.Color(0, 255, 51));
        txtPilhaSete.setColumns(20);
        txtPilhaSete.setRows(5);

        javax.swing.GroupLayout Pilha7Layout = new javax.swing.GroupLayout(Pilha7);
        Pilha7.setLayout(Pilha7Layout);
        Pilha7Layout.setHorizontalGroup(
            Pilha7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaSete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Pilha7Layout.setVerticalGroup(
            Pilha7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaSete)
        );

        MudarPilha7.setText("Mudar");
        MudarPilha7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarPilha7ActionPerformed(evt);
            }
        });

        Pilha8.setBackground(new java.awt.Color(0, 255, 51));
        Pilha8.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 0)));

        txtPilhaOito.setEditable(false);
        txtPilhaOito.setBackground(new java.awt.Color(0, 255, 51));
        txtPilhaOito.setColumns(20);
        txtPilhaOito.setRows(5);

        javax.swing.GroupLayout Pilha8Layout = new javax.swing.GroupLayout(Pilha8);
        Pilha8.setLayout(Pilha8Layout);
        Pilha8Layout.setHorizontalGroup(
            Pilha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaOito, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Pilha8Layout.setVerticalGroup(
            Pilha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPilhaOito)
        );

        MudarPilha8.setText("Mudar");
        MudarPilha8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarPilha8ActionPerformed(evt);
            }
        });

        bRetirarEspaco1.setText("Retirar");
        bRetirarEspaco1.setEnabled(false);
        bRetirarEspaco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetirarEspaco1ActionPerformed(evt);
            }
        });

        bRetirarEspaco2.setText("Retirar");
        bRetirarEspaco2.setEnabled(false);
        bRetirarEspaco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetirarEspaco2ActionPerformed(evt);
            }
        });

        bRetirarEspaco3.setText("Retirar");
        bRetirarEspaco3.setEnabled(false);
        bRetirarEspaco3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetirarEspaco3ActionPerformed(evt);
            }
        });

        bRetirarEspaco4.setText("Retirar");
        bRetirarEspaco4.setEnabled(false);
        bRetirarEspaco4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetirarEspaco4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bMudarPilha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pPilha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bMudarPilha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pilha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bMudarPilha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pilha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bMudarPilha4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pilha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MudarPilha5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pilha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MudarPilha6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pilha6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MudarPilha7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pilha7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MudarPilha8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pilha8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bRetirarEspaco1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(pEspaco1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pEspaco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bRetirarEspaco2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pEspaco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bRetirarEspaco3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pEspaco4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bRetirarEspaco4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pPilhaBase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pPilhaBase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pPilhaBase3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pPilhaBase4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRetirarEspaco1)
                    .addComponent(bRetirarEspaco2)
                    .addComponent(bRetirarEspaco3)
                    .addComponent(bRetirarEspaco4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pEspaco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEspaco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEspaco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEspaco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPilhaBase4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPilhaBase3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPilhaBase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPilhaBase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bMudarPilha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pPilha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bMudarPilha2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pilha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bMudarPilha3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pilha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bMudarPilha4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pilha4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MudarPilha5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pilha5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MudarPilha6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pilha6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MudarPilha7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pilha7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MudarPilha8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pilha8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Jogo");

        jMenuItem1.setText("Novo Jogo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMudarPilha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMudarPilha1ActionPerformed
        if (!baralho.getPrimeiraPilha().isEmpty()) {
            Object[] opcao = {"Mudar de Pilha", "Celula de Retenção", "Pilha Base"};

            String[] escolha;
            int resp = JOptionPane.showOptionDialog(this, "O que deseja fazer?",
                    "Freecell", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (resp == JOptionPane.YES_OPTION) {
                escolha = new String[]{"Pilha 2", "Pilha 3", "Pilha 4", "Pilha 5", "Pilha 6", "Pilha 7", "Pilha 8"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    mudarPilha(resp2.toString(), baralho.getPrimeiraPilha());
                }
            } else if (resp == JOptionPane.NO_OPTION) {
                escolha = new String[]{"Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha o espaço para guardar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarEspacoLivre(resp2.toString(), baralho.getPrimeiraPilha());
                }
            } else if (resp == JOptionPane.CANCEL_OPTION) {
                escolha = new String[]{"Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha uma pilha base!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarPilhaBase(resp2.toString(), baralho.getPrimeiraPilha());
                }
            }
            atualizar();
        }
    }//GEN-LAST:event_bMudarPilha1ActionPerformed

    private void bMudarPilha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMudarPilha2ActionPerformed
        if (!baralho.getSegundaPilha().isEmpty()) {
            Object[] opcao = {"Mudar de Pilha", "Celula de Retenção", "Pilha Base"};

            String[] escolha;
            int resp = JOptionPane.showOptionDialog(this, "O que deseja fazer?",
                    "Freecell", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (resp == JOptionPane.YES_OPTION) {
                escolha = new String[]{"Pilha 1", "Pilha 3", "Pilha 4", "Pilha 5", "Pilha 6", "Pilha 7", "Pilha 8"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    mudarPilha(resp2.toString(), baralho.getSegundaPilha());
                }
            } else if (resp == JOptionPane.NO_OPTION) {
                escolha = new String[]{"Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha o espaço para guardar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarEspacoLivre(resp2.toString(), baralho.getSegundaPilha());
                }
            } else if (resp == JOptionPane.CANCEL_OPTION) {
                escolha = new String[]{"Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha uma pilha base!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarPilhaBase(resp2.toString(), baralho.getSegundaPilha());
                }
            }
            atualizar();
        }
    }//GEN-LAST:event_bMudarPilha2ActionPerformed

    private void bMudarPilha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMudarPilha3ActionPerformed
        if (!baralho.getTerceiraPilha().isEmpty()) {
            Object[] opcao = {"Mudar de Pilha", "Celula de Retenção", "Pilha Base"};

            String[] escolha;
            int resp = JOptionPane.showOptionDialog(this, "O que deseja fazer?",
                    "Freecell", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (resp == JOptionPane.YES_OPTION) {
                escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 4", "Pilha 5", "Pilha 6", "Pilha 7", "Pilha 8"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    mudarPilha(resp2.toString(), baralho.getTerceiraPilha());
                }
            } else if (resp == JOptionPane.NO_OPTION) {
                escolha = new String[]{"Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha o espaço para guardar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarEspacoLivre(resp2.toString(), baralho.getTerceiraPilha());
                }
            } else if (resp == JOptionPane.CANCEL_OPTION) {
                escolha = new String[]{"Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha uma pilha base!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarPilhaBase(resp2.toString(), baralho.getTerceiraPilha());
                }
            }
            atualizar();
        }
    }//GEN-LAST:event_bMudarPilha3ActionPerformed

    private void bMudarPilha4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMudarPilha4ActionPerformed
        if (!baralho.getQuartaPilha().isEmpty()) {
            Object[] opcao = {"Mudar de Pilha", "Celula de Retenção", "Pilha Base"};

            String[] escolha;
            int resp = JOptionPane.showOptionDialog(this, "O que deseja fazer?",
                    "Freecell", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (resp == JOptionPane.YES_OPTION) {
                escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 5", "Pilha 6", "Pilha 7", "Pilha 8"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    mudarPilha(resp2.toString(), baralho.getQuartaPilha());
                }
            } else if (resp == JOptionPane.NO_OPTION) {
                escolha = new String[]{"Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha o espaço para guardar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarEspacoLivre(resp2.toString(), baralho.getQuartaPilha());
                }
            } else if (resp == JOptionPane.CANCEL_OPTION) {
                escolha = new String[]{"Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha uma pilha base!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarPilhaBase(resp2.toString(), baralho.getQuartaPilha());
                }
            }
            atualizar();
        }
    }//GEN-LAST:event_bMudarPilha4ActionPerformed

    private void MudarPilha5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MudarPilha5ActionPerformed
        if (!baralho.getQuintaPilha().isEmpty()) {
            Object[] opcao = {"Mudar de Pilha", "Celula de Retenção", "Pilha Base"};

            String[] escolha;
            int resp = JOptionPane.showOptionDialog(this, "O que deseja fazer?",
                    "Freecell", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (resp == JOptionPane.YES_OPTION) {
                escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 4", "Pilha 6", "Pilha 7", "Pilha 8"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    mudarPilha(resp2.toString(), baralho.getQuintaPilha());
                }
            } else if (resp == JOptionPane.NO_OPTION) {
                escolha = new String[]{"Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha o espaço para guardar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarEspacoLivre(resp2.toString(), baralho.getQuintaPilha());
                }
            } else if (resp == JOptionPane.CANCEL_OPTION) {
                escolha = new String[]{"Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha uma pilha base!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarPilhaBase(resp2.toString(), baralho.getQuintaPilha());
                }
            }
            atualizar();
        }
    }//GEN-LAST:event_MudarPilha5ActionPerformed

    private void MudarPilha6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MudarPilha6ActionPerformed
        if (!baralho.getSextaPilha().isEmpty()) {
            Object[] opcao = {"Mudar de Pilha", "Celula de Retenção", "Pilha Base"};

            String[] escolha;
            int resp = JOptionPane.showOptionDialog(this, "O que deseja fazer?",
                    "Freecell", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (resp == JOptionPane.YES_OPTION) {
                escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 4", "Pilha 5", "Pilha 7", "Pilha 8"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    mudarPilha(resp2.toString(), baralho.getSextaPilha());
                }
            } else if (resp == JOptionPane.NO_OPTION) {
                escolha = new String[]{"Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha o espaço para guardar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarEspacoLivre(resp2.toString(), baralho.getSextaPilha());
                }
            } else if (resp == JOptionPane.CANCEL_OPTION) {
                escolha = new String[]{"Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha uma pilha base!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarPilhaBase(resp2.toString(), baralho.getSextaPilha());
                }
            }
            atualizar();
        }
    }//GEN-LAST:event_MudarPilha6ActionPerformed

    private void MudarPilha7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MudarPilha7ActionPerformed
        if (!baralho.getSetimaPilha().isEmpty()) {
            Object[] opcao = {"Mudar de Pilha", "Celula de Retenção", "Pilha Base"};

            String[] escolha;
            int resp = JOptionPane.showOptionDialog(this, "O que deseja fazer?",
                    "Freecell", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (resp == JOptionPane.YES_OPTION) {
                escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 4", "Pilha 5", "Pilha 6", "Pilha 7"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    mudarPilha(resp2.toString(), baralho.getSetimaPilha());
                }
            } else if (resp == JOptionPane.NO_OPTION) {
                escolha = new String[]{"Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha o espaço para guardar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarEspacoLivre(resp2.toString(), baralho.getSetimaPilha());
                }
            } else if (resp == JOptionPane.CANCEL_OPTION) {
                escolha = new String[]{"Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha uma pilha base!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarPilhaBase(resp2.toString(), baralho.getSetimaPilha());
                }
            }
            atualizar();
        }
    }//GEN-LAST:event_MudarPilha7ActionPerformed

    private void MudarPilha8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MudarPilha8ActionPerformed
        if (!baralho.getOitavaPilha().isEmpty()) {
            Object[] opcao = {"Mudar de Pilha", "Celula de Retenção", "Pilha Base"};

            String[] escolha;
            int resp = JOptionPane.showOptionDialog(this, "O que deseja fazer?",
                    "Freecell", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            if (resp == JOptionPane.YES_OPTION) {
                escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 4", "Pilha 5", "Pilha 6", "Pilha 7"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    mudarPilha(resp2.toString(), baralho.getOitavaPilha());
                }
            } else if (resp == JOptionPane.NO_OPTION) {
                escolha = new String[]{"Espaço 1", "Espaço 2", "Espaço 3", "Espaço 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha o espaço para guardar a carta!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarEspacoLivre(resp2.toString(), baralho.getOitavaPilha());
                }
            } else if (resp == JOptionPane.CANCEL_OPTION) {
                escolha = new String[]{"Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
                Object resp2 = JOptionPane.showInputDialog(this, "Escolha uma pilha base!",
                        "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
                if (resp2 != null) {
                    colocarPilhaBase(resp2.toString(), baralho.getOitavaPilha());
                }
            }
            atualizar();
        }
    }//GEN-LAST:event_MudarPilha8ActionPerformed

    private void bRetirarEspaco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetirarEspaco1ActionPerformed
        String[] escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 4",
            "Pilha 5", "Pilha 6", "Pilha 7", "Pilha 8", "Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
        Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
        if (resp2 != null) {
            mudarCarta(resp2.toString(), baralho.getEspaco1());
            if (baralho.getEspaco1().isEmpty()) {
                bRetirarEspaco1.setEnabled(false);
            }
            atualizar();
        }
    }//GEN-LAST:event_bRetirarEspaco1ActionPerformed

    private void bRetirarEspaco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetirarEspaco2ActionPerformed
        String[] escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 4", "Pilha 5", "Pilha 6",
            "Pilha 7", "Pilha 8", "Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
        Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
        if (resp2 != null) {
            mudarCarta(resp2.toString(), baralho.getEspaco2());
            if (baralho.getEspaco2().isEmpty()) {
                bRetirarEspaco2.setEnabled(false);
            }
            atualizar();
        }
    }//GEN-LAST:event_bRetirarEspaco2ActionPerformed

    private void bRetirarEspaco3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetirarEspaco3ActionPerformed
        String[] escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 4", "Pilha 5", "Pilha 6",
            "Pilha 7", "Pilha 8", "Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
        Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
        if (resp2 != null) {
            mudarCarta(resp2.toString(), baralho.getEspaco3());
            if (baralho.getEspaco3().isEmpty()) {
                bRetirarEspaco3.setEnabled(false);
            }
            atualizar();
        }
    }//GEN-LAST:event_bRetirarEspaco3ActionPerformed

    private void bRetirarEspaco4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetirarEspaco4ActionPerformed
        String[] escolha = new String[]{"Pilha 1", "Pilha 2", "Pilha 3", "Pilha 4", "Pilha 5", "Pilha 6",
            "Pilha 7", "Pilha 8", "Pilha base 1", "Pilha base 2", "Pilha base 3", "Pilha base 4"};
        Object resp2 = JOptionPane.showInputDialog(this, "Escolha a pilha onde quer colocar a carta!",
                "Freecell", JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[0]);
        if (resp2 != null) {
            mudarCarta(resp2.toString(), baralho.getEspaco4());
            if (baralho.getEspaco4().isEmpty()) {
                bRetirarEspaco4.setEnabled(false);
            }
            atualizar();
        }
    }//GEN-LAST:event_bRetirarEspaco4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        novoJogo();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Freecell.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Freecell.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Freecell.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Freecell.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Freecell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MudarPilha5;
    private javax.swing.JButton MudarPilha6;
    private javax.swing.JButton MudarPilha7;
    private javax.swing.JButton MudarPilha8;
    private javax.swing.JPanel Pilha2;
    private javax.swing.JPanel Pilha3;
    private javax.swing.JPanel Pilha4;
    private javax.swing.JPanel Pilha5;
    private javax.swing.JPanel Pilha6;
    private javax.swing.JPanel Pilha7;
    private javax.swing.JPanel Pilha8;
    private javax.swing.JButton bMudarPilha1;
    private javax.swing.JButton bMudarPilha2;
    private javax.swing.JButton bMudarPilha3;
    private javax.swing.JButton bMudarPilha4;
    private javax.swing.JButton bMudarPilha5;
    private javax.swing.JButton bMudarPilha6;
    private javax.swing.JButton bMudarPilha7;
    private javax.swing.JButton bMudarPilha8;
    private javax.swing.JButton bMudarPilha9;
    private javax.swing.JButton bRetirarEspaco1;
    private javax.swing.JButton bRetirarEspaco2;
    private javax.swing.JButton bRetirarEspaco3;
    private javax.swing.JButton bRetirarEspaco4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pEspaco1;
    private javax.swing.JPanel pEspaco2;
    private javax.swing.JPanel pEspaco3;
    private javax.swing.JPanel pEspaco4;
    private javax.swing.JPanel pPilha1;
    private javax.swing.JPanel pPilha10;
    private javax.swing.JPanel pPilha14;
    private javax.swing.JPanel pPilha2;
    private javax.swing.JPanel pPilha3;
    private javax.swing.JPanel pPilha6;
    private javax.swing.JPanel pPilha7;
    private javax.swing.JPanel pPilha8;
    private javax.swing.JPanel pPilha9;
    private javax.swing.JPanel pPilhaBase1;
    private javax.swing.JPanel pPilhaBase2;
    private javax.swing.JPanel pPilhaBase3;
    private javax.swing.JPanel pPilhaBase4;
    private javax.swing.JLabel txtEspaco1;
    private javax.swing.JLabel txtEspaco2;
    private javax.swing.JLabel txtEspaco3;
    private javax.swing.JLabel txtEspaco4;
    private javax.swing.JTextArea txtPilha1;
    private javax.swing.JTextArea txtPilha10;
    private javax.swing.JTextArea txtPilha14;
    private javax.swing.JTextArea txtPilha2;
    private javax.swing.JTextArea txtPilha3;
    private javax.swing.JTextArea txtPilha6;
    private javax.swing.JTextArea txtPilha7;
    private javax.swing.JTextArea txtPilha8;
    private javax.swing.JTextArea txtPilha9;
    private javax.swing.JLabel txtPilhaBase1;
    private javax.swing.JLabel txtPilhaBase2;
    private javax.swing.JLabel txtPilhaBase3;
    private javax.swing.JLabel txtPilhaBase4;
    private javax.swing.JTextArea txtPilhaCinco;
    private javax.swing.JTextArea txtPilhaDois;
    private javax.swing.JTextArea txtPilhaOito;
    private javax.swing.JTextArea txtPilhaQuatro;
    private javax.swing.JTextArea txtPilhaSeis;
    private javax.swing.JTextArea txtPilhaSete;
    private javax.swing.JTextArea txtPilhaTres;
    // End of variables declaration//GEN-END:variables
}
