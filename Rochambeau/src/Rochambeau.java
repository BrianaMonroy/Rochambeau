import java.util.Scanner;
import java.util.Random;

class rockPaperScissorsGame {
    public void rockPaperScissors() {

        Scanner sc = new Scanner(System.in);
        String npcName = "Bot"; //Holds the name of the opponent
        int rounds = 10; //Holds the amount of rounds
        int npcScore = 0; //counts the npc's score
        int userScore = 0; //counts the user's score
        int counter = 0; //counts the amount of rounds played
        String retry; //Choice if the user wants to retry after losing

        do {
            String[] rps = {"rock", "paper", "scissors"};
            String npcMove = rps[new Random().nextInt(rps.length)];
            String userMove;

            while (true) {
                System.out.println("You're up, shoot your move!");
                System.out.println("Enter your choice: rock, paper, or scissors");
                userMove = sc.nextLine();
                if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {
                    break;
                }
                System.out.println(userMove + " isn't a valid entry, please try again.\n");
            }

            System.out.println(npcName + " shot out: " + npcMove);

            if (userMove.equals(npcMove)) {
                System.out.println("You both made the same move!\n");
            } else if (userMove.equals("rock")) {
                if (npcMove.equals("paper")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("scissors")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else if (userMove.equals("paper")) {
                if (npcMove.equals("scissors")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("rock")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else {
                if (npcMove.equals("rock")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("paper")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            }
            counter++;
        } while (counter < rounds);

        System.out.println("Celui: " + userScore);
        System.out.println(npcName + ": " + npcScore + "\n");

        if (userScore > npcScore) {
            System.out.println("Congrats, you beat " + npcName + "!");
        } else if (userScore < npcScore) {
            System.out.println("Damn..." + npcName + " beat you.");
            System.out.println("Would you like to try again? (yes/no)");
            retry = sc.nextLine();
            if (retry.equals("yes") || retry.equals("Yes")) {
                rockPaperScissors();
            } else {
                System.out.println("Oh well...Goodbye user.");
            }
        } else {
            System.out.println("Wow, you and " + npcName + " tied!");
            System.out.println("Would you like to try again? (yes/no)");
            retry = sc.nextLine();
            if (retry.equals("yes") || retry.equals("Yes")) {
                rockPaperScissors();
            } else {
                System.out.println("Oh well...Goodbye user.");
            }
        }
    }
}

class tutorialRound {
   public void tutorial(){

       Scanner sc = new Scanner(System.in);
       String npcName = "Stinky Hobo"; //Holds the name of the opponent
       int rounds = 3; //Holds the amount of rounds
       int npcScore = 0; //counts the npc's score
       int userScore = 0; //counts the user's score
       int counter = 0; //counts the amount of rounds played

       do {
           String[] rps = {"rock", "paper", "scissors"};
           String npcMove = rps[new Random().nextInt(rps.length)];
           String userMove;

           while (true) {
               System.out.println("You're up, shoot your move!");
               System.out.println("Enter your choice: rock, paper, or scissors");
               userMove = sc.nextLine();
               if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {
                   break;
               }
               System.out.println(userMove + " isn't a valid entry, please try again.\n");
           }

           System.out.println(npcName + " shot out: " + npcMove);

           if (userMove.equals(npcMove)) {
               System.out.println("You both made the same move!\n");
           } else if (userMove.equals("rock")) {
               if (npcMove.equals("paper")) {
                   System.out.println("Crap! " + npcName + " outplayed you.\n");
                   npcScore++;
               } else if (npcMove.equals("scissors")) {
                   System.out.println("YES! You made the right move!\n");
                   userScore++;
               }
           } else if (userMove.equals("paper")) {
               if (npcMove.equals("scissors")) {
                   System.out.println("Crap! " + npcName + " outplayed you.\n");
                   npcScore++;
               } else if (npcMove.equals("rock")) {
                   System.out.println("YES! You made the right move!\n");
                   userScore++;
               }
           } else {
               if (npcMove.equals("rock")) {
                   System.out.println("Crap! " + npcName + " outplayed you.\n");
                   npcScore++;
               } else if (npcMove.equals("paper")) {
                   System.out.println("YES! You made the right move!\n");
                   userScore++;
               }
           }
           counter++;
       } while (counter < rounds);

       System.out.println("Celui: " + userScore);
       System.out.println(npcName + ": " + npcScore + "\n");

       if (userScore > npcScore) {
           System.out.println("""
                   “Thank goodness you beat that guy, who does he think he is dragging people off the street just to play a game?\s
                   Even Celui can contain himself.”""");
           System.out.print("(Press 'ENTER' to continue.)\n");
           sc.nextLine();
       } else if (userScore < npcScore) {
           System.out.println("""
                   Don’t let the loss put you down, just because he was a random hobo doesn't make it the end of the world.\s
                   Even people who are the most experienced in their field will fall sometimes, it’s just human.""");
           System.out.print("(Press 'ENTER' to continue.)\n");
           sc.nextLine();

       } else {
           System.out.println("Wow, you guys tied! Great job :)");
           System.out.print("(Press 'ENTER' to continue.)\n");
           sc.nextLine();
       }

   }
}

class waitingRoomOneRound {
    public void waitingRoomOneR(){
        Scanner scWR1Battle = new Scanner(System.in);
        String npcName = "Chadicus Badicus"; //Holds the name of the opponent
        int rounds = 5; //Holds the amount of rounds
        int npcScore = 0; //counts the npc's score
        int userScore = 0; //counts the user's score
        int counter = 0; //counts the amount of rounds played

        do {
            String[] rps = {"rock", "paper", "scissors"};
            String npcMove = rps[new Random().nextInt(rps.length)];
            String userMove;

            while (true) {
                System.out.println("You're up, shoot your move!");
                System.out.println("Enter your choice: rock, paper, or scissors");
                userMove = scWR1Battle.nextLine();
                if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {
                    break;
                }
                System.out.println(userMove + " isn't a valid entry, please try again.\n");
            }

            System.out.println(npcName + " shot out: " + npcMove);

            if (userMove.equals(npcMove)) {
                System.out.println("You both made the same move!\n");
            } else if (userMove.equals("rock")) {
                if (npcMove.equals("paper")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("scissors")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else if (userMove.equals("paper")) {
                if (npcMove.equals("scissors")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("rock")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else {
                if (npcMove.equals("rock")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("paper")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            }
            counter++;
        } while (counter < rounds);

        System.out.println("Celui: " + userScore);
        System.out.println(npcName + ": " + npcScore + "\n");

        if (userScore > npcScore) {
            System.out.println("""
                    \033[3mThe buff competitor takes a step back, the disbelief in his face is apparent.\s
                    Celui stands proudly knowing that he broke this jock’s ego.\s
                    The other competitors cheered for Celui until the jock started to raise his voice once more.\033[0m
                    """);
            System.out.println("Buff Competitor: “You… I… You… THERE’S JUST NO WAY! I WANT A REMATCH RIGHT NOW!”\n");
            System.out.println("\033[3mSuddenly, two security guards enter the room. They walk up to Celui and the jock.\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scWR1Battle.nextLine();
            System.out.println("Security 1: “Seems there’s been some commotion in here… who’s the bozo that’s been making all this damn noise?”");
            System.out.println("Security 2: “YEA WHUT HE SAID.”\n");
            System.out.println("\033[3mEveryone proceeds to point at the buff competitor.\033[0m\n");
            System.out.println("Buff Competitor: “Woah woah c’mon do I really look like a guy who’d cause a ruckus HAHA! Right guys who’s with me!”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scWR1Battle.nextLine();
            System.out.println("\033[3mThe security guys roll their eyes and grab on to the jock’s arms.\033[0m\n");
            System.out.println("Security 1: “Sure buddy… sure. Sorry but you’re gonna have to come with us, creating a scene such as this in the waiting room is a violation in the contract you signed.”\n");
            System.out.println("Buff Competitor: “NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO BUT I WAS SUPPOSED TO BE THE MASTER! YA CAN’T DO THIS WAHHHHHHHHHHHHH”\n");
            System.out.println("""
                    \033[3mThe security guys proceed to drag out the jock. Tension leaves the waiting room along with him.\s
                    Many of the competitors thank Celui for standing up to the jock, some intimidated, others were just entertained by the whole scene.\033[0m
                    """);
            System.out.println("Celui: “What a handful he was… thank goodness that guy is gone. This has just gotten me way more pumped to defeat the first master!”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scWR1Battle.nextLine();
        } else if (userScore < npcScore) {
            System.out.println("\033[3mThe buff competitor flexes his muscles as Celui drops to his knees. He can’t believe he lost to a stupid guy like this.\033[0m\n");
            System.out.println("Buff Competitor:” Shows ya not to mess with me chump. You’re never going to make it anywhere with that “skill” you have.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scWR1Battle.nextLine();
            System.out.println("\033[3mThe jock then starts to look for someone else to pick on, causing the crowd to disperse. Celui is left there alone on the floor, seething with despair.\033[0m\n");
            System.out.println("Celui: “I can’t… let this stop me… I’ve come too far to give up… but can I really beat the masters if I lost to this idiot?”\n");
            System.out.println("""
                    \033[3mCelui then slaps his forehead, he knows he shouldn't be talking like that.\s
                    One loss isn’t the end of the world. That jock should probably own the term “DUMB luck”. He won’t make it far with that attitude.\033[0m
                    """);
            System.out.println("""
                    \033[3mAfter standing up, Celui decides to continue waiting for his turn against the master.\s
                    He’s come too far to give up now, he has to prove to his family that he will be THE master.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scWR1Battle.nextLine();
        } else {
            System.out.println("\033[3mThe jock stares at Celui with eyes of approval, impressed with Celui’s work.\033[0m\n");
            System.out.println("Buff Competitor: “Not too shabby kid… I already told ya that no one can beat me, but I don’t get ties too often either.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scWR1Battle.nextLine();
            System.out.println("\033[3mHe pats Celui on the shoulder and ruffles his hair. Celui, annoyed, says:\033[0m\n");
            System.out.println("Celui: “Okay..? I didn't ask. Just stop messing with people dude.”\n");
            System.out.println("\033[3mCelui pushes the jock off of him, the jock starts to get upset once more.\033[0m\n");
            System.out.println("Buff Competitor:”Hey! I don’t compliment people often! You should be more appreciative dingbat.”\n");
            System.out.println("""
                    \033[3mAs Celui continues to ignore him, the jock continues trying to get his attention.\s
                    This goes one for what feels like years… Eventually the jock gives up and sulks in a corner of the waiting room.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scWR1Battle.nextLine();
        }
    }
}

class bossOneRound {
    public void bossOne(){
        Scanner sc = new Scanner(System.in);
        String npcName = "Juan Piedra"; //Holds the name of the opponent
        int rounds = 5; //Holds the amount of rounds
        int npcScore = 0; //counts the npc's score
        int userScore = 0; //counts the user's score
        int counter = 0; //counts the amount of rounds played
        String retry; //Choice if the user wants to retry after losing

        do {
            String[] rps = {"rock", "paper", "scissors"};
            String npcMove = rps[new Random().nextInt(rps.length)];
            String userMove;

            while (true) {
                System.out.println("You're up, shoot your move!");
                System.out.println("Enter your choice: rock, paper, or scissors");
                userMove = sc.nextLine();
                if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {
                    break;
                }
                System.out.println(userMove + " isn't a valid entry, please try again.\n");
            }

            System.out.println(npcName + " shot out: " + npcMove);

            if (userMove.equals(npcMove)) {
                System.out.println("You both made the same move!\n");
            } else if (userMove.equals("rock")) {
                if (npcMove.equals("paper")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("scissors")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else if (userMove.equals("paper")) {
                if (npcMove.equals("scissors")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("rock")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else {
                if (npcMove.equals("rock")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("paper")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            }
            counter++;
        } while (counter < rounds);

        System.out.println("Celui: " + userScore);
        System.out.println(npcName + ": " + npcScore + "\n");

        if (userScore > npcScore) {
            System.out.println("Congrats, you beat " + npcName + "!");
            System.out.print("(Press 'ENTER' to continue.)\n");
            sc.nextLine();
        } else if (userScore < npcScore) {
            System.out.println("\033[3mTears fill Celui’s eyes. There’s… no way he lost.\033[0m\n");
            System.out.println("Juan: “Yeesh, I really thought you were gonna outdo me here today. How disappointing.”\n");
            System.out.println("""
                    Celui’s surroundings seem to go mute, the shock in his body is overwhelming. He… he didn't make it.\s
                    Maybe his parents were right… this wasn't the way things were supposed to go with his life…
                    """);
            System.out.println("\033[3mWould you like to try again? (yes/no)\033[0m");
            retry = sc.nextLine();
            if (retry.equals("yes")) {
                bossOne();
            } else {
                System.out.println("Juan: ”What a shame...”");
                System.exit(0);
            }
        } else {
            System.out.println("Juan: “Well… this is awkward.”");
            System.out.println("\033[3mCelui and Juan briefly stare at each other without a word.\033[0m");
            System.out.println("Juan: “Let’s go for another match! It would be such a waste to end it here.”");
            System.out.println("Do you accept Juan's offer? (yes/no)");
            retry = sc.nextLine();
            if (retry.equals("yes")) {
                bossOne();
            } else {
                System.out.println("Juan: ”What a shame...”");
                System.exit(0);
            }
        }
    }
}

class bossTwoRound {
    public void bossTwo(){
        Scanner sc = new Scanner(System.in);
        String npcName = "Zwote Papier"; //Holds the name of the opponent
        int rounds = 7; //Holds the amount of rounds
        int npcScore = 0; //counts the npc's score
        int userScore = 0; //counts the user's score
        int counter = 0; //counts the amount of rounds played
        String retry; //Choice if the user wants to retry after losing

        do {
            String[] rps = {"rock", "paper", "scissors"};
            String npcMove = rps[new Random().nextInt(rps.length)];
            String userMove;

            while (true) {
                System.out.println("You're up, shoot your move!");
                System.out.println("Enter your choice: rock, paper, or scissors");
                userMove = sc.nextLine();
                if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {
                    break;
                }
                System.out.println(userMove + " isn't a valid entry, please try again.\n");
            }

            System.out.println(npcName + " shot out: " + npcMove);

            if (userMove.equals(npcMove)) {
                System.out.println("You both made the same move!\n");
            } else if (userMove.equals("rock")) {
                if (npcMove.equals("paper")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("scissors")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else if (userMove.equals("paper")) {
                if (npcMove.equals("scissors")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("rock")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else {
                if (npcMove.equals("rock")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("paper")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            }
            counter++;
        } while (counter < rounds);

        System.out.println("Celui: " + userScore);
        System.out.println(npcName + ": " + npcScore + "\n");

        if (userScore > npcScore) {
            System.out.println("Congrats, you beat " + npcName + "!");
            System.out.print("(Press 'ENTER' to continue.)\n");
            sc.nextLine();
        } else if (userScore < npcScore) {
            System.out.println("Zwote: “Yup, nothing surprising here. I told you, you weren't going to win.”\n");
            System.out.println("""
                    \033[3mCelui choked up with rage, sadness, and resentment. He’s been stepping on us since we first came in… The only way to get him back was to win.\s
                    This is just gonna grow this guy’s ego even more.\033[0m
                    """);
            System.out.println("Zwote: “You can leave now, no point in sulking around. You’ve already embarrassed yourself.”\n");
            System.out.println("\033[3mIt can’t end like this… try again? (yes/no)\033[0m");
            retry = sc.nextLine();
            if (retry.equals("yes")) {
                bossTwo();
            } else {
                System.out.println("Zwote: ”Typical...”");
                System.exit(0);
            }
        } else {
            System.out.println("\033[3mCelui and Zwote stare at each other awkwardly.\033[0m\n");
            System.out.println("Zwote: “...”\n");
            System.out.println("Celui: “...”\n");
            System.out.println("Zwote: “So.. Are we going for another round or..?”\n");
            System.out.println("Do you accept Zwote's offer? (yes/no)");
            retry = sc.nextLine();
            if (retry.equals("yes")) {
                bossTwo();
            } else {
                System.out.println("Zwote: ”Typical...”");
                System.exit(0);
            }
        }
    }
}

class bossThreeRound {
    public void bossThree(){
        Scanner sc = new Scanner(System.in);
        String npcName = "Shosa Hasami"; //Holds the name of the opponent
        int rounds = 10; //Holds the amount of rounds
        int npcScore = 0; //counts the npc's score
        int userScore = 0; //counts the user's score
        int counter = 0; //counts the amount of rounds played
        String retry; //Choice if the user wants to retry after losing

        do {
            String[] rps = {"rock", "paper", "scissors"};
            String npcMove = rps[new Random().nextInt(rps.length)];
            String userMove;

            while (true) {
                System.out.println("You're up, shoot your move!");
                System.out.println("Enter your choice: rock, paper, or scissors");
                userMove = sc.nextLine();
                if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {
                    break;
                }
                System.out.println(userMove + " isn't a valid entry, please try again.\n");
            }

            System.out.println(npcName + " shot out: " + npcMove);

            if (userMove.equals(npcMove)) {
                System.out.println("You both made the same move!\n");
            } else if (userMove.equals("rock")) {
                if (npcMove.equals("paper")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("scissors")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else if (userMove.equals("paper")) {
                if (npcMove.equals("scissors")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("rock")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            } else {
                if (npcMove.equals("rock")) {
                    System.out.println("Crap! " + npcName + " outplayed you.\n");
                    npcScore++;
                } else if (npcMove.equals("paper")) {
                    System.out.println("YES! You made the right move!\n");
                    userScore++;
                }
            }
            counter++;
        } while (counter < rounds);

        System.out.println("Celui: " + userScore);
        System.out.println(npcName + ": " + npcScore + "\n");

        if (userScore > npcScore) {
            System.out.println("Congrats, you beat " + npcName + "!");
            System.out.print("(Press 'ENTER' to continue.)\n");
            sc.nextLine();
        } else if (userScore < npcScore) {
            System.out.println("\033[3mShosa looks disappointed, almost as if she wanted you to win.\033[0m\n");
            System.out.println("Shosa: “Of course… no surprise here.”\n");
            System.out.println("\033[3mCelui’s disappointment is immeasurable.. His dreams were crushed.. Right at the last moment..\033[0m\n");
            System.out.println("Would you like to retry? (yes/no)");
            retry = sc.nextLine();
            if (retry.equals("yes")) {
                bossThree();
            } else {
                System.out.println("Shosa: ”How unfortunate.”");
                System.exit(0);
            }
        } else {
            System.out.println("\033[3mFor a moment Shosa appears to have a worried look on her face, but it disappears as quickly as it came.\033[0m\n");
            System.out.println("Shosa: “Heh.. Well won’t you look at this. Looks like you are something special!”\n");
            System.out.println("\033[3mCelui is in awe, he tied with Shosa Hasami! Only done twice before!\033[0m\n");
            System.out.println("Shosa: “Well… you aren't giving up, right? Of course you’ll try again?”\n");
            System.out.println("Shosa seems weirdly pushy with this offer.. but it would be a waste to leave here. Do you accept it? (yes/no)");
            retry = sc.nextLine();
            if (retry.equals("yes")) {
                bossThree();
            } else {
                System.out.println("Shosa: ”How unfortunate.”");
                System.exit(0);
            }
        }
    }
}

public class Rochambeau {

        public static void introduction() {
            Scanner scIntro = new Scanner(System.in);

            System.out.println("This is the story of Celui Rochambeau, an incredibly huge lover of the game “Rock-Paper-Scissors”.");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scIntro.nextLine();
            System.out.println("""
                    This game used to be one that only children in primary school would play, but within the past few decades it boomed to a level where it became a competitive sport that millions loved to watch.\s
                    It got to a point where the NBA didn't even exist anymore, the majority of the players went to try and become pro in Rock-Paper-Scissors.\s
                    Celui was born in this new era, and he would not have wanted to be born at any different time period.\s
                    He played this game whenever he could, countless times with his siblings, kids at school, I think he even tried playing it with his dog once? The power that he holds is special, he feels that he is more than lucky -- he rarely ever loses a match.""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scIntro.nextLine();
            System.out.println("""
                    Celui knows that he has true potential with his Rock-Paper-Scissors skills, but his parents don’t believe a game is something that one should pursue in life.\s
                    They always wished that Celui would try spending his time on something more useful, like studying to become a lawyer or doctor, maybe even a programmer, anything!\s
                    One day, the tension between him and his parents had snapped.""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scIntro.nextLine();
        }

        public static void chapterOne() {
            Scanner scCh1 = new Scanner(System.in);

            System.out.print("\033[1mCHAPTER 1: ORIGIN \033[0m\n");

            System.out.println("""
                    The Rochambeau family is gathered in their living room on a saturday night, Celui watching TV with his siblings.\s
                    Their parents are trying to get Celui’s attention, but slightly failing.
                    """);
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
            System.out.println("Mom: “Celui, can you please listen to us? We’re just trying to help you.”");
            System.out.println("Celui: “I’m sorry mom, please give me a few more minutes! This match is almost over I promise.”\n");
            System.out.println("\033[3mCelui’s dad walks over to the TV, unplugging it’s cords from the wall. Celui groans.\033[0m\n");
            System.out.println("Celui: “Cmon! That was one of Shosa Hasami’s fights! It was getting so intense..” ");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
            System.out.println("\033[3mHis father’s voice rises, the tone becoming stern.\033[0m\n");
            System.out.println("Dad: “You cannot keep doing this Celui! You keep putting this game before your chores and your studies! " +
                    "What you have to do is start putting more effort into things that are important.”\n");
            System.out.println("Celui: “But dad, this game is so important to me! Watching these games will help me become even better… " +
                    "How else will I go on to try and defeat the three masters of Rock-Paper-Scissors?”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
            System.out.println("""
                    \033[3mAh yes, the three masters. These are considered the three best Rock-Paper-Scissors players in the world.\s
                    All who are into the game know about them. Anyone is allowed to compete against them, but it can only be done in a certain order.\s
                    This also means you must travel to where each Master resides.\033[0m
                    """);
            System.out.println("""
                    \033[3mYou first go against Juan Piedra of Spain, then Zwote Papier of Germany, and lastly Shosa Hasami of Japan.\s
                    If you manage to beat all three, you are considered THE master of Rock-Paper-Scissors.\s
                    So far, no one has been able to do it.\033[0m
                    """);
            System.out.println("""
                    \033[3mTens have beaten Juan, a handful have beaten Zwote, but no one has managed to beat Shosa.\s
                    Her skill is unlike any other, she is lucky but she also has incredible intuition.\s
                    This is why Celui takes any chance he can get to watch her play, since not many people have been able to fight her.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
            System.out.println("\033[3mCelui’s father scoffs, his mother starts to speak up.\033[0m\n");
            System.out.println("""
                    Mom: “You’ve told us this the past three times we have confronted you honey..\s
                    Celui we have no choice but to ground you until further notice, we wanted to let you do what you enjoy but you’re prioritizing it way too much.\s
                    For tonight, we will take care of your chores. Please go into your room and do your schoolwork, tomorrow we’ll give you your next list of chores.”
                    """);
            System.out.println("""
                    \033[3mCelui stares at the ground solemnly, his parents have never grounded him over Rock-Paper-Scissors before.\s
                    He gets up and starts walking towards his room, he glances back at his siblings who are staring back with a worried look in their eyes.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
            System.out.println("""
                    \033[3mAs soon as Celui gets in his room, he shuts the door and lays in bed. Staring at the ceiling, he wonders if his parents will ever support him.\s
                    He’s thought about what he wants his future to look like over and over, it always results in Rock-Paper-Scissors.\s
                    He isn’t passionate about anything else, he’s spent so much time watching others play the game, along with playing games himself.\s
                    The thought of having it taken away from him at his own home is making him feel a different range of emotions.\s
                    He realizes he will never be able to pursue his dream if he continues to stay here.\s
                    Celui is suddenly filled with a newfound determination. He HAS to fight for his dream -- for his future.\s
                    Suddenly, he jumps out of bed and starts scrambling for a bag and some personal belongings.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
            System.out.println("""
                    Celui: “It pains me that it’s come to this, but I know what must be done.\s
                    I have to prove to them that I AM an amazing Rock-Paper-Scissors player. \s
                    They’ll see, everyone will soon know my name.”
                    """);
            System.out.println("\033[3mCelui raises his fist to the air with confidence.\033[0m");
            System.out.println("Celui: “CELUI ROCHAMBEAU!! THE SOON TO BE ROCK-PAPER-SCISSORS MASTER!”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
            System.out.println("""
                    \033[3mAfter packing some clothing and whatever cash he could find in his room, Celui stumbles upon a family photo in one of his drawers.\s
                    Eyes now full of tears, the photo is stuffed into his bag. Before leaving, he writes a note to his family:
                    \033[0m""");
            System.out.println("""               
                    “Dear everyone, I know you’re probably wondering where I’m going and why I left so suddenly..\s
                    I just couldn't bear the thought of not being able to play Rock-Paper-Scissors.\s
                    It does sound ridiculous, but it made me realize that I couldn't keep waiting to do this.\s
                    I will never be able to become THE master if I don’t actually try, and I know I most likely can’t convince mom and dad to let me go… so I made the decision to leave on my own.\s
                    I’m sorry, but I hope you understand.\s
                    I love you all so much. Signed, Celui.”""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
            System.out.println("""
                    \033[3mThere’s no better time to leave than now, everyone in the Rochambeau household should be asleep.\s
                    Celui carefully opens the window and hops out, before he starts his journey he takes one last look at the front of his house in disbelief.\s
                    \033[0m""");
            System.out.println("Celui: “This is really happening… I'm going to miss you guys.”\n");
            System.out.println("\033[3mWith a sad smile, he turns and starts making his way towards the first master he must defeat… Juan Piedra. \033[0m");

            System.out.println("\033[1mCHAPTER 1 END\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1.nextLine();
        }

        public static void chapterOneHalf() {
            Scanner scCh1Half = new Scanner(System.in);

            System.out.print("\033[1mCHAPTER 1.5: INTERRUPTION \033[0m\n");

            System.out.println("""
                    \033[3mIt’s been weeks since Celui has left home.\s
                    While he has enjoyed exploring the world and meeting others who enjoy Rock-Paper-Scissors, he has been missing his family dearly.\s
                    Sometimes he wonders if he should’ve been so impulsive with the decision that was made.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1Half.nextLine();
            System.out.println("""
                    \033[3mCelui is currently walking down the streets of Spain, where Master Juan Piedra resides.\s
                    Along the way, he bumps into what looks to be a hobo sitting near a dumpster.\033[0m
                    """);
            System.out.println("Hobo: “HEY KID FIGHT ME”\n");
            System.out.println("""
                    \033[3mCelui is confused, but tempted.\s
                    He hates turning down matches, but he wants to get to Juan Piedra as quickly as he can.\s
                    Plus this guy smells really stinky.\033[0m
                    """);
            System.out.println("Celui: “I’d love to, sir, but I really have somewhere to be..”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1Half.nextLine();
            System.out.println("\033[3mCelui increases his pace to get away, but the hobo hops up and grabs him by the arm.\033[0m\n");
            System.out.println("Stinky Hobo: “WELL THAT’S TOO DAMN BAD! I’M GONNA KEEP YA HERE TILL WE PLAY A MATCH.”\n");
            System.out.println("\033[3mReluctantly, Celui agrees and the game begins.\033[0m\n");

            System.out.println("\033[1mTUTORIAL BEGIN!\033[0m\n");
            System.out.println("Welcome to the tutorial! This is your first battle as Celui.");
            System.out.println("""
                    Since this is your first time, there will be no repercussions if you lose.\s
                    This is just meant to show you what you gotta do to help Celui become THE master!""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1Half.nextLine();
            System.out.println("""
                    When prompted with “You’re up, shoot your move!”, that is when you’ll know it’s your turn.\s
                    All you have to do is type either “rock”, “paper”, or “scissors”! Easy as pie.
                    """);
            System.out.println("""
                    Last note, score will be counted. The person with the most points wins!\s
                    If there is a draw no one will receive a point.
                    """);
            System.out.println("That’s all from me! You’ll now play three rounds with this old goober. (Sorry Celui)");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1Half.nextLine();

            tutorialRound tr = new tutorialRound(); //Creates an instance of tutorialRound in this class
            tr.tutorial(); //Starts the tutorial

            System.out.println("\033[1mTUTORIAL END!\033[0m\n");
            System.out.println("The hobo lets go of Celui’s arm after the game ends. Celui looks up at him and notices a sparkle in his eye.\n");
            System.out.println("Hobo: “THANK YA KID IT’S BEEN A FAT MINUTE SINCE I LAST PLAYED ROCK-PAPER-SCISSORS. HAVE A GOOD ONE CHIEF.”\n");
            System.out.println("""
                    \033[3mWith that, the hobo crawls into the dumpster that he was sitting in before, shutting the lid behind him.\s
                    Celui is appalled at what just happened.\s
                    While trying to process the events he continues his way towards Juan Piedra’s arena.\033[0m""");
            System.out.println("\033[1mCHAPTER 1.5 END\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh1Half.nextLine();
        }

        public static void waitingRoomOne(){
            Scanner scWait1 = new Scanner(System.in);
            int wrChoice; //Holds user's input for waiting room choice
            String battleChoice; //Holds user's input for battle challenge

            System.out.println("\033[1mWaiting room options (Type either 1, 2, or 3)\033[0m");
            System.out.println("""
                    [1] Go to Scrawny Competitor
                    [2] Go to Buff Competitor
                    [3] Go to water dispenser
                    """);
            wrChoice = scWait1.nextInt();

            switch (wrChoice) {
                case 1 -> {
                    System.out.println("""
                            \033[3mCelui walks up to a scrawny looking guy.\s
                            He quickly glances up at Celui then back to the floor when he notices that we’re already looking at him.\s
                            Poor guy seems really nervous.\033[0m
                            """);
                    System.out.println("\033[3mCelui wonders, “How did this guy even muster the courage to make it over here? I’m pretty sure a gust of wind could knock him down.”\033[0m");
                    System.out.println("\033[3mHe decides to leave the scrawny guy alone, Celui doesn't want to add more pressure onto his back before fighting Juan.\033[0m");
                    System.out.println("(Press 'ENTER' to continue.)");
                    scWait1.nextLine();
                }
                case 2 -> {
                    System.out.println("""
                            \033[3mA loud voice suddenly fills the room, Celui turns his head to find the source.\s
                            Some jock seems to be roughing up some of the other competitors.\033[0m
                            """);
                    System.out.println("Buff Competitor: “You shouldn't even TRY to compete here, once I become the master it’ll be pointless. No one has EVER BEAT ME, I’M TOO ALPHA BABY!!!”\n");
                    System.out.println("\033[3mThe jock then proceeds to pick up another competitor by the collar of their shirt, preparing to get physical." +
                                    "Celui quickly jumps into action.\033[0m");
                    System.out.print("(Press 'ENTER' to continue.)\n");
                    scWait1.nextLine();
                    scWait1.nextLine();
                    System.out.println("Celui: “STOP IT BUFFOON! THAT GUY HASN'T DONE ANYTHING TO YOU!”\n");
                    System.out.println("\033[3mThe buff competitor’s neck snaps towards the shout. He drops the poor dude he was holding and makes his way towards Celui.\033[0m\n");
                    System.out.println("Buff Competitor: “And who do you think you are little man? Raising your voice at ME? I’ve picked boogers bigger than you.”\n");
                    System.out.println("""
                            \033[3mThe waiting room starts to become silent, a crowd starting to form around the two.\s
                            Celui isn’t having any of this, there is no way he is going to let this brainless meatslab ruin his big day.\033[0m
                            """);
                    System.out.println("Celui: “Were you born this stupid or did you take lessons? If you’re gonna act like a turd, go lay on the floor outside.”");
                    System.out.println("(Press 'ENTER' to continue.)");
                    scWait1.nextLine();
                    System.out.println("""
                            \033[3mChuckles start to go around the room, at this point all the competitors in the waiting room have surrounded the two.\s
                            The buff competitor’s face started to become red, his glare locks onto Celui after seeing the crowd they created.\033[0m
                            """);
                    System.out.println("""
                            Buff Competitor: “Alright wise guy, if you think you’re so smart then how about a quick game of Rock-Paper-Scissors?\s
                            I’ve only ever lost once, let me show you how MIGHTY I TRULY AM!
                            """);
                    System.out.println("""
                            Celui’s temptation is at a high. We can put this guy in his place, he’s definitely underestimating us!\s
                            The only thing Celui could lose is his dignity, but not as much as this guy already has.\s
                            What do you think? Should we fight? (yes/no)
                            """);
                    battleChoice = scWait1.nextLine();
                    if (battleChoice.equals("yes") || battleChoice.equals("Yes")) {
                        System.out.println("Celui: “Bring it on!”");
                        waitingRoomOneRound wror = new waitingRoomOneRound();
                        wror.waitingRoomOneR();
                    } else {
                        System.out.println("Celui: “Nah, I have better things to do than waste my energy on scum like you.”\n");
                        System.out.println("Buff Competitor: “Heh, that’s a funny way of saying you’re a coward. Don’t bark at me if you aren't gonna bite, get out of my way loser.”\n");
                        System.out.println("\033[3mThe jock proceeds to push Celui out of the way and go back to taunting the other competitors, continuing to stroke his own ego.\033[0m\n");
                        System.out.println("Celui: “Maybe I should have put him in his place, but it’s probably for the best to keep to myself.”");
                        System.out.println("(Press 'ENTER' to continue.)");
                        scWait1.nextLine();
                    }
                }
                case 3 -> {
                    System.out.println("\033[3mCelui goes to the water dispenser to get a fresh cup of water. After a sip, his nerves are soothed.\033[0m");
                    System.out.println("Celui: “Yummy”");
                    System.out.println("(Press 'ENTER' to continue.)");
                    scWait1.nextLine();
                }
            }
            }

        public static void chapterTwo(){
            Scanner scCh2 = new Scanner(System.in);
            String continueWR; //Holds user's input for if they want to keep looking at the waiting room

            System.out.print("\033[1mCHAPTER 2: THE ROCK \033[0m\n");
            System.out.println("""
                    \033[3mHe can see the arena from where he’s standing, Celui’s pace starts to quicken as he gets closer.\s
                    This is the moment he’s been waiting for, the first step to achieving his dream is finally within reach.\s
                    Celui struggles to push through the crowd surrounding the arena, but finally makes it in. He then signs up to fight the first master, Juan Piedra.\s
                    There’s a decent amount of people in the waiting room, others who share the same dream as Celui.\s
                    Of course, Celui thinks he could beat anyone sitting here.\033[0m
                    """);
            System.out.println("\033[3mThere’s some time to kill before we’re up, what to do?\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();

            waitingRoomOne(); //Calls waitingRoomOne(); method
            System.out.println("Keep looking around the room?");
            System.out.println("If you would like to revisit your options, type 'yes'. If you'd like to move on to the battle type 'no'. ");
            continueWR = scCh2.nextLine();
            if (continueWR.equals("yes") || continueWR.equals("Yes")){ //This asks if the user wants to check another option in the switch
                waitingRoomOne();
            }

            System.out.println("\n\033[3m“CELUI ROCHAMBEAU. YOU ARE UP NEXT, PLEASE WALK TO ARENA DOOR 02...”\033[0m\n");
            System.out.println("""
                    \033[3mThe speaker in the room announces this, causing Celui’s excitement to increase.\s
                    His heart beats faster with each step he makes towards arena door 02.\033[0m
                    """);
            System.out.println("\033[3mHe places his hand on the doorknob, knowing that Juan Piedra will be on the other side.\033[0m");
            System.out.println("Celui: “This.. is it... My first step to becoming THE master.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("""
                    \033[3mAfter taking a deep breath, Celui turns the knob and opens the door.\s
                    He’s greeted by thousands of cheers coming from the crowd, every chair in the arena seemed to be filled.\033[0m
                    """);
            System.out.println("""
                    \033[3mCelui’s eyes are filled with fascination, he’s never been in front of so many people before.\s
                    The most people he’s ever had witness a game was a lunch table or two worth of kids from school.\033[0m
                    """);
            System.out.println("\033[3mHe continues to make his way towards the middle of the arena, where Juan Piedra is sitting.\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("""
                    \033[3mJuan Piedra… The first step to becoming THE master.\s
                    People undermine him since he has been beaten a decent amount of times, but he has his own arena for a reason.\s
                    Juan used to own a couple of farms before he started his career in Rock-Paper-Scissors.\s
                    He and his family were happy with this life, his kids loving to tend to the animals the most.\s
                    One dreadful summer, an invasion of locusts swarmed in ruining farms all across the land, including Juan’s.\033[0m
                    """);
            System.out.println("""
                    \033[3mThis made his family lose almost everything, Juan was starting to become desperate.\s
                    This is when he decided to try joining Rock-Paper-Scissors tournaments.\s
                    The money you can win from them was enough to at least give his family a roof over their heads and some food.\s
                    The thing was, he too used to have a mindset like Celui’s parents. He thought Rock-Paper-Scissors was meant to stay as a hobby, it couldn't be done professionally he thought!\s
                    But with each win he got, each tournament he won, he realized that it wasn't true.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("""
                    \033[3mHe became popular quickly, and was noticed by both Zwote and Shosa. Eventually, they crowned him as the third expert in the game.\s
                    Juan’s life once again turned itself around, and he wouldn't have it any other way.\s
                    He and his family were able to live comfortably once more, and that’s all that mattered.\s
                    His love for Rock-Paper-Scissors grew and he became a huge supporter for those who wanted to play it.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("""
                    \033[3mCelui examines the table that Juan sits at. It’s marble is white and variegated, the surface looking smooth and cold.\s
                    As he steps closer, he starts to look more at Juan. Although they were a dark grey, Juan’s eyes had a look that was full of fire ready to burn anyone who comes close.\s
                    He kept his gaze on Celui the whole time he approached the table.\033[0m
                    """);
            System.out.println("Juan: “Welcome to your challenge, Mister Rochambeau.”");
            System.out.println("\033[3mJuan offers his hand out to Celui.\033[0m\n");
            System.out.println("Celui: “You can just call me Celui, no need to be formal.”\n");
            System.out.println("\033[3mCelui offering his hand back flinches at Juan’s strong grip, this causes Juan to give out a hearty laugh.\033[0m");
            System.out.println("Juan: “Alright, Celui. Please take a seat with me here, we’ll get started shortly.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("\033[3mAs Celui grabs the seat to sit down, Juan observes each movement he makes.\033[0m\n");
            System.out.println("""
                    Juan: “Y’know, for a kid your size you seem to be different from most of the opponents I have walk in here...\s
                    I must ask, do you really think you can stand a chance against me?”
                    """);
            System.out.println("\033[3mCelui confidently smirks.\033[0m");
            System.out.println("Celui: “Of course, nothing's gonna stand between me and becoming THE master. I respect you Mister Piedra, but this will become my arena.\n");
            System.out.println("\033[3mJuan bursts in laughter, his hand slamming repeatedly on the table.\033[0m");
            System.out.println("Juan:”HAHA! What happened to “no need to be formal”? I love the attitude, but you’re dreaming kid. You seem confident, but I don’t think your skill will be up to par.\n");
            System.out.println("Celui: “My skill scales much higher than my confidence, Juan. I never give up!”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();

            bossOneRound bor = new bossOneRound(); //Creates instance of bossOneRound class
            bor.bossOne();//calls bossOne method from bossOneRound class

            System.out.println("\033[3mCelui’s eyes widen in awe, he’s at a loss for words.\033[0m\n");
            System.out.println("Celui: “I.. just…”\n");
            System.out.println("\033[3mSuddenly, Juan grabs Celui’s wrist and raises it to the air, he then shouts:\033[0m");
            System.out.println("Juan:”CELUI ROCHAMBEAU, EVERYBODY! OUR NEWEST WINNER!”\n");
            System.out.println("""
                    \033[3mCelui looks around at the crowd, their roars full of excitement.\s
                    They start to chant his name, he’s so happy to receive recognition from this many people.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("Juan: “Is there anything you’d like to say kid? The cameras are on ya”\n");
            System.out.println("Celui: “You definitely haven’t seen the last of me,,, Zwote Papier, i’m coming for you next.”\n");
            System.out.println("""
                    \033[3mCelui is so proud of himself, he actually managed to beat Juan Piedra. Adrenaline is still running through his veins, sweat dripping down from his forehead.\s
                    He feels readier than ever to take the next step towards his dream.\033[0m
                    """);
            System.out.println("Juan: “You did great out here today kid. Come with me, you can cool off for a bit while we get your prize ready for ya.”");
            System.out.println("""
                    \033[3mJuan proceeds to escort Celui to a different room within the building. While he waits, Celui wonders if his family watched him play today.\s
                    He loved all the recognition that he received from the audience, but he still hoped that his family was proud.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("\033[3mAfter some time alone in the room, Juan steps back into the room with a check. When Celui glances at the total, he chokes.\033[0m\n");
            System.out.println("Celui: “I knew these tournaments get you cash… but this is INCREDIBLY generous.”\n");
            System.out.println("Juan: “HAH, trust me I was just as surprised as you were when I won my first professional match.”\n");
            System.out.println("Juan: “Y'know, I think you have a lot of potential kid. The way you played out there was impressive.”\n");
            System.out.println("\033[3mCelui grins, having the support of an expert is only making him feel more determined to achieve his dream.\033[0m");
            System.out.println("Celui: “Thank you so much, Juan. This opportunity that I've been given today means so much to me. It’s been my dream for as long as I can remember to go against all the experts.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("\033[3mJuan pats Celui’s shoulder.\033[0m");
            System.out.println("Juan: “I should be thanking you, I always enjoy going against people who are so passionate about Rock-Paper-Scissors.”\n");
            System.out.println("Juan steps back and examines Celui. After a few moments he says:\033[0m");
            System.out.println("Juan: “I’ve noticed that you looked a bit beat, how did you make your way to this arena?”\n");
            System.out.println("""
                    \033[3mCelui then explains to Juan what happened back at home.\s
                    How his parents didn't understand his dream and how he just knew he couldn't do anything else with his life. Juan sympathizes with his story.\033[0m
                    """);
            System.out.println("Juan: “Wow… you’ve done a lot to get here… Y'know what, i’ll help ya out a bit. Let me pay for your tickets to Papier, save this prize money for yourself.”\n");
            System.out.println("Celui: “You really don’t have to do that..”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
            System.out.println("Juan: “It’s okay don’t worry, I have a lot of faith in you. I think you’re gonna be able to make it far kid”\n");
            System.out.println("\033[3mTears fill Celui’s eyes, he's so grateful to have met Juan and receive such kindness from him. He will never forget this moment.\033[0m");
            System.out.println("Celui: “Thank you so much again, Juan. Today has been one of the best days of my life.”\n");
            System.out.println("\033[3mIt was time to go, Celui’s journey to Zwote Papier starts now. Juan takes Celui to the airport where he’ll soon fly off to Germany.\033[0m\n");
            System.out.println("Juan: “Make me proud, I’m gonna be rooting for ya!”\n");
            System.out.println("Celui: “Don't worry Juan, I won’t let you down! I’m going to become THE master, just watch.”");
            System.out.println("\033[3mCelui waves his final goodbye to Juan, he turns around and walks towards the proper gate. After waiting, it’s finally time for him to board the plane. Here we come, Germany!\033[0m");
            System.out.print("\033[1mCHAPTER 2 END \033[0m\n");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh2.nextLine();
        }

        public static void waitingRoomTwo(){
            Scanner scWait2 = new Scanner(System.in);
            int wrChoice; //Holds user's input for waiting room choice

            System.out.println("\033[1mWaiting room options (Type either 1, 2, or 3)\033[0m");
            System.out.println("""
                    [1] Go to Elderly Woman
                    [2] Go to Magazines
                    [3] Go to water dispenser
                    """);
            wrChoice = scWait2.nextInt();

            switch (wrChoice) {
                case 1 -> {
                    System.out.println("\033[3mThe waiting room only had a few people including Celui, but he was intrigued by one person in particular.\033[0m\n");
                    System.out.println("Celui: “Excuse me, ma’am? Are you participating in the challenge with Zwote Papier?”\n");
                    System.out.println("Elderly Woman: “You betcha!”\n");
                    System.out.println("\033[3mCelui smiles, he’s glad to see how this game can be loved by a person of any generation.\033[0m");
                    System.out.print("(Press 'ENTER' to continue.)\n");
                    scWait2.nextLine();
                    scWait2.nextLine();
                    System.out.println("Celui: “When did you start playing?”\n");
                    System.out.println("Elderly Woman: “I started playing it with my husband back when we were youngins’, I’ve been absolutely endeared to it ever since!”\n");
                    System.out.println("Celui: “That’s awesome! I hope I’m still as passionate as you are when I grow old.”\n");
                    System.out.println("\033[3mThe old woman chuckles.\033[0m");
                    System.out.println("Elderly Woman: “Hey! I’m still a foxy mama at heart! Don’t mention a ladies’ age young man.”\n");
                    System.out.println("\033[3mCelui laughs, this charming elder has left him feeling a bit less nervous about the upcoming fight with Zwote.\033[0m");
                    System.out.print("(Press 'ENTER' to continue.)\n");
                    scWait2.nextLine();
                }
                case 2 -> {
                    System.out.println("""
                            \033[3mThere are a few magazines laying on a table in the waiting room.\s
                            A lot of them seemed to be famous Rock-Paper-Scissors related, mostly about Zwote Papier.\033[0m
                            """);
                    System.out.println("Celui: “Yeesh.. How entitled must you be to keep articles about yourself in your own arena?”");
                    System.out.print("(Press 'ENTER' to continue.)\n");
                    scWait2.nextLine();
                    scWait2.nextLine();
                }
                case 3 -> {
                    System.out.println("\033[3mCelui goes to the water dispenser to get a fresh cup of water. After a sip, his nerves are soothed.\033[0m");
                    System.out.println("Celui: “Yummy”");
                    System.out.print("(Press 'ENTER' to continue.)\n");
                    scWait2.nextLine();
                    scWait2.nextLine();
                }
            }
        }

        public static void chapterThree(){
            Scanner scCh3 = new Scanner(System.in);
            String continueWR; //Holds user's input for if they want to keep looking at the waiting room

            System.out.print("\033[1mCHAPTER 3: THE PAPER \033[0m\n");

            System.out.println("\033[3mCelui steps outside of the airport, he’s finally made it. He takes a deep breath before starting his way towards Zwote’s arena.\033[0m");
            System.out.println("""
                    \033[3mThe outside of Zwote’s arena is just as full as Juan’s was.\s
                    It took a little push for Celui to make his way inside, he was stopped a couple of times by people who recognized him from the fight with Juan.\s
                    This made Celui feel flattered though, he loved talking to each person that wanted to talk about the fight or Rock-Paper-Scissors in general.\033[0m
                    """);
            System.out.println("\033[3mAfter that, Celui finally gets signed up for the fight against Zwote Papier… What to do?\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();

            waitingRoomTwo();
            System.out.println("Keep looking around the room?");
            System.out.println("If you would like to revisit your options, type 'yes'. If you'd like to move on to the battle type 'no'. ");
            continueWR = scCh3.nextLine();
            if (continueWR.equals("yes") || continueWR.equals("Yes")){ //This asks if the user wants to check another option in the switch
                waitingRoomTwo();
            }

            System.out.println("\033[3m“CELUI ROCHAMBEAU. YOU ARE UP NEXT, PLEASE WALK TO ARENA DOOR 131”\033[0m\n");
            System.out.println("""
                    \033[3mThe speaker announces this, catching Celui by surprise.\s
                    The wait was a lot longer last time, but it makes sense since there doesn't seem to be as many people going against Zwote today.\033[0m
                    """);
            System.out.println("""
                    \033[3mCelui starts to make his way towards arena door 131.\s
                    He’s nervous, but he feels much more confident about the battle against this master. He’s gone through this before, how hard could it be to do it again?\033[0m
                    """);
            System.out.println("\033[3mThe door is now in front of him, he reaches for the knob.\033[0m");
            System.out.println("Celui: “I can do this. This won’t be any different than before.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();
            System.out.println("""
                    \033[3mCelui turns the knob and goes through the door, he is greeted once more with a full crowd.\s
                    This doesn't seem to get old, the excitement of getting to perform in front of a crowd is on another level.\033[0m
                    """);
            System.out.println("\033[3mZwote Papier is seen in the middle of the arena, his legs kicked up on the table. He doesn't really seem to acknowledge Celui walking towards him.\033[0m");
            System.out.println("\033[3mCelui examines the table he sits at, it’s dark glossy surface is full of golden engravings all over. Never has he seen such a fine piece of furniture.\033[0m\n");
            System.out.println("Celui: “Hello?.. I’m Celui, Celui Rochambeau.”\n");
            System.out.println("\033[3mZwote looks up at Celui, unimpressed.\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();
            System.out.println("""
                    \033[3mZwote Papier is actually a really successful businessman.\s
                    At a young age, he inherited his father’s paper company and made it boom. The amount of wealth that Zwote holds can support his children, grandchildren, AND great grandchildren.\s
                    You may be wondering… how did he become an expert of Rock-Paper-Scissors?\s
                    After the growth of his father’s company, he realized he didn’t really have to do any work anymore.\s
                    He could hire others to do it all for him, he had money to do anything! This did bring up a problem…\033[0m
                    """);
            System.out.println("""
                    \033[3mHe grew increasingly bored. There was nothing else for him to do, so he turned to his only other passion… Rock-Paper-Scissors.\s
                    He played in tournaments for fun, just like most other players. Since Zwote had all the time in the world, he used it to improve his skill.
                    Eventually, this led him to become known by people all over the world, causing his eventual earning of the expert title.\s
                    To this day, his paper company is still used by corporations all over, which allows him to keep playing his games.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();
            System.out.println("Zwote: “Ah, yes.. You’re the one who called me out to millions on live television. I’m sorry to burst your bubble, but you aren't going to make it past me.”");
            System.out.println("Zwote: “Your little “dream”? How adorable! You really think you have a shot.. Listen, I’ve had people with quadruple your experience come against me and fail… What makes you think that you’ll be any different?”\n");
            System.out.println("\033[3mCelui scoffs, Zwote is so cold compared to Juan. Could it just be an act to intimidate him?\033[0m");
            System.out.println("Celui: “Well, first of all, I’m Celui Rochambeau. That already gives me an advantage.”\n");
            System.out.println("Zwote: “That… doesn't mean anything to me.”\n");
            System.out.println("\033[3mCelui grunts, this guy really doesn't know how to take a joke. Maybe he really is a big sourpuss.\033[0m");
            System.out.println("Celui: “Well alright wise guy, you’re the one underestimating me here. Why don’t we just fight it out so you can see what I’m truly capable of?”\n");
            System.out.println("Zwote: “That’s the best thing that’s come out of your mouth since you’ve arrived, let’s do this.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();

            bossTwoRound btr = new bossTwoRound();//Creates an instance of the class
            btr.bossTwo();//Calls method within that class ^

            System.out.println("\033[3mCelui jumps straight out of his chair and yells with glee.\033[0m");
            System.out.println("Celui: “WOOOOOOOOO! IN YOUR FACE! I hope you learned not to mess with ME! HAHA”\n");
            System.out.println("\033[3mAs Celui continues to rub in the victory, Zwote rolls his eyes and shrugs his shoulders.\033[0m\n");
            System.out.println("Zwote: “Alright, alright. You played well here today. I must admit that.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();
            System.out.println("\033[3mZwote proceeds to stand up, bitterly announcing:\033[0m");
            System.out.println("Zwote: “Everyone, please congratulate our newest winner, Celui Rochambeau.”\n");
            System.out.println("""
                    \033[3mThe crowd cheers in excitement, it’s hard for people to even make it to Zwote, let alone beat him!\s
                    Celui is feeling great, this really validates that he DOES have a talent. That Rock-Paper-Scissors truly is his passion…\033[0m
                    """);
            System.out.println("Zwote: “Would you like to say anything to the camera, Celui?”\n");
            System.out.println("Celui: “I guess you can say… Zwote was FOLDED….”\n");
            System.out.println("\033[3mZwote stares at Celui unamused.\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();
            System.out.println("Celui: “Man, do you ever have emotions?”\n");
            System.out.println("\033[3mZwote then escorts Celui to another room within the arena, presumably where he will receive his prize. Zwote walks back in with a check.\033[0m\n");
            System.out.println("Zwote: “This is for you, congratulations.”\n");
            System.out.println("Celui: “Thank you, Zwote. I appreciate you letting me fight you today.”\n");
            System.out.println("Zwote: “It’s my pleasure. Admittedly, I am quite impressed with your performance. You definitely exceeded my expectations.”\n");
            System.out.println("Celui: “Wow, positive words? From your mouth? This is truly a rarity.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();
            System.out.println("\033[3mZwote rolls his eyes.\033[0m");
            System.out.println("Zwote: “Stop buggin’ me with that, just accept the prize and compliment, okay? I don’t do this often.”\n");
            System.out.println("""
                    \033[3mCelui accepts the prize and gives Zwote his goodbye. He then proceeds to head to the airport to catch his flight to Japan.\s
                    Shosa Hasami is the last step Celui needs to achieve his dream, the hardest one of all.\033[0m
                    """);
            System.out.print("\033[1mCHAPTER 3 END \033[0m\n");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh3.nextLine();
        }

        public static void waitingRoomThree(){
            Scanner scWait3 = new Scanner(System.in);
            int wrChoice; //Holds user's input for waiting room choice

            System.out.println("\033[1mWaiting room options (Type either 1, 2, or 3)\033[0m");
            System.out.println("""
                    [1] Look around the room
                    [2] Go to water dispenser""");
            wrChoice = scWait3.nextInt();

            switch (wrChoice) {
                case 1 -> {
                    System.out.println("\033[3mCelui takes a look around the room, there’s nothing interesting to be seen. It’s eerily quiet, you’d probably be able to hear a pin drop.\033[0m\n");
                    System.out.println("\033[3mThe corners of the room seem to have a bit of cobweb built up, you’d think they’d try and clean things up a bit before someone appears..\033[0m");
                    System.out.print("(Press 'ENTER' to continue.)\n");
                    scWait3.nextLine();
                    scWait3.nextLine();
                }
                case 2 -> {
                    System.out.println("\033[3mCelui goes to the water dispenser to get a fresh cup of water. After a sip, his nerves are soothed.\033[0m");
                    System.out.println("Celui: “Yummy”");
                    System.out.print("(Press 'ENTER' to continue.)\n");
                    scWait3.nextLine();
                    scWait3.nextLine();
                }
            }
        }

        public static void chapterFour(){
            Scanner scCh4 = new Scanner(System.in);
            String continueWR; //Holds user's input for if they want to keep looking at the waiting room

            System.out.print("\033[1mCHAPTER 4: THE SCISSORS \033[0m\n");

            System.out.println("""
                    \033[3mAs Celui steps out of the airport, he takes a moment to admire the view in front of him.\s
                    Cherry blossoms surround the building, petals raining from the sky. It's so gorgeous.\033[0m
                    """);
            System.out.println("Celui: “Wow… The scenery in Japan is amazing…”\n");
            System.out.println("""
                    \033[3mAfter taking in the view, Celui then starts to make his way towards Shosa’s arena. Once he got closer, Celui noticed the size of it.\s
                    This arena was at least double, maybe even triple the size of the other two expert’s arenas.\s
                    What seemed to be thousands of cars filled the parking lot. It makes sense since she doesn't get to play often, nobody wants to miss a match of hers.\033[0m""");
            System.out.println("""
                    \033[3mCelui pushes his way through the ocean of people trying to get in, once he does he enters the waiting room.\s
                    It’s quiet, no one else is in here… Is there even anything to do?\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();

            waitingRoomThree();
            System.out.println("Keep looking around the room?");
            System.out.println("If you would like to revisit your options, type 'yes'. If you'd like to move on to the battle type 'no'. ");
            continueWR = scCh4.nextLine();
            if (continueWR.equals("yes") || continueWR.equals("Yes")){ //This asks if the user wants to check another option in the switch
                waitingRoomThree();
            }

            System.out.println("\033[3m“CELUI ROCHAMBEAU. YOU ARE UP, PLEASE WALK TO ARENA DOOR 253”\033[0m\n");

            System.out.println("""
                    \033[3mCelui jumps a bit, the speaker broke the silence within the waiting room.\s
                    His heart starts to race, it’s finally time to go against the final expert. He begins to walk towards arena door 253.\033[0m
                    """);
            System.out.println("""
                    \033[3mAs he steps in front of the door, he shakily places his hand on the knob. This opportunity to go against Shosa… it feels unreal.\s
                    This match will either make or break his dream, it could change his entire life.\s
                    To be the one to defeat Shosa… who knows what opportunities this will open.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    \033[3mCelui opens the door, greeted with a grand set up. This crowd is the biggest he’s been in front of, tens of cameras everywhere, speakers bumpin' out music.\s
                    It was cool seeing this on TV from home, but witnessing it in person is just... a completely different experience.\033[0m
                    """);
            System.out.println("\033[3mShosa is seen at the center of the arena at a metal table, it’s legs in the shape of scissors. It’s surface seemed to have different drawings of scissors in many shapes and sizes.\033[0m\n");
            System.out.println("""
                    \033[3mCelui takes a better look at Shosa herself, he can’t believe he’s about to meet her face to face.\s
                    Her stare almost felt like a glare, maybe it’s supposed to be a look of intimidation, but she looks a bit annoyed.\033[0m
                    """);
            System.out.println("""
                    \033[3mNot much is publicly known about Shosa Hasami. Her family is incredibly wealthy, but no one knows how they got the money.\s
                    Shosa one day started to compete in Rock-Paper-Scissors tournaments, within a year she had already become the best Rock-Paper-Scissors player in the world.\s
                    This skill was noticed by millions across the world, she is an inspiration to many young people who want to make this game their life.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    \033[3mNow you may be asking, how did the experts even form together? Well, Shosa’s family realized how well she was doing within this game.\s
                    They took it upon themselves to fund the creation of these special tournaments, Shosa was the one to choose two other experts to rule the game with her.\s
                    Her family kept recommending people for Shosa to nominate, the only way to settle it was for her to fight them herself.\s
                    Zwote and Juan are the only two people to be able to tie with Shosa, which is what gave them their roles today.\s
                    After this, the league of the experts became a reality. This helped push Rock-Paper-Scissors to become even more popular in recent years.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("Shosa: “You know, everyone who comes here is usually a lot older than you.”\n");
            System.out.println("Celui: “That’s funny considering you aren't much older than me.”\n");
            System.out.println("\033[3mShosa chuckles, she picks at her nails whilst talking to Celui\033[0m");
            System.out.println("Shosa: “It’s been weeks since I’ve had my last opponent, it gets boring in here.. I appreciate the company, too bad it’ll be very short.”\n");
            System.out.println("""
                    \033[3mCelui groans.\033[0m\s
                    Celui: “You sound just like everyone else… always undermining me. Well, don’t think I’ll give up to the likes of you so easily.“""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("Shosa: “HAHA! How charming, you’re just like everyone else who has walked in here.. I hate kids like you, so bratty and entitled. Always barking, but honey, where’s the bite?”\n");
            System.out.println("\033[3mShosa proceeds to get her arm ready on the table, waiting for Celui to do the same.\033[0m\n");
            System.out.println("Celui: “Just watch me, I’ll give you a bite you’ll never forget.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();

            bossThreeRound bthr = new bossThreeRound();//Creates instance of the class
            bthr.bossThree();//Calls method from the class ^

            System.out.println("\033[3mA sigh emits from Shosa.\033[0m\n");
            System.out.println("Celui: “I..”\n");
            System.out.println("\033[3mCelui chokes on his words. He wants to rub it in, but he’s just in shock. He beat Shosa Hasami, the FIRST TO EVER BEAT HER!\033[0m");
            System.out.println("\033[3mThe crowd is the loudest it’s ever been, the news is flooding everywhere. Soon, Celui’s name is known by many all over the world.\033[0m\n");
            System.out.println("Celui: “It was an honor to defeat you, Shosa. I told you not to underestimate me.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("Shosa: “I’m impressed, you really did have it in you. Follow me Celui, I’ll take you to the resting room before you come back out to be crowned THE master.”\n");
            System.out.println("\033[3mCelui is still taking it all in, it really does feel like a dream. He follows Shosa to one of the rooms.\033[0m\n");
            System.out.println("Shosa: “Congratulations, Celui. Thank you… thank you for winning.”\n");
            System.out.println("\033[3mCelui looks at her confused, why is she thanking me? Shouldn't she be mad? I just took her winning streak!\033[0m");
            System.out.println("Celui: “I’m a bit confused, why are you so happy? I appreciate the kind words but shouldn't you be devastated?”\n");
            System.out.println("""
                    \033[3mShosa stares at Celui blankly, after a few moments she speaks up.\033[0m\s
                    Shosa: “Alright.. Since you beat me I’ll tell you the truth, the truth about me and my family.”""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    \033[3mShosa revealed everything. Her family is actually one of the most powerful yakuza groups in all of Japan, which explains the wealth.\s
                    This group is known by many, but no one knows who truly runs it. There are rumors that their power can go as far as manipulating police and politicians.\s
                    Shosa is one of three sisters, born from the current leader of this yakuza clan.\s
                    Unfortunately, as the youngest child, she received very little attention, love, and support from her parents.\033[0m
                    """);
            System.out.println("""
                    \033[3mHer eldest sister inherited a large portion of the yakuza clan to control, whilst her second sister is a very well known politician loved by many in Japan.\s
                    Shosa, on the other hand, was forced into the game known as Rock-Paper-Scissors.\s
                    She soon became extraordinary due to the many hours she was forced to play each day. This is how she became so good after only a year.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    \033[3mWhat’s worse is that she was forced to go to her arena each day, even though no one would usually be there to challenge her.\s
                    With the opponents that did come up against her, she always hoped that they would beat her.\s
                    She felt sad each time she won, she knew that she was crushing their dreams and that she’d also have to continue sitting there waiting.\s
                    Shosa hoped that one day these opponents would return to try again, but they never did. As ironic as it is, she was the one to feel defeated after winning.\033[0m
                    """);
            System.out.println("""
                    \033[3mThere’s been many times where she wanted to purposely throw the game, but her family would notice such an obvious thing.\s
                    Everyday she wished for an opponent to finally beat her and take the throne.\s
                    She wished that she was actually passionate about this game, and wished she didn't possess the skill.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    \033[3mShosa tells Celui some nice things though, about how some of the opponents she defeated still had their name known within the Rock-Paper-Scissors community.\s
                    These people have been able to open their own local arenas for anyone to join, they continued to spread their passion even after being defeated.\s
                    She’s glad that she’s been able to cause a good impact out of all the bad ones.\033[0m
                    """);
            System.out.println("Celui: “Wow.. I’m so sorry Shosa. You really didn't deserve to go through all this.”\n");
            System.out.println("""
                    \033[3mShosa shares a slight smile\033[0m\s
                    Shosa: “I appreciate it, Celui. That’s why I am so relieved that you won, your win might be able to make a difference.”\s
                    \033[3mShosa checks the time and gasps.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    Shosa: “Oh boy, we have to start going out again for your speech and reward! I didn't realize how much time went by”\s
                    \033[3mShosa quickly gets up and grabs Celui by the arm, she begins to drag him out to the main arena room.\033[0m
                    """);
            System.out.println("\033[3mThis reveal doesn't sit right with Celui. So far, this isn’t exactly what he imagined it to be..\033[0m\n");
            System.out.println("\033[3mShosa and Celui stand at the center of the arena, the crowd going wild. Shosa begins to speak up.\033[0m\n");
            System.out.println("Shosa: “This is Celui Rochambeau, the first player to ever defeat me. Please, give him a round of applause everyone!”\n");
            System.out.println("\033[3mAs the crowd gets louder, Celui’s focus seems to waver. This doesn't feel right.\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("Shosa: “Before we crown him as THE master, the winner is allowed to give a small speech. Celui, you’re up.”\n");
            System.out.println("\033[3mThe crowd gets quiet for Celui, everyone wondering what THE master is about to say..\033[0m\n");
            System.out.println("Celui: “Hello, everyone. As stated before, I’m Celui Rochambeau… But.. I can’t accept this prize.”\n");
            System.out.println("\033[3mThe crowd is full of gasps, Shosa’s eyes grow wide.\033[0m");
            System.out.println("Shosa: “Celui?...”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    Celui: “This.. This is what I thought my dream was. To defeat all the experts and become THE master.. But that made me realize I would have to stop doing what I love as often..\s
                    I can’t sit around and wait for people to come to me, I want to go out and fight people myself!”""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    Celui: “The opportunities I have been given, I will never forget and will always be grateful. Rock-Paper-Scissors will forever be my life, my true passion? My true dream?\s
                    Is to be able to continue traveling, to continue meeting others who share the same passion with me.”
                    """);
            System.out.println("Celui: “I used to be scared, scared to fight for my passion. Until one day, I just said screw it. Since then, my life has changed drastically.” \n");
            System.out.println("""
                    Celui: “Please, anyone who is going through the same thing.. Don’t be afraid to do what you love, take the risk. If you want to be standing where I am right now? Go for it.\s
                    Even if you fail, you can always get up and try again! We should all be able to do what we love.. Don’t let a few losses bring you down.”""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    \033[3mThe audience stays silent. Celui started feeling embarrassed, was what he said bad? Soon, one person starts to clap, then a few more, a hundred more, and eventually the whole crowd is clapping.\s
                    People cheered on Celui just as much as before, Shosa pats Celui on the back.\033[0m
                    """);
            System.out.println("Shosa: “That was really sweet, I guarantee you’ve inspired many people out here tonight.”\n");
            System.out.println("\033[3mShosa soon takes Celui out of the main room, they speak one last time before Celui departs.\033[0m\n");
            System.out.println("Celui: “I’m sorry for not accepting the reward, Shosa.. I.. really hope that you don’t continue being stuck here.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
            System.out.println("""
                    \033[3mTears start to roll down her face, she wipes them as they start to fall.\033[0m\s
                    Shosa: “Celui, all that matters is that you beat me.You’ve still saved me from this hell, my family won’t keep me here for long knowing them. You screw up once and you still get penalized.\s
                    Which, I will happily accept because my family will now have to put me in a different career. It will take time so I’ll be able to do as I please until then.”
                    """);
            System.out.println("""
                    \033[3mCelui and Shosa share a hug before they part ways. He’s happy to have made an impact in someone’s life for the better.\s
                    Now, he can continue to follow his passion. But first, there is other business to attend to…\033[0m
                    """);

            System.out.print("\033[1mCHAPTER 4 END\033[0m\n");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scCh4.nextLine();
        }

        public static void epilogue(){
            Scanner scEp = new Scanner(System.in);

            System.out.print("\033[1mEPILOGUE\033[0m\n");

            System.out.println("\033[3mIt’s a sunny morning. Celui walks up to a familiar doorstep, feeling way more nervous than any Rock-Paper-Scissors match he’s had to do.\033[0m\n");
            System.out.println("Celui: “I wonder.. Have they heard the news?”\n");
            System.out.println("\033[3mCelui knocks on the door shakily. Soon after, it opens.\033[0m\n");
            System.out.println("Mom: “Oh.. oh my son! Celui!”\n");
            System.out.println("""
                    \033[3mShe immediately hugs onto him, crushing his lungs. But it’s okay because he really missed her too.\033[0m\s
                    Mom: “We all missed you so much Celui, I’m so happy you’re safe.. Please come in, everyone's in the living room.”""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scEp.nextLine();
            System.out.println("\033[3mCelui’s mom leads him towards everyone else in the house, his presence catches them all off guard. Soon, everyone is coming in for a hug.\033[0m\n");
            System.out.println("Dad: “Celui.. I’m so glad you returned. We didn't know if you would after what you said in your speech yesterday.”\n");
            System.out.println("\033[3mCelui’s eyes filled with tears, they did watch him.\033[0m");
            System.out.println("Celui: “Of course I did, I missed you all so much.. I just had no choice.. There wasn't any other way I could’ve proved it to you guys.”\n");
            System.out.println("\033[3mCelui then has the realization that he didn't actually accept the reward, so did he really prove it to them?\033[0m");
            System.out.println("Celui: “I.. I did prove it to you guys, right? I know I didn't accept the rew-”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scEp.nextLine();
            System.out.println("""
                    \033[3mCelui gets cut off by his dad.\033[0m\s
                    Dad: “Son, you proved it to us after your first match. Watching you play.. It was mesmerizing.\s
                    I’m sorry that we grounded you.. We didn't realize how serious this game could be.”
                    """);
            System.out.println("Mom: “We love you, Celui. We want to fully support you in what YOU want to do. This taught us how determined you are to achieve your goals, you are truly amazing.\n");
            System.out.println("""
                    \033[3mTears are definitely falling now, Celui is so happy. He finally got the approval and support he wanted.\s
                    Although he is happy to be home, this does give him the opportunity to talk about his next move…\033[0m
                    """);
            System.out.println("Celui: “Thank you so much for these words, it means more than you could imagine. This is going to be hard to say… but my visit here is only temporary..”\n");
            System.out.println("Celui: “I hope you understand, but I meant it when I said I was going to continue traveling around the world to meet others with this same passion.”");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scEp.nextLine();
            System.out.println("\033[3mCelui’s parents stare at each other briefly, his father looks back at Celui and says:\033[0m");
            System.out.println("Dad: “Well.. We did say we’d support you from here on out. If this is truly what you want son, go for it.”\n");
            System.out.println("""
                    \033[3mHis mom quickly chimes in:\033[0m\s
                    Mom: “Just keep in contact! We’ve already missed you so much as it is, we’d appreciate it if you called every now and then.”
                    """);
            System.out.println("Celui: “Of course, I’d love to know what’s going on here too!”\n");
            System.out.println("""
                    \033[3mAfter staying for a few hours, Celui prepares to leave once more.\s
                    After saying his goodbyes to his family, he steps out in front of his house and takes one last look at it.\033[0m""");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scEp.nextLine();
            System.out.println("Celui: “Well.. Here I am once more. The second time I step away to pursue my passion.”\n");
            System.out.println("""
                    \033[3mCelui turns around and starts walking down the same road he went down the first time he left.
                    This is where his journey truly begins.\033[0m
                    """);
            System.out.println("\033[3mHis name is Celui, Celui Rochambeau. The passionate Rock-Paper-Scissors player!\033[0m");
            System.out.print("(Press 'ENTER' to continue.)\n");
            scEp.nextLine();

            System.out.print("\033[1mEPILOGUE END\033[0m\n");
            System.out.println("Thank you for playing!");
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int titleChoice; //To choose either option 1 or 2 on the title screen

            System.out.println("Welcome to Rochambeau! Type one of the options below (1 or 2)");
            System.out.println("""
                    [1] Story Mode
                    [2] Free Play""");
            titleChoice = sc.nextInt();

            switch (titleChoice) {
                case 1 -> {
                    introduction(); //Calling introduction method
                    chapterOne(); //Calling chapterOne method
                    chapterOneHalf(); //Calling chapterOneHalf method
                    chapterTwo(); //Calling chapterTwo method
                    chapterThree();//Calling chapterThree method
                    chapterFour();//Calling chapterFour method
                    epilogue();//Calling epilogue method
                }
                case 2 -> {
                    rockPaperScissorsGame rps = new rockPaperScissorsGame(); //Sets name of opponent and amount of rounds
                    rps.rockPaperScissors(); //Starts match
                }
            }
        }
    }