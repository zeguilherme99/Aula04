import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		int nDeAlunos =0, i=0, idadeDoAluno, somaIdade = 0;
		double mediaIdade;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantidade de alunos:");
		nDeAlunos = leitor.nextInt();
		
		while(i<nDeAlunos) {
			System.out.println("Idade do aluno, este é o "+ (i+1) + " aluno");
			idadeDoAluno = leitor.nextInt();
			somaIdade += idadeDoAluno;
			i++;
		}
			mediaIdade = somaIdade/nDeAlunos;
			System.out.println("A media de idade é de: " + mediaIdade);
		
			leitor.close();
	}

}
