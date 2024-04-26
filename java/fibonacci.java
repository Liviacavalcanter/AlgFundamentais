import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int quantidade = scanner.nextInt();
        int a = 1;
        int b = 0;
        int aux;

        for (int i = 0; i < quantidade; i++){
            aux = a;
            a = a + b;
            b = aux;
            System.out.println(a);
        }
    }
    
}
