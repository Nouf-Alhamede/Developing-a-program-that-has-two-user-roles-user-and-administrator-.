/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;
/*import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing. *;
import java.io.*;
/**
 *
 * @author hp

public class Admin extends JFrame  {
    private JTextField t1,t2,t3,t4,t5;
    private JButton b11,b2,b3,b4,b5,b6;
    private static File u;
   
    public Admin(String titel){
    super(titel);
    this.setLocation(300,300);
    this.setVisible(true);
    this.setSize(300,200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    b11=new JButton("Display");
    JPanel p1=new JPanel(new BorderLayout());
    p1.add(b11,BorderLayout.CENTER);
    b11.addActionListener(new buttonListener1());
   
    t1=new JTextField(25);
    b2= new JButton ("Accept");
    JPanel p2=new JPanel(new FlowLayout(FlowLayout.LEFT));       
    p2.add(t1);
    p2.add(b2);
    b2.addActionListener(new buttonListener11());
    
    t2=new JTextField(25);
    b3= new JButton ("Accept");
    JPanel p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
    p3.add(t2);
    p3.add(b3);
    b3.addActionListener(new buttonListener11());
    
    t3=new JTextField(25);
    b4= new JButton ("Accept");
    JPanel p4=new JPanel(new FlowLayout(FlowLayout.LEFT));
    p4.add(t3);
    p4.add(b4);
    b4.addActionListener(new buttonListener11());
    
    t4=new JTextField(25);
    b5= new JButton ("Accept");
    JPanel p5=new JPanel(new FlowLayout(FlowLayout.LEFT));
    p5.add(t4);
    p5.add(b5);
    b5.addActionListener(new buttonListener11());
    
    t5=new JTextField(25);
    b6= new JButton ("Accept");
    JPanel p6=new JPanel(new FlowLayout(FlowLayout.LEFT));
    p6.add(t5);
    p6.add(b6);
   b6.addActionListener(new buttonListener11());
    
    JPanel p=(JPanel)this.getContentPane();
    p.setLayout(new GridLayout(6,1));
    p.add(p1);
    p.add(p2);
    p.add(p3);
    p.add(p4);
    p.add(p5);
    p.add(p6);
    
    this.pack();
    
    }
    class buttonListener1 implements ActionListener{ /*****
    public void actionPerformed(ActionEvent b11) {
       
      try
           {
             FileReader u=new FileReader("users.txt"); 
             BufferedReader br=new BufferedReader(u);
             t1.read(br, null);
             u.close();
             t1.requestFocus();
               
               
           }
           catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erorr" );
           }  }}
    
     class buttonListener11 implements ActionListener{ /*****
    public void actionPerformed(ActionEvent b11){
          String n=(String)t1.getText();
          String n1=(String)t2.getText();
          String n2=(String)t3.getText();
          String n3=(String)t4.getText();
          String n4=(String)t5.getText();
           try
           {
             FileWriter u=new FileWriter("Accepted"); 
             u.write(n);
             u.write(n1);
             u.write(n2);
             u.write(n3);
             u.write(n4);
             u.write(System.getProperty("line.separator"));
             u.close();
             JOptionPane.showMessageDialog(null,"Succssess" );
               
               
           }
           catch (IOException b2) {
            JOptionPane.showMessageDialog(null,"Erorr" );
           }  
   
    }}   
        
       
    public static void main(String[] args) {
     Admin r11 = new Admin("Admin page");
    }
}*/

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame{
    
    private JTextField t1, t2, t3, t4, t5;
    private JButton b1, b2, b3, b4, b5, b6;
    private JPanel p1, p2, p3, p4, p5, pC, pG;
    private person p[] = new person[5];

    public Admin()
    {
        super("Admin Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600, 300);
        
       
        
        
        File file = new File("Accepted.txt");
        if (file.exists()) {
            file.delete();
        }
        
        b1 = new JButton("Display");
        
        
        p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        t1 = new JTextField(25);
        b2 = new JButton("Accept");
        p1.add(t1);
        p1.add(b2);
        
        
        p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        t2 = new JTextField(25);
        b3 = new JButton("Accept");
        p2.add(t2);
        p2.add(b3);
        
        
        p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        t3 = new JTextField(25);
        b4 = new JButton("Accept");
        p3.add(t3);
        p3.add(b4);
        
        
        p4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        t4 = new JTextField(25);
        b5 = new JButton("Accept");
        p4.add(t4);
        p4.add(b5);
        
        
        p5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        t5 = new JTextField(25);
        b6 = new JButton("Accept");
        p5.add(t5);
        p5.add(b6);

        pC = new JPanel();
        pC.setLayout(new GridLayout(5, 1));
        
        pC.add(p1);
        pC.add(p2);
        pC.add(p3);
        pC.add(p4);
        pC.add(p5);
        
        pG = (JPanel)getContentPane();
        pG.setLayout(new BorderLayout());
        
        pG.add(b1,BorderLayout.NORTH);
        pG.add(pC, BorderLayout.SOUTH);
        
        
        b1.addActionListener(new ButtonDisplayListener());
        b2.addActionListener(new ButtonAcceptListener1());
        b3.addActionListener(new ButtonAcceptListener2());
        b4.addActionListener(new ButtonAcceptListener3());
        b5.addActionListener(new ButtonAcceptListener4());
        b6.addActionListener(new ButtonAcceptListener5());
        setVisible(true);
        pack();
        
        
    }
    

    
    public class ButtonDisplayListener implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            FileInputStream file;
            ObjectInputStream obj;
            BufferedReader br;
            String lin = null, arr[];
            String fn, ln, ag, gn;
            try {
            br = new BufferedReader(new FileReader("users.txt"));
            int i = 0;
            while ((lin = br.readLine()) != null) {
                arr = lin.split(";");
                fn = arr[0];
                ln = arr[1];
                ag = arr[2];
                gn = arr[3];
                p[i] = new person(fn, ln, ag, gn);
                i++;
            }
            
            t1.setText(p[0].toString());
            t2.setText(p[1].toString());
            t3.setText(p[2].toString());
            t4.setText(p[3].toString());
            t5.setText(p[4].toString());

            br.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("The file person.txt is not found");
        } 
        catch (IOException e) {
            System.out.println("Exception of I/o: " + e);
        }
        catch (ClassCastException e){
            System.out.println("Exception of cast: " + e.getMessage());
        }
        }
    }
    
    public class ButtonAcceptListener1 implements ActionListener {
    public void actionPerformed(ActionEvent a) {
        
        try {
            PrintWriter outputfile = new PrintWriter(new FileWriter("Accepted.txt", true));
            outputfile.println(t1.getText());
            outputfile.close();            
            t1.setText("");
            
        } catch (FileNotFoundException e) {
            System.out.println("The file Accepted.txt is not found");
        } catch (IOException e) {
            System.out.println("Exception of I/O: " + e.getMessage());
        }
    }
}
    
    public class ButtonAcceptListener2 implements ActionListener {
    public void actionPerformed(ActionEvent a) {
       
        try {
            PrintWriter outputfile = new PrintWriter(new FileWriter("Accepted.txt", true));
            outputfile.println(t2.getText());
            outputfile.close(); 
            t2.setText("");

        } catch (FileNotFoundException e) {
            System.out.println("The file Accepted.txt is not found");
        } catch (IOException e) {
            System.out.println("Exception of I/O: " + e.getMessage());
        }
    }
}
    
    public class ButtonAcceptListener3 implements ActionListener {
    public void actionPerformed(ActionEvent a) {
        
        try {
            PrintWriter outputfile = new PrintWriter(new FileWriter("Accepted.txt", true));
            outputfile.println(t3.getText());
            outputfile.close(); 
            t3.setText("");
  
        } catch (FileNotFoundException e) {
            System.out.println("The file Accepted.txt is not found");
        } catch (IOException e) {
            System.out.println("Exception of I/O: " + e.getMessage());
        }
    }
}
    
    public class ButtonAcceptListener4 implements ActionListener {
    public void actionPerformed(ActionEvent a) {
        
        try {
            PrintWriter outputfile = new PrintWriter(new FileWriter("Accepted.txt", true));
            outputfile.println(t4.getText());
            outputfile.close(); 
            t4.setText("");
    
        } catch (FileNotFoundException e) {
            System.out.println("The file Accepted.txt is not found");
        } catch (IOException e) {
            System.out.println("Exception of I/O: " + e.getMessage());
        }
    }
}
    
    public class ButtonAcceptListener5 implements ActionListener {
    public void actionPerformed(ActionEvent a) {
        
        try {
            PrintWriter outputfile = new PrintWriter(new FileWriter("Accepted.txt", true));
            outputfile.println(t5.getText());
            outputfile.close(); 
            t5.setText("");
 
        } catch (FileNotFoundException e) {
            System.out.println("The file Accepted.txt is not found");
        } catch (IOException e) {
            System.out.println("Exception of I/O: " + e.getMessage());
        }
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        Admin admin = new Admin();
        admin.show();
    }
    
}