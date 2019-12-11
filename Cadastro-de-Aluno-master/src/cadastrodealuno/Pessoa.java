package cadastrodealuno;
import java.util.Calendar;

abstract public class Pessoa 
{
    protected String nome;
    protected String sobrenome;
    protected String email;
    protected Idade data_digitada;

    public String NomeCompleto() 
    {
        return nome + " " + sobrenome;
    }
    
    public  void setNome(String nome)
    {
       this.nome = nome;
    }
    
    public  void setSobrenome(String sobrenome)
    {
       this.sobrenome = sobrenome;
    }
    
    public  void setEmail(String email)
    {
       this.email = email;
    }
    
    public int CalculoIdade()
    {
        int idade;
        Calendar calendario = Calendar.getInstance();
        if (calendario.get(Calendar.MONTH) + 1 < data_digitada.mes) 
        {
            idade = calendario.get(Calendar.YEAR) - 1 - data_digitada.ano;
        } 
        else if (calendario.get(Calendar.MONTH) + 1 == data_digitada.mes) 
        {
            if (Calendar.DAY_OF_MONTH < data_digitada.dia)
            {
                idade = calendario.get(Calendar.YEAR) - 1 - data_digitada.ano;
            }
            else 
            {
                idade = calendario.get(Calendar.YEAR) - data_digitada.ano;
            }
        }
        else 
        {
            idade = calendario.get(Calendar.YEAR) - data_digitada.ano;
        }
        return idade;
    }
    public String getDataDeNascimento() 
    {
        return data_digitada.toString();
    }
    public String Email()
    {
        return email;
    }
}