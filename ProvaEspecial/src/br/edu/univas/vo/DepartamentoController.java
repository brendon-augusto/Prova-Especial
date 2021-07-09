package br.edu.univas.vo;

import java.util.Scanner;

import br.edu.univas.dao.Departamento;

public class DepartamentoController {
		
		Scanner scanner = new Scanner(System.in);
	
	public Departamento createrDepartamento(Scanner scanner) {
		
		 Departamento departamento = new Departamento(); 
		 
		 System.out.println("Informe seu Departamento");
		 departamento.setNome(scanner.nextLine());
		 
		 System.out.println("Informe quantos funcionarios possui seu Departamento ");
		 departamento.setQuantidadeFuncionarios(scanner.nextInt());
		 scanner.nextLine();
		 
		 
		 scanner.close();
		return departamento; 
	}
}
