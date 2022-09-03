package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest1 {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(100);
        int expected = 900;
        assertEquals(actual,expected);
    }
    @org.junit.Test
    public void testRemain1() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }
}