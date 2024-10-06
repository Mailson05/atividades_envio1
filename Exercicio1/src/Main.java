import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Aluno al = new Aluno();

        System.out.println("Qual nome do aluno? ");
        al.setNome(sc2.nextLine());
        System.out.println("Nota 1 : ");
        al.setN1(sc.nextInt());
        System.out.println("Nota 2 : ");
        al.setN2(sc.nextInt());
        System.out.println("Nota 3 : ");
        al.setN3(sc.nextInt());

        System.out.println(al.media());

        al.exibir();






    }
}