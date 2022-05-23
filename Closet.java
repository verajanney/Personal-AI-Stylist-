import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/** 
 * <h1>Closet</h1>
 * The Closet program stores clothing articles in a closet that are imported by the user via .txt file
 * 
 * @author Maria, Ruby, and VV
 * */ 

public class Closet {
  public ArrayList<String> tops;
  public ArrayList<String> bottoms;
  public ArrayList<String> shoes;
  public ArrayList<String> accessories;
  
  
  /**
   * creates a closet with user imputted clothes
   * */
  
  public Closet(){
    this.tops = getTops();
    this.bottoms = getBottoms();
    this.shoes = getShoes();
    this.accessories = getAccessories();
  }
  
  
  /**
   * This method creates an ArrayList of tops from a text file
   * @return returns an ArrayList of all the tops
   * */
  
  public ArrayList<String> getTops(){
    ArrayList<String> tops = new ArrayList<>();
    try (Scanner scan = new Scanner(new File("tops.txt"))){ 
      while (scan.hasNextLine()) {
        tops.add(scan.nextLine());
      }
    }
    catch (Exception e){
      e.printStackTrace(); 
    }
    return tops;
  }
  
  
  /**
   * This method creates an ArrayList of bottoms from a text file
   * @return returns an ArrayList of all the bottoms
   * */
  
  public ArrayList<String> getBottoms(){
    ArrayList<String> bottoms = new ArrayList<>();
    try (Scanner scan = new Scanner(new File("bottoms.txt"))){ 
      while (scan.hasNextLine()) {
        bottoms.add(scan.nextLine());
      }
    }
    catch (Exception e){
      e.printStackTrace(); 
    }
    return bottoms; 
  }
  
  
  /**
   * This method creates an ArrayList of shoes from a text file
   * @return returns an ArrayList of all the shoes
   * */

  public ArrayList<String> getShoes(){
    ArrayList<String> shoes = new ArrayList<>();
    try (Scanner scan = new Scanner(new File("shoes.txt"))){ 
      while (scan.hasNextLine()) {
        shoes.add(scan.nextLine());
      }
    }
    catch (Exception e){
      e.printStackTrace(); 
    }
    return shoes; 
  }
  
  
  /**
   * This method creates an ArrayList of accessories from a text file
   * @return returns an ArrayList of all the accessories
   * */
 
  public ArrayList<String> getAccessories(){
    ArrayList<String> accessories = new ArrayList<>();
    try (Scanner scan = new Scanner(new File("accessories.txt"))){ 
      while (scan.hasNextLine()) {
        accessories.add(scan.nextLine());
      }
    }
    catch (Exception e){
      e.printStackTrace(); 
    }
    return accessories; 
  }
  
  
  
  public static void main (String [] args){
    Closet mycloset = new Closet();
  }
  
  
}
