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
  //displays the current date
    displayCurrDate();
    //displays the current amount of free memory
    displayMemory();
  }
  public static void displayCurrDate(){
    Date currentDate = new Date();
    System.out.println("The current date is: " + currentDate);
  }
 public static void displayMemory(){
		Runtime run =  Runtime.getRuntime();
		long freeMemory = run.freeMemory();
		System.out.println("Current amount of free memory is: " + freeMemory / (1024 * 1024) + "MB");
	}
}
