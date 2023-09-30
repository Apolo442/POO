public class Acervo {

    private int id;
    private String descricao;
    private String autor;

    public Acervo(int id, String descricao, String autor) {
        this.id = id;
        this.descricao = descricao;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
