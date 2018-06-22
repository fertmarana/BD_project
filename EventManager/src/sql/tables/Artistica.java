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
/**
 *
 * @author macbook
 */
public class Artistica {
    private String Nome;
    private String NomeArtista;
    
    	public Artistica(String Nome, String NomeArtista) {
		this.Nome = Nome;
                this.NomeArtista = NomeArtista;
		
	}
        public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getNomeArtista() {
		return NomeArtista;
	}
	
	public void setNomeArtista(String NomeArtista) {
		this.NomeArtista = NomeArtista;
	} 
    public static ObservableList<Artistica> tableView(){
		ResultSet res;
		List<Artistica> list = new ArrayList<Artistica>();
		String sql="select * from ARTISTICA";
		try {
			res = ConnectionManager.query(sql);
			while(res.next())
				list.add(new Artistica(res.getString(1), res.getString(2)));
			res.close();
			ConnectionManager.closeQuery();
			
			return FXCollections.observableList(list);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
    
    public static ObservableList<String> getListArtistica(){
		ResultSet res;
		List<String> list = new ArrayList<>();
		String sql = "select NOME from ARTISTICA";
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
	
        
        public static void insertArtistica(Artistica artistica) {
		String sql = "insert into ARTISTICA (NOME,NOMEARTISTA) values("+artistica+")";
		try {
			ConnectionManager.query(sql);
			ConnectionManager.closeQuery();
		}catch(SQLException e) {
			throw new RuntimeException();
		}
	}
        public static void deleteArtistica(Artistica artistica) {
		String sql = "delete from ARTISTICA"+ artistica.toStringRestritions();
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
                if(NomeArtista.compareTo("") != 0) {
			res += " NOMEARTISTA = '"+this.NomeArtista+"'";
		}
		
		if(res.compareTo(" where ") == 0)
			res = " ";
		return res;
	}
        @Override
	public String toString() {
		return "'"+this.Nome+"','"+this.NomeArtista+"'";
	}
}
