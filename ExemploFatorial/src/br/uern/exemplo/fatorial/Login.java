package br.uern.exemplo.fatorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
public class Login {


	public static void main(String[] args) {
		BancoDeDados bancoDeDados = new BancoDeDados();
			bancoDeDados.conectar();
			if(bancoDeDados.estaconectado()) {
				bancoDeDados.listarNUMFATORIAL();
				bancoDeDados.desconectar();
			}
			else {
				System.out.println("Nao foi possivel conectar ao banco de Dados");
			}
			
	}
}