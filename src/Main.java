import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, introduce tu nombre:");
        String name = input.nextLine();

        System.out.println(name);

        System.out.print("Por favor, introduce tu edad:");
        int age = input.nextInt();

        while (age < 0) {
            System.err.println("Tu edad no puede ser negativa");
            age = input.nextInt();
        }

        if (age >= 18) System.out.println("Eres mayor de edad");
        if (age < 18) System.out.println("Eres un yogurin");


        System.out.print("Tienes " + age + " años");


        String frase = input.nextLine();
        //El perro de San Roque no tiene rabo o quizas si
        //perro no empieza por vocal
        //de no empieza por vocal
        //San no empieza por vocal
        //..
        //Total palabras palabras que empiezan por vocal: 2



    }
}