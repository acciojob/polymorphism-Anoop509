package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int a= p.Product(5, 6);
        int b = p.Product(1,2,3);
        double c= p.Product(1.1,2.1);
    }
    public static class Product{

        public int Product(int x, int y) {

            return  x*y;

        }
        public int Product(int x, int y, int z) {
            return  x*y*z;
        }

        public double Product(double x, double y) {


            return x*y;
        }
    }
}