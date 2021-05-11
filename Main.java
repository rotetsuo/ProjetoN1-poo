import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class Main {
	public static void main ( String [] args ) {
		Chatbot bot = new Chatbot ();
		// criando as respostas
		Resposta rs1 = new RespostaSimples("nome", " Meus amigos me chamam de AnhembiBot .");
    	Resposta rs2 = new RespostaSimples("musica", " Minha musica favorita é alguma do daft punk, meus amigos robôs .");
		Resposta rs3 = new RespostaSimples("jogo", " Meu jogo favorito é portal 2 .");
		ArrayList<String> piadas = new ArrayList();
		piadas.add(" Qual é o peixe baterista ? A truta !");
		piadas.add(" Qual é o peixe que cai do céu? Atum !");
		piadas.add(" O que o pato disse para a pata? Vem Quá!");
		piadas.add(" Qual a cidade brasileira que não tem táxi? Uberlandia !");
		piadas.add("O que o tijolo falou para o outro? Há um ciumento entre nós!");
		piadas.add("Porque o Batman colocou o bat-móvel no seguro? Porque ele tem medo que Robin! ");
		Resposta rs4 = new RespostaAleatoria ("piada", piadas );
  		Resposta rs5 = new RespostaHora("hora");
  		Resposta rs6 = new RespostaData("dia");
		Resposta rs7 = new RespostaContador("quantidade");
    
    
		bot.adiciona(rs1);
		bot.adiciona(rs2);
		bot.adiciona(rs3);
		bot.adiciona(rs4);
		bot.adiciona(rs5);
		bot.adiciona(rs6);
		bot.adiciona(rs7);
		//System.out.println(bot.processar("dia"));
		System.out.println(" ------------------------------------");
		System.out.println(" Iniciando o chatbot ");
		System.out.println(" ------------------------------------");
		Scanner entrada = new Scanner ( System.in);
		String texto ;
		// loop infinito para ficar lendo as perguntas do usuario
		while ( true ) {
			System.out.print("> ");
			texto = entrada.nextLine ();
			System.out.println(bot.processar( texto ));
		}
	
	}
}
