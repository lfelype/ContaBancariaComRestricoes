package Aplicacao;

import Modelos.ContaBancaria;
import Modelos.Excecoes;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

            System.out.println("DADOS DA CONTA");
            System.out.println("Entre com o numero da conta: ");
            Integer numeroConta = sc.nextInt();
            System.out.println("Entre com o proprietario da conta: ");
            sc.nextLine();
            String proprietario = sc.nextLine();
            System.out.println("Balanco inicial da conta: ");
            Double balancoInicial = sc.nextDouble();
            System.out.println("Limite de saque: ");
            Double limiteSaque = sc.nextDouble();

            ContaBancaria cb = new ContaBancaria(numeroConta, proprietario, balancoInicial, limiteSaque);

            System.out.println("Digite um valor para sacar, atenção para seu limite de saque!");
            Double saque = sc.nextDouble();

            try {
                cb.saque(saque);
                System.out.println("Novo saldo: " + cb.getBalanco());
            }
            catch (Excecoes e) {
                System.out.println(e.getMessage());
            }
            sc.close();
        }

}
