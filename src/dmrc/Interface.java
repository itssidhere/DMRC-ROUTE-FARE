/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmrc;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Siddharth
 */
public class Interface extends javax.swing.JFrame {
    private ResultSet rs;
    private Connection con;
    private PreparedStatement st;
    private String select="--Select---",lab="<html>";
    private int id1,id2;
    private String result;
    private int interchange=0;
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/metro","root","root");
        st=con.prepareStatement("select * from yellow order by id asc");
        rs=st.executeQuery();
        yellow.addItem(select);
        yellow_1.addItem(select);
        blue.addItem(select);
        blue_1.addItem(select);
        red.addItem(select);
        red_1.addItem(select);
        while(rs.next()){
            yellow.addItem(rs.getString(2));
            yellow_1.addItem(rs.getString(2));
        }
        st=con.prepareStatement("select * from blue order by id asc");
        rs=st.executeQuery();
        while(rs.next()){
            blue.addItem(rs.getString(2));
            blue_1.addItem(rs.getString(2));
        }
        st=con.prepareStatement("select * from red order by id asc");
        rs=st.executeQuery();
        while(rs.next()){
            red.addItem(rs.getString(2));
            red_1.addItem(rs.getString(2));
        }
        yellow.setSelectedItem(select);
        yellow_1.setSelectedItem(select);
        blue.setSelectedItem(select);
        blue_1.setSelectedItem(select);
        red.setSelectedItem(select);
        red_1.setSelectedItem(select);
        }catch(Exception e){
        System.out.println("Error ");
        }
        
    }

    /**6
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button = new javax.swing.JButton();
        yellow = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yellow_1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        blue = new javax.swing.JComboBox();
        blue_1 = new javax.swing.JComboBox();
        red = new javax.swing.JComboBox();
        red_1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(756, 472));
        getContentPane().setLayout(null);

        button.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        button.setForeground(new java.awt.Color(102, 102, 102));
        button.setText("Submit");
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button);
        button.setBounds(290, 200, 130, 50);

        yellow.setBackground(new java.awt.Color(255, 255, 51));
        yellow.setNextFocusableComponent(yellow_1);
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });
        getContentPane().add(yellow);
        yellow.setBounds(44, 41, 141, 20);

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("           Yellow Line");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 9, 245, 21);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setText(" From");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 43, 34, 16);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText(" To");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 81, 17, 16);

        yellow_1.setBackground(new java.awt.Color(255, 255, 51));
        yellow_1.setNextFocusableComponent(blue);
        yellow_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellow_1ActionPerformed(evt);
            }
        });
        getContentPane().add(yellow_1);
        yellow_1.setBounds(44, 79, 141, 20);

        jLabel4.setBackground(new java.awt.Color(102, 102, 255));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("            Blue Line");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(247, 9, 250, 21);

        jLabel5.setBackground(new java.awt.Color(255, 0, 51));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel5.setText("                 Red Line");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(499, 9, 260, 21);

        blue.setBackground(new java.awt.Color(102, 102, 255));
        blue.setNextFocusableComponent(blue_1);
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });
        getContentPane().add(blue);
        blue.setBounds(298, 41, 141, 20);

        blue_1.setBackground(new java.awt.Color(102, 102, 255));
        blue_1.setNextFocusableComponent(yellow);
        blue_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue_1ActionPerformed(evt);
            }
        });
        getContentPane().add(blue_1);
        blue_1.setBounds(298, 79, 141, 20);

        red.setBackground(new java.awt.Color(255, 51, 51));
        red.setNextFocusableComponent(yellow_1);
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });
        getContentPane().add(red);
        red.setBounds(573, 41, 142, 20);

        red_1.setBackground(new java.awt.Color(255, 51, 51));
        red_1.setNextFocusableComponent(button);
        red_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red_1ActionPerformed(evt);
            }
        });
        getContentPane().add(red_1);
        red_1.setBounds(573, 79, 142, 20);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 760, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        String s1=yellow.getSelectedItem().toString();
        String s2=yellow_1.getSelectedItem().toString();
        String b1=blue.getSelectedItem().toString();
        String b2= blue_1.getSelectedItem().toString();
        String r1=red.getSelectedItem().toString();
        String r2=red_1.getSelectedItem().toString();
        
         try {
            if(s1!=select && s2!=select){
           /* if(s1==select || s2==select){
              res.setText("Select two stations atleast");
            }*/
           st=con.prepareStatement("select * from yellow where station=?");
           st.setString(1,s1);
           rs=st.executeQuery();
           rs.next();
           id1=rs.getInt(1);
           st.setString(1,s2);
           rs=st.executeQuery();
           rs.next();
           id2=rs.getInt(1);
           //st=con.prepareStatement("select * from yellow where id between 2 and 4 order by id "+order);
           
           
           if(id1<id2){
              
                st=con.prepareStatement("select * from yellow where id between ? and ? order by id asc");
                st.setInt(2,id2);
               st.setInt(1,id1);
           }
           else{
               
               
               st=con.prepareStatement("select * from yellow where id between ? and ? order by id desc");
               st.setInt(1,id2);
               st.setInt(2,id1);
           }
           rs=st.executeQuery();
           int count=0;
           result="<html>";
           while(rs.next()){
               ++count;
              // if(count%5==0) lab+="<br/>";
               result+=rs.getString(2)+" - ";
           }
           //result+="</html>";
          }
          if(b1!=select&&b2!=select){
              st=con.prepareStatement("select * from blue where station=?");
           st.setString(1,b1);
           rs=st.executeQuery();
           rs.next();
           id1=rs.getInt(1);
           st.setString(1,b2);
           rs=st.executeQuery();
           rs.next();
           id2=rs.getInt(1);
           //st=con.prepareStatement("select * from yellow where id between 2 and 4 order by id "+order);
           
           
           if(id1<id2){
              
                st=con.prepareStatement("select * from blue where id between ? and ? order by id asc");
                st.setInt(2,id2);
               st.setInt(1,id1);
           }
           else{
               
               
               st=con.prepareStatement("select * from blue where id between ? and ? order by id desc");
               st.setInt(1,id2);
               st.setInt(2,id1);
           }
           rs=st.executeQuery();
           int count=0;
           result="<html>";
           while(rs.next()){
               ++count;
              // if(count%5==0) lab+="<br/>";
               result+=rs.getString(2)+" - ";
           }
           //result+="</html>";
             System.out.println(lab);
          }
          if(r1!=select&&r2!=select){
           st=con.prepareStatement("select * from red where station=?");
           st.setString(1,r1);
           rs=st.executeQuery();
           rs.next();
           id1=rs.getInt(1);
           st.setString(1,r2);
           rs=st.executeQuery();
           rs.next();
           id2=rs.getInt(1);
           //st=con.prepareStatement("select * from yellow where id between 2 and 4 order by id "+order);
           
           
           if(id1<id2){
              
                st=con.prepareStatement("select * from red where id between ? and ? order by id asc");
                st.setInt(2,id2);
               st.setInt(1,id1);
           }
           else{
               
               
               st=con.prepareStatement("select * from red where id between ? and ? order by id desc");
               st.setInt(1,id2);
               st.setInt(2,id1);
           }
           rs=st.executeQuery();
           int count=0;
           result="<html>";
           while(rs.next()){
               ++count;
              // if(count%5==0) lab+="<br/>";
               result+=rs.getString(2)+" - ";
           }
           //result+="</html>";
          
             //System.out.println(lab);
          }
          if(s1!=select && r2!=select){
              interchange=1;
              result="<html>";
              st=con.prepareStatement("select * from yellow where station=?");
              
              st.setString(1,s1);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>16){
                  st=con.prepareStatement("select * from yellow where id between 12 and ? order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from yellow where id between ? and 12");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              st=con.prepareStatement("select * from red where station=?");
              st.setString(1,r2);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>16){
                  st=con.prepareStatement("select * from red where id between 17 and ?");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from red where id between ? and 15 order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
          }
              if(s1!=select && b2!=select){
              interchange=1;
              result="<html>";
              st=con.prepareStatement("select * from yellow where station=?");
              
              st.setString(1,s1);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>16){
                  st=con.prepareStatement("select * from yellow where id between 16 and ? order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from yellow where id between ? and 16");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              st=con.prepareStatement("select * from blue where station=?");
              st.setString(1,b2);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>22){
                  st=con.prepareStatement("select * from blue where id between 23 and ?");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from blue where id between ? and 21 order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
          }
              if(s2!=select && b1!=select){
              interchange=1;
              result="<html>";
              st=con.prepareStatement("select * from blue where station=?");
              
              st.setString(1,b1);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>22){
                  st=con.prepareStatement("select * from blue where id between 22 and ? order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from blue where id between ? and 22");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              st=con.prepareStatement("select * from yellow where station=?");
              st.setString(1,s2);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>16){
                  st=con.prepareStatement("select * from yellow where id between 17 and ?");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from yellow where id between ? and 15 order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
          }
                if(s2!=select && r1!=select){
              interchange=1;
              result="<html>";
              st=con.prepareStatement("select * from red where station=?");
              
              st.setString(1,r1);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>16){
                  st=con.prepareStatement("select * from red where id between 16 and ? order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from red where id between ? and 16");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              st=con.prepareStatement("select * from yellow where station=?");
              st.setString(1,s2);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>12){
                  st=con.prepareStatement("select * from yellow where id between 13 and ?");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from yellow where id between ? and 11 order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
          }
               if(b1!=select && r2!=select){
                   interchange=2;
                   result="<html>";
              st=con.prepareStatement("select * from blue where station=?");
              
              st.setString(1,b1);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>22){
                  st=con.prepareStatement("select * from blue where id between 22 and ? order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from blue where id between ? and 22");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
               st=con.prepareStatement("select * from yellow where id between 12 and 15 order by id desc");
               rs=st.executeQuery();
               while(rs.next()){
                   result+=rs.getString(2)+" - ";
               }
               ///////////COME HERE//////////
               st=con.prepareStatement("select * from red where station=?");
              st.setString(1,r2);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>16){
                  st=con.prepareStatement("select * from red where id between 17 and ?");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from red where id between ? and 15 order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
             }
              if(r1!=select && b2!=select){
                  interchange=2;
                  result="<html>";
              st=con.prepareStatement("select * from red where station=?");
              
              st.setString(1,r1);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>16){
                  st=con.prepareStatement("select * from red where id between 16 and ? order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from red where id between ? and 16");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              st=con.prepareStatement("select * from yellow where id between 13 and 16");
              rs=st.executeQuery();
              while(rs.next()){
                  result+=rs.getString(2)+" - ";
              }
              st=con.prepareStatement("select * from blue where station=?");
              st.setString(1,b2);
              rs=st.executeQuery();
              rs.next();
              id1=rs.getInt(1);
              if(id1>22){
                  st=con.prepareStatement("select * from blue where id between 23 and ?");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              else{
                  st=con.prepareStatement("select * from blue where id between ? and 21 order by id desc");
                  st.setInt(1,id1);
                  rs=st.executeQuery();
                  while(rs.next()){
                      result+=rs.getString(2)+" - ";
                  }
              }
              }
               
             result+="Destination";
             result+="</html>";
             
        } catch (Exception ex) {
            Logger.getLogger(DMRC.class.getName()).log(Level.SEVERE, null, ex);
        }
        new route(result,interchange).show();
          // dispose();
    }//GEN-LAST:event_buttonActionPerformed

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        // TODO add your handling code here:
        String s=yellow.getSelectedItem().toString();
        blue.setSelectedItem(select);
        red.setSelectedItem(select);
        yellow.setSelectedItem(s);
    }//GEN-LAST:event_yellowActionPerformed

    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
        String s=blue.getSelectedItem().toString();
        yellow.setSelectedItem(select);
        red.setSelectedItem(select);
        blue.setSelectedItem(s);
    }//GEN-LAST:event_blueActionPerformed

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        // TODO add your handling code here:
        String s=red.getSelectedItem().toString();
        blue.setSelectedItem(select);
        yellow.setSelectedItem(select);
        red.setSelectedItem(s);
    }//GEN-LAST:event_redActionPerformed

    private void yellow_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellow_1ActionPerformed
        // TODO add your handling code here:
        String s=yellow_1.getSelectedItem().toString();
        blue_1.setSelectedItem(select);
        red_1.setSelectedItem(select);
        yellow_1.setSelectedItem(s);
    }//GEN-LAST:event_yellow_1ActionPerformed

    private void blue_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue_1ActionPerformed
        // TODO add your handling code here:
        String s=blue_1.getSelectedItem().toString();
        red_1.setSelectedItem(select);
        yellow_1.setSelectedItem(select);
        blue_1.setSelectedItem(s);
    }//GEN-LAST:event_blue_1ActionPerformed

    private void red_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red_1ActionPerformed
        // TODO add your handling code here:
        String s=red_1.getSelectedItem().toString();
        yellow_1.setSelectedItem(select);
        blue_1.setSelectedItem(select);
        red_1.setSelectedItem(s);
    }//GEN-LAST:event_red_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox blue;
    private javax.swing.JComboBox blue_1;
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox red;
    private javax.swing.JComboBox red_1;
    private javax.swing.JComboBox yellow;
    private javax.swing.JComboBox yellow_1;
    // End of variables declaration//GEN-END:variables
}