package com.univesp;

import javax.swing.JOptionPane;

public class VOID {
    private static Object StringIndexOutOfBoundsException;
    private static Object nome_candidatos;

    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao simulador!" +
                "\n" + "Precione 'OK' para registrar os valores.");
/*        int x, a, b, resultado;
        a=0;
        b=0;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog("Inserir número:"));
        } catch (NumberFormatException e) {
            System.out.println("Você deveria inserir um número 1");
            x = 0;
        }
        try {
            resultado = divisao(20, x);
            System.out.println("resultado: " + resultado);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
    }

 */
/*
    public static int divisao (int codigo, nome, partido) throws ArithmeticException {
        return codigo || nome || partido;
    }

    int codigo, nome, partido, resultado;
    codigo = 0;
    String nome = nome;
    String partido = partido;
        try {
        int = Integer.parseInt(JOptionPane.showInputDialog("Inserir código:"));
    } catch (NumberFormatException e) {
        System.out.println("Você deveria inserir um codigo" + codigo !=);
        String = nome_candidatos;
    }
        try {
        resultado = String (codigo, nome);
        System.out.println("resultado: " + resultado);
    } catch (ArithmeticException arithmeticException) {
        System.out.println(arithmeticException);
    }
}
    public static int divisao (int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }


*/
/**
*
*/
    class VOID {
        public static void main(String args[]) {
            JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao simulador!" +
                    "\n" + "Precione 'OK' para registrar os candidatos.");
            int i;
            String s;
            try {
                i = Integer.valueOf(JOptionPane.showInputDialog("Inserir número: "));
                i = Integer.valueOf(JOptionPane.showInputDialog("Inserir número e nome: "));
                String quantCandidatos = JOptionPane.showInputDialog("Qual o número de candidatos?: ");
                int i1 = Integer.valueOf(quantCandidatos);

            } catch (NumberFormatException e) {

                System.out.println("Você deveria inserir um número, 0");
                System.out.println("OK, agora você deve inserir número e nome ");

            } finally {
                for (int q = 0; q < 0; q++) { //quantCandidatos + Candidato;
                    return;
                    }
                }
            }

        }
    }
}
/* Este abaixo deu mais ou menos certo!!!
        } finally {
            for (int q = 0; q < 0; q++) { //quantCandidatos + Candidatos;
                return;
            }
        */
 /*
        public class VOID {
            public static void main(String args[]) {
                JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao simulador!" +
                        "\n" + "Precione 'OK' para registrar os candidatos.");
                int i;
                String s;
                try {
                    i = Integer.valueOf(JOptionPane.showInputDialog("Inserir número: "));
                    i = Integer.valueOf(JOptionPane.showInputDialog("Inserir número e nome: "));
                    String quantCandidatos = JOptionPane.showInputDialog("Qual o número de candidatos?: ");
                    int i1 = Integer.valueOf(quantCandidatos);

                } catch (NumberFormatException e) {
                    System.out.println("Você deveria inserir um número, 0");
                    System.out.println("OK, agora você deve inserir número e nome ");
                } finally {
                    for (int q = 0; q < 0; q++) { //quantCandidatos + Candidato;
                        return;
                    }
                }
            }
        }
*/



/*
public static void main (String args[]){
JOptionPane.showMessageDialog(null,"Olá, seja bem vindo ao simulador!"+
        "\n"+ "Precione 'OK' para registrar os candidatos.");

String Candidato = JOptionPane.showInputDialog("Qual o número de candidatos?");
int x = Integer.parseInt(codigo_votacao);
String s = Integer.parseInt(nome_candidato, partido);



codigo_votação[] i = new codigo_votação[x];
nome_candidato[] s = new nome_candidato[x];

for (int q = 0; i < x; q++){
    a[q] = new codigo_candidato();
    a[q] = new nome_candidato();
    a[q] = new partido();
    a[q].getCodigo_Candidato();
    a[q].getPartido();
    a[q].getNumeroDoCandidato();
 }
 }
 }
*/
