package br.com.alura.musicas.models;

public class Audio {
    private String Titulo;
    private int totalReproducoes;
    private int classificacao;
    private int totalCurtidas;

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }


    public String getTitulo() {
        return Titulo;
    }


    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    //metodos
    public void curtir(){
        this.totalCurtidas++;
    }
    public void reproducao(){
        this.totalReproducoes++;
    }
}
