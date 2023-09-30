import java.util.Date;

public class Empréstimo {

    private Acervo acervoEmprestimo;
    private String cpf;
    private String nome;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Empréstimo(Acervo acervoEmprestimo, String cpf, String nome, Date dataEmprestimo, Date dataDevolucao) {
        this.acervoEmprestimo = acervoEmprestimo;
        this.cpf = cpf;
        this.nome = nome;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Acervo getAcervoEmprestimo() {
        return acervoEmprestimo;
    }

    public void setAcervoEmprestimo(Acervo acervoEmprestimo) {
        this.acervoEmprestimo = acervoEmprestimo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
