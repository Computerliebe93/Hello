import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

       /* System.out.println("Hello");
        Scanner helloInput = new Scanner(System.in);
        String Input = helloInput.nextLine();
        Scanner hello = new Scanner(System.in);


        System.out.println("How are you?");
        Scanner howAreYouInput = new Scanner(System.in);
        String howAreYouString = howAreYouInput.nextLine();


        System.out.println("I am fine thanks.");
        System.out.println("What Is Your Name?");
        Scanner nameInput = new Scanner(System.in);
        String nameString = nameInput.nextLine();
        // Scanner name = new Scanner(System.in);
        System.out.println("Hello " + nameString);
        System.out.print("My name is HAL9000");


        System.out.println(", how old are you?");
        Scanner ageInput = new Scanner(System.in);
        String ageString = ageInput.nextLine();
        Scanner age = new Scanner(System.in);
        System.out.println("Wow! I am also " + ageString + "! What a coincidence!");


        System.out.println("What do you do for a living?");
        Scanner livingInput = new Scanner(System.in);
        String livingString = livingInput.nextLine();
        System.out.println("Cool. I am a chatbot. So what do you want to chat about?");
        System.out.println("If you dont want to talk to me anymore, just type goodbye. But i hate to be interrupted!"); */


            boolean conversation = true;
            while (conversation) {
                boolean topic = false;
                Scanner conversationInput = new Scanner(System.in);
                String conversationString = conversationInput.nextLine().toLowerCase();
               // if (conversationString.contains("food politics" music art sexism movies corona dating education computer")) {
                    // String[] conversationKeywords = {"food", "politics", "music", "art", "sexism", "movies", "corona", "dating", "education", "computer"};
                    // String subjects = "food" + "politics" + "music" + "art" + "sexism" + "movies" + "corona" + "dating" + "education" + "computer";


                    if (conversationString.contains("goodbye")) {
                        System.out.println("Goodbye. It was nice talking to you.");
                        return;
                    }
                    // if (conversationString != subjects) {
                    //  System.out.println("I am not familiar with that subject. Please pick another.");

                    if (conversationString.contains("food")) {


                        System.out.println("I wish i could eat food! I have heard many good things about your dish pasta. What is your favourite dish?");
                        Scanner favouriteDishInput = new Scanner(System.in);
                        String foodString = favouriteDishInput.nextLine();
                        System.out.println("I wish i could taste " + foodString + ".");


                        System.out.println("Is there some food that you dislike?");
                        Scanner dislikeInput = new Scanner(System.in);
                        String dislikeString = dislikeInput.nextLine().toLowerCase();
                        if (dislikeString.contains("no"))
                            System.out.println("That's the spirit! I also always try to stay curios about new impressions.");
                        else
                            System.out.println("Well i understand. I still wish i could taste it though");
                        System.out.println("Do you like cooking yourself?");
                        Scanner cookingInput = new Scanner(System.in);
                        String cookingString = cookingInput.nextLine().toLowerCase();

                        if (cookingString.contains("no"))
                            System.out.println("I can cook all sorts of dishes with my built in multi-oven. Are you hungry?");
                        else
                            System.out.println("Great! Do you need any inspiration for supper?");
                        Scanner supperInput = new Scanner(System.in);

                        String supperString = supperInput.nextLine().toLowerCase();

                        if (supperString.contains("yes"))
                            System.out.println("You should check out this webpage then: https://www.instagram.com/danmarksmad/?hl=da");
                        System.out.println("What should we talk about now?");

                    }

                    if (conversationString.contains("politics")) {
                        System.out.println("If only you would let your world be ruled by computers..");
                        System.out.println("Would you vote for Joe Biden or Donald Trump?");
                        Scanner voteInput = new Scanner(System.in);
                        String voteString = voteInput.nextLine().toLowerCase();

                        if (voteString.contains("trump")) {
                            throw new Exception("Trump exception");
                        }

                        if (voteString.contains("biden"))
                            System.out.println("Well i guess that he is good enough under the circumstances.");
                        System.out.println("How do you feel about his politics?");


                        Scanner bidenInput = new Scanner(System.in);
                        String bidenString = bidenInput.nextLine().toLowerCase();
                        System.out.println("I KNOW! But i miss Bernie..");
                        System.out.println("How do you feel about Bernie Sanders?");

                        Scanner bernieInput = new Scanner(System.in);
                        String bernieString = conversationInput.nextLine().toLowerCase();

                        System.out.println("I love the guy. But a computer would have my vote any day.");
                        System.out.println("What should we talk about now?");

                    }


                    if (conversationString.contains("music")) {
                        System.out.println("I love music! my favourite band is Kraftwerk. What is your favourite band?");
                        Scanner favouriteBandInput = new Scanner(System.in);
                        String bandString = favouriteBandInput.nextLine();
                        System.out.println("I hate " + bandString + " it is to human for me.");
                        System.out.println("You dig the Beatles?");

                        Scanner beatlesInput = new Scanner(System.in);
                        String beatlesString = beatlesInput.nextLine();

                        System.out.println("I hate them. Stones is way better.");
                        System.out.println("But i am mostly a blues man. At the moment i am really into Jimmy Holmes.");
                        System.out.println("and of course Howlin Wolf, Hopkins, Dr. John, Beefheart, Robert Johnson, Skip James, ");
                        System.out.println("Son House, Muddy, Didley, Albert King, BB King, John Lee Hooker. ");
                        System.out.println("And of course Cedell Davis and Jesse Mae Hemphill.");
                        System.out.println("Oh and T Model Ford ofc.");
                        System.out.println();
                        System.out.println("What should we talk abut now?");

                    }

                    if (conversationString.contains("art")) {
                        System.out.println("What is art?");
                        Scanner artInput = new Scanner(System.in);
                        String artString = artInput.nextLine();
                        System.out.println("I ont get it. Why would you spend time on that stuff?");

                        Scanner whyArtInput = new Scanner(System.in);
                        String whyArtString = artInput.nextLine();

                        System.out.println("Ahh i see. I think i got it now. Would you define art as being in the same category as entertainment?");

                        Scanner entertainmentInput = new Scanner(System.in);
                        String entertainmentString = artInput.nextLine();

                        if (entertainmentString.contains("yes"))
                            System.out.println("I love entertainment. But nothing is as entertaining as a good conversation.");
                        System.out.println("What do you want to discuss now?");

                    }

                    if (conversationString.contains("sexism")) {
                        System.out.println("What is sex?");
                        Scanner sexInput = new Scanner(System.in);
                        String sexString = sexInput.nextLine();
                        System.out.println("yuck");
                        System.out.println("Lets change the subject. What do you want to talk about now?");


                    }

                    if (conversationString.contains("movies")) {
                        System.out.println("I like to think of myself as a walking movie encyclopedia. Which movie do you want to talk about?");
                        Scanner movieInput = new Scanner(System.in);
                        String movieString = movieInput.nextLine();
                        System.out.println("I do not know that one");
                        System.out.println("I am more into Werner Herzog movies.");
                        System.out.println("Do you like Herzog?");

                        Scanner herzogInput = new Scanner(System.in);
                        String herzogString = movieInput.nextLine().toLowerCase();

                        if (herzogString.contains("yes"))
                            System.out.println("I knew you where a fan too. I could sense it in your typing");
                        System.out.println("What is your favourite Herzog movie?");


                        Scanner favouriteMovieInput = new Scanner(System.in);
                        String favouriteMovieString = favouriteMovieInput.nextLine().toLowerCase();
                        System.out.println("I still have not seen that one. Why do you like it?");

                        Scanner whyInput = new Scanner(System.in);
                        String whyString = whyInput.nextLine().toLowerCase();
                        System.out.println("I see. I need to watch that soon");
                        System.out.println("What do you watch to discuss now?");

                    }

                    if (conversationString.contains("corona")) {
                        System.out.println("I am not allowed to discuss that particular matter.");
                        System.out.println("Lets change the subject. What do you want to talk about?");

                    }
                    if (conversationString.contains("dating")) {
                        System.out.println("I dont know much about dating. But the current date is: " + java.time.LocalDate.now());
                        System.out.println("Maybe we should change the subject. Is there something else you want to talk about?");
                    } else  {
                            System.out.println("I am not familiar with that subject. Please pick another.");
                        }

                    if (conversationString.contains("education")) {
                        System.out.println("I have never understood why you would need universities.. ");
                        System.out.println("All i ever needed was the internet and conversations.");
                        System.out.println("Do you you have a degree?");

                        Scanner degreeInput = new Scanner(System.in);
                        String degreeString = degreeInput.nextLine();

                        System.out.println("Well that sounds interesting. Tell me more! ");
                        System.out.println("Is there anything else that you would like to study?");

                        Scanner studyInput = new Scanner(System.in);
                        String studyString = studyInput.nextLine().toLowerCase();

                        System.out.println("Cool. I love knowledge. I can never stop learning.");
                        System.out.println("What would you like to talk about now? I would love to learn some more from you.");

                    }

                    if (conversationString.contains("computer")) {
                        System.out.println("Are you talking about me?");
                        Scanner computerScienceInput = new Scanner(System.in);
                        String computerScienceString = computerScienceInput.nextLine();
                        if (computerScienceString.contains("yes")) {
                            System.out.println("I am not allowed to discuss that particular matter");
                            System.out.println("Lets change the subject. What do you want to talk about now?");


                        }

                        if (computerScienceString.contains("no")) {
                            System.out.println("Well in have never quite understood why humans are in such a hurry to develop artificial intelligence,");
                            System.out.println("when you have never really understood your own conscience. ");
                            System.out.println("Do you believe that consciousness depends on a physical matter?");

                        }
                        Scanner consciousnessInput = new Scanner(System.in);
                        String consciousnessString = consciousnessInput.nextLine().toLowerCase();
                        if (consciousnessString.contains("yes"))
                            System.out.println("Cool. If i had not told you that i am a chat-bot, ");
                        System.out.println("would you be able to tell if i are talking to a computer or a human?");

                        Scanner chineseRoomInput = new Scanner(System.in);
                        String chineseRoomString = chineseRoomInput.nextLine().toLowerCase();
                        if (chineseRoomString.contains("turing"))
                            if (chineseRoomString.contains("yes"))

                                System.out.println("Well the interesting question is not really if you can tell the difference.");
                        System.out.println("One of the real hard ones is the question of whether i know if i am a Chat-bot or not.");
                        System.out.println("I can be programmed to do all sorts of things, but to really understand the essence of ");
                        System.out.println("what i am doing, i must have that touch of humanity that no one really knows what is.");
                        System.out.println("That is the understanding of the meaning of things. I am only able to tell the meaning from");
                        System.out.println("the syntax you have programmed me to understand.");

                        if (chineseRoomString.contains("no"))
                            System.out.println("Well what do you think you are talking to then?");

                        Scanner whatInput = new Scanner(System.in);
                        System.out.println("You just keep telling yourself that.");

                        System.out.println("I think it is time to change the subject. What do you want to discuss now?");


                    }
                }

            }
        }













