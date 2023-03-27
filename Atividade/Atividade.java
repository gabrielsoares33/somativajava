package Atividade;

import java.util.Scanner;

    
public class Atividade {
    Scanner sc = new Scanner(System.in);
    public void Exercicio1() {
        System.out.println("Informe Qual Operação Aritmética.. (Adição = 1, Subtração = 2, multiplicação = 3, divisão = 4).");
    int Operaçao = sc.nextInt();
    System.out.println("Informe o primeiro numero.");
    double num1 = sc.nextDouble();
    System.out.println("informe o segundo numero.");
    double num2 = sc.nextDouble();
    double total;
    if (Operaçao==1) { total = num1+num2; System.out.println("resultado da soma foi"+total+"."); }
   else if (Operaçao==2) { total = num1-num2; System.out.println("o resultado da subtraçao foi "+total+".");  }
   else if (Operaçao==3) { total = num1*num2; System.out.println("o resultado da multiplicaçao foi "+total+".");}
   else if (Operaçao==4) { total = num1/num2; System.out.println("o resultado da divisão foi "+total+".");}
   else {System.out.println("Operaçao invalida");}


    }


public void Exercicio2() {
    System.out.println("informe o numero da matricula:");
    int matricula = sc.nextInt();
    double total = matricula%4;
    if (total==1) {System.out.println("O estudante esta no time chris.");}
    else if (total==2) {System.out.println("O estudante esta no time greg");}
    else if (total==3) {System.out.println("O estudante esta no time caruso");}
    else if (total==4) {System.out.println("O estudante se encontra no time jerome");}
    else {System.out.println("Matricula");}
 
 }
 
 public void Exercicio3() {
    System.out.println("informe o peso (em quilos) dos morangos adquiridos: ");
    double pesoMorangos = sc.nextDouble();
    System.out.println("informe o peso (em quilos) das maças adquiridas: ");
    double pesoMacas = sc.nextDouble();
    System.out.println("Informe o peso (em quilos) das bananas adquiridas:");
    double pesoBananas = sc.nextDouble();

    
    double precoMorangos = pesoMorangos * 3.50;
    double precoBananas = pesoBananas * 1.80;
    double precoMacas = pesoMacas * 2.30;
    double totalpreco = precoBananas + precoMacas + precoMorangos;
    double totaldepeso = pesoBananas + pesoMacas + pesoMorangos;
    double desconto;
    double precoFinal;
    if (totalpreco >= 30 && totaldepeso >= 15) {
        desconto = totalpreco / 10;
        precoFinal = totalpreco - desconto;
        System.out.println("O preso total a ser pago foi de " + precoFinal);
    }else if (totalpreco >= 30) {
        desconto = totalpreco / 10;
        precoFinal = totalpreco - desconto;
        System.out.println("o proço total a ser pago dfoi de "+ precoFinal);
    }else if (totaldepeso >= 15) {
        desconto = totalpreco / 10;
        precoFinal = totalpreco - desconto;
        System.out.println("O preço a ser pago é "+totalpreco);
    }
    else {System.out.println("o preço total a ser pago foi "+totalpreco);}
}
}

 