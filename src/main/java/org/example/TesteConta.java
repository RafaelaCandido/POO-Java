package org.example;

public class TesteConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.titularDaConta = "Rafaela";
        conta1.agencia = "1234";
        conta1.numeroDaConta = 142536;
        conta1.saldoDaConta = 70000;

        conta1.dataAberutaConta = new Data();
        conta1.dataAberutaConta.preencheData(1, 7, 2009);
        System.out.println(conta1.recuperaDadosParaImpressao());

        Conta conta2 = new Conta();
        conta2.titularDaConta = "Rafaela";
        conta2.agencia = "1234";
        conta2.numeroDaConta = 142536;
        conta2.saldoDaConta = 70000;

        conta2 = conta1;

        conta1.saca(500);
        conta1.deposita(1000);
        conta1.getRendimento();
        System.out.println(conta1.saldoDaConta);
        System.out.println(conta1.getRendimento());

        if (conta1 == conta2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}