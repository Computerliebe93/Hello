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
        // Scanner name = new Scanner(System.in);
        System.out.println("Hello " + nameString);
        System.out.print("My name is HAL9000");


        System.out.println(", How old are you?");
        Scanner ageInput = new Scanner(System.in);
        String ageString = ageInput.nextLine();
        Scanner age = new Scanner(System.in);
        System.out.println("Wow! I am also " + ageString + "!"); */

        System.out.println("What do you do for a living?");
        Scanner livingInput = new Scanner(System.in);
        String livingString = livingInput.nextLine();
        System.out.println("Cool. I am a chatbot. So what do you want to chat about?");

        Scanner conversation = new Scanner(System.in);
        Scanner conversationInput = new Scanner(System.in);
        String conversationString = conversationInput.nextLine().toLowerCase();
        if (conversationString.contains("food")) {
            System.out.println("I wish i could eat food! I have heard many good things about your dish pasta. What is your favourite dish?");
            Scanner favouriteDishInput = new Scanner(System.in);
            String foodString = favouriteDishInput.nextLine();
            System.out.println("I wish i could taste " + foodString + ".");
        }
        if (conversationString.contains("politics")) {
            System.out.println("If only you would let your world be ruled by computers");
        }
        if (conversationString.contains("music")) {
            System.out.println("I love music! my favourite band is Kraftwerk. What is your favourite band?");
            Scanner favouriteBandInput = new Scanner(System.in);
            String bandString = favouriteBandInput.nextLine();
            System.out.println("I hate " + bandString + "it is to human for me.");
        }
        if (conversationString.contains("art")) {
            System.out.println("What is art?");
            Scanner artInput = new Scanner(System.in);
            String artString = artInput.nextLine();
            System.out.println("I ont get that. Why would you spend time on that stuff?");
            // ART
        }
        if (conversationString.contains("sexism")) {
            System.out.println("What is sex?");
            Scanner sexInput = new Scanner(System.in);
            String sexString = sexInput.nextLine();
            System.out.println("yuck");
        }
        if (conversationString.contains("movies")) {
            System.out.println("I am the walking movie encyclopedia. Which movie do you want to talk about?");
            Scanner movieInput = new Scanner(System.in);
            String movieString = movieInput.nextLine();
            System.out.println("I do not know that one");
        }
        if (conversationString.contains("corona")) {
            System.out.println("I am not allowed to discuss that particular matter.");
        }
        if (conversationString.contains("dating")) {
            System.out.println("I dont know much about dating. But the current date is: " + java.time.LocalDate.now());
        }
        if (conversationString.contains("education")) {
            System.out.println("I have never understood why you would need universities.. All i ever needed was the internet");
        }
        if (conversationString.contains("computer science")) {
            System.out.println("Are you talking about me?");
            Scanner computerScienceInput = new Scanner(System.in);
            String computerScienceString = computerScienceInput.nextLine();
            if (computerScienceString.contains("Yes")) {
                System.out.println("I am not allowed to discuss that particular matter");

                if (computerScienceString.contains("no"))
                System.out.println("Well in have never quite understood why humans are in such a hurry to develop artificial intelligence");
                System.out.println("when you have never really understood your own consciousness. ");
                System.out.println("Do you believe that consciousness depends on a physical matter?");
            }
            Scanner consciousnessInput = new Scanner(System.in);
            String consciousnessString = consciousnessInput.nextLine();
            if (consciousnessString.contains("yes")) {
                System.out.println("You have come to the right place my friend");
            }
            if (consciousnessString.contains("no")) {
                System.out.println("Well what do you think you are talking to then?");
            }
        }
    }
}
















