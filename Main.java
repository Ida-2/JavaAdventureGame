import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);
    Scanner enterScan = new Scanner(System.in);

    int playerHp;
    int choice;

    String name;
    String playerWep;

    public static void main(String[] args) {

        Game start;
        start = new Game();
        start.playerSetUp();
        start.gate();
        start.castleTown();
        start.evening();
        start.horse();
        start.onRun();
        start.castle();
        start.WalkCastle();
        start.InsideCastle();
        start.princess();
        start.escOne();
        start.escTwo();
        start.escThree();
        start.four();
        //start.end();
    }

    public void playerSetUp() {

        playerHp = 100;
        playerWep = "dirty underpants";

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Your stats: ");
        System.out.println("Your hp: " + playerHp);
       // System.out.println("You are carrying: ");
        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println("What is thy name, horse feces?");
        System.out.println("");
        name = scan.nextLine();

        System.out.println("What is your weapon of choice?");
        playerWep = scan.nextLine();

        System.out.println("");
        System.out.println("Oh really, " + name + ". how ghastly of your mama and papa- to curse thee with thy name!");
        System.out.println("And " + playerWep + " what a crude weapon of choice! tsk tsk tsk. ");
        System.out.println("There are naught one reason to stand and mope around, " + name + ". We shall start thy game!");
        System.out.println("---------------------------------------------------------------------------------------------");

    }

    public void gate() {

        System.out.println("");
        System.out.println("You are standing outside of the gates outside of the town. Two guards stands in front of the entrance.");
        System.out.println("The two guards looks at you, disgusted. Doesn't seem like their letting you in.");
        System.out.println("");
        System.out.println("Guard: Hello there. Is that your face posted on that wanted sign? Your name is " + name + " right?");
        System.out.println("");
        System.out.println("What will you do?");
        System.out.println("");
        System.out.println("1: telling them a joke?");
        System.out.println("2: try to attack the guards!");
        System.out.println("3: Run like the hedge-born, that you are.");
        System.out.println("");

        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println(name + ": Why was the court jester almost executed? Because the Queen got the joke at the last moment!" +
                    " The guards laughed at your joke, but judged you for your lack of intelligence. They let you pass.");
        }
        if (choice == 2) {
            System.out.println("You pull out your " + playerWep + ". " + name + ": I will take you both o-");
            System.out.println("you were sliced by the guard before you could finished your sentence.");
            System.out.println("");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            gate();
        }
        if (choice == 3) {
            playerHp = playerHp - 10;
            System.out.println("You panicked and started to run. " +
                    "You were so blind by your own fear that you got run over by a carriage" +
                    "you lost 10 hp, but you survived.");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("your current stats:");
            System.out.println("Your hp: " + playerHp);
            System.out.println("You are carrying: " + playerWep);
        }
    }

    public void castleTown() {
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("You stand now at the middle of the town square.");
        System.out.println("If you go north, you shall end up at the castle");
        System.out.println("If you go to the west, you will end up at the brothel");
        System.out.println("Or if you prefer you can go to the east. End up in a mysterious back ally");
        System.out.println("Or return back south.");
        System.out.println("");
        System.out.println("Where do you go?");
        System.out.println("");
        System.out.println("1: North.");
        System.out.println("2: South?!");
        System.out.println("3: West!");
        System.out.println("4: East?");

        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println(name + ": North! Of course, its the obvious answer! " +
                    "You said as you venture off. You suddenly see that there is a massive crowd of protesters that" +
                    "comes storming towards you. You get trampled on, and suffocates to death.");
            System.out.println("");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            castleTown();
        }
        if (choice == 2) {
            System.out.println("For some odd reason you went back to the gate. Why? Are you daft? Go back, you idiotic bedswerver!");
            System.out.println("");
            System.out.println("You insulted the author, you shall try again!");
            enterScan.nextLine();
            castleTown();
            System.out.println("");
        }
        if (choice == 3) {
            playerHp = playerHp - 35;
            System.out.println("You decided to head straight for the brothel! You decided to spend the night with a handful of people." +
                    "your crotch itches, and you feel awful, yet in heaven!. You loose 35 hp!");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("your current stats:");
            System.out.println("Your hp: " + playerHp);
            System.out.println("You are carrying: " + playerWep + " and sexual diseases.");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");
        }
        if (choice == 4) {
            System.out.println(name + ": HAH! A sketchy, dark and scary ally? I smell the adventure from here!");
            System.out.println("you walk in there proudly, with your head held high");
            System.out.println("Someone grabs you from behinds and takes you further inn");
            System.out.println("Your body was never found, and you probably died a horrific death. ");
            System.out.println("");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            castleTown();
        }
    }
    public void evening() {
        System.out.println("");
        System.out.println("It's turning dark. You are exhausted, after a long day. You are itching and feel even worse.");
        System.out.println("You see an inn near by, but you don't have any gold in your pockets.");
        System.out.println("What shall you do?");
        System.out.println("");
        System.out.println("1: Sleep on the street.");
        System.out.println("2: Sneak into the inn.");
        System.out.println("3: Go back to the brothel");

        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("You found a corner in the slump");
            System.out.println("sadly someone emptied their night potty out of their window, and splashed you with it.");
            System.out.println("You caught e-coli and died in a pretty shitty way.");
            System.out.println("");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            evening();
        }
        if (choice == 2) {
            System.out.println("You took your " + playerWep + " out and walked to the inn.");
            System.out.println("You walked slowly inn, and you see a sleeping man, behind the counter.");
            System.out.println("You stepped on a mousetrap, and screamed. The man woke up and shoot you with his crossbow.");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            evening();
        }
        if (choice == 3) {
            System.out.println(name + ": nah, I shall head back, and have a good time");
            System.out.println("");
        }
    }
    public void horse() {
        System.out.println("As you walked towards the brothel, you hear men yelling, and horse shoes clacking hard on the cobblestone street.");
        System.out.println("");
        System.out.println("Unknown female voice: Watch out!");
        System.out.println("The hooded female on the horse crashes onto you.");
        System.out.println("The woman, horse and you went tumbling.");
        System.out.println("");
        System.out.println("What do you do?");
        System.out.println("");
        System.out.println("1: you take the horse and the lady and runs off");
        System.out.println("2: You scream in pain!");


        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("Luckily you lived with horses for many years, so you got on the horse, calmed it.");
            System.out.println("You grabbed the half unconscious female. And rode away with the limpy woman.");
            System.out.println("");
        }

        if (choice == 2) {
            System.out.println("The horse gets up, frightened by your loud noises, and tramples you.");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            horse();
        }
    }
    public void onRun() {
        playerHp = playerHp + 30;
        System.out.println("");
        System.out.println("You rode on the horse long enough that the guards gave up on you.");
        System.out.println("You have no idea why you did this, or how to get out this. But here you are.");
        System.out.println("The mysterious woman started to wake up, and looks up at you.");
        System.out.println("");
        System.out.println("Unknown woman: Thanks, whoever you are. I guess.");
        System.out.println("");
        System.out.println("You stare at her, and think to yourself this isn't bad at all!");
        System.out.println("Before you knew it, she suddenly had teeth, and tore your face off!");
        System.out.println("You woke up in the slum, back at the castle town.");
        System.out.println("You have now anxiety, but you healed due to the rest you got!");
        System.out.println("");
    }

    public void castle() {
        playerHp = playerHp - 10;
        System.out.println("");
        System.out.println("You are now extremely cold, and wet. You realized your pillow was a bundle of horse shit. ");
        System.out.println("You loose 10 hp from utterly disgust from the smell. ");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("your current stats:");
        System.out.println("Your hp: " + playerHp);
        System.out.println("You are carrying: " + playerWep + ", crippling anxiety and sexual diseases while being covered in horse dung.");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("The town square started to fill up. The stalls were up and running.");
        System.out.println("A tiny man, in fancy clothing came riding into the square and spoke thus: ");
        System.out.println("");
        System.out.println(" Tiny man in fancy clothing: Hear ye, hear ye.");
        System.out.println("The castle has been taken, the kingdom has fallen.");
        System.out.println("The one who saves the princess of the bandits,");
        System.out.println("gets the kingdom and the princess!");
        System.out.println("");
        System.out.println("Will you save the princess?");
        System.out.println("");
        System.out.println("1: No.");
        System.out.println("2: Yes.");

        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("Are you daft? You don't want the princess? Are you queer " + name + "? Dear god.");
        }
        if (choice == 2) {
            System.out.println("You grin like a fool and heads straight to the castle!");
            System.out.println("");
        }
    }

    public void WalkCastle(){
        System.out.println("You are now standing in front of the castle.");
        System.out.println("The usual entrance is blocked, and there doesn't seem like there is a way in.");
        System.out.println("You see there is a sewer hole, ");
        System.out.println("a loose rope hanging on the side of the wall, ");
        System.out.println("and a sleeping guard.");
        System.out.println("");
        System.out.println("How do you get in?");
        System.out.println("");
        System.out.println("1: You crawl into the sewer.");
        System.out.println("2: You take the rope and tries to climb in.");
        System.out.println("3: You smack the guard unconscious, and steal his clothes!");

        choice = scan.nextInt();

        if(choice == 1){
            System.out.println("You jump into the sewer.");
            System.out.println("");
            System.out.println(name + ": Finally I got the horse shit out of my hair!");
            System.out.println("");
            System.out.println("The stench is awful, but you swam, crawled and cried your way inn to the castle!");
            System.out.println("");
        }
        if(choice == 2){
            System.out.println("You jumped up the wall, assassins creed style.");
            System.out.println("But you are weak from not eating, and you are not as strong as you thought.");
            System.out.println("You fell and broke your neck. Boo hoo.");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            WalkCastle();
        }
        if(choice == 3){
            System.out.println("You were going to hit him, but then he woke up.");
            System.out.println("Since he is three times bigger, stronger and faster-");
            System.out.println("He slammed your body to the ground until you were turned into mush.");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            WalkCastle();
        }
    }
    public void InsideCastle(){
        System.out.println("You finally made it inside. No clue where you are.");
        System.out.println("");
        System.out.println(name + ": psssst. Princess. PSSSSST");
        System.out.println("You whispered as loud as you could. As you sneak around!");
        System.out.println("");
        System.out.println("Bandit: Oi there, What are you doing here!");
        System.out.println("");
        System.out.println("Shit. What do you do now?");
        System.out.println("");
        System.out.println("1: Tell him you escaped from  the dungeon.");
        System.out.println("2: telling him that you are a lost tourist.");
        System.out.println("3: Tell him you are the forgotten servant.");

        choice = scan.nextInt();

        if(choice == 1){
            System.out.println(name + ": I escaped the dungeons. I am a professional lock picker, you see.");
            System.out.println("");
            System.out.println("You said with not so much confidence.");
            System.out.println("The guard smiled and thanked you. He wanted you to help him on a mission");
            System.out.println("The mission was to try getting into the bank in the town.");
            System.out.println("The mission went down south, and you got killed by the police.");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            InsideCastle();
        }
        if(choice == 2){
            System.out.println(name + ": Hello there sire. I seem to be lost. I am not from here and-");
            System.out.println("");
            System.out.println("The guard laughed and threw his axe towards you, and missed.");
            System.out.println("You laughed until he came sprinting towards you.");
            System.out.println("You started to run for you life, with the guards close behind you. ");
        }
        if (choice == 3){
            System.out.println(name + ": I am just a humble servant, sire.");
            System.out.println("");
            System.out.println("The guard smiled, and took his handcuffs on you. He guided you to the dungeons.");
            System.out.println("Where he threw you into a cell, with the rotting corpse of the royal family as your company.");
            System.out.println(name + " died of starvation. Try again.");
            enterScan.nextLine();
            InsideCastle();
        }
    }
    public void princess(){
        playerHp = playerHp + 30;
        System.out.println("");
        System.out.println("As you ran for your life from the guard.");
        System.out.println("Lucky you that the guy was not the fastest runner.");
        System.out.println("You found a spot to stop and catch your breath, ");
        System.out.println("but before you even could think, someone dragged you backwards into a room.");
        System.out.println("It was the princess.");
        System.out.println("");
        System.out.println("Princess: Are you here to rescue me?");
        System.out.println("");
        System.out.println("You were so stunned by her beauty and loss for words.");
        System.out.println("How do you react to your future wife?");
        System.out.println("");
        System.out.println("1: being crude.");
        System.out.println("2: cry.");
        System.out.println("3: Show your muscles!");

        choice = scan.nextInt();

        if(choice == 1){
            System.out.println(name + ": Sorry, sometimes I itch. You know. What happens at the brothel, stays at the brothel.");
            System.out.println("");
            System.out.println("The princess was not impressed and yelled for the bandits.");
            System.out.println(name + " died of starvation. Try again.");
            enterScan.nextLine();
            princess();
        }
        if(choice == 2){
            System.out.println(name + ": I slept on horse shit, I am hungry, I swam in the sewer, I got chased by a bandit. I am so tireeeed.");
            System.out.println("");
            System.out.println("You cried, and cried into the princess bosom. She comforted you.");
            System.out.println("You gained 30 hp.");
        }
        if(choice == 3){
            System.out.println(name + ": You see princess. I slayed them all with these muscles!");
            System.out.println("");
            System.out.println("As you flexed, and flexed. you flexed too hard and passed out.");
            System.out.println("The princess thought of you as weak and threw you out. ");
            System.out.println("The guards found you, and threw you into the prison cell.");
            System.out.println(name + " died of starvation. Try again.");
            enterScan.nextLine();
            princess();
        }
    }
    public void escOne(){
        playerHp = playerHp -100;
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("your current stats:");
        System.out.println("Your hp: " + playerHp);
        System.out.println("You are carrying: " + playerWep + ", exhausted, sweaty. has severe sexual diseases while wet of the dirty sewers.");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("After being comforted by the princess, you two talked. And were ready to escape.");
        System.out.println("Now we need a solid plan.");
        System.out.println("");
        System.out.println("Princess: We can climb out of the window! But with what?");
        System.out.println("");
        System.out.println("1: Wait until her hair grew and used that as a rope.");
        System.out.println("2: Use the bedsheet.");
        System.out.println("3: You jump first, and then the princess use you as a soft landing.");

        choice = scan.nextInt();

        if(choice == 1){
            System.out.println("It apparently takes awhile for hair to grow.");
            System.out.println(name + " and the princess died of starvation. Try again.");
            enterScan.nextLine();
            escOne();
        }
        if(choice == 2){
            System.out.println("The bedsheet tore off as you climbed. The Princess was left alone.");
            System.out.println(name + " You left the princess behind. Try again.");
            enterScan.nextLine();
            escOne();
        }
        if(choice == 3){
            System.out.println("You threw yourself out the window like the smart ass you are.");
            System.out.println("The fall was brutal and you lost 80hp");
            System.out.println("The princess landed on you, you lost another 10hp");
            System.out.println("You both got up, and you were now located in the court yard.");
        }
    }
    public void escTwo(){
        System.out.println("");
        System.out.println("There was bandits playing all sorts of games, drinking and play fighting.");
        System.out.println("It is packed. How are you two going to solve this?");
        System.out.println("");
        System.out.println("Princess: Ehm, mabye we could dress as bushes, and move slowly behind the bandits?");
        System.out.println("");
        System.out.println(name + ": Are you thick in the skull? We should sneak them from behind and take em out.");
        System.out.println("");
        System.out.println("What shall you do?");
        System.out.println("");
        System.out.println("1: Follow the princess.");
        System.out.println("2: Follow through your own plan.");
        System.out.println("3: She goes through her plan, and you yours.");

        choice = scan.nextInt();

        if(choice == 1){
            System.out.println("You two get some type of bushes, wiggle inside of them.");
            System.out.println("You sneak slowly behind the bandits, and slowly but surly get away.");
        }
        if(choice == 2){
            System.out.println("You tried to sneak and take out one bandit, when you tumbled on a rock.");
            System.out.println("You fell forward and got caught.");
            System.out.println(name + " You left the princess behind. Try again.");
            enterScan.nextLine();
            escTwo();

        }
        if(choice == 3){
            System.out.println("You tried to sneak and take out one bandit, when you tumbled on a rock.");
            System.out.println("You fell forward and got caught.");
            System.out.println(name + " You left the princess behind. Try again.");
            enterScan.nextLine();
            escTwo();
        }
    }
    public void escThree(){
        System.out.println("You manage to escape to the town square. She ask you to take her to the inn. She wants to send a dove. ");
        System.out.println("");
        System.out.println("Will you let her?");
        System.out.println("");
        System.out.println("1: Yes, ofc. Why not?");
        System.out.println("2: No. that is too suspicious.");

        choice = scan.nextInt();

        if(choice == 1){
            System.out.println("You let her go inn, do her business. She comes back, smiling.");
            System.out.println("");
            System.out.println("Princess: Follow me. I know where we can camp for tonight.");
        }
        if(choice == 2){
            System.out.println("She gets irritated that you refused. She huffs, and goes to the inn alone.");
            System.out.println("She comes back smiling.");
            System.out.println("");
            System.out.println("Princess: Follow me. I know where we can camp for tonight.");
            System.out.println("");
        }
    }
    public void four(){
        System.out.println("After a few hours you got to the camp.");
        System.out.println("It is late, and you two sits by a fire.");
        System.out.println("");
        System.out.println(name + ": Soooo, princess. What is the plan now?");
        System.out.println("");
        System.out.println("Princess: There is no plan. What do you mean?");
        System.out.println("");
        System.out.println(name + ": Since I rescued you. I was promised your hand and the kingdom!");
        System.out.println("");
        System.out.println("Princess: Are you serious " + name + "?  I am GAY.");
        System.out.println("I am sorry you had to do all that for nothing.");
        System.out.println("I sended a dove to have my girlfriend fetch me.");
        System.out.println("");
        System.out.println("Your heart did not handle it well. You felt dizzy, and tasted blood.");
        System.out.println("");
        System.out.println("You died. Game over.");
    }
}

