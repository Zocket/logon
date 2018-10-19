package com.sn.logon.model;

import org.apache.ibatis.annotations.*;

@Mapper
public interface AccountMapper {
    //Account getAccountByName(@Param("username") String username);
    @Insert("INSERT INTO account(id,username,passphrase) VALUES(0,#{username},#{encryptedPassword})")
    //@Insert("INSERT INTO account(id,username,passphrase) VALUES（0,'yelei','dummy')")
    void createAccount(Account account);

    @Select("SELECT * FROM account WHERE username = #{username}")
    @Results({
            @Result(property = "username", column = "username"),
            @Result(property = "passphrase", column = "encryptedPassword")
    })
    Account getAccountByName(String username);
}
