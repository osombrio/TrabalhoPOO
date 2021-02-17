package trabalho_1_PCII;

public class Produto 
{
	private static int contadorProdutos=0;
	private int codigoID;
	private String nome;
	private int quantidadeDisponivel;
	private float precoVenda;
	private String descricao;
	
	public Produto(String nome, int quantidadeDisponivel, float precoVenda, String descricao) {
		this.codigoID=contadorProdutos;
		contadorProdutos++;
		this.nome = nome;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.precoVenda = precoVenda;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigoID() {
		return codigoID;
	}
}
