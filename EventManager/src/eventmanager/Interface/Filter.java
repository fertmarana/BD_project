/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager.Interface;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author macbook
 */
public class Filter {
    String Search;
    String Atribute;
    String Key;
    String Op;

    public Filter(){
        
        
    }
    
    public Filter(String s, String a, String k, String op){
        addSearch(s);
        addAtribute(a);
        addKey(k);
        addOp(op);
        
    }
    
    
    public void addSearch(String s){
        Search = s;
        
    }
    public void addAtribute(String s){
        Atribute = s;
        
    }
    public void addKey(String s){
        Key = s;
        
    }
    public void addOp(String s){
        Op = s;
        
    }
    public String getSearch(){
        return Search;
    }
    public String getAtribute(){
        return Atribute;
    }
    public String getKey(){
        return Key;
    }
    public String getOp(){
        return Op;
    }
    
}
