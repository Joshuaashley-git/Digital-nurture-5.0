package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        System.out.println("Setting up: creating new account with balance 100");
        account = new BankAccount(100.0);
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down: discarding account");
        account = null;
    }

    @Test
    public void testDeposit() {
        account.deposit(50);

        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {

        account.withdraw(30);

        assertEquals(70.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientFundsThrows() {

        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(200);
        });
    }

    @Test
    public void testDepositNegativeAmountThrows() {

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10);
        });
    }
}