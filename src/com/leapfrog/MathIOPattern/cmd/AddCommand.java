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
public class AddCommand extends MathCommand{

    @Override
    public void calculate(int x,int y) {
        System.out.println(x+y);
    }
    
}
