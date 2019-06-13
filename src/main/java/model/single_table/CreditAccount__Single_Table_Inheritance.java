package model.single_table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CreditAccount__Single_Table_Inheritance")
public class CreditAccount__Single_Table_Inheritance extends Account_Single_Table_Inheritance{
  
  private double creditLimit;
  
  public double getCreditLimit() {
	return creditLimit;
  }
  
  public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
  }
  
  @Override
  public String toString() {
	return "CreditAccount__Single_Table_Inheritance{" +
			"creditLimit=" + creditLimit +
			'}';
  }
}
