package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		
		//lista Generica
		List lista1 = new ArrayList();
		Cliente  cliente1  = new Cliente(1, "jose","carlos","342.489.910-04");
		Cliente  cliente2  = new Cliente(2, "tomas","carlos","851.246.130-68");
		
		lista1.add(cliente1);
		lista1.add(cliente2);
		
		
		System.out.println(lista1.size());
		
		Funcionario f1 = new Funcionario(1, "Ana","Maria", "342.489.910-04");
		Funcionario f2 = new Funcionario(1, "Joana","Maria", "342.489.910-04");
		
		//lista1.add(f1);
		//lista1.add(f2);
		
		System.out.println(lista1.size());
		
		for(int i =0; i <lista1.size(); i++ ) {
			Cliente ctemp = (Cliente) lista1.get(i);
			System.out.println(ctemp.getNome());
			
		}

	}

}
