import java.util.Scanner;

 /**
   * <h1>Personal AI Stylist</h1>
   * The Personal AI Stylist loads the user's closet and generates random outfits
   * @author Maria, Ruby, and VV
   *
   * */

public class PersonalAIStylist{
  
  public static void main(String[] args) {
    Closet myCloset = new Closet();
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to your Personal AI Stylist!");
    System.out.println("Time to find your outfit and conquer the day!");
    System.out.println("Here are the items you have in your closet:");
    System.out.println("Your tops: " + myCloset.tops.toString());
    System.out.println("Your bottoms: " + myCloset.bottoms.toString());
    System.out.println("Your shoes: " + myCloset.shoes.toString());
    System.out.println("Your accessories: " + myCloset.accessories.toString());
    System.out.println("Type 'next' to pick an outfit!");
    String input = scan.nextLine().toLowerCase();
    
    while(input.equals("next")) {
      //for tops
      System.out.println(myCloset.tops.get((int)(Math.random()*myCloset.tops.size()-1)));
      
      //for bottoms 
      System.out.println(myCloset.bottoms.get((int)(Math.random()*myCloset.bottoms.size()-1)));  
      
      //for shoes
      System.out.println(myCloset.shoes.get((int)(Math.random()*myCloset.shoes.size()-1)));      
      
      //for accessories
      System.out.println(myCloset.accessories.get((int)(Math.random()*myCloset.accessories.size()-1)));  
      
      System.out.println("Not the right one? Type 'next' for a new outfit or 'quit' to quit!");
      input = scan.nextLine().toLowerCase();                   
      
    }
    
    if (input.equals("quit")){
      System.out.println("Thank you for using Personal AI Stylist!");
    }
    
    
    
    
  } // main
  
} //class 

