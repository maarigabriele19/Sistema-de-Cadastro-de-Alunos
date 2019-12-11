package cadastrodealuno;
public class Aluno extends Pessoa // Criando método ALUNO que herdará atributos da classe PESSOA //
{
    private String curso;
    private String matricula;
    private float n1;
    private float n2;
    private float n3;
    
    public Aluno(String curso, float n1, float n2, float n3)
    {
        data_digitada = new Idade();
        this.curso = curso;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public String getMatricula()
    {
         return matricula;
    }
    public void setMatricula(String newMatricula)
    {
         matricula  = newMatricula;
    }

    public String getCurso() 
    {
        return curso;
    }

    public void setCurso(String curso) 
    {
        this.curso = curso;
    }

    public float getN1() 
    {
        return n1;
    }

    public void setN1(float n1) 
    {
        this.n1 = n1;
    }

    public float getN2()
    {
        return n2;
    }

    public void setN2(float n2) 
    {
        this.n2 = n2;
    }

    public float getN3() 
    {
        return n3;
    }

    public void setN3(float n3) 
    {
        this.n3 = n3;
    }
    public float getMedia()
    {
        return (n1 + n2 + n3) / 3;
    }
     public String getSituacaoAluno() 
     {
        if (getMedia() >= 7) 
        {
            return "Aprovado por média";
        } 
        else if (getMedia() <= 6.9 && getMedia() >= 4) 
        {
            return "De AF";
        }
        else
        {
             return "Reprovado";
        }
     }
    @Override
    public String toString() {
        return
                "Nome Completo: " + NomeCompleto() + "\n"
                + "E-mail: " + Email() + "\n"
                + "Idade: " + CalculoIdade() + "\n"
                + "Data De Nascimento: " + getDataDeNascimento() + "\n"
                + "Curso: " + curso + "\n"
                + "Número de Matrícula: " + matricula + "\n"
                + "Notas: " + n1 + "," + n2 + "," + n3 + "\n"
                + "Média: " + getMedia() + "\n"
                + "Situação: " + getSituacaoAluno();
    }
}
    
 
