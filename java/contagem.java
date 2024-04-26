import java.util.Scanner;

public class contagem {
     public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números para inserir:");
        int quantidade = scanner.nextInt();

        int contadorInteiros = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            double numero = scanner.nextDouble();
            if (numero % 1 == 0) {
                contadorInteiros++;
            }
        }

        System.out.format("Quantidade de numeros inteiros: " + contadorInteiros);
    }


    }
   

