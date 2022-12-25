package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "André Rodrigues");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Andre Rodrigues", 123456);
		Aluno a2 = new Aluno("Teste",5617);
		Aluno a3 = new Aluno("Teste2", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.getAlunos().forEach(a ->{
			System.out.println(a);
		});
		
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		//iterador.hasNext();
		//iterador.next();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		Vector<Aluno> vetor = new Vector<>();
		
		for(Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
		
		System.out.println("o aluno " + a1 + "está matricula?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno andre = new Aluno("Andre Rodrigues", 123456);
		System.out.println(javaColecoes.estaMatriculado(andre));
		System.out.println();
		System.out.println(a1.equals(andre));
		
		System.out.println(a1.hashCode() == andre.hashCode());
		

	}

}
