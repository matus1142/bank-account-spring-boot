package com.matus.bank_account_crud;

import com.matus.bank_account_crud.entity.Account;
import com.matus.bank_account_crud.repository.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BankAccountCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO dao){
		return runner->{
//			createAccount(dao,"enrico@bank.com",700.f);
//			getAccount(dao,1);
//			getAllAccount(dao);;
//			updateAccount(dao,3,"enrico@bank.com", 1400.f);
			deleteAccount(dao,3);
		};
	}

	public void createAccount(AccountDAO dao,String email,float balance){
		Account account = new Account(email,balance) ;
		dao.create(account);
		System.out.println("Create Account Successfully");
	}

	public void getAccount(AccountDAO dao,int id){
		Account account = dao.get(id);
		System.out.println(account);
	}
	public void getAllAccount(AccountDAO dao){
		List<Account> accountList = dao.getAll();
		for(Account account : accountList){
			System.out.println(account);
		}
	}
	public void updateAccount(AccountDAO dao,int id,String new_email, float new_balance){
		Account account = dao.get(id);
		account.setEmail(new_email);
		account.setBalance(new_balance);
		dao.update(account);
		System.out.println("Update Account Successfully");
	}
	public void deleteAccount(AccountDAO dao,int id){
		dao.delete(id);
		System.out.println("Delete Account Successfully");
	}

}
