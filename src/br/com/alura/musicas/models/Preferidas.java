package br.com.alura.musicas.models;

//analisar as melhores
public class Preferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " SUCESSO");
        }else{
            System.out.println( audio.getTitulo() + " Boa opcao");
        }
    }
}
