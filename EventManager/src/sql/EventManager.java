/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;
import javax.swing.JOptionPane;
import eventmanager.Interface.AdmMain;
import eventmanager.Interface.AdmMain;
import eventmanager.Interface.AdmMain;
import eventmanager.Interface.ExtEventConfig;
import eventmanager.Interface.ExtEventConfiguration;
import eventmanager.Interface.Filter;
import eventmanager.Interface.Filter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JFrame;
import static sql.ConnectionManager.connect;
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
        //ConnectionManager con = new ConnectionManager();
        ConnectionManager.connect("T9791010","821311");
        
        // TODO code application logic here
        //new AdmMain(new ArrayList<Filter>()).setVisible(true);
        new ExtEventConfig().setVisible(true);

        //new JFrame("My 2nd Window!").setVisible(true);
    }
    
}
