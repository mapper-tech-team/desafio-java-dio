package Classes;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String nome;

    private String categoria;

    private String descricao;

    public abstract double calcularXp();

    public Conteudo() {
    }

    public Conteudo(String nome, String categoria, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
