package exerciciocomposite2;

public abstract class GerenciadorDeArquivos {
 
    public String nomeArquivo;
    public String tamanhoArquivo;
 
    public void dadosArquivos() {
        System.out.println(this.nomeArquivo);
        System.out.println(this.tamanhoArquivo);
    }
 
    public String getNomeArquivo() {
        return this.nomeArquivo;
    }

    public void add(GerenciadorDeArquivos novoArquivo) throws Exception {
        throw new Exception("Não pode inserir arquivos em: " + this.nomeArquivo + " - Não é uma pasta\n");
    }
 
    public void remover(String nomeArquivo) throws Exception {
        throw new Exception("Não pode remover arquivos em: " + this.nomeArquivo + " -Não é uma pasta\n");
    }
 
    public GerenciadorDeArquivos getArquivo(String nomeArquivo) throws Exception {
        throw new Exception("Não pode pesquisar arquivos em: " + this.nomeArquivo + " - Não é uma pasta\n");
    }
}
