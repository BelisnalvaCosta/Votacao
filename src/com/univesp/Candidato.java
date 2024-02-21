package com.univesp;
import javax.swing.JOptionPane;

public class Candidato<nome_candidato> {
    public int votos;
    public String nome;
    private int codigo_votacao;
    private String nome_candidato;
    private String partido;
    private int votoTotal;

    public int getVotos() {
        return votos;
    }

    public Candidato(int votos, int codigo_votacao, String nome, String nome_candidato, String partido, int votoTotal) {
        this.votos = votos;
        this.nome = nome;
        this.codigo_votacao = codigo_votacao;
        this.nome_candidato = nome_candidato;
        this.partido = partido;
        this.votoTotal = votoTotal;
    }
    public int votos() {
        return votos;
    }

    public void setvotos(int votos) {
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo_votacao() {
        return codigo_votacao;
    }

    public void setCodigo_votacao(int codigo_votacao) {
        this.codigo_votacao = codigo_votacao;
    }

    public String getNome_candidato() {
        return nome_candidato;
    }

    public void setNome_candidato(String nome_candidato) {
        this.nome_candidato = nome_candidato;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotoTotal() {
        return votoTotal;
    }

    public void setVotoTotal(int votoTotal) {
        this.votoTotal = votoTotal;
    }
}
