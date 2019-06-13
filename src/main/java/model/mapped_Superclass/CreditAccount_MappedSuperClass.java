package model.mapped_Superclass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CreditAccount_MappedSuperClass")
public class CreditAccount_MappedSuperClass extends AccountMappedSuperClass {
  
  private double creditLimit;
  
  public double getCreditLimit() {
	return creditLimit;
  }
  
  public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
  }
  
  @Override
  public String toString() {
	return "CreditAccount{" +
			"creditLimit=" + creditLimit +
			'}';
  }
  

}
