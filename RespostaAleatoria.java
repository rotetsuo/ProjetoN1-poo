import java.util.ArrayList;
import java.util.Random;

public class RespostaAleatoria extends Resposta{
  ArrayList<String> listaRespostas = new ArrayList();
  

  public RespostaAleatoria(String pergunta, ArrayList<String> listarespostas){
    super(pergunta);
    this.listaRespostas = listarespostas;
  }
  public String produz(){
    Random randomizer = new Random();
    String random = this.listaRespostas.get(randomizer.nextInt(this.listaRespostas.size()));
    return random;
  }
}