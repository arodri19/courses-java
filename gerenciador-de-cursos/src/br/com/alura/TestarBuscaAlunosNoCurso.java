package br.com.alura;

public class TestarBuscaAlunosNoCurso {

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
		
		
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(a1.getNumeroMatricula());
		System.out.println("aluno: " + aluno);

	}

}
