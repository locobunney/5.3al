/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg3;

/**
 *
 * @author Andrew_2
 */
public class Task implements Priority{
    private String task; private int prioritylevel;
    
    public void setPriority(int priority){
        prioritylevel=priority;
    }
    public int getPriority(){
        return prioritylevel;
    }
    public String getTask(){
        return task;
    }
}
