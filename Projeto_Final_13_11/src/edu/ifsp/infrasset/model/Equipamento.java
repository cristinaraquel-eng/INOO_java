package edu.ifsp.infrasset.model;

public abstract class Equipamento {
    private String codigoPatrimonio;
    private String descricao;
    private double valor;
    private int anoAquisicao;
    private StatusManutencao statusManutencao = StatusManutencao.OPERACIONAL; 

    // Construtor
    public Equipamento(String codigoPatrimonio, String descricao, double valor, int anoAquisicao) {
        this.codigoPatrimonio = codigoPatrimonio;
        this.descricao = descricao;
        this.valor = valor;
        this.anoAquisicao = anoAquisicao;
    }

    // Método para atualizar o status recebendo o enum (sem retorno por isso void)
    public void atualizarStatus(StatusManutencao novoStatus) {
        this.statusManutencao = novoStatus;
    }

    // Métodos abstratos(ou seja sem parametros apenas nomeados na classe)
    public abstract double calcularDepreciacaoAnual();    
    public abstract String getCategoria();

    // Método concreto para calcular o valor atual
    public double valorAtual(int anoReferencia) {
        int anos = Math.max(0, anoReferencia - this.anoAquisicao);
        double valorAtual = this.valor - (this.calcularDepreciacaoAnual() * anos);
        return Math.max(0, valorAtual);
    }

    // Getters (usando para retornar os valores)
    public String getCodigoPatrimonio() {
        return codigoPatrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getAnoAquisicao() {
        return anoAquisicao;
    }

    public StatusManutencao getStatusManutencao() {
        return statusManutencao;
    }
}
