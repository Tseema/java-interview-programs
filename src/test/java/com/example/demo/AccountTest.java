package com.example.demo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeWithdraw() {
        Account account = new Account(-20);


        assertEquals(false, account.withdraw(-20));
    }

    @Test
    public void accountCannotHaveNegativeDeposit() {
        Account account = new Account(-20);


        assertEquals(false, account.deposit(-20));
    }

    @Test
    public void accountDeposit() {
        Account account = new Account(-20);
        assertEquals(true, account.deposit(20));
    }

    @Test
    public void accountWithdraw() {
        Account account = new Account(-20);
        account.deposit(40);
        assertEquals(true, account.withdraw(20));
    }

    @Test
    public void accountOverdraftLimit() {
        Account account = new Account(-20);
       assertFalse(account.withdraw(50));
       assertEquals(false,account.withdraw(50));
    }

    @Test
    public void accountBalanceAfterDeposit() {
        Account account = new Account(-20);
        assertTrue(account.deposit(40));
        assertEquals(40, account.getBalance());
    }

    @Test
    public void accountBalanceAfterWithdraw() {
        Account account = new Account(-20);
        assertTrue(account.deposit(40));
        assertTrue(account.withdraw(20));
        assertEquals(20d, account.getBalance(), epsilon);
        assertEquals(20d,account.getBalance(),epsilon);
    }
}
