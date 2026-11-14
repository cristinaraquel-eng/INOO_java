package edu.ifsp.infrasset.model;

 public abstract class Computador extends Equipamento{
    private int capacidadeMemoria;
    private String processador;

    public Computador(String codigoPatrimonio, String descricao, double valor, int anoAquisicao){
      super(codigoPatrimonio, descricao, valor, anoAquisicao);
      this.codigoPatrimonio = codigoPatrimonio;
      this.descricao = descricao;
      this.valor = valor;
      this.anoAquisicao = anoAquisicao;

      this.capacidadeMemoria = capacidadeMemoria;
      this.processador = processador;
}

    public int getcapacidadeMemoria(){
        return capacidadeMemoria;
    }

     public String isprocessador(){
         return processador;
    }

    @Override
    public double calcularDepreciacaoAnual() {
        return getValor() * 0.20;
    }

     @Override
     public String getCategoria() {
         return "Computador";
     }

}
