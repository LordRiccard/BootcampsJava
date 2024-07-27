package graph.services;

import graph.domain.models.Account;

public interface AccountService {
    void create(Account account);

    Account findById(Integer id);

    void update(Integer id, Account account);
    
    void delete(Integer id);
}