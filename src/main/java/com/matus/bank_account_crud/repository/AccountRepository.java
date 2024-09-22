package com.matus.bank_account_crud.repository;

import com.matus.bank_account_crud.entity.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepository implements AccountDAO{
    private EntityManager entityManager;

    public AccountRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public void create(Account account) {
        entityManager.persist(account);
    }

    @Override
    public Account get(int id) {
        return entityManager.find(Account.class,id);
    }

    @Override
    public List<Account> getAll() {
        TypedQuery<Account> queries = entityManager.createQuery("From Account",Account.class);
        return queries.getResultList();
    }

    @Override
    @Transactional
    public void update(Account account) {
        entityManager.merge(account);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Account account = entityManager.find(Account.class,id);
        entityManager.remove(account);
    }
}
