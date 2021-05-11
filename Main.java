import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class Main {
	public static void main ( String [] args ) {
		Chatbot bot = new Chatbot ();
		// criando as respostas
		Resposta rs1 = new RespostaSimples("nome", " Meus amigos me chamam de AnhembiBot .");
    	Resposta rs2 = new RespostaSimples("musica", " Minha musica favorita é alguma do rhcp .");
		Resposta rs3 = new RespostaSimples("jogo", " Meu jogo favorito é minecraft .");
		ArrayList<String> piadas = new ArrayList();
		piadas.add(" Qual é o peixe baterista ? A truta !");
		piadas.add(" Qual é o peixe que cai do céu? Atum !");
		Resposta rs4 = new RespostaAleatoria ("piada", piadas );
  		Resposta rs5 = new RespostaHora("hora");
  		Resposta rs6 = new RespostaData("dia");
    
    
		bot.adiciona(rs1);
		bot.adiciona(rs2);
		bot.adiciona(rs3);
		bot.adiciona(rs4);
		bot.adiciona(rs5);
		bot.adiciona(rs6);
		//System.out.println(bot.processar("dia"));
		Scanner entrada = new Scanner ( System . in);
		String texto ;
		// loop infinito para ficar lendo as perguntas do usuario
		while ( true ) {
			System.out.print("> ");
			texto = entrada.nextLine ();
			System.out.println(bot.processar( texto ));
		}
	
	}
}
