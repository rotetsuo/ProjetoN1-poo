public class RespostaContador extends Resposta {
    public int contador;

    public RespostaContador(String pergunta){
        super(pergunta);
        this.contador = 0;
    }
    public String produz(){

        this.contador++;
        
        return String.valueOf(this.contador);
    }
}
