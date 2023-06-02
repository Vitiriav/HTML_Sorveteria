package sorveteria;
public class produto {

		private static String nome;
	    private double preco;
	    private int quantidade;
		public static String getNome() {
			return nome;
		}
		public static void setNome(String nome) {
			produto.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
	    
	    
}