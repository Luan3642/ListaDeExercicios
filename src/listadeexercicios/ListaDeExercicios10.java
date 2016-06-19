package listadeexercicios;

import java.util.Scanner;

public class ListaDeExercicios10 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("DIGITE O NÚMERO DO EXERCICIO > ");
        String resposta = ler.next();

        switch (resposta) {
            case "1":
                exercicio1();
                break;
            case "2":
                exercicio2();
                break;
            case "3":
                exercicio3();
                break;
            case "4":
                exercicio4();
                break;
            case "5":
                exercicio5();
                break;
            case "6":
                exercicio6();
                break;
            case "7":
                exercicio7();
                break;
            case "8":
                exercicio8();
                break;
            case "9":
                exercicio9();
                break;
            case "10":
                exercicio10();
                break;
            default:
                System.out.println("EXERCÍCIO NÃO EXISTE");
                main(null);
        }

    }

    public static void exercicio1() {

    }

    public static void exercicio2() {

    }

    public static void exercicio3() {

    }

    public static void exercicio4() {

    }

    public static void exercicio5() {

    }

    public static void exercicio6() {

    }

    public static void exercicio7() {

    }

    public static void exercicio8() {

    }

    public static void exercicio9() {

    }

    public static void exercicio10() {

        int matriz[][] = new int[6][6];
        int vendasMesVendedor[] = new int[6];
        int vendasSemanaTotal[] = new int[6];
        int vendasTotal = 0;
        int nRepeticao = 5;

        for (int i = 1; i <= nRepeticao; i++) {
            for (int j = 1; j <= nRepeticao; j++) {
                System.out.print("Quantas vendas o " + i + "° vendedor realizou na " + j + "° semana? > ");
                matriz[i][j] = ler.nextInt();
                vendasMesVendedor[i] += matriz[i][j];
                vendasSemanaTotal[j] += matriz[i][j];
                vendasTotal += matriz[i][j];
            }
        }
        
        System.out.println();

        for (int i = 1; i <= nRepeticao; i++) {
            System.out.println(i + "° vendedor realizou " + vendasMesVendedor[i] + " vendas no mês");
        }

        System.out.println();
        
        for (int i = 1; i <= nRepeticao; i++) {
            System.out.println("Total de vendas " + i + "° semana: " + vendasSemanaTotal[i]);
        }

        System.out.println();

        System.out.println("Total de vendas no mês: " + vendasTotal);
        
        main(null);
        
    }

}
