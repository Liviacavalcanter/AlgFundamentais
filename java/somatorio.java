import java.util.Scanner;

public class somatorio {
    public static void main(String[] args) {
        System.out.println("Quantidade de números:");
        Scanner prompt = new Scanner(System.in);
        int n = prompt.nextInt();
        int numero;
        int soma = 0;
        int i = 0;
        while(i < n){
            i = i + 1;
            System.out.println("Numero:");
            numero = prompt.nextInt();
            soma = soma + numero;
        }
        System.out.println("Soma = " +soma);
        
    }

   
}


    
    

