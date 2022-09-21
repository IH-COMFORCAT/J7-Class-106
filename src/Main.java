import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        /*


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
        input.nextLine();



        System.out.println("Por favor, introduce la frase: ");
        String frase = input.nextLine();

        String[] words = frase.split(" ");

        System.out.println(Arrays.toString(words));

        int counter  = 0;

        for (String word : words) {
            if (word.toLowerCase().startsWith("a")
                    || word.toLowerCase().startsWith("e")
                    || word.toLowerCase().startsWith("i")
                    || word.toLowerCase().startsWith("o")
                    || word.toLowerCase().startsWith("u")
            ) counter++;
            else System.err.println("La palabra "+ word + " no empieza por vocal");
        }
        System.out.println("Total palabras que empiezan por vocal: " + counter);




        String[] words = frase.split(" ");
        int counter = 0;
        for (String word : words) {
            if (word.matches("(\\b[AaEeIiOoUu]+[\\w]*\\b)")) counter++;
            else System.err.println("Word " + word + " doesn't start with a vowel");
        }
        System.out.println("Total words starting with a vowel: " + counter);

 */

        FileWriter writer = new FileWriter("demo.txt", false);

        String name = "Jaume";
        String age = "33";

        writer.write("Hola clase \nQué tal? \n");
        writer.write("Soy vuestro profe "+ name + "\n");
        writer.write("Tengo "+ age + " años\n");

        writer.close();

        File file = new File("demo.txt");

        Scanner fileReader = new Scanner(file);

        while (fileReader.hasNextLine()) {
            String[] words = fileReader.nextLine().split(" ");
            for (String word : words) {
                System.out.println(word);
                char[] chars = word.toCharArray();
                for (char c : chars) {
                    System.out.println(c);
                }
            }
        }

        fileReader.close();

    }
}