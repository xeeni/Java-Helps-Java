package com.javahelps.shapes;

class Square implements Shape {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}