package com.univesp;
import java.util.Scanner;

public class UrnaEletronica {

    private static Candidato[] candidato;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******** URNA ********");
        System.out.println("(12) Marta (Pl)");
        System.out.println("(16) José (PMDB");
        System.out.println("(18) Roberto (PT)");
        System.out.println("(20) Maria Silva (PHR)");
        System.out.println("(0) Branco");
        System.out.println("(1) Nulo");

        System.out.println("******** URNA ********");
        int voto = sc.nextInt();
        int votosMarta = 0;
        int votosJosé = 0;
        int votosRoberto = 0;
        int votosMariaSilva = 0;
        int votosEmBranco = 0;
        int votosNulo = 0;
        int votoTotal = 0;
        int maior = 0;
        int maiorVotos = 0;
        String partido = "";
        String vencedor = "";

        Candidato maiorCandidato = null;
        for (Candidato e : candidato) {
            if (e.votos > maiorVotos) {
                maiorVotos = e.votos;
                maiorCandidato = e;
            }
        }
        if (maiorCandidato != null) {
            System.out.println("O primeiro candidato eleito Presidente do partido é: " + maiorCandidato.nome);
        }

        while (voto >= 0) {
            if (voto == 12) {
                votosMarta = votosMarta + 1;
                System.out.println("O seu voto foi computado para a candidata Marta ");
            } else if (voto == 16) {
                votosJosé++;
                System.out.println("O seu voto foi computado para o candidato José");
            } else if (voto == 18) {
                votosRoberto++;
                System.out.println("O seu voto foi computado para o candidato Roberto");
            } else if (voto == 20) {
                votosMariaSilva++;
                System.out.println("O seu voto foi computado para a candidata Maria Silva ");
            }
            if (voto == 0) {
                votosEmBranco++;
                System.out.println("Você votou Branco");
            }
            if (voto == 1) {
                votosNulo++;
                System.out.println("Você votou Nulo");
            } else if(voto < 0) {
                System.out.println("Candidato não existe, vote novamente");
            }
            if (voto == 12 || voto == 16 || voto == 18 || voto == 20 || voto == 0 || voto == 1) {
                votoTotal++;
            }

            if(votosMarta > maior) {
                maior = votosMarta;
                vencedor = "Marta";
                partido = "PL";

            } if(votosJosé > maior) {
                maior = votosJosé;
                vencedor = "José";
                partido = "PMDB";

            } if(votosRoberto > maior) {
                maior = votosRoberto;
                vencedor = "Roberto";
                partido = "PT";

            } if(votosMariaSilva > maior) {
                maior = votosMariaSilva;
                vencedor = "Maria Silva";
                partido = "PR";
            }

            System.out.println("Vote novamente: ");
            System.out.println("(-1) para Sair");
            voto = sc.nextInt();
        }

        System.out.println("******** Resultado ********");
        System.out.println("Total = " + votoTotal + " = 100%");
        double porcMarta = (100 * votosMarta) / votoTotal;
        System.out.println("Marta = " + porcMarta + "%");

        System.out.println("Total = " + votoTotal + " = 100%");
        double porcJosé = (100 * votosJosé) / votoTotal;
        System.out.println("José = " + porcJosé + "%");

        System.out.println("Total = " + votoTotal + " = 100%");
        double porcRoberto = (100 * votosRoberto) / votoTotal;
        System.out.println("Roberto = " + porcRoberto + "%");

        System.out.println("Total = " + votoTotal + " = 100%");
        double porcMariaSilva = (100 * votosMariaSilva) / votoTotal;
        System.out.println("MariaSilva = " + String.format("%.2f", porcMariaSilva) + "%");

        double porcBranco = (100 * votosEmBranco) / votoTotal;
        System.out.println("Votos em branco: " + porcBranco + "%");

        double porcNulo = (100 * votosNulo) / votoTotal;
        System.out.println("Votos nulo: " + porcNulo + "%");
        System.out.println("Vencedor: " + vencedor);
        System.out.println("Partido: " + partido);
        sc.close();
    }

}
