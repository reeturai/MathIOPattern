/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.MathIOPattern;

import com.leapfrog.MathIOPattern.cmd.MathCommand;
import com.leapfrog.MathIOPattern.cmd.MathFactory;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class program {

    
    public static void main(String[] args) {
        MathFactory mf=new MathFactory();
        Scanner in=new Scanner(System.in);
        while(true){
        System.out.println("Enter the number x and y");
        int x=in.nextInt();
        int y=in.nextInt();
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("Enter your choice");
        System.out.println("1.add");
        System.out.println("2.subtract");
        System.out.println("3.power");
        System.out.println("4.division");
        System.out.println("5.exit");
        int a=in.nextInt();
        MathCommand cmd=mf.get(a);
        if(cmd!=null){
           cmd.calculate(x,y);
            
        }else
            System.out.println("command not found");
        
    }}
    
}
