package cse360assignment02;
//first version

public class AddingMachine {
  private int total;
  private String history = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  //gets the total
  public int getTotal () {
    return total;
  }
  //adds the values
  public void add (int value) {
	  total = total + value;
	  history = history + " " + "+" + " " + value;
	  
	  
  }
  //subtracts the values
  public void subtract (int value) {
	  total = total - value;
	  history = history + " " + "-" + " " + value;
  }
  //makes the total a string
  public String toString () {
    return history;
  }
  //clears the total
  public void clear() {
	  total = 0;
  }
}