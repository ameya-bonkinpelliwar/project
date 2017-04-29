/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_sem8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author my pc
 */
public class f4 extends javax.swing.JFrame {
    static String s1,s2,s3;
    static String cr[] = new String[10];   
    static int cap[] = new int[10]; 
    static int i=0,s,e,ss;
    static int o1,o2;
    static int oo1[] = new int[5]; 
    static int oo2[] = new int[5]; 
    static int ob1[] = new int[5]; 
    static int ob2[] = new int[5]; 
    static ArrayList<Integer> a11 = new ArrayList<Integer>();  
    static ArrayList<Integer> a21 = new ArrayList<Integer>();  
    static int row,ben,capa;

    /**
     * Creates new form f4
     */
    public f4() {
        initComponents();
    }
    
    public static void showa()
    {
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
       //  System.out.println("o2");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","");
         //    System.out.println("o3");
            Statement s = conn.createStatement();           
            s.execute("SELECT * FROM r1 ");
            // System.out.println("o4");
            ResultSet rs = s.getResultSet(); 
            jComboBox3.addItem(" ");
              while(rs.next())
              {
                  jComboBox3.addItem(rs.getString("cr"));     
                  
              }
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
    
    public static void showb()
    {
        try
        {
            ss=0;
            e=0;
         Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","");
         //    System.out.println("o3");
            Statement s = conn.createStatement();           
            s.execute("SELECT * FROM r1 ");
            // System.out.println("o4");
            ResultSet rs = s.getResultSet(); 
            jComboBox3.addItem(" ");
             i=0;
              while(rs.next())
              {
                  cr[i]=rs.getString("cr");
                  cap[i]=Integer.parseInt(rs.getString("cap"));
                  i++;                  
              }
              for(i=0;i<cr.length;i++)
              {
                  System.out.println(cr[i]+" "+cap[i]);
              }
              
              if(s3.equals(cr[0]))
              {                  
                  ss=0;
                  e=cap[0];
              }
              else
              {
                int kk;
                for(kk=0;kk<cr.length;kk++)
                {
                  if(s3.equals(cr[kk]))
                      break;
                }
                  for(int j1=0;j1<kk;j1++)
                  {
                      ss=ss+cap[j1];
                  }
                  e=ss+cap[kk];
              }
              
              
              
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
     public static void showc()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
       // System.out.println("o2");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","");
             //System.out.println("o3");
            Statement s = conn.createStatement();  
            String t1 = "9 a.m.";
            String t2 = "2 p.m.",tt1,tt2;
            //"9 a.m.", "2 p.m."
            if(s2.equals(t1))
            {
                tt1="9a1";
                tt2="9a2";
            }
            else
            {
                tt1="2p1";
                tt2="2p2";                
            }
            System.out.println(s1);
            char[] b = s1.toCharArray();
            //System.out.println("ok "+b[5]);
            String pp = "d"+b[6];
            s.execute("SELECT * from r4 WHERE day='"+pp+"'");
            //System.out.println(pp+" "+tt1);
            ResultSet rs = s.getResultSet(); 
            while(rs.next())
              {
                  o1=Integer.parseInt(rs.getString(tt1));
              }
            s.execute("SELECT * from r4 WHERE day='"+pp+"'");
             rs = s.getResultSet(); 
            while(rs.next())
              {
                  o2=Integer.parseInt(rs.getString(tt2));
              }
            //System.out.println("1 "+o1+" 2 "+o2);
            //System.out.println("s "+ss+" e "+e);
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
     public static void showd()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
       // System.out.println("o2");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","");
             //System.out.println("o3");
            Statement s = conn.createStatement(); 
            s.execute("SELECT * from r3 ");
            ResultSet rs = s.getResultSet(); 
            int kj=0;
            String kj1= "y"+o1;
            String kj2= "y"+o2;
            System.out.println(kj1+" "+kj2);
            while(rs.next())
            {
                oo1[kj]=Integer.parseInt(rs.getString(kj1));
                oo2[kj]=Integer.parseInt(rs.getString(kj2));                
                kj++;
            }
            System.out.println("----------------");
            
            
            s.execute("SELECT * from r5 WHERE sr='"+o1+"'");
             rs = s.getResultSet(); 
             while(rs.next())
              {
                  ob1[0]=Integer.parseInt(rs.getString("b1"));
              }
             s.execute("SELECT * from r5 WHERE sr='"+o1+"'");
             rs = s.getResultSet(); 
             while(rs.next())
              {
                  ob1[1]=Integer.parseInt(rs.getString("b2"));
              }
             s.execute("SELECT * from r5 WHERE sr='"+o1+"'");
             rs = s.getResultSet(); 
             while(rs.next())
              {
                  ob1[2]=Integer.parseInt(rs.getString("b3"));
              }
             
             s.execute("SELECT * from r5 WHERE sr='"+o2+"'");
             rs = s.getResultSet(); 
             while(rs.next())
              {
                  ob2[0]=Integer.parseInt(rs.getString("b1"));
              }
             s.execute("SELECT * from r5 WHERE sr='"+o2+"'");
             rs = s.getResultSet(); 
             while(rs.next())
              {
                  ob2[1]=Integer.parseInt(rs.getString("b2"));
              }
             s.execute("SELECT * from r5 WHERE sr='"+o2+"'");
             rs = s.getResultSet(); 
             while(rs.next())
              {
                  ob2[2]=Integer.parseInt(rs.getString("b3"));
              }
             /*for(int mm=0;mm<kj;mm++)
            {
                System.out.println(oo1[mm]+" "+oo2[mm]+" "+mm+" "+ob1[mm]+" "+ob2[mm]);
            }*/
             if(s3!=" ")
             {
                 for(int qz=0;qz<3;qz++)
                 {
                     int z1=ob1[qz];
                     for(int z2=1;z2<=oo1[z1-1];z2++)
                     {
                         int pp=o1*10000;                         
                             int qq=0;
                             if(z1==1)
                             {
                                 qq=1;
                             }
                             else if(z1==2)
                             {
                                 qq=2;
                             }
                             else if(z1==3)
                             {
                                 qq=3;
                             }
                             int rr = qq*1000;
                             int tt=pp+rr+z2;
                             a11.add(tt);
                         
                         
                     }
                 }
             }
             
             if(s3!=" ")
             {
                 for(int qz=0;qz<3;qz++)
                 {
                     int z1=ob2[qz];
                     for(int z2=1;z2<=oo2[z1-1];z2++)
                     {
                         int pp=o2*10000;                         
                             int qq=0;
                             if(z1==1)
                             {
                                 qq=1;
                             }
                             else if(z1==2)
                             {
                                 qq=2;
                             }
                             else if(z1==3)
                             {
                                 qq=3;
                             }
                             int rr = qq*1000;
                             int tt=pp+rr+z2;
                             a21.add(tt);       
                     }
                 }
             }
             
            if(s3!=" ")
             {
             System.out.println("--------------------");
             for(int opo=0;opo<a21.size();opo++)
             {
                 System.out.println(a21.get(opo));
             }
             }
             /*System.out.println("----------------");
             for(int mm=0;mm<3;mm++)
            {
                System.out.println(ob1[mm]+" "+ob2[mm]);
            }*/
             //System.out.println(ss+" space "+e);
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
     public static void showe()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
       // System.out.println("o2");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","");
             //System.out.println("o3");
            Statement s = conn.createStatement();
            s.execute("SELECT * from r1 WHERE cr='"+s3+"'");
            //System.out.println(pp+" "+tt1);
            ResultSet rs = s.getResultSet(); 
            while(rs.next())
              {
                  row=Integer.parseInt(rs.getString("row"));
                  ben=Integer.parseInt(rs.getString("ben"));
                  capa=Integer.parseInt(rs.getString("cap"));
              }
            System.out.println(row+" "+ben+" "+capa);
        }
        catch(Exception e)
        {
            
        }
    }
     public static void showf()
    {
        if(s3!=" ")
        {            
        int abd=ss;
        for(int i=0;i<row;i++)
        {
            String a = "";
           for(int jjj=0;jjj<ben;jjj++)
           {
               a+=a11.get(abd)+"|"+a21.get(abd)+"       ";
               abd++;
                //a+= "7a|7b\t";
           }
           String tmp =  jTextPane1.getText();           
           jTextPane1.setText(tmp + "\n" +a);
           jTextPane1.setText(jTextPane1.getText()+"\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        }
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

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ","paper 1", "paper 2", "paper 3", "paper 4", "paper 5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select paper");

        jLabel2.setText("Select Time");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ","9 a.m.", "2 p.m." }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Class");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("See Arragnment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 204, 0)));
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 3));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_sem8/1.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText(" B");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText(" L");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText(" A");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText(" c");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText(" k");

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText(" B");

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText(" o");

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText(" R");

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText(" D");

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText(" A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        s2 = jComboBox2.getSelectedItem().toString();
        f4.showa();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        s1 = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        s3 = jComboBox3.getSelectedItem().toString();
        f4.showb();
        f4.showc();
        f4.showd();
        f4.showe();
        
        
        
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        f4.showf();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        f3 l1 = new f3();
        l1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(f4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private static javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
