package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для списка А: ");
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            A.add(name);
        }
        System.out.println("Ваш список А: " + A);
        System.out.println("_______________________");
        System.out.println("Введите имя для списка Б: ");
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String name2 = scanner.nextLine();
            B.add(name2);
        }
        System.out.println("Ваш список Б: " + B);
        System.out.println("_______________________");
        ArrayList<String> C = new ArrayList<>();
        System.out.println("Ваш список С: " + A + B);
        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));
        System.out.println("_______________________");
        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println("Ваш список С после сортировки: " + C);
    }
}