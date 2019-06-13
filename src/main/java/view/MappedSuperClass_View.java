package view;

import model.mapped_Superclass.CreditAccount_MappedSuperClass;

import model.mapped_Superclass.DebitAccount_MappedSuperClass;
import model.single_table.CreditAccount__Single_Table_Inheritance;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

import java.util.List;

public class MappedSuperClass_View {
  
  public static void main(String[] args) {
	
	CreditAccount_MappedSuperClass accountOne = new CreditAccount_MappedSuperClass();
	
	accountOne.setBalance(1299.99);
	accountOne.setInterestRate(23);
	accountOne.setOwner("TestOneUser");
	accountOne.setCreditLimit(15000.00);
	
	DebitAccount_MappedSuperClass debitAccountMappedSuperClass =
			new DebitAccount_MappedSuperClass();
	
	debitAccountMappedSuperClass.setBalance(4568.89);
	debitAccountMappedSuperClass.setInterestRate(10);
	debitAccountMappedSuperClass.setOwner("Debitcard");
	debitAccountMappedSuperClass.setOverdraftFee(45);
 
 
	CreditAccount__Single_Table_Inheritance single_table_inheritance =
			new CreditAccount__Single_Table_Inheritance();
	single_table_inheritance.setCreditLimit(12989.99);
	single_table_inheritance.setBalance(190000);
	single_table_inheritance.setInterestRate(20);
	
	Transaction transaction = null;
	try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	  transaction = session.beginTransaction();
	  session.save(accountOne);
	  session.save(debitAccountMappedSuperClass);
	  session.save(single_table_inheritance);
	  
	  
	  transaction.commit();
	  
	} catch (Exception e) {
	  if (transaction != null) {
		transaction.rollback();
	  }
	  
	}
  }
}
