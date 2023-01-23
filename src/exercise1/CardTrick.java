package exercise1;


public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
		hand[i]=card;
		System.out.println()
            
        }
        //I AM DONE!!!
	    Scanner sc = new Scanner(System.in);
        Card crd = new Card();

        System.out.print(" Enter the suit: ");
        crd.setSuit(sc.next());
        System.out.print("Enter the Value of suit: ");
        crd.setValue(sc.nextInt());

     
        
    }

   
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Samiksha, but you can call me sami, sam or khurana");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Score good grades");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Dancing");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
