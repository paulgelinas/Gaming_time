import java.util.Scanner;
public class time_for_a_game
{
    public static void main(String[] args)
    {
     Scanner myObj = new Scanner(System.in);
     System.out.println('\u000C');
      System.out.println("throught this game 1 means yes and 2 means no");
      Scanner inputScanner = new Scanner(System.in);
      System.out.println("would you like to play?");
      int H = myObj.nextInt();
     while (H == 1) {
     System.out.println("Are you sure?");
     int G = myObj.nextInt();
     while (G == 1)
     {
     System.out.println('\u000C');
      System.out.println("throught this game 1 means yes and 2 means no");
     System.out.println("you are in a tight, confined space. would you like to try and escape?");
     int Y = myObj.nextInt(); //YoN means yes or no//
     if (Y == 1)
     {
      System.out.println("you shook and shook and rocked and flailed and you felt the space free up.");
     }
     else if (Y == 2)
     {
      System.out.println("you stop resisting and succumb to the cold embrace of death. GAME OVER");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("you are laying in a box in the middle of the desert, would you like to get up and explore?");
     double yOn = myObj.nextDouble();
     if (yOn == 1)
     {
      System.out.println("you get up to explore and after about a mile in the harsh desert heat, you see an almost immediate shift from blistering heat to sub zero tempuratures.");  
     }
     else if (yOn == 2)
     {
       System.out.println("You lay in your box and die of heat stroke. GAME OVER");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
         
     System.out.println("given your current situation would you like to shout in frustration?");
     double yon = myObj.nextDouble();
     if (yon == 1)
     {
         System.out.println("what would you like to shout?");
         String A = myObj.nextLine();
         System.out.println("you proceed to scream " + A + "into the wilderness.");
     }
     else if (yon == 2)
     {         
         System.out.println("looks like you're not that irritated, interesting, especially in the current situation");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("after that little break is there something you would like to do?");
     double YON = myObj.nextDouble();
     if (YON == 1)
     {
         System.out.println("Well what would you like to do?");
         String A = myObj.nextLine();
         System.out.println("You proceed to " + A + "and the earth begins to shake...");
     }
     else if (YON == 2)
     {
         System.out.println("well how boring, the Gods become bored of you and smite you with lightning... GAME OVER");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("as the earth shakes and you become as wobbly as the ground, you begin to feel the earth calm down and you hear a voice...");
     System.out.println("WHO ARE YOU TO ENTER MY DOMAIN? WHO IS THIS TO COMPETE FOR ETERNAL DOMINION OF THIS LAND?");
     System.out.println("Would you like to resond?");
     double O = myObj.nextDouble();
     if (O == 1)
     {
         System.out.println("what would you like to say?");
         String B = myObj.nextLine();
         System.out.println("you respond: " + B + ". the voice does not take kindly to this and you get smashed by a boulder. GAME OVER");
     }
     else if (O == 2)
     {
         System.out.println("you remain silent and after around 30 minutes you hear the voice raise and lower in volume saying:");
         System.out.println("HOW DARE YOU REMAIN SILENT?! YOU DO NOT ANSWER TO THE VERY BEING THAT CREATED YOU?! YOU MAY BE LESS INTELIGENT THAN I THOUGHT");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("you continue to remain silent and eventually the voice lowers in volume and perceived anger and it says this to you:");
     System.out.println("BUT YOU ARE NOT LIKE THE OTHERS ARE YOU? YOU SEEK SOMETHING MORE THAN SELFISH GAIN AND WORTHLESS POWER DON'T YOU?");
     System.out.println("COME MY CHILD, LET US DISCUSS");
     System.out.println("Will you join them?");
     double N = myObj.nextDouble();
     if (N == 1)
     {
         System.out.println("you begin to walk towards where you assume the voice is coming from and you round a cold, icy corner to be embraced by a warm light");
         System.out.println("you continue to walk into the light and you are greeted by a tall, powerfully built, seemingly old man who greets you with these words");
         System.out.println("SO IT IS YOU, COME MY CHILD, YOU HAVE SUFFERED ENOUGH ALREADY, LET ME SHOW YOU THE LIGHT YOU SAW IN THE TUNNLE. GAME OVER (good ending)");
     }
     else if (N == 2)
     {
         System.out.println("WELL IF IT IS THAT YOU DESIRE IT IS THAT YOU SHALL RECEIVE!");
         System.out.println("You see a large muscular figure leap impossibly high from about a mile away and he lands in front of you. 7 feet tall and 500 Lbs of pure muscle");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("With this large and imposing figure standing but 3 feet away from you, what will you do first? will you throw the first punch or remain passive?");
     double C = myObj.nextDouble();
     if (C == 1)
     {
         System.out.println("you threw a punch at the man and landed a solid blow to his chin, he staggered and fell. but almost immediatly levitated back to his first position.");
         System.out.println("The man grabs you by the neck and throws you several hundred feet. the fight continues on like this for an indeterminable amount of time");
         System.out.println("at the end of what seemed like an eternity both of you lay, tired and defeated. the man then says to you:");
         System.out.println("NO MORTAL SHOULD BE ABLE TO NEAR ME IN COMBAT, YOU ARE SPECIAL... I HAVE WAITED FOR ONE LIKE YOU FOR LONG ENOUGH. COME WITH ME.");
     }
     else if (C == 2)
     { 
         System.out.println("The figure throws a punch at you, landing a devistating right hand to your head, this blow renders you unconcious.");
         System.out.println("The figure then grabs a rock and as he is about to smash your head in he says:");
         System.out.println("WHAT A SHAME. I TRULY THOUGHT YOU WERE THE ONE.");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("SEEING AS YOU HAVE EQUALED ME IN COMBAT I WILL GRANT YOU THAT WHICH YOU SEEK");
     System.out.println("The figure stretches his hand out to you and his hand begins to glow brighter than he had previously");
     System.out.println("Will you accept his offer?");
     double D = myObj.nextDouble();
     if (D == 1)
     {
         System.out.println("The figure proceeds to grab your forearm and slam you into the ground, you are so exhausted that you don't even fight back");
         System.out.println("He finishes you off quickly with a stomp your neck, breaking it and killing you instantly. GAME OVER");
     }
     else if (D == 2)
     {
         System.out.println("The figure cocks his head at you and smiles, He presses his hand into your chest and utters a small incantation:");
         System.out.println("GRATIAS AD TE VIRTUTEM MEAM: ET IN SPE ERIT ULTERIUS QUOD NOSTRIS DEFENDERE CAUSA ET GLORIAE NOSTRAE");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("You feel heat flow through your veins, much needed in the cold snowy mountain your battle ended on.");
     System.out.println("You get up and turn to face the figure who pushed you but all you can see is his loin cloth, left on the floor, white as the snow.");
     System.out.println("what now? you begin to feel warmer and warmer but it never beomes uncomfortable for You");
     System.out.println("You then realize that it is sunrise, meaning you fought through the night, but you don't remember having any trouble seeing or even it being dark");
     System.out.println(".");
     System.out.println(".");
     System.out.println(".");
     System.out.println("Well would you like to try something powerlike?");
     double E = myObj.nextDouble();
     if (E == 1)
     {
         System.out.println("You try and will yourself into the air, it does not work");
         System.out.println("You jump in the air trying to fly, you jump really high but it does not work");
         System.out.println("Finally you're about ready to give up, and you trip over a rock and you try and cath yourself... but you never hit the ground.");
         System.out.println("So you can fly! I knew it! who knows what else you could do, but lets save that for another day.");
     }
     else if (E == 2)
     {
         System.out.println("Well thats boring but alright. GAME OVER (Boring God ending)");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("with your new powers you levitate around your new domain, able do be wherever you want, do whatever you want");
     System.out.println("But even with your power and stature, there was still something missing, you have become lonely.");
     System.out.println("You cry out for the figure you saw, who gave you this curse of power, but no one came.");
     System.out.println("Eventually you cry out for the figure to come kill you, end the suffering of immortality you had been bestowed with");
     System.out.println("Just then you sense another presence in your domain, will you go and confont them? repeating history?");
     double F = myObj.nextDouble();
     if (F == 1)
     {
         System.out.println("You fly over to them and call out: WHO DARE ENTER MY DOMAIN?");
     }
     else if (F == 2)
     {
         System.out.println("You decide to end this cycle of suffering, reognizing that the person in your domain is there for precisely the same reason you were");
         System.out.println("GAME OVER (Timeline destruction ending)");
     }
     else 
     {
         System.out.println("I'm not sure I understand");
     }
     System.out.println("With your continuing of your previous battle you did the same as your predicesor, and passed on your curse.");
     System.out.println("This is it, are you happy now? someone else has taken your place in eterenal suffering while you fade into nothingness");
     System.out.println("THE END");
     System.out.println("would you like to continue your story as your new self?");
     
     }
    }
   }
}
