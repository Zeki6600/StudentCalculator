/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentcalculator;

/**
 *
 * @author alexanderantonio
 */
public class Calculator {
    
    public int add(int a, int b){
        return a+b;
    }
    
    public int subratc(int a, int b){
        return a-b;
    }
    
    public int multiply(int a, int b){
        return a*b;
    }
    
    public int divide(int a, int b){
        if(b!=0){
            return a/b;
        }else
        return 0;
    }
    
}
