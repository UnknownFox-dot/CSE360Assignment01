package cse360assignment01;

public class AddingMachine
{
  private int total;
  
  public AddingMachine ()
  {
    total = 0; 
  }
  
  public int getTotal ()	//returns the overall total
  {
    return total;
  }
  
  public void add (int value)	//performs the add function
  {
	  total += value;
  }

  public void subtract (int value)	//performs the subtraction function
  {
	  total -= value;
  }

  public String toString ()	//returns the operations performed
  {
    return "";
  }

  public void clear()	//resets the total
  {
	  total = 0;
  }
}