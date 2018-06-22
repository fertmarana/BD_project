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
public class Atracao {
    private String Nome;
   
    
    	public Atracao(String Nome) {
		this.Nome = Nome;
		
	}
        public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	   
    public static ObservableList<Atracao> tableView(){
		ResultSet res;
		List<Atracao> list = new ArrayList<Atracao>();
		String sql="select * from ATRACAO";
		try {
			res = ConnectionManager.query(sql);
			while(res.next())
				list.add(new Atracao(res.getString(1)));
			res.close();
			ConnectionManager.closeQuery();
			
			return FXCollections.observableList(list);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
    
        public static ObservableList<String> getListAtracao(){
		ResultSet res;
		List<String> list = new ArrayList<>();
		String sql = "select NOME from ATRACAO";
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
        
        public static void insertAtracao(Atracao atracao) {
		String sql = "insert into ATRACAO (NOME) values("+atracao+")";
		try {
			ConnectionManager.query(sql);
			ConnectionManager.closeQuery();
		}catch(SQLException e) {
			throw new RuntimeException();
		}
	}
        public static void deleteAtracao(Atracao atracao) {
		String sql = "delete from ATRACAO"+ atracao.toStringRestritions();
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
		
		if(res.compareTo(" where ") == 0)
			res = " ";
		return res;
	}
        @Override
	public String toString() {
		return "'"+this.Nome+"'";
	}
}
