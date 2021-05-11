import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class RespostaHora extends Resposta{
  
  public String data;

  public RespostaHora(String pergunta){
    super(pergunta);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    this.data = dtf.format(now);
  }
  public String produz(){
    return this.data;
  }
}