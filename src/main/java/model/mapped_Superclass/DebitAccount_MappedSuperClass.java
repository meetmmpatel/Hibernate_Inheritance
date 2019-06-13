package model.mapped_Superclass;

import javax.persistence.Entity;

@Entity(name = "DebitAccount_MappedSuperClass")
public class DebitAccount_MappedSuperClass extends AccountMappedSuperClass {
  
  private double overdraftFee;
  
  public double getOverdraftFee() {
	return overdraftFee;
  }
  
  public void setOverdraftFee(double overdraftFee) {
	this.overdraftFee = overdraftFee;
  }
  
  @Override
  public String toString() {
	return "DebitAccount{" +
			"overdraftFee=" + overdraftFee +
			'}';
  }
}
