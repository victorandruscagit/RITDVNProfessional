package Mod2.test;

import Mod2.domain.Acccount;

public class TestAccount {
    public static void main(String[] args) {
        Acccount acccount = new Acccount(2.45);
        System.out.println("acccunt balance is " + acccount.getBalance());

    }
}
