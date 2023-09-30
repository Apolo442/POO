import java.util.Date;

public class Livros extends Acervo{

    private String editora;
    private int numPaginas;
    private String idioma;
    private Date dataPublicacao;

    public Livros(int id, String descricao, String autor, String editora, int numPaginas, String idioma, Date dataPublicacao) {
        super(id, descricao, autor);
        this.editora = editora;
        this.numPaginas = numPaginas;
        this.idioma = idioma;
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
