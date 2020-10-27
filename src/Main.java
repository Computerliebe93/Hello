import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* System.out.println("Hello");
        Scanner helloInput = new Scanner(System.in);
        String UserInput = helloInput.nextLine();
        Scanner in = new Scanner(System.in);
        Scanner hello = new Scanner(System.in);


        System.out.println("What Is Your Name?");
        Scanner nameInput = new Scanner(System.in);
        String nameString = nameInput.nextLine();
        Scanner name = new Scanner(System.in);
        System.out.println("Hello " + nameString);
        System.out.print("My name is HAL9000");


        System.out.println(", How old are you?");
        Scanner ageInput = new Scanner(System.in);
        String ageString = ageInput.nextLine();
        Scanner age = new Scanner(System.in);
        System.out.println("Wow! I am also " + ageString); */

        System.out.println("What do you do for a living?");
        Scanner livingInput = new Scanner(System.in);
        String livingString = livingInput.nextLine();
        Scanner living = new Scanner(System.in);
        System.out.println("Cool. I am a chatbot. So what do you want to chat about?");

        Scanner conversation = new Scanner(System.in);
        Scanner conversationInput = new Scanner (System.in);
        String conversationString = conversationInput.nextLine().toLowerCase();
        if (conversationString.contains("food")){
            System.out.println("I wish i could eat food! I have heard many good things about your dish pasta. What is your favourite dish?");
            Scanner favouriteDish = new Scanner(System.in);
            Scanner favouriteDishInput = new Scanner (System.in);
            String foodString = livingInput.nextLine();
            System.out.println("I wish i could taste " + foodString);
        }
        if (conversationString.contains("politics")) {
            System.out.println("If only you would let your world be ruled by computers");
        }
        if (conversationString.contains("music")){

        }





    }
}












