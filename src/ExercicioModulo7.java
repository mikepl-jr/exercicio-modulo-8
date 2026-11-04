import java.util.Scanner;

public class ExercicioModulo7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro!");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero inteiro!");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("O numero maior é " + n1);
        } else if (n2 >n1) {
            System.out.println("O numero maior é " + n2);
        }else{
            System.out.println("Os numeros são iguais");
        }


        scanner.close();
    }
}
