import java.util.Date;
public class helloWorld{
  public static void main(String[] args){
    System.out.println("Here ye : important announcement");
    System.out.println("Hello World!");
    System.out.println("Goodbye!");
    System.out.println("Hi Alice");
    System.out.println("Hi Bob");
    System.out.println("Hi Charlie");
    System.out.println("Hi Denise");
    System.out.println("Hi Ester");
  //display the current date
    displayCurrDate();
  }
  public static void displayCurrDate(){
    Date currentDate = new Date();
    System.out.println("The current date is: " + currentDate);
  }
}
