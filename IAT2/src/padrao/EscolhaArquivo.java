/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

/**
 *
 * @author gustavocastrohs
 */
public class EscolhaArquivo extends javax.swing.JFrame {

    ArrayList<String> arquivoASeTratado = new ArrayList<>();
    ArrayList<String> arquivoComOsItensParaExclusao = new ArrayList<>();
    String arquivoExclusao="";
    /**
     * Creates new form EscolhaArquivo
     */
    public EscolhaArquivo() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Escolha da pasta a ser tratada");
        jButton1.setActionCommand("Escolha o arquivo com as palavras iniciais");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jButton2.setText("Escolha o arquivo com as palavras a serem excluidas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salvar documento Processado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jScrollPane3.setViewportView(jList3);

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Salvar Novo Arquivos de Exclusao");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome da classe");

        jLabel4.setText("jLabel4");

        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList4);

        jButton6.setText("Processar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("R");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jButton6)
                .addGap(221, 221, 221)
                .addComponent(jButton3))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButton2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton3))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.CANCEL_OPTION) {
        } else {
            String path = fileChooser.getSelectedFile().getParent();

            jLabel1.setText(path);

            try {
                lePasta(new File(path));

                //       System.out.println("Arquivo:" + path + "\nnumero de linhas" + arquivoASeTratado.size());
            } catch (IOException ex) {
                Logger.getLogger(EscolhaArquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();


        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.CANCEL_OPTION) {
        } else {
            String path = fileChooser.getSelectedFile().getPath();

            arquivoExclusao=(path);
            try {
                leArquivoExclusao(path);
                
                System.out.println("Arquivos para exclusao:" + path);
            } catch (IOException ex) {
                Logger.getLogger(EscolhaArquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        salvaArquivoExclusao();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String selectedValue = (String) jList1.getSelectedValue();
        if (cadastraNaLista(arquivoComOsItensParaExclusao, selectedValue)) {
            arquivoComOsItensParaExclusao.add(selectedValue);
            DefaultListModel model = (DefaultListModel) jList2.getModel();
            model.addElement(selectedValue);
            jList2.setModel(model);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        processaArquivo(arquivoASeTratado, arquivoASeTratado);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        try {
            leArquivo(new File(jLabel1.getText() + "\\" + jList4.getSelectedValue().toString()),(DefaultListModel)jList1.getModel());
        } catch (IOException ex) {
            Logger.getLogger(EscolhaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jList4MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        DefaultListModel model = new DefaultListModel();
        for (String s : arquivoComOsItensParaExclusao) {
            model.addElement(s);

        }
        jList2.setModel(model);

    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(EscolhaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaArquivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    private void lePasta(File dir) throws FileNotFoundException, IOException {

        ArrayList<File> listaDeArquivos = new ArrayList<>();
        DefaultListModel modeloArquivos = new DefaultListModel();
        DefaultListModel modeloArquivosExclusao = new DefaultListModel();
        jLabel4.setText(dir.getName());
        if (dir.isDirectory()) {
            String[] filhos = dir.list();
            for (int i = 0; i < filhos.length; i++) {
                File nome = new File(dir, filhos[i]);
                if (nome.isFile()) {

                    listaDeArquivos.add(nome);
                    modeloArquivos.addElement(nome.getName());

                }
            }

        }
        jList4.setModel(modeloArquivos);

    }

    private ArrayList<String> leArquivo(File arquivo) throws FileNotFoundException, IOException {
        ArrayList<String> lista = new ArrayList<>();
        FileInputStream fis = new FileInputStream(arquivo);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            lista.add(line);

        }

        br.close();
        return lista;
    }
        private ArrayList<String> leArquivo(File arquivo,DefaultListModel model) throws FileNotFoundException, IOException {
        ArrayList<String> lista = new ArrayList<>();
        FileInputStream fis = new FileInputStream(arquivo);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            lista.add(line);
            model.addElement(line);
        }

        br.close();
        return lista;
    }


    private void leArquivoExclusao(String arquivo) throws FileNotFoundException, IOException {
      
        FileInputStream fis = new FileInputStream(arquivo);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        DefaultListModel model = new DefaultListModel();
        String line = null;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
           
                    arquivoComOsItensParaExclusao.add(line);

                model.addElement(line);
            }
        
        
        jList2.setModel(model);

        br.close();
      
        
    }

    private void leArquivoParaExclusao(String arquivo) throws FileNotFoundException, IOException {
        ArrayList<String> lista = new ArrayList<>();
        FileInputStream fis = new FileInputStream(arquivo);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            if (isNumeric(line) || isMenorQueDois(line) || isPontuacao(line)) {
                if (cadastraNaLista(arquivoComOsItensParaExclusao, line)) {
                    arquivoComOsItensParaExclusao.add(line);
                }
            } else {
                lista.add(line);
            
            }

        }

        br.close();
       
    }

    public boolean cadastraNaLista(ArrayList<String> lista, String texto) {

        for (String s : lista) {
            if (s.equalsIgnoreCase(texto)) {
                return false;
            }

        }

        return true;
    }

    public void processaArquivo(ArrayList<String> listaASerProcessada, ArrayList<String> listaASerExcluida) {

        for (int i = 0; i < listaASerProcessada.size(); i++) {
            String s1 = listaASerProcessada.get(i);
            for (String s2 : listaASerExcluida) {
                if (s1.equalsIgnoreCase(s2)) {
                    listaASerProcessada.remove(s1);
                    break;
                }
            }

        }
          
          DefaultListModel model = new DefaultListModel();
        for (String s1 : listaASerProcessada) {
            model.addElement(s1);

        }
        jList3.setModel(model);
    }

    public boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPontuacao(String str) {
        String punctutations = ".,:;#\\ /";
        return punctutations.contains(str);

    }

    public boolean isMenorQueDois(String str) {

        if (str.length() > 1) {
            return false;
        }

        return true;
    }

    public void salvaArquivoExclusao() {
        try ( // File permission problems are caught here.
                PrintWriter writer = new PrintWriter(arquivoExclusao, "UTF-8")) {
            for (String s : arquivoComOsItensParaExclusao) {
                writer.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscolhaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(EscolhaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private boolean preProcessamento(String line) {

        if (isNumeric(line) || isMenorQueDois(line) || isPontuacao(line)) {
            return (cadastraNaLista(arquivoComOsItensParaExclusao, line));
        }

        return false;
    }

}
