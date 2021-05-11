
public class RespostaSimples extends Resposta{
  public String resposta;
  public RespostaSimples(String pergunta, String resposta){
    super(pergunta);
     this.resposta = resposta;
  }
 public String produz(){
    return this.resposta;
  }
}