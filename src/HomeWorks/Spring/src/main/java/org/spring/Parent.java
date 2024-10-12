package org.spring;

public class Parent {
    private Child child;

    public Parent(Child child) {
        System.out.println("\033[31mcall initialization...\033[0m");
        System.out.println("Сынок, ужин готов, иди кушать.");
        System.out.println();
        this.child = child;
    }

    public void callChildMethod() {
        child.childMethod();
    }
}
