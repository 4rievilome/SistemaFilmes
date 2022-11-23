import java.util.ArrayList;
import java.util.List;

public class Filme {
	private String codigo;
	private String nome;
	private int anoLancamento;
	private int duracaoEmMinutos;
	private int duracao;
	private List<CategoriaFilme> categorias;
	
	public Filme(String codigo) {
		this(codigo,"", 0, 0, 0, new ArrayList<>());
	}
	
	public Filme(String codigo,String nome, int anoLancamento, int duracaoEmMinutos, int duracao, List<CategoriaFilme> categorias) {
		this.codigo = codigo;
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.duracao = duracao;
		this.categorias = categorias;
	}
	
	public boolean ehDaCategoria(CategoriaFilme categoria) {
		for (CategoriaFilme cat: this.categorias) {
			if (cat ==categoria) {
				return true;
			}
		}
		return false;
    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	
}