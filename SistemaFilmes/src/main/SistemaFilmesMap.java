import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SistemaFilmesMap {

    private Map<String,Filme> filmes;
    
    public SistemaFilmesMap() {

    }

    @Override
    public void cadastraFilme(Filme f) throws FilmeJaExisteException {
        if (filmes.containskey(f.getNome())) {
            throw new FilmeJaExisteException("Esse filme já existe.");
        }
            filmes.put(f.getNome(), f);
    }

    @Override
    public void pesquisaFilme(String codigo) throws FilmeNaoExisteException {
        if (!filmes.containskey(codigo)) {
            throw new FilmeNaoExisteException("O filme com o código" +codigo+ "não existe.");
        }
        return filmes.get(codigo);
    }

    @Override
    public List<Filme> obterFilmesLancadosEm(int ano) {
        List<Filme> filmesLancados = new ArrayList<>();
        for (Filme f : this.filmes.values()) {
            if (f.getAnoLancamento() == ano) {
                filmesLancados.put(f);
            }
        }
        return filmesLancados;
    }

    @Override
    public List<Filme> obterFilmesComNome(String nome) {
        List<Filme> filmesComNome = new ArrayList<>();
        for (Filme f : this.filmes.values()) {
            if (f.getNome().containskey(nome)) {
                filmesComNome.put(nome);
            }
        }
        return filmesComNome;
    }

    @Override
    public boolean existemFilmesDaCategoria(CategoriaFilme categoria) {
        for (Filme f : this.filmes.values()) {
            if (f.getCategoria() == categoria) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int contaFilmesDaCategoria(CategoriaFilme categoria) {
        int cont = 0;
        for (Filme f : this.filmes.values()) {
            if (f.getCategoria() == categoria) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public List<Filme> obterFilmesDaCategoria(CategoriaFilme categoria) {
        List<Filme> filmesDaCategoria = new ArrayList<>();
        for (Filme f : this.filmes.values()) {
            if (f.getCategoria() == categoria) {
                filmesDaCategoria.put(f);
            }
        }
        return filmesDaCategoria;
    }

    @Override
    public List<Filme> obterFilmesComDuracaoMaiorQue(int duracao) {
        List<Filme> filmesComDuracaoMaiorQue = new ArrayList<>();
        for (Filme f : this.filmes.values()) {
            if (f.getDuracaoEmMinutos() >= duracao) {
                filmesComDuracaoMaior.put(f);
            }
        }
        return filmesComDuracaoMaior;
    }

    @Override
    public List<Filme> obterFilmesComDuracaoMenorQue(int duracao) {
        List<Filme> filmesComDuracaoMenorQue = new ArrayList<>();
        for (Filme f : this.filmes.values()) {
            if (f.getDuracaoEmMinutos() <= duracao) {
                filmesComDuracaoMenorQue.put(f);
            }
        }
        return filmesComDuracaoMenorQue;
    }

}
