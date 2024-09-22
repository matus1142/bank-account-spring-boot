package com.matus.bank_account_crud.repository;

import com.matus.bank_account_crud.entity.Account;

import java.util.List;

public interface AccountDAO {
    void create(Account account);
    Account get(int id);
    List<Account> getAll();
    void update(Account account);
    void delete(int id);
}
