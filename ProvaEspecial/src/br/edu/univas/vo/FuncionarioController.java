package br.edu.univas.vo;

import java.util.Scanner;

import br.edu.univas.dao.Departamento;
import br.edu.univas.dao.Funcionario;

public class FuncionarioController {
	  
	Scanner scanner = new Scanner(System.in);
	
	
	public Funcionario createFuncionario( ) {
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Por favor insira seu registro");
		funcionario.setRegistro(scanner.nextLine());
		
		System.out.println("Digite agora o seu Nome");
		funcionario.setNome(scanner.nextLine());
		
		System.out.println("Insira seu email: ");
		funcionario.setEmail(scanner.nextLine());
		
		System.out.println("Informe seu Departamento  Desenvolvimento ou Designe");
		 String departamento = scanner.nextLine();
		 
		 if(departamento.equals("Desenvolvimento")) {
			 funcionario.setDepartamento(new Departamento());
			 
		 } else if(departamento.equals("Designe")) {
			 funcionario.setDepartamento(new Departamento());
		 }
		
		scanner.close();
		return funcionario; 
	}
}
