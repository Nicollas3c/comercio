package com.itb.inf2hm.comercio.model;

public class Produto {

		private long id;
		private String nome;
		private String codigoBarras;
		private double preco;
		
		// public  : Acesso liberado para todas as  classes
		// private : Propiedade (atributo ou método) só pode ser acesado dentro da própia classe
		
		// Métodos Setter´s e Getter´s
		
		//Set: Atribui informação
		//Get: Recupera informação
		
		public void setId(int i) {
			this.id = i;
		}
		public Long getId() {
			return id;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
		
		public String getCodigoBarras() {
			return codigoBarras;
		}
		public void setCodigoBarras(String codigoBarras) {
			this.codigoBarras = codigoBarras;
		}
		
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		
}