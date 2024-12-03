import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      


      boolean condition = false;
      //Statments inside a WHILE LOOP BODY will repeat
      // until the condition is false
      while (condition) {
         //Statments (instructions_ to be repeated)
         System.out.println("You fool");
         //While condition is false, the body won't exucute
         // If we had set our condition to true, we'd have an infinite loop
      }

      // THREE STEPS TO WRITE A LOOP
      //1. Initialize the LOOP CONTROL variable
      int count = 1;
      //2. Test the CONDITION in the loop header
      //here, the condition is "count<=10"
      //but it could also just be a boolean value
      while (count <= 1){
         //Execute statments in the loop body
         System.out.println(count);
         //3. CHANGE your loop control variable
         count++; //equvalent to count - count + 1;
      }


      //FOR LOOPS are "shortcuts" for looping when you know
      //how many times the loop should run

      for (int i = 0; i < 13; i++) {
         // LOOP BODY (process to be repeated)
         System.out.println("For loop, i = " + 1);
      }
      //You can change the variable by anythin!
      //What does this loop do?
      for(int i =8; i<= 22; i+=2) {
         System.out.println("For loop #2, i = " +1);
      }


      //Backwards looping
      //You must change all 3 loop control parts!!
      for (int i = 12; i >= 1; i--){
         System.out.println(i + " bottles of coke on the wall");
         System.out.println(i + " bottles of coke");
         System.out.println("take one down pass it around");
         System.out.println((i - 1) + " bottles of coke on the wall");
         //check if on the last bottle (final iteration)
         if (i ==1) {
            System.out.println("DRINK RESPONSIBLY");

         }
      }




//*** LOOPS AND STRINGS***
// WHILE loop -> find & replace characters
String s = "Jackson dropped all of the chargers!";
int i = 0; //loop counter there, represents INDEX in String
//test condition: while "a" is still in String a

while (s.indexOf("a") >=0){
   i=s.indexOf("a");
   //show character at that index
   String letter = s. substring(i, i+1);
   System.out.println("There is an " + letter + " at index" + i);
   // get the firs part of the stirng
   String firstPart = s.substring(0, i);
   // get the last part of the string
   String lastPart = s.substring(i+1,s.length() );
   // reassign the string to a new version of it, with "a" replaced
   s = firstPart +"@" + lastPart;
}
System.out.println("String after find & replace:" + s);
   
//For loop --> reserve all characters of a String
// Use a For loop when you want to visit every character
int finalIndex = s.length() -1;
for (int index = finalIndex; index >= 0; index-- ) {
   //System.out.println("Current index: " + i);
   //System.out.println("Letter at index:" + s.substring(index, index +1));

//Build our reversed version at current index
//Concatenate with the letter at current index


//reversedS = reversedS + s.substring(index, index++);
}




//NESTED LOOPS
// Outer loop(runs 3 time)
for (int row = 1; row <= 10; row++){
   //Inner loop runs 5 times for each outer loop
   for (int col = 1; col <= 8; col++){
      System.out.print(" WITH THIS SACRED TREASURE I SUMMON");
   }
   // after cols are printed, next line
   System.out.println();
}



         //Guessing game
         Scanner scan = new Scanner(System.in);
         // Choose a random number from 0-100
      int num = (int) (Math.random() * 100);
   
         // Ask the user to guess a number from 0 to 100
         System.out.println("SAY A NUMBER FROM 0-100 OR ELSE.");
         int guess = scan.nextInt();
         // Get the first guess using scan.nextInt();
         // Loop while the guess does not equal the random number,
      while (guess != num) {

         // If the guess is less than the random number, print out "Too low!"
   if (guess < num) {
System.out.println("TOO LOW YA DINGLEWEED");
   }
   // If the guess is greater than the random number, print out "Too high!"
   else if (guess > num) {
System.out.println("TOO HIGH YA FEATHER JUNK");
   }
        // Get a new guess (save it into the same variable) 
   System.out.println("Guess again.");
guess = scan.nextInt(); //LOOP CHANGE
        
   
      }

      System.out.println("YOU DID NOT DO IT >:(");
         // Print out something like "You got it!"
   

   }
}
