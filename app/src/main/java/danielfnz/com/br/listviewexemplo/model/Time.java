package danielfnz.com.br.listviewexemplo.model;

/**
 * Created by Alunoinf_2 on 02/02/2019.
 */

public class Time {

    private String nome;
    private int imagem;

    public Time(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

