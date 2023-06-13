package com.itb.inf2fm.comercio;

public class Produto {

	
        private Long id;
        private String nome;
        private String descricao; 
        private String codigobarras;
        private double preco;
        
        //public: Acesso liberado para todas as classes.
        
        //private : Acesso permitido apenas para os membros
        //          da propria classe.
        //          Entende-se por membros(Atributos e ou métodos)

        // Métodos Setter´s Getter's: atribuir e recuperar dados do atributo "RESPECTIVAMENTE"
        
        public void setId(Long id) {
        	this.id = id;
        }
        public Long getId() {
        	return id;
        }
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getCodigobarras() {
			return codigobarras;
		}
		public void setCodigobarras(String codigobarras) {
			this.codigobarras = codigobarras;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
       
        
        
}
