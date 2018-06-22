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
public class PossuiAtracao {
    
    private String IdEvento;
    private String NomeAtracao;
   
    
    	public PossuiAtracao(String IdEvento,String NomeAtracao) {
		this.IdEvento = IdEvento;
                this.NomeAtracao = NomeAtracao;
		
	}
        
        
        public String getIdEvento() {
		return IdEvento;
	}
	
	public void setIdEvento(String IdEvento) {
		this.IdEvento = IdEvento;
	}
        public String getNomeAtracao() {
		return NomeAtracao;
	}
	
	public void setNomeAtracao(String NomeAtracao) {
		this.NomeAtracao = NomeAtracao;
	}
	
	
    public static ObservableList<PossuiAtracao> tableView(){
		ResultSet res;
		List<PossuiAtracao> list = new ArrayList<PossuiAtracao>();
		String sql="select * from POSSUIATRACAO";
		try {
			res = ConnectionManager.query(sql);
			while(res.next())
				list.add(new PossuiAtracao(res.getString(1),res.getString(2)));
			res.close();
			ConnectionManager.closeQuery();
			
			return FXCollections.observableList(list);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
    
        public static ObservableList<String> getListPossuiAtracao(){
		ResultSet res;
		List<String> list = new ArrayList<>();
		String sql = "select NOME,IDEVENTO from POSSUIATRACAO";
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
        
        public static void insertPossuiAtracao(PossuiAtracao possuiAtracao) {
		String sql = "insert into POSSUIATRACAO (NOME) values("+possuiAtracao+")";
		try {
			ConnectionManager.query(sql);
			ConnectionManager.closeQuery();
		}catch(SQLException e) {
			throw new RuntimeException();
		}
	}
        public static void deletePossuiAtracao(PossuiAtracao possuiAtracao) {
		String sql = "delete from POSSUIATRACAO"+ possuiAtracao.toStringRestritions();
		try {
			ConnectionManager.query(sql);
			ConnectionManager.closeQuery();
		}catch(SQLException e) {
			throw new RuntimeException();
		}
                
	}
        private String toStringRestritions() {
		String res = " where ";
		if(IdEvento.compareTo("") != 0) {
			res += " IDEVENTO = '"+this.IdEvento+"'";
		}
		
                if(NomeAtracao.compareTo("") != 0) {
			res += " NOME = '"+this.NomeAtracao+"'";
		}
                
		if(res.compareTo(" where ") == 0)
			res = " ";
		return res;
	}
        @Override
	public String toString() {
		return "'"+this.IdEvento+"','"+this.NomeAtracao+"'";
	}
}
