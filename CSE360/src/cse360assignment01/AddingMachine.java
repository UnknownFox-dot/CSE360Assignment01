package cse360assignment01;

public class AddingMachine
{
  private static int total;

  public AddingMachine()
  {
    total = 0; 
  }
  
  public static void main (String [] args) 
  {
	  add(5);
	  subtract(7);
	  add(9);
	  System.out.println("0 + 5 - 7 + 9");
	  System.out.println("Total: " + getTotal());
	  subtract(6);
	  System.out.println("0 + 5 - 7 + 9 - 6");
	  System.out.println("Total: " + getTotal());
	  clear();
	  System.out.println("Total: " + getTotal());
  }
  
  public static int getTotal()	//returns the overall total
  {
    return total;
  }
  
  public static void add(int value)	//performs the add function
  {
	  total += value;
  }

  public static void subtract(int value)	//performs the subtraction function
  {
	  total -= value;
  }
  
  public static void clear()	//resets the total
  {
	  total = 0;
  }
}