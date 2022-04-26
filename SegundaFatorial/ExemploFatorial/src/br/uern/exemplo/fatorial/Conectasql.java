package br.uern.exemplo.fatorial;

import java.sql.*;
import javax.swing.*;
public class Conectasql {
   Connection conn=null;
	public static Connection dbConnector() {
	
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\luesp\\OneDrive\\Documentos\\PADATA\\TrabalhoPA.db");
			JOptionPane.showMessageDialog(null, "Connection Successful");
			return conn;
		}
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
}