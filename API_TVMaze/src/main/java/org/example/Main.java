package org.example;

public class Main {
    public static void main(String[] args) {
        new A("");
        new A();
    }
}


class A {
    private int a;

    public A() {
        System.out.println("dup1a");
    }

    public A(String b) {
        System.out.println("dupa");
    }

}
