package com.matus.bank_account_crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "balance")
    private Float balance;

    // default constructor
    public Account() {

    }

    // constructor with field
    public Account(String email, Float balance) {
        this.email = email;
        this.balance = balance;
    }

    public int getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public Float getBalance() {
        return balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }
}
