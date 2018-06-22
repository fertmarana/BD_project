/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.tables;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sql.ConnectionManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sql.ConnectionManager;
/**
 *
 * @author macbook
 */
public class Recreativa {
     private String Nome;
    private String RestricaodeIdade;
    
    	public Recreativa(String Nome, String RestricaodeIdade) {
		this.Nome = Nome;
                this.RestricaodeIdade = RestricaodeIdade;
		
	}
        public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getRestricaodeIdade() {
		return RestricaodeIdade;
	}
	
	public void setRestricaodeIdade(String RestricaodeIdade) {
		this.RestricaodeIdade = RestricaodeIdade;
	} 
    public static ObservableList<Recreativa> tableView(){
		ResultSet res;
		List<Recreativa> list = new ArrayList<Recreativa>();
		String sql="select * from RECREATIVA";
		try {
			res = ConnectionManager.query(sql);
			while(res.next())
				list.add(new Recreativa(res.getString(1), res.getString(2)));
			res.close();
			ConnectionManager.closeQuery();
			
			return FXCollections.observableList(list);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
    
    public static ObservableList<String> getListRecreativa(){
		ResultSet res;
		List<String> list = new ArrayList<>();
		String sql = "select NOME from RECREATIVA";
		try {
			res = ConnectionManager.query(sql);
			while(res.next())			
				list.add(res.getString(1));
				
			res.close();
			ConnectionManager.closeQuery();
			
			return FXCollections.observableList(list);
		} catch (SQLException e) {
            throw new RuntimeException(e);
		}
	}
	
        
        public static void insertRecreativa(Recreativa recreativa) {
		String sql = "insert into RECREATIVA (NOME,RESTRICAODEIDADE) values("+recreativa+")";
		try {
			ConnectionManager.query(sql);
			ConnectionManager.closeQuery();
		}catch(SQLException e) {
			throw new RuntimeException();
		}
	}
        public static void deleteRecreativa(Recreativa recreativa) {
		String sql = "delete from RECREATIVA"+ recreativa.toStringRestritions();
		try {
			ConnectionManager.query(sql);
			ConnectionManager.closeQuery();
		}catch(SQLException e) {
			throw new RuntimeException();
		}
                
	}
        private String toStringRestritions() {
		String res = " where ";
		if(Nome.compareTo("") != 0) {
			res += " NOME = '"+this.Nome+"'";
		}
                if(RestricaodeIdade.compareTo("") != 0) {
			res += " RESTRICAODEIDADE = '"+this.RestricaodeIdade+"'";
		}
		
		if(res.compareTo(" where ") == 0)
			res = " ";
		return res;
	}
        @Override
	public String toString() {
		return "'"+this.Nome+"','"+this.RestricaodeIdade+"'";
	}
}
