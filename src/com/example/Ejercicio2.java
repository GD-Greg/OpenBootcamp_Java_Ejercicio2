package com.example;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el precio del producto: ");
        double precio = scanner.nextFloat();

        System.out.println("El precio total del producto es: " + precioIVA(precio));
    }

    public static double precioIVA(double precio) {
        double IVA = precio * 0.21;

        return IVA;
    }
}
