import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

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




        File oscars = new File("oscar_age.csv");
        Scanner reader = new Scanner(oscars);
        FileWriter writer = new FileWriter("result.txt", false);


        reader.nextLine();


        while (reader.hasNextLine()) {
            String[] words = reader.nextLine().split(", ");
            String name = words[3];
            String year = words[1];
            String age = words[2];
            String movie = words[4];
            String separator = "==========";
            writer.write("Name: " + name + "\n");
            writer.write("Year: " + year + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Movie: " + movie + "\n");
            writer.write(separator + "\n");
        }

        reader.close();
        writer.close();

 */
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle(2010, 2000, "Audi", "A4");
        vehicle1.setBrand("Ford");
        vehicle1.setModel("Fiesta");

        Vehicle vehicle3 = Vehicle.cloneVehiculo(vehicle1);
        System.out.println(vehicle1.getId());
        System.out.println(vehicle2.getId());
        System.out.println(vehicle3.getId());


        System.out.println(vehicle1.getBrand());
        System.out.println(vehicle1.getYear());

        Course course = new Course(1, 30, 30, "Backend Java");

        System.out.println(course.getTitle());

        Car car = new Car(2015,
                1000,
                "Mercedes",
                "C200",
                5,
                true,
                true);

        System.out.println(car.getBrand());

        car.addNewTrip();
        car.addNewTrip(500);
        System.out.println(car.getKilometers());

    }
}