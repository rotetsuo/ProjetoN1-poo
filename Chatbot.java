import java.util.ArrayList;
public class Chatbot{
  
  ArrayList<Resposta> respostas = new ArrayList();
  ArrayList<String> perguntas = new ArrayList();
  
  public void adiciona(Resposta r){
    respostas.add(r);
    String palavraChave = r.getPergunta();
    perguntas.add(palavraChave);
  }
  
  
  public String processar(String texto){
  
    for(Resposta palavraChave : respostas){
      if(palavraChave.verifica(texto)){
        return palavraChave.produz();
      }
    }
    
    return "nao sei responder";
  }
  
}