package ru.netology.service;

import org.testng.Assert;

public class CashbackHackServiceTest1 {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(100);
        int expected = 900;
        Assert.assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void testRemain1() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }
}