package br.uern.exemplo.fatorial;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.*;
public class BancoDeDados {

	   public class BancoDeDados {
		   private Connection connection = null;
		   private Statement statement = null;
		   private ResultSet resultset = null;
		   public void conectar() {
			   String servidor = "jdbc:mysql//localhost:3306/FATORIAL";
			   String usuario = "root";
			   String senha = "password";
			   String driver = "com.mysql.jdbc.Driver";
			   try {
				   Class.forName(driver);
				   this.connection = DriverManager.getConnection(servidor, usuario, senha);
				   this.statement = this.connection.createStatement();
			   } catch (Exception e) {
				   System.out.println("Erro:" + e.getMessage);
			   }
		   }
		public boolean estaConectado() {
			if(this.connection != null) {
				return true;
			}
			else {
				return false;
			}
		}
		public void listarNUMFATORIAL() {
			try {
				String query = "SELECT * FROM valor ORDER BY id";
				this.resultset = this.statement.executeQuery(query);
				this.statement = this.connection.createStatement();
				while(this.resultset.next()) {
					System.out.println("ID:" + this.resultset.getString("id") + "- Valor:" + this.resultset.getString("nome") + "- Fatorial:" + this.resultset.getString("fatorial"));
				}
			} catch(Exception e) {
				System.out.println("Erro:" + e.getMessage());
			}
		}
	   }
}