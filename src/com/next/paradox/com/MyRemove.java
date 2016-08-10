package com.next.paradox.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyRemove extends Calc{
    public static void main(String[] args) throws Exception {
        Calc calc = new Calc();
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String sIn;

        try {
            System.out.println("Введте выражение для расчета. Поддерживаются цифры, операции +,-,*,/,^,% и приоритеты в виде скобок ( и ):");
            sIn = d.readLine();
            sIn = opn(sIn);
            System.out.println(calculate(sIn));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

