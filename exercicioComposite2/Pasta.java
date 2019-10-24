package exerciciocomposite2;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends GerenciadorDeArquivos {
 
    List<GerenciadorDeArquivos> arquivos = new ArrayList<GerenciadorDeArquivos>();
 
    public Pasta(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    @Override
    public void dadosArquivos() {
        System.out.println(this.nomeArquivo);
        for (GerenciadorDeArquivos arquivoTmp : arquivos) {
            arquivoTmp.dadosArquivos();
        }
    }
    
    @Override
    public void add(GerenciadorDeArquivos novoArquivo) {
        this.arquivos.add(novoArquivo);
    }
 
    @Override
    public void remover(String NomeArquivo) throws Exception {
        for (GerenciadorDeArquivos arquivoTmp : arquivos) {
            System.out.println(arquivoTmp.getNomeArquivo());
            if (arquivoTmp.getNomeArquivo() == NomeArquivo) {
                this.arquivos.remove(arquivoTmp);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
 
    @Override
    public GerenciadorDeArquivos getArquivo(String NomeArquivo) throws Exception {
        for (GerenciadorDeArquivos arquivoTmp : arquivos) {
            if (arquivoTmp.getNomeArquivo() == NomeArquivo) {
                return arquivoTmp;   
            }
        }
        throw new Exception("Não existe este arquivo");
    }
    
}