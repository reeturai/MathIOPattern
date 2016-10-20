/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.MathIOPattern.cmd;

/**
 *
 * @author welcome
 */
public class PowerCommand extends MathCommand {

    @Override
    public void calculate(int x,int y) {
          int total=1;
        for(int i=1;i<=y;i++){
          
            total=total*x;
           
        }System.out.println( total);
         }
    
}
