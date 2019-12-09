package com.smart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    private JdbcTemplate jdbcTemplate;
    private final static String Match_COUNT_SQL="Select count(*) from logintable where username=? and password=?";

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public int ValidUser(String username,String password){
        return jdbcTemplate.queryForObject(Match_COUNT_SQL,new Object[]{username,password},Integer.class);
    }
}
