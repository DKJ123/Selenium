package com.selenium;

import java.util.Scanner;

public class SelectTest {

    public void getInput() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which test would you like to run?:\n1. Google search\n2. Fill out form\n3. Adlibris");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                GoogleSearch g = new GoogleSearch();
                g.search();
                break;
            case 2:
                FillOutForm f = new FillOutForm();
                f.Form();
                break;
            case 3:
                Adlibris a = new Adlibris();
                a.BuyBook();
                break;

        }
    }

}
