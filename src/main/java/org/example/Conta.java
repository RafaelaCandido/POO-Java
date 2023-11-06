package org.example;

public class Conta {

    public String titularDaConta = "";
    public int numeroDaConta = 0;
    public String agencia = "";
    public double saldoDaConta = 20;
    public Data dataAberutaConta;

    public Conta() {

    }

    public double saca(double valorSaque) {
        if (valorSaque <= saldoDaConta) {
            saldoDaConta = saldoDaConta - valorSaque;
        } else {
            System.out.println("Você não tem saldo suficiente para esse saque!");
        }
        return saldoDaConta;
    }

    public double deposita(double valorDeposito) {
            saldoDaConta += valorDeposito;
              return saldoDaConta;
    }

    public double getRendimento(){
        return saldoDaConta * 0.1;
    }

    String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titularDaConta;
        dados += "\nNúmero: " + this.numeroDaConta;
        dados += "\nAgência: " + this.agencia;
        dados += "\nData de abertura: " + this.dataAberutaConta.toString();
        return dados;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public Data getDataAberutaConta() {
        return dataAberutaConta;
    }

    public void setDataAberutaConta(Data dataAberutaConta) {
        this.dataAberutaConta = dataAberutaConta;
    }

    private int identificador;
    private static int proximoIdentificador;

    public Conta(String titular) {
        this.titularDaConta = titular;
        this.identificador = proximoIdentificador++;
    }

    public int getIdentificador() {
        return this.identificador;
    }
}
