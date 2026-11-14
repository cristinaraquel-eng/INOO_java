package edu.ifsp.infrasset.model;

public abstract class Projetor extends Equipamento{
        private boolean conexaoWiFi;
        private String resolucaoMaxima;

        public Projetor(String codigoPatrimonio, String descricao, double valor, int anoAquisicao){
            super(codigoPatrimonio, descricao, valor, anoAquisicao);
            this.codigoPatrimonio = codigoPatrimonio;
            this.descricao = descricao;
            this.valor = valor;
            this.anoAquisicao = anoAquisicao;

            this.resolucaoMaxima = resolucaoMaxima;
            this.conexaoWiFi = conexaoWiFi;
        }

        public boolean getconexaoWiFi(){
            return conexaoWiFi;
        }

        public String isresolucaoMaxima(){
            return resolucaoMaxima;
        }

        @Override
        public double calcularDepreciacaoAnual(){
         return getValor() * 0.20;
        }

        @Override
        public String getCategoria(){
            return "Projetor";
        }
    }
