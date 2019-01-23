/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18.uno;

import dous.Persoal;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Academica {
    private static int numReferencia;
    private String nome;
    private int nota;
    private dous.Persoal alumn;

    public Academica() {
    }

    public Academica(String nome, int nota, Persoal alumn) {
        this.nome = nome;
        this.nota = nota;
        this.alumn = alumn;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlumn() {
        return alumn;
    }

    public void setAlumn(Persoal alumn) {
        this.alumn = alumn;
    }

    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", alumn=" + alumn.toString() + '}';
    }
    
}
