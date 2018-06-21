/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;
import javax.swing.JOptionPane;
import eventmanager.AdmMain;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author macbook
 */
public class EventManager {
    //public List<String> conditions = new List<String>();
   //  List<Filter> conditions = new ArrayList<Filter>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new AdmMain(new ArrayList<Filter>()).setVisible(true);
    }
    
}
