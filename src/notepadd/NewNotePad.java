
package notepadd;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.StringReader;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;




public class NewNotePad extends javax.swing.JFrame {

  

   
    public NewNotePad() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Textarea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        var_file = new javax.swing.JMenu();
        newfile = new javax.swing.JMenuItem();
        openfile = new javax.swing.JMenuItem();
        saveasfile = new javax.swing.JMenuItem();
        exitfile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Textarea.setColumns(20);
        Textarea.setRows(5);
        jScrollPane2.setViewportView(Textarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        var_file.setText("File");

        newfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new_24px.png"))); // NOI18N
        newfile.setText("New");
        newfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newfileActionPerformed(evt);
            }
        });
        var_file.add(newfile);

        openfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/open_sign_24px.png"))); // NOI18N
        openfile.setText("Open");
        openfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openfileActionPerformed(evt);
            }
        });
        var_file.add(openfile);

        saveasfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveasfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_24px.png"))); // NOI18N
        saveasfile.setText("Save As");
        saveasfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasfileActionPerformed(evt);
            }
        });
        var_file.add(saveasfile);

        exitfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit_24px.png"))); // NOI18N
        exitfile.setText("Exit");
        exitfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitfileActionPerformed(evt);
            }
        });
        var_file.add(exitfile);

        jMenuBar1.add(var_file);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newfileActionPerformed
        if (evt.getActionCommand().equals("New")) {
            Textarea.setText("");
        }
    
                   
    }//GEN-LAST:event_newfileActionPerformed

    private void saveasfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasfileActionPerformed
            final JFileChooser SaveAs = new JFileChooser();
            SaveAs.setApproveButtonText("Save");
            int actionDialog = SaveAs.showOpenDialog(this);
            if (actionDialog != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File fileName = new File(SaveAs.getSelectedFile() + ".txt");
            BufferedWriter outFile = null;
            try {
                outFile = new BufferedWriter(new FileWriter(fileName));
                Textarea.write(outFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        
    }//GEN-LAST:event_saveasfileActionPerformed

    private void exitfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitfileActionPerformed
        if (evt.getActionCommand().equals("Exit")) 
            System.exit(0);
        
    }//GEN-LAST:event_exitfileActionPerformed

    private void openfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openfileActionPerformed
        if (evt.getActionCommand().equals("Open")) {
            JFileChooser chooser = new JFileChooser("D:/Java");
            chooser.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt"); 
            chooser.addChoosableFileFilter(restrict);
            
            int result = chooser.showOpenDialog(this);
            if(result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                
                  try{
                    System.out.println("File Open");
                    FileReader reader = new FileReader(file);
                    BufferedReader br = new BufferedReader(reader);
                    Textarea.read( br, null );
                    br.close();
                    Textarea.requestFocus();
                }catch(Exception e){
                    System.out.print(e);
                }
				
            }
       }
    }//GEN-LAST:event_openfileActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewNotePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Textarea;
    private javax.swing.JMenuItem exitfile;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem newfile;
    private javax.swing.JMenuItem openfile;
    private javax.swing.JMenuItem saveasfile;
    private javax.swing.JMenu var_file;
    // End of variables declaration//GEN-END:variables

    private void saveAs() {
        throw new UnsupportedOperationException("Not supported yet.");
       
            
            
            
      
        
    
    }

    private void save(JMenuItem newfile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
