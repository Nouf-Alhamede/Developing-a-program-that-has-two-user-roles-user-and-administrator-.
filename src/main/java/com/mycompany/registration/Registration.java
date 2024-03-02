/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;
/*import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
/*
 *
 * @author hp
 
public class Registration extends JFrame {
    private JLabel l1,l2,l3,l4,l5;
    private JTextField t1,t2,t3;
    private JComboBox cam1;
    private JRadioButton r1,r2;
    private JButton b1,b2;
    private ButtonGroup gp;
    private static int count = 1;
    private String name,lastname,emil,gender,ligne,age;
    
    public Registration(String title){
    super(title);
    this.setLocation(500,500);
    this.setSize(300,300);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    l1=new JLabel("first name");
    t1=new JTextField(10);
    JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
    p1.add(l1);
    p1.add(t1);
    
    l2=new JLabel("last name");
    t2=new JTextField(10);
    JPanel p2= new JPanel(new FlowLayout(FlowLayout.LEFT));
    p2.add(l2);
    p2.add(t2);
    
    l3= new JLabel("age");
    String s1[]={"10-20","20-30","30-40","40"};
    cam1=new JComboBox(s1);
    JPanel p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
    p3.add(l3);
    p3.add(cam1);
    
     cam1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                age = (String) cam1.getSelectedItem();
            }
        });
        
    
    l4=new JLabel("gender");
    r1= new JRadioButton("male");
    r2=new JRadioButton("female");
    ButtonGroup gp=new ButtonGroup();
    gp.add(r1);
    gp.add(r2);
    JPanel p4=new JPanel(new FlowLayout(FlowLayout.LEFT));
    p4.add(l4);
    p4.add(r1);
    p4.add(r2);
    
    l5=new JLabel ("e-mail");
    t3=new JTextField(20);
    JPanel p5=new JPanel(new FlowLayout(FlowLayout.LEFT));
    p5.add(l5);
    p5.add(t3);
    
    b1=new JButton("Register");
    b2=new JButton("cancel");
    JPanel p6=new JPanel();
    p6.add(b1);
    p6.add(b2);
    b1.addActionListener(new buttonListener());
    b2.addActionListener(new buttonListener());
    
    
    JPanel p=(JPanel)this.getContentPane();
    p.setLayout(new GridLayout(6,1));
    p.add(p1);
    p.add(p2);
    p.add(p3);
    p.add(p4);
    p.add(p5);
    p.add(p6);
    
    this.pack();
    File file = new File("users");
    if(file.exists()){
     file.delete();
    }
    
    }
    class buttonListener implements ActionListener{ /******
    public void actionPerformed(ActionEvent e) {
           
           try
           {
               BufferedWriter w=new BufferedWriter(new FileWriter("users",true));
               if(count>5){
               JOptionPane.showMessageDialog(null, "number is mor then 5:",null,JOptionPane.ERROR_MESSAGE);
               System.exit(0);
               }else {
               name=t1.getText();
               lastname=t2.getText();
               emil=t3.getText();
               
               if(r1.isSelected()){
               gender=r1.getText();
               
               }
               else if(r2.isSelected()){
               gender=r2.getText();
               }
               ligne=name+lastname+gender+emil;
               w.write(ligne);
               t1.setText("");
               t2.setText("");
               t3.setText("");
               cam1.setSelectedIndex(0);
               gp.clearSelection();
               count++;
               JOptionPane.showMessageDialog(null,"Succssess" );
               }
                w.close();
                  
           }
           catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erorr" );
           }  
   
    }}
 
    
    public static void main(String[] args) {
     Registration r1=new Registration("Registration");
    }
}*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
 
public class Registration extends JFrame  {
    
    private JLabel l1 , l2 , l3 , l4 , l5 ;
    private JTextField t1 , t2 , t3 ;
    private JComboBox c1 ;
    private JRadioButton r1,r2;
    private JButton b1 , b2 ;
    private String firstName , lastName , email ,age , gender , ligne;
    private static int count = 1 ;
    private ButtonGroup gp;
    
    public Registration(String title)
    {
        super(title);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("First name");
        t1 = new JTextField(10) ;
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p1.add(l1);
        p1.add(t1);
        
        l2 = new JLabel("Last Name");
        t2 = new JTextField(10);
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.add(l2);
        p2.add(t2);
        
        
        l3 = new JLabel("Age");
        String[] s = {"10-20" , "20-30" , "30-40" , "40>"};
        c1 = new JComboBox(s);
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3.add(l3);
        p3.add(c1);
        
        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                age = (String) c1.getSelectedItem();
            }
        });
        
        
        l4 = new JLabel("Gender");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p4.add(l4);
        p4.add(r1);
        p4.add(r2);
        
       
        
        l5 = new JLabel("E-Mail");
        t3 = new JTextField(20);
        JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p5.add(l5);
        p5.add(t3);
        
        b1 = new JButton("Register");
        b2 = new JButton("Cancel");
        JPanel p6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p6.add(b1);
        p6.add(b2);
        
        b1.addActionListener(new ButtonListener());
        b2.addActionListener(new ExitListener());
        
        JPanel p = (JPanel)this.getContentPane();
        p.setLayout(new GridLayout(6, 1));
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
       

        this.pack();
        this.setVisible(true);
        
         File file = new File("users.txt");
        if (file.exists()) {
            file.delete();
        }
        
    }
    
  
    
    class ButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try {
                PrintWriter ofile = new PrintWriter(new FileWriter("users.txt" , true));
                if(count > 5)
                {
                    JOptionPane.showMessageDialog(null , "Maximum number is reached");
                    System.exit(0);
                } 
                else
                {
                    firstName = t1.getText();
                    lastName = t2.getText();
                    email = t3.getText();
                    
                     if (r1.isSelected()) {
                        gender = r1.getText();
                    } 
                     else if (r2.isSelected()) {
                        gender = r2.getText();
                    }
                    
                    ligne = firstName + ";" + lastName + ";" + age + ";" + gender +";"+email ;
                    
                    ofile.println(ligne);
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    
                    c1.setSelectedIndex(0);
                    gp.clearSelection();
                    count ++ ;
                    JOptionPane.showMessageDialog(null , "Successfully registered");
                }
                ofile.close();
            }
            catch(Exception ex)
            {
                System.out.println("Error");
                JOptionPane.showMessageDialog(null , "Error");
            }
        }
    }
    
    class ExitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        Registration u = new Registration("Registration page");      
    } 
}