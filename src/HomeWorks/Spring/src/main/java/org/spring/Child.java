package org.spring;

public class Child {
    public Child() {
        System.out.println("\033[31mchild connected\033[0m" + "");
        System.out.println();
    }

    public void childMethod() {
        System.out.println("\033[31mrequest received...\033[0m \n" + "Уже иду!");
    }
}
