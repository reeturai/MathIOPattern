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
public class MathFactory {
    public MathCommand get(int a){
        if(a==1)
            return new AddCommand();
       else if(a==2)
            return new SubCommand();
       else if(a==3)
            return new PowerCommand();
       else if(a==4)
            return new DivideCommand();
      else if(a==5)
         return new ExitCommand();
       else 
           return null;
        
    }
    
}
