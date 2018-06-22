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
public class Pessoa {
    private String CPF;
    private String Categoria;
    private String Nome;
    private String RG;
    private String Telefone;
    private String Email;
    
        public Pessoa() {
		this.CPF = CPF;
		this.Categoria = Categoria;
		this.Nome = Nome;
                this.RG = RG;
		this.Telefone = Telefone;
		this.Email = Email;
	}
        
    	public Pessoa(String CPF, String Categoria, String Nome, String RG, String Telefone, String Email) {
		this.CPF = CPF;
		this.Categoria = Categoria;
		this.Nome = Nome;
                this.RG = RG;
		this.Telefone = Telefone;
		this.Email = Email;
	}
        public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public String getCategoria() {
		return Categoria;
	}
	
	public void setCategoria(String Categoria) {
		this.Categoria = Categoria;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
        public String getRG() {
		return RG;
	}
	
	public void setRG(String RG) {
		this.RG = RG;
	}
	
	public String getTelefone() {
		return Telefone;
	}
	
	public void setTelefone(String Telefone) {
		this.Telefone = Telefone;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
        
        public static ObservableList<Pessoa> tableView(){
		ResultSet res;
		List<Pessoa> list = new ArrayList<Pessoa>();
		String sql="select * from PESSOA";
		try {
			res = ConnectionManager.query(sql);
			while(res.next())
				list.add(new Pessoa(res.getString(1), res.getString(2), res.getString(3), res.getString(4),res.getString(5), res.getString(6)));
			res.close();
			ConnectionManager.closeQuery();
			
			return FXCollections.observableList(list);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
    
        public static ObservableList<String> getListPessoa(){
		ResultSet res;
		List<String> list = new ArrayList<>();
		String sql = "select NOME from PESSOA";
		try {
			res = ConnectionManager.query(sql);
			while(res.next())			
				list.add(res.getString(4));
				
			res.close();
			ConnectionManager.closeQuery();
			System.out.printf("%s", list.toString());
			return FXCollections.observableList(list);
		} catch (SQLException e) {
            throw new RuntimeException(e);
		}
	}
        
        public static void insertPessoa(Pessoa pessoa) {
		String sql = "insert into PESSOA (CPF,CATEGORIA, NOME,RG, TELEFONE,EMAIL) values("+pessoa+")";
		try {
			ConnectionManager.query(sql);
			ConnectionManager.closeQuery();
		}catch(SQLException e) {
			throw new RuntimeException();
		}
	}
        public static void deletePessoa(Pessoa pessoa) {
		String sql = "delete from PESSOA"+ pessoa.toStringRestritions();
		try {
			ConnectionManager.query(sql);
			ConnectionManager.closeQuery();
		}catch(SQLException e) {
			throw new RuntimeException();
		}
                
	}
        private String toStringRestritions() {
		String res = " where ";
		if(CPF.compareTo("") != 0) {
			res += " CPF = '"+this.CPF+"'";
		}
		if(Categoria.compareTo("") != 0) {
			if(res.compareTo(" where ") != 0)
				res += " and ";
			res += " CATEGORIA = '"+this.Categoria+"'";
		}
		if(Nome.compareTo("") != 0) {
			if(res.compareTo(" where ") != 0)
				res += " and ";
			res += " NOME = '"+this.Nome+"'";
		}
                if(RG.compareTo("") != 0) {
			if(res.compareTo(" where ") != 0)
				res += " and ";
			res += " RG = '"+this.RG+"'";
		}
		if(res.compareTo(" where ") == 0)
			res = " ";
		return res;
	}
        @Override
	public String toString() {
		return "'"+this.CPF+"','"+this.Categoria+"','"+this.Nome+"','"+this.RG+"','"+this.Telefone+"','"+this.Nome+"'";
	}
    
}
