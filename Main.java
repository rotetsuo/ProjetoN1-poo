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
		Resposta rs5 = new RespostaAleatoria ("piada", piadas );
  		Resposta rs4 = new RespostaHora("dia");
    
    
		bot.adiciona(rs1);
		bot.adiciona(rs2);
		bot.adiciona(rs3);
		bot.adiciona(rs4);
		System.out.println(bot.processar("dia"));
	
	}
}
