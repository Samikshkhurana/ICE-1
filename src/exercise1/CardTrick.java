package exercise1;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random()*13));
            card.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
		hand[i]=card;
		System.out.println(hand[i].getValue()+hand[i].getSuit());
            
        }
        
	Scanner sc = new Scanner(System.in);
        Card crd = new Card();

        System.out.print(" Enter the suit: ");
        String b=sc.next();
       
        System.out.print("Enter the Value of suit: ");
        int a=sc.nextInt();
        
        
        for(int v=0;v<hand.length;v++){
        if(a==hand[v].getValue() && b.equalsIgnoreCase(hand[v].getSuit())){
        
        }
            
        }
        

     
        
    }

   //I AM DONE!!!!
    private static void printInfo() {
    
        System.out.println("Congratulations!You guesseed right");
        System.out.println();
        
        System.out.println("My name is Samiksha, but you can call me sami, sam or khurana");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Score good marks");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Dancing");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my car");

        System.out.println();
        
    
    }

}
