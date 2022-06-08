package agenda;
import java.util.Arrays;
import java.util.Scanner;
public class agenda {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Declarando variáveis e dando valor a elas
		int colunas=5, linhas=10;
		//Declarando variáveis e inicializando elas
		int i=0,j=0;
		//Criando matriz de string 10x5
		String agenda[][]= new String [linhas][colunas];
		
		 //Repita 10 vezes (1x por pessoa) recebendo os seguintes comandos
			for (i=0;i<10;i++) {
				//Pedindo para informar o nome
				System.out.printf("Nome:\n", (j+1));
				//lendo o nome digitado
				agenda[i][0]=ler.next();
				//Pedindo para informar o bairro
				System.out.printf("Bairro:\n", (j+1));
				//lendo o bairro informado
				agenda[i][1]=ler.next();
				//Pedindo para informar o endereco
				System.out.printf("Endereco:\n", (j+1));
				//lendo o endereco informado
				agenda[i][2]=ler.next();
				//Pedindo para informar o CEP
				System.out.printf("CEP:\n", (j+1));
				//lendo cep informado
				agenda[i][3]=ler.next();
				//Pedindo para informar o Telefone
				System.out.printf("Telefone:\n", (j+1));
				//Lendo o telefone informado
				agenda[i][4]=ler.next();	
			}
			//Repita 10 vezes para imprimir os dados que foram informados anteriormente 
		for (i=0;i<10;i++) {
			//Exibindo o nome informado
			System.out.printf("Nome: %s\n", agenda[i][0]);
			//Exibindo o bairro informado
			System.out.printf("Bairro: %s\n", agenda[i][1]);
			//Exibindo o endereco informado
			System.out.printf("Endereco: %s\n", agenda[i][2]);
			//Exibindo o cep informado
		    System.out.printf("CEP: %s\n", agenda[i][3]);
		  //Exibindo o telefone informado
		    System.out.printf("Telefone: %s\n\n", agenda[i][4]);          
		}
	}
}

