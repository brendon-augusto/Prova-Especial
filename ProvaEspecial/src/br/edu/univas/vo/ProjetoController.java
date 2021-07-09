package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.univas.dao.Desenvolvedor;
import br.edu.univas.dao.Designer;
import br.edu.univas.dao.Funcionario;
import br.edu.univas.dao.Projeto;

public class ProjetoController {
	 List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	Scanner scanner = new Scanner(System.in);
	
	public Projeto createProjeto() {
			
		Projeto projeto = new Projeto();
		
		System.out.println("Informe a data de inicio do projeto ");
		projeto.setInicio(scanner.nextLine());
		
		System.out.println("Informe a data final estipulada do projeto ou data de termino ");
		projeto.setFim(scanner.nextLine());
		
		System.out.println("Informe a data de inicio do projeto ");
		projeto.setInicio(scanner.nextLine());
		
		System.out.println("Informe o status do projeto");
		projeto.setStatus(scanner.nextLine());
		
		System.out.println("Informe a qual a sua função Desenvolvedor ou Designer ");
		String dev = scanner.nextLine();
		String designer = scanner.nextLine();
		
		if (dev.equals("Desenvolvedor")) {
			funcionarios.add(new Desenvolvedor());
			
		} else if(designer.equals("Designer")) {
			funcionarios.add(new Designer());
		}
		
		scanner.close();
		return projeto; 
	}
}
