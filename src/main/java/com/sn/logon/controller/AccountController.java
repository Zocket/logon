package com.sn.logon.controller;

import com.sn.logon.model.Account;
import com.sn.logon.model.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountMapper accountMapper;

    @GetMapping
    //public String verify(String un, String eps){
    public String verify(@RequestParam(value = "username",defaultValue = "default") String un, @RequestParam(value = "password", defaultValue = "default") String eps){
        Account a = accountMapper.getAccountByName(un);
        accountMapper.createAccount(new Account(un,eps));

        return (a==null) ? "no account exists" : a.getEncryptedPassword();
    }

    @PutMapping
    public String create(String un, String eps){
        accountMapper.createAccount(new Account(un,eps));
        return "PUT";
    }

    @PostMapping
    public String update(String un, String eps){
        accountMapper.createAccount(new Account(un,eps));
        return "UPDATE";
    }

    @DeleteMapping
    public String remove(String un, String eps){
        return "DELETE";
    }
}
