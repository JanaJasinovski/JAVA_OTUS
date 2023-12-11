package ru.otus;

@SuppressWarnings("WeakerAccess")
public class Main {
    private final String name;

    public Main(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Main example = new Main("Tully");
        long size = example.getAnswer();
        System.out.println("The answer for " + example.name + " is: " + size);
    }

    public long getAnswer() {
        int a = 1;
        int b = 5;
        int c = a << b;
        return c + 10;
    }
}
