package al.infnet.edu.br.rodrigomorofrancisco.model.domain;

public class Medicamento {
	private String nome;
    private String codigo;
    private double preco;
    private int estoque;

    // Constructor
    public Medicamento(String nome, String codigo, double preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Método que retorna o valor total do estoque de um medicamento
    public double calcularValorTotalEstoque() {
        return this.preco * this.estoque;
    }
    
    public void aumentarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

}
