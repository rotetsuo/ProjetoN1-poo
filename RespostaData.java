import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class RespostaData extends Resposta{
  
  public String data;

  public RespostaData(String pergunta){
    super(pergunta);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    LocalDateTime now = LocalDateTime.now();  
    this.data = dtf.format(now);
  }
  public String produz(){
    return this.data;
  }
}