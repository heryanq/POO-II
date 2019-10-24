package exerciciocomposite2;

import exerciciocomposite2.tiposArquivos.*;

public class Computador {

    public static void main(String[] args) {
        
        GerenciadorDeArquivos pasta1 = new Pasta("Downloads/");
        GerenciadorDeArquivos pasta2 = new Pasta("Playlist/");
        GerenciadorDeArquivos video1 = new ArquivoVideo("NarutoShippudenS08E01.mkv", "1.1GBs");
        GerenciadorDeArquivos imagem1 = new ArquivoVideo("fotoDoHeryanDeBiquine.png", "980KBs");
        GerenciadorDeArquivos musica1 = new ArquivoVideo("Luan Santana - A Louca.mp3", "5MBs");

        try {
            video1.add(imagem1);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

        try {
            pasta1.add(video1);
            pasta1.add(imagem1);
            pasta1.add(pasta2);
            pasta2.add(musica1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nPesquisando arquivos:");
            pasta1.dadosArquivos();
            System.out.println("\nRemover arquivos:");
            pasta1.remover(video1.getNomeArquivo());
            pasta2.remover(musica1.getNomeArquivo());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("\nPesquisando arquivos:");
        pasta1.dadosArquivos();
        
    }
    
}
