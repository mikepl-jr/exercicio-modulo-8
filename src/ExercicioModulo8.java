import java.util.Scanner;

public class ExercicioModulo8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        String usuario = sc.nextLine();
        System.out.println("Digite um numero positivo: ");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("Você digitou um numero negativo. Digite um numero positivo");
            n = sc.nextInt();
        }
        forCrescenteDecrescente(n);// passei n como parámetro(Já tinha esse conhecimento de outros cursos e da faculdade)
        nomeUsuario(usuario,n);
    }

    public static void nomeUsuario(String usuario, int n){//usei usuario e n como parámetros
        System.out.println("\n");
        if (usuario.length() > 6){
            for (int i = 1; i <= n; i++){
                System.out.println("Nome " + i + "ºvez: " + usuario);
            }
        }else {
            System.out.println("Nome: "+ usuario);
        }
    }
    public static void forCrescenteDecrescente(int n){
        System.out.println("For crescente:");//for crescente
        for (int i = 0; i <= n; i++){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n");
        System.out.println("For decrescente:");//for decrescente
        for (int i = n; i >= 0; i--){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
