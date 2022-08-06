package estruturas;

import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

	String[] nome = new String[50];
	String[] endereco = new String[50];
	String[] telefone = new String[50];

	for (int i = 0; i < nome.length; i++) {
		nome[i] = "";
		telefone[i] = "";
		endereco[i] = "";
	}

	int opcao = 0, listarPor = 0, posicao = 0, codigoPesquisa = 0;
            String continuar = "", nomeExcluir = "", nomePesquisa = "";

            Scanner entrada = new Scanner(System.in);

         do {

         System.out.println("Escolha: 1-Incluir  2-Listar  3-Excluir  4-Sair");
		opcao = entrada.nextInt(); 
		entrada.nextLine();

	switch (opcao) {
        case 1:
	// Código para Incluir
				
            if (posicao < nome.length) {					
            do {
						
            System.out.print("Digite o nome: ");
            nome[posicao] = entrada.nextLine();

            System.out.print("Digite o endereco: ");
            endereco[posicao] = entrada.nextLine();

            System.out.print("Digite o telefone: ");
            telefone[posicao] = entrada.nextLine();

            System.out.print("Deseja continuar cadastro? 1-Sim  2-Nao ");
            continuar = entrada.nextLine();

            posicao++;
                    }
            while (continuar.equals("1"));
            } 
            else {
                    System.out.println("Sua agenda esta cheia.");
            }
            break;

        case 2:
            
        System.out.println("Como deseja pesquisar? 01-Código 02-Nome 03-Todos");
        listarPor = entrada.nextInt();
        entrada.nextLine();

        switch (listarPor) {
        case 1:
                System.out.println("Digite o codigo para pesquisa: ");
                codigoPesquisa = entrada.nextInt();
                entrada.nextLine();

                if (codigoPesquisa < nome.length && codigoPesquisa >= 0) {

                System.out.println("Nome: " + nome[codigoPesquisa] + 
                                "Endereco: " + endereco[codigoPesquisa] + 
                                "Telefone: " + telefone[codigoPesquisa]);
                } 
                else {
                        System.out.println("Codigo Invalido!");
                }
                break;

        case 2:
            
                System.out.println("Digite o nome para pesquisa: ");
                nomePesquisa = entrada.nextLine();

                for (int i = 0; i < telefone.length; i++) {

                        if (nome[i].equalsIgnoreCase(nomePesquisa)) {

                        System.out.println("Nome: " + nome[i] + 
                        "Endereco: " + endereco[i] +"Telefone: " + telefone[i]);							
                        }
                }
                break;

        case 3:
                // Código que lista todos os dados.
                for (int i = 0; i < nome.length; i++) {

                    if (!nome[i].equals("")) {

                        System.out.println("Nome: " + nome[i] + " Telefone: "
                              + telefone[i] + " Endereco: " + endereco[i]);
                     }
              }
                break;

        default:
                System.out.println("Opcao invalida! Escolha de 1 a 3");

                break;                
        }

    case 3:
            // Código para Excluir
            System.out.println("Quem deseja excluir? ");
            nomeExcluir = entrada.nextLine();

            for (int i = 0; i < nome.length; i++) {
                    if (nome[i].equals(nomeExcluir)) {

                            nome[i] = "";
                            telefone[i] = "";
                            endereco[i] = "";
                    }
            }
            break;
            
    case 4:
            // Código para Sair
            System.out.println("Programa Finalizado.");
            return;

    default:
            // Opção Invalida!
            System.out.println("Opcao Invalida! Tente novamente.");
            break;
    }
    } while (opcao != 4);
         
    }
}