package edu.ifsp.infrasset.model;

public class Computador extends Equipamento{
private int capacidadeMemoria;
private String processador;

public Computador(String codigoPatrimonio, String descricao, double valor, int anoAquisicao){
  super(codigoPatrimonio, descricao, valor, anoAquisicao);
  this.codigoPatrimonio = codigoPatrimonio;
  this.descricao = descricao;
  this.valor = valor; 
  this.anoAquisicao = anoAquisicao;  
}
  @Override
  calcularDepreciacaoAnual()

}
