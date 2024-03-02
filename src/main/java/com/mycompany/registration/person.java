/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

import java.io.*;
import java .io.Serializable;

public class person implements Serializable  {
 private String t1,t2,com1,r1;

public person(String t1,String t2,String com1,String r1){
  this.t1=t1;
  this.t2=t2;
  this.com1=com1;
  this.r1=r1;
 
    
}

@Override
public String toString(){
return t1+","+t2+","+com1+","+r1;
}

}