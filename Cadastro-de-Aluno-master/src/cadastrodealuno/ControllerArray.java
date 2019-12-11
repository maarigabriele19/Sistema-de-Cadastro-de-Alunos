package cadastrodealuno;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ControllerArray 
{
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private int cont = 0;

    public String ProximoAluno() 
    {
        if(alunos.size() > 0)
        {
            cont ++;
            if(cont > alunos.size() -1 )
        {
            cont = 0;
        }
            String AddPosicao = "Pos: " + (cont + 1) + "\n" + alunos.get(cont).toString();
            return AddPosicao;
        }
        return null;
    }
    public String AlunoAnterior() 
    {
        if(alunos.size() > 0)
        {
             cont--;
             if(cont < 0)
             {
                 cont = alunos.size() - 1;
             }
             String AddPosicao = "Pos: " + (cont + 1) + "\n" + alunos.get(cont).toString();
             return AddPosicao;
        }
        return null;
    }

    public String UltimoCadastrado() 
    {
        try
        {
            int quantidade = alunos.size();
            cont = alunos.size() - 1;
            String AddPosicao = "Pos: " + (quantidade) + "\n" + alunos.get(cont).toString();
            return AddPosicao;
        }
        catch(Exception errado)
        {
            JOptionPane.showMessageDialog(null, "Problema na leitura de dados");
            return null;
        }
    }

    public boolean DeletarAluno() 
    {
        try
        {
            if(alunos.size() > 0)
            {
                alunos.remove(cont);
                return true;
            }
        }
        catch(Exception errado)
        {
            JOptionPane.showMessageDialog(null, "Problema na leitura de dados");
            return true;
        }
        return false;
    }
    public ArrayList<Aluno> getAlunos() 
    {
        return alunos;
    }
}
