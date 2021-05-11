public abstract class Resposta{
  public String pergunta;
  public String resposta;

  public Resposta(String pergunta){
    this.pergunta = pergunta;
   
  }
  public boolean verifica(String entrada) {
      if (entrada.contains(pergunta)) {
        return true;
      }else{
        return false;
      }
  }

  public String produz(){
    return this.resposta;
  }
   public String getPergunta(){
    return this.pergunta;
  }

}