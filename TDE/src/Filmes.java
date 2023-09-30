import java.util.ArrayList;
import java.util.Date;

public class Filmes extends Acervo{

    ArrayList<Filmes> atores = new ArrayList<>();

    private Date dataLancamento;
    private String nomeDiretor;

    public Filmes(int id, String descricao, String autor, Date dataLancamento, String nomeDiretor) {
        super(id, descricao, autor);
        this.dataLancamento = dataLancamento;
        this.nomeDiretor = nomeDiretor;
    }

    public ArrayList<Filmes> getAtores() {
        return atores;
    }

    public void setAtores(ArrayList<Filmes> atores) {
        this.atores = atores;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
}
