/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ageo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Anas
 */
public class calcGeometrique extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
    */
    public class RoundedBorder implements Border {
    private final int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(radius + 1, radius + 1, radius + 1, radius + 1);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.GRAY); // Border color
        g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius); // Rounded rectangle
    }
}
    
    
    
    
    public calcGeometrique() {
        initComponents();
         label1.setBorder(new LineBorder(Color.BLACK, 0));
         label1.setForeground(Color.WHITE); // Set text color
         label1.setHorizontalAlignment(SwingConstants.CENTER); // Center text
         label1.setBorder(new RoundedBorder(15));
          // combobox
            Box1.setFont(new Font("Arial", Font.PLAIN, 14)); // Set custom font
            Box1.setBackground(Color.WHITE); // Background color
        Box1.setForeground(Color.BLACK); // Text color
          Box1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0)); // Add border
             Box1.setBorder(new RoundedBorder(5));
        // field1
             field1.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        // Allow only digits
        if (!Character.isDigit(e.getKeyChar())) {
            e.consume();
             label1.setText("Error de remplissage");
             label1.setOpaque(true);// Ensure the label's background is visible
             label1.setBackground(Color.RED); // Use Color.RED for the red color
        }
    }
});
             // field5
              field5.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        // Allow only digits
        if (!Character.isDigit(e.getKeyChar())) {
            e.consume();
             label1.setText("Error de remplissage");
             label1.setOpaque(true);// Ensure the label's background is visible
             label1.setBackground(Color.RED); // Use Color.RED for the red color
        }
    }
});
              // field6
              field6.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        // Allow only digits
        if (!Character.isDigit(e.getKeyChar())) {
            e.consume();
             label1.setText("Error de remplissage");
             label1.setOpaque(true);// Ensure the label's background is visible
             label1.setBackground(Color.RED); // Use Color.RED for the red color
        }
    }
});
              // field7
              field7.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        // Allow only digits
        if (!Character.isDigit(e.getKeyChar())) {
            e.consume();
             label1.setText("Error de remplissage");
             label1.setOpaque(true);// Ensure the label's background is visible
             label1.setBackground(Color.RED); // Use Color.RED for the red color
        }
    }
});
               // field3
              field3.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        // Allow only digits
        if (!Character.isDigit(e.getKeyChar())) {
            e.consume();
             label1.setText("Error de remplissage");
             label1.setOpaque(true);// Ensure the label's background is visible
             label1.setBackground(Color.RED); // Use Color.RED for the red color
        }
    }
});
              button.setOpaque(true);
              label1.setBackground(Color.GREEN);
        this.getContentPane().setBackground(Color.green);
        field1.setVisible(false);
         field6.setVisible(false);
         field5.setVisible(false);
         field3.setVisible(false);
             field7.setVisible(false);
         Label2.setVisible(false);
         Label3.setVisible(false);
         Label4.setVisible(false);
         Label5.setVisible(false);
         Label6.setVisible(false);

         btn0.setVisible(false);
         btn1.setVisible(false);
         btn2.setVisible(false);
         btn3.setVisible(false);
         btn4.setVisible(false);
         btn5.setVisible(false);
         btn6.setVisible(false);
         btn7.setVisible(false);
         btn8.setVisible(false);
         btn9.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button = new javax.swing.JButton();
        Box1 = new javax.swing.JComboBox<>();
        label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        field6 = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        field1 = new javax.swing.JTextField();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        field3 = new javax.swing.JTextField();
        Label4 = new javax.swing.JLabel();
        field5 = new javax.swing.JTextField();
        Label5 = new javax.swing.JLabel();
        field7 = new javax.swing.JTextField();
        Label6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button.setText("enter");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        Box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cercle", "rectangle", "carré", "Triangle" }));
        Box1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Box1ComponentAdded(evt);
            }
        });
        Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1ActionPerformed(evt);
            }
        });

        Label2.setText("Périmétre :");

        field6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field6ActionPerformed(evt);
            }
        });

        Label3.setText("Aire :");

        field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field1ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field3ActionPerformed(evt);
            }
        });

        Label4.setText("Largeur  :");

        field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field5ActionPerformed(evt);
            }
        });

        Label5.setText("Longeur :");

        field7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field7ActionPerformed(evt);
            }
        });

        Label6.setText("Longeur :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1)
                .addContainerGap(346, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label6)
                            .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Label2))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label4)
                    .addComponent(Label5)
                    .addComponent(Label6))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9)
                    .addComponent(btn8)
                    .addComponent(btn7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(label1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
                     // TODO add your handling code here:
                      if(op.equals("cercle")){
         double nbr1 = Double.parseDouble(field3.getText());
        double perimetre = nbr1 * 2 * 3.14;
        field3.setText("");
       field3.setText(String.valueOf(perimetre));
       
        /// calcule de l'air
          field1.setText("");
       //  double nbr2 = Double.parseDouble(field1.getText());
        double Air = (nbr1*nbr1) * 3.14;
        field1.setText(String.valueOf(Air));
                      }else if(op.equals("rectangle")){
                         double Largeur= Double.parseDouble(field5.getText());
                          double longeur= Double.parseDouble(field6.getText());
                          double per=(Largeur+longeur)*2;
                           double surface=(Largeur*longeur);
                             field3.setText("");
                             field3.setText(String.valueOf(per));
                              field1.setText("");
                             field1.setText(String.valueOf(surface));
                      }   
                      else if(op.equals("carré")){
                         double cote= Double.parseDouble(field5.getText());
                        
                          double per=4*cote;
                           double surface=(cote*cote);
                             field3.setText("");
                             field3.setText(String.valueOf(per));
                              field1.setText("");
                             field1.setText(String.valueOf(surface));
                      }  else if(op.equals("Triangle")){
                         double A= Double.parseDouble(field5.getText());
                       ((AbstractDocument) field5.getDocument()).setDocumentFilter(new DigitOnlyFilter());

                          double B= Double.parseDouble(field6.getText());
                           double C= Double.parseDouble(field7.getText());

                          double per=(A+B+C);
                           double surface=(Math.sqrt(3)/4)* Math.pow(A, 2);
                             field3.setText("");
                             field3.setText(String.valueOf(per));
                              field1.setText("");
                             field1.setText(String.valueOf(surface));
                      }    
    }//GEN-LAST:event_buttonActionPerformed
      String op;
    private void Box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1ActionPerformed
        // TODO add your handling code here:
      //  field1.setText((String) Box1.getSelectedItem());
        if(Box1.getSelectedItem()=="cercle"){
                    field3.setText("");
                    field5.setText("");

            field6.setText("");
            field1.setText("");
            Label3.setText("Air :");
            op="cercle";
            label1.setText("choisie une forme" );
            label1.setText("entrer les proprities du cercle");
              field1.setVisible(true);
                      field3.setVisible(true);
             field7.setVisible(false);

         Label2.setVisible(true);
         Label3.setVisible(true);
         
         btn0.setVisible(true);
         btn1.setVisible(true);
         btn2.setVisible(true);
         btn3.setVisible(true);
         btn4.setVisible(true);
         btn5.setVisible(true);
         btn6.setVisible(true);
         btn7.setVisible(true);
         btn8.setVisible(true);
         btn9.setVisible(true);
       
          Label4.setVisible(false);
         Label5.setVisible(false);
           field6.setVisible(false);
         field5.setVisible(false);
                    Label6.setVisible(false);

        }else if(Box1.getSelectedItem()=="rectangle"){
                    field3.setText("");
                    field5.setText("");
             field7.setVisible(false);

             field6.setText("");
            field1.setText("");
             op="rectangle";
            label1.setText("choisie une forme" );
             label1.setText("entrer les proprities du rectangle");
             field1.setVisible(true);
         field6.setVisible(true);
                  field5.setVisible(true);
         field3.setVisible(true);

         Label2.setVisible(true);
         Label3.setText("surface");
         Label3.setVisible(true);
         
         btn0.setVisible(true);
         btn1.setVisible(true);
         btn2.setVisible(true);
         btn3.setVisible(true);
         btn4.setVisible(true);
         btn5.setVisible(true);
         btn6.setVisible(true);
         btn7.setVisible(true);
         btn8.setVisible(true);
         btn9.setVisible(true);
         
          Label4.setVisible(true);
          Label5.setVisible(true);
                     Label6.setVisible(false);

        }else if(Box1.getSelectedItem()=="carré"){
                    field3.setText("");
                    field5.setVisible(true);
             field7.setVisible(false);

             field6.setText("");
             field6.setVisible(false);
            field1.setText("");
             op="carré";
            label1.setText("choisie une forme" );
             label1.setText("entrer les proprities du carré");
             field1.setVisible(true);
        
         field3.setVisible(true);

         Label2.setVisible(true);
         Label3.setText("surface");
         Label3.setVisible(true);
         
         btn0.setVisible(true);
         btn1.setVisible(true);
         btn2.setVisible(true);
         btn3.setVisible(true);
         btn4.setVisible(true);
         btn5.setVisible(true);
         btn6.setVisible(true);
         btn7.setVisible(true);
         btn8.setVisible(true);
         btn9.setVisible(true);
         
          Label4.setVisible(true);
          Label4.setText("Coté");
          Label5.setVisible(false);
            Label6.setVisible(false);
        }else if(Box1.getSelectedItem()=="Triangle"){
                    field3.setText("");
                    field5.setVisible(true);
                    field6.setVisible(true);

             field6.setText("");
            field1.setText("");
             op="Triangle";
            label1.setText("choisie une forme" );
             label1.setText("entrer les proprities du Triangle");
             field1.setVisible(true);
        
         field3.setVisible(true);

         Label2.setVisible(true);
         Label3.setText("surface");
         Label3.setVisible(true);
         
         btn0.setVisible(true);
         btn1.setVisible(true);
         btn2.setVisible(true);
         btn3.setVisible(true);
         btn4.setVisible(true);
         btn5.setVisible(true);
         btn6.setVisible(true);
         btn7.setVisible(true);
         btn8.setVisible(true);
         btn9.setVisible(true);
         
          Label4.setVisible(true);
          Label4.setText("Coté a");
          Label5.setVisible(true);
                    Label5.setText("Coté base");
            Label6.setVisible(true);
          Label6.setText("Coté c"); 
             field7.setVisible(true);
        }
    }//GEN-LAST:event_Box1ActionPerformed

    private void Box1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Box1ComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Box1ComponentAdded

    private void field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field6ActionPerformed
        // TODO add your handling code here:
           /// calcule de périmétre
          field6.setText("");
         double nbr1 = Double.parseDouble(field6.getText());
        double périmétre = nbr1 * 2 * 3.14;
        field6.setText(String.valueOf(périmétre));
       
    }//GEN-LAST:event_field6ActionPerformed

    private void field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field1ActionPerformed
        // TODO add your handling code here:
          /// calcule de l'air
          field1.setText("");
         double nbr2 = Double.parseDouble(field6.getText());
        double Air = (nbr2*nbr2) * 3.14;
        field1.setText(String.valueOf(Air));
                                          
    }//GEN-LAST:event_field1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        setAll("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        setAll("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        setAll("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
       setAll("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        setAll("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        setAll("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        setAll("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        setAll("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        setAll("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        setAll("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field3ActionPerformed

    private void field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field5ActionPerformed

    private void field7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field7ActionPerformed
   private void setAll(String s){
      
       if(op.equals("rectangle")){
         field6.setText(field6.getText()+s);
         field5.setText(field5.getText()+s);
       }else if(op.equals("cercle")){
           field1.setText(field1.getText()+s);
           field3.setText(field3.getText()+s);
       }
     
   }
     public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignore non-digit characters
                }
            }
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
            java.util.logging.Logger.getLogger(calcGeometrique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcGeometrique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcGeometrique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcGeometrique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcGeometrique().setVisible(true);
               
            }
        });
    }
        class DigitOnlyFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string.matches("\\d*")) { // Only allow digits
            super.insertString(fb, offset, string, attr);
        }else{
         label1.setText("Error: Only digits are allowed");

        }
    }}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Box1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton button;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field5;
    private javax.swing.JTextField field6;
    private javax.swing.JTextField field7;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
