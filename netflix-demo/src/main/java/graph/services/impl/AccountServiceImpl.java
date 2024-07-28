package graph.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import graph.domain.models.Account;
import graph.domain.repositories.AccountRepository;
import graph.services.AccountService;

public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository repo;

    @Override
    public void create(Account account) {
        repo.save(account);
    }

    @Override
    public Account findById(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public void update(Integer id, Account account) {
        repo.save(repo.findById(id).get());
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}