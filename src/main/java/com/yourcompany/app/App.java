package com.yourcompany.app;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Logic Operations App ---");
        App app = new App();
        System.out.println("AND Operation (true, false): " + app.andOp(true, false));
    }

    public boolean andOp(boolean a, boolean b) { return a && b; }
    public boolean orOp(boolean a, boolean b) { return a || b; }
    public boolean notOp(boolean a) { return !a; }
}
