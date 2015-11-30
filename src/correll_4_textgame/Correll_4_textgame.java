package correll_4_textgame;

import java.util.Scanner;

public class Correll_4_textgame {

    static boolean youWin = false;
    static boolean youLose = false;
    //Win and Lose conditions start here
    static boolean repeat = false;
    //Does a certain section need to be repeated, depending on your answer?
    static boolean mf = false;
    //Male or Female
    static boolean fav = false;
    //Your favorite food
    static boolean sardines = false;
    static boolean kibble = false;
    //Some pet food you will find along the way
    static String playername;
    static String gender;
    static String favfood;
    static String favcol;
    static String favpet;
    //Player's name, gender, and favorites
    static String response;
    //Response to questions
    static String tpp;
    static String tppp;
    static String tpop;
    //These determine what is placed in a sentence depending on the player's gender

    public static void main(String[] args) {
            profile();
            one();
            two();
            three();
            four();
            five();
            finale();
            //All of my methods
        }
    

    static void profile() {
        System.out.println("The world is ending. Buildings crumble, and the population dwindles. "
                + "\n What caused all of this destruction and ruin? The war. The war that attempted "
                + "to end the feud between cats and dogs. \n It began with an old woman who lived in "
                + "Addison, Texas, a small town with only a Vintage Aircraft Museum to its name. \n One day, "
                + "her cat, Walter, went out for his morning stroll when the neighbor’s doberman skidded around "
                + "the street corner. \n According to the stories, the doberman’s vicious canines ripped poor Walt apart, "
                + "causing an uproar through the nation. \n “Dogs are too dangerous,” the cat-lovers cried, "
                + "“they need to be chained!”. “Cats are too cold,” the dog-lovers barked, “dogs will always be by our side!”. "
                + "\n No one could agree. Riots broke out on the streets. People fought, people fell. "
                + "Others hid, ran. People disappeared. Animals disappeared. \n By the time the arguments cooled down,"
                + " there were no more people to argue with, and no more pets to argue about. \n "
                + "Those left seeked to return to the days when cats and dogs could live in relative peace with one another. \n "
                + "To do this, they had to find what was left of the cats and the dogs. You were one of these people, "
                + "looking for the last pet on the planet. \n Will you find a cat or a dog? Which pet will finally win? \n");
        Scanner name = new Scanner(System.in);
        System.out.println("Player's Name Is...");
        playername = name.nextLine();
        //What's the player's name?
        Scanner sex = new Scanner(System.in);
        boolean goodanswer = false;
        while (!goodanswer) {
            System.out.println("Player's Gender Is...");
            gender = sex.nextLine();
            if (gender.contains("F") || gender.contains("f")) {
                goodanswer = true;
                mf = false;
                tpp = "she";
                tppp = "her";
                tpop = "her";
            } else if (gender.contains("M") || gender.contains("m")) {
                goodanswer = true;
                mf = true;
                tpp = "he";
                tppp = "his";
                tpop = "him";
            } else {
                System.out.println("I don't understand. \n");
            }
        }
        //Determines the player's gender depending on what you type

        Scanner food = new Scanner(System.in);
        System.out.println("Player's Favorite Food Is...");
        favfood = food.nextLine();
        Scanner color = new Scanner(System.in);
        System.out.println("Player's Favorite Color Is...");
        favcol = color.nextLine();
        Scanner pet = new Scanner(System.in);
        if (!mf) {
            System.out.println("\n Character Profile: \n Name: " + playername + "\n Gender: Female \n Favorite Food: " + favfood + "\n Favorite Color: " + favcol + "\n");
        } else {
            System.out.println("\n Character Profile: \n Name: " + playername + "\n Gender: Male \n Favorite Food: " + favfood + " \n Favorite Color: " + favcol + "\n");
        }
    }
    //Shows what the player as typed and chosen as their profile
        
    static void one() {
        if (!mf) {
            System.out.println(playername + " is standing in " + tppp + " home, if " + tpp + " could call it that, with its tattered furniture and stained walls. " + playername + " has been preparing for days, gathering food and supplies, to go and find the last pet. \n Will " + tpp + " find a cat or a dog? All of " + tppp + " actions will determine " + tppp + " story, so " + playername + " must be careful, and attempt to make the right decisions. \n");
        } else {
            System.out.println(playername + " is standing in " + tppp + " home, if " + tpp + " could call it that, with its tattered furniture and stained walls. " + playername + " has been preparing for days, gathering food and supplies, to go and find the last pet. \n Will " + tpp + " find a cat or a dog? All of " + tppp + " actions will determine " + tppp + " story, so " + playername + " must be careful, and attempt to make the right decisions. \n");
        }
        //Sentences are altered depending on the player's gender
        
        Scanner zero = new Scanner(System.in);
        boolean goodanswer = false;
        while (!goodanswer) {
        System.out.println("Is " + playername + " ready to go?");
        response = zero.nextLine();
        if (response.contains("Y") || response.contains("y")) {
            System.out.println("\n" + playername + " opens the door to the outside world, carrying all of " + tppp + " belongings to the car.");
                goodanswer = true;
        } else if (response.contains("N") || response.contains("n")) {
            System.out.println("\n" + playername + " , fearing the outside world, remains in " + tppp + " home, and lives the rest of " + tppp + " life, locked away, never to see the sun again.");
            youLose = true;
            System.exit(0);
            //The player has already lost the game
        } else {
            System.out.println("I don't understand. \n");
        }
        }
    }
    //First decision: every method is a new decision
    
    static void two() {            
        System.out.println(tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " started up the old truck, the engine roaring. " + playername + " feared that " + tpp + " would be approached, so " + tpp + " rolled down the ruined street, driving east. \n" + tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " looked at " + tppp + " map, where the marker sat on Addison, Texas. This is where " + tpp + " needed to go, and this is where " + tppp + " journey truly began. \n");
        Scanner first = new Scanner(System.in);
        boolean goodanswer = false;
        while (!goodanswer) {
        System.out.println("As " + playername + " drives along, " + tpp + " hears a loud thump. Does " + tpp + " investigate the noise, or leave?");
        response = first.nextLine();
        if (response.contains("I") || response.contains("i")) {
            System.out.println(playername + " gets out of the car to investigate, and finds a trash can on the side of the road, dented from where " + tpp + " hit it. Inside, " + playername + " finds a can of sardines. " + tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " gets back in the car and continues driving. \n");
                goodanswer = true;
                sardines = true;
                //This is what you recieve after taking this route
        } else if (response.contains("L") || response.contains("l")) {
            System.out.println(playername + " continues driving down the street. \n");
                goodanswer = true;
        } else {
            System.out.println("I don't understand. \n");
        }
        }
    }

    static void three() {
        System.out.println(tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " comes across a wide, abandoned field with dead grass and flat hills. " + tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " knows this is where " + tpp + " needs to be.");
        Scanner second = new Scanner(System.in);
        boolean goodanswer = false;
        while (!goodanswer) {
        System.out.println("As " + playername + " drives down the street, the sound of a gunshot rings out across the open plains. Does " + tpp + " get out of the car, or will " + tpp + " drive away?");
        response = second.nextLine();
        if (response.contains("G") || response.contains("g")) {
            System.out.println("A woman with a revolver runs up from behind a bush and grazes " + playername + "'s shoulder. Before " + playername + " can retaliate, the woman sprints away. " + playername + " uses one of " + tppp + " five medkits. " + tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " gets back in the car and continues driving. \n");
                goodanswer = true;            
        } else if (response.contains("D") || response.contains("d")) {
            System.out.println(playername + " continues driving down the street. \n");
                goodanswer = true;        
        } else {
            System.out.println("I don't understand. \n");
        }
        }
    }

    static void four() {
        System.out.println(playername + " made it to Fortworth, Texas after six days of travel. " + tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " is running low on " + tppp + " favorite food, " + favfood + ", but has plenty of water.");
        Scanner third = new Scanner(System.in);
        boolean goodanswer = false;
        while (!goodanswer) {
        System.out.println(tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " spots a grocery store in " + tppp + " peripheral vision. Does " + tpp + " go to the grocery store?");
        response = third.nextLine();
        if (response.contains("Y") || response.contains("y")) {
            System.out.println(tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " turns the corner and pulls up into the parking lot of the store. Carts litter the pavement, tipped over and empty. \n" + playername + " opens the wide doors, and locates a box of " + favfood + " on the second aisle. However, the pet food aisle is wiped clean. \n" + tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " gets back in the car and continues driving. \n");
                goodanswer = true;            
                fav = true;
                //This is what you recieve after taking this route
        } else if (response.contains("N") || response.contains("n")) {
            System.out.println(playername + " continues driving down the street. \n");
                goodanswer = true;        
        } else {
            System.out.println("I don't understand. \n");
        }
        }
    }
    

    static void five() {
        System.out.println(playername + " has made it to Highway 635, the North Lake far behind " + tppp + ". A shopping outlet becomes visible, the signs broken down and dull.");
        Scanner first = new Scanner(System.in);
        boolean goodanswer = false;
        while (!goodanswer) {
        System.out.println(tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " turns into the outlet, avoiding the cars that litter the grounds. She drives by an abandoned Petco, the sliding doors jarred open. Does " + tpp + " enter? Or does " + tpp + " leave?");
        response = first.nextLine();
        if (response.contains("E") || response.contains("e")) {
            System.out.println(playername + " enters Petco, and a low groal echos through the store. To " + tppp + " suprise, the growl is coming from a person, standing ten feet from the doors. He lunges out to bite " + playername + ", but " + tpp + " pushes him away. He falls back and hits his head, knocked unconcious. " + playername + " finds a bag of kibble in the back aisle. " + tpp.substring(0, 1).toUpperCase() + tpp.substring(1) + " gets back in the car and continues driving. \n");
                goodanswer = true;
                kibble = true;
                //This is what you recieve after taking this route
        } else if (response.contains("L") || response.contains("l")) {
            System.out.println(playername + " continues driving back to the highway. \n");
                goodanswer = true;
        } else {
            System.out.println("I don't understand. \n");
        }
        }
    }
    
    static void finale() {
        Scanner finale1 = new Scanner(System.in);
        boolean goodanswer = false;
        while (!goodanswer) {
            System.out.println(playername + " has finally made it to Addison, Texas, " + tppp + " supply running low. After a few more hours of driving, the address has come into view, the exterior paint of the house faded. " + playername + " opens the unlocked door, the hinges moaning in disagreement. As " + tpp + " walks through the abandoned home, a low meow echoes through the halls. An orange tabby strolls up to " + playername + " its eyes wide with curiosity. " + playername + " knows " + tppp + " has the food to feed the cat, even if it is all " + tppp + " has left. Does " + tppp + "?");
            response = finale1.nextLine();
            if (response.contains("Y") || response.contains("y") && sardines) {
                System.out.println("The cat comes closer as " + playername + " gives it the food, and " + playername + " sees the cat's collar. The cats name is Walter. This is the end of " + playername + "'s quest.");
                youWin = true;
                System.exit(0);
                //Player wins the game
            } else if (response.contains("N") || response.contains("n") && sardines) {
                System.out.println(playername + " stares at the cat, refusing to give up " + tpp + " food. The cat hisses at you and runs away.");
                youLose = true;
                System.exit(0);
                //Player loses the game
            } else if (!sardines) {
                System.out.println("The cat grows hungry, and dies of starvation.");
                youLose = true;
                System.exit(0);
                //Player loses the game
            }
    }
}
}
