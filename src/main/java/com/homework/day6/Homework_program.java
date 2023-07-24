package com.homework.day6;

import java.util.Scanner;

public class Homework_program {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Choose the loop type:");
	        System.out.println("\n1. For loop");
	        System.out.println("2. While loop");
	        System.out.print("Enter the option number: ");

	        int loopType = scanner.nextInt();

	        if (loopType == 1) {
	            displayForLoopTasks();
	        } else if (loopType == 2) {
	            displayWhileLoopTasks();
	        } else {
	            System.out.println("Invalid option selected!");
	        }

	        scanner.close();
	    }

	    public static void displayForLoopTasks() {
	        System.out.println("Select the program to run:");
	        System.out.println("1. Print the first 100 natural numbers using for loop");
	        System.out.println("2. Print the first 50 even numbers using for loop");
	        System.out.println("3. Print numbers in reverse from 100 to 1 using for loop");
	        System.out.println("4. Print numbers in reverse with 3 separations from 99 to 3 using for loop");
	        System.out.println("5. Print the first 10 multiples of 5 and find their sum using for loop");
	        System.out.println("6. Print numbers in reverse from 100 to 5 and find their sum using for loop");
	        System.out.print("Enter the option number: ");

	        Scanner scanner = new Scanner(System.in);
	        int option = scanner.nextInt();

	        switch (option) {
	            case 1:
	                printFirst100NaturalNumbersUsingForLoop();
	                break;
	            case 2:
	                printFirst50EvenNumbersUsingForLoop();
	                break;
	            case 3:
	                printNumbersInReverseFrom100To1UsingForLoop();
	                break;
	            case 4:
	                printNumbersInReverseWithSeparationsUsingForLoop();
	                break;
	            case 5:
	                printFirst10MultiplesOf5AndSumUsingForLoop();
	                break;
	            case 6:
	                printNumbersInReverseFrom100To5AndSumUsingForLoop();
	                break;
	            default:
	                System.out.println("Invalid option selected!");
	        }

	        scanner.close();
	    }

	    public static void displayWhileLoopTasks() {
	        System.out.println("Select the program to run:");
	        System.out.println("1. Print the first 100 natural numbers using while loop");
	        System.out.println("2. Print the first 50 even numbers using while loop");
	        System.out.println("3. Print numbers in reverse from 100 to 1 using while loop");
	        System.out.println("4. Print numbers in reverse with 3 separations from 99 to 3 using while loop");
	        System.out.println("5. Print the first 10 multiples of 5 and find their sum using while loop");
	        System.out.println("6. Print numbers in reverse from 100 to 5 and find their sum using while loop");
	        System.out.print("Enter the option number: ");

	        Scanner scanner = new Scanner(System.in);
	        int option = scanner.nextInt();

	        switch (option) {
	            case 1:
	                printFirst100NaturalNumbersUsingWhileLoop();
	                break;
	            case 2:
	                printFirst50EvenNumbersUsingWhileLoop();
	                break;
	            case 3:
	                printNumbersInReverseFrom100To1UsingWhileLoop();
	                break;
	            case 4:
	                printNumbersInReverseWithSeparationsUsingWhileLoop();
	                break;
	            case 5:
	                printFirst10MultiplesOf5AndSumUsingWhileLoop();
	                break;
	            case 6:
	                printNumbersInReverseFrom100To5AndSumUsingWhileLoop();
	                break;
	            default:
	                System.out.println("Invalid option selected!");
	        }

	        scanner.close();
	    }
	    public static void printFirst100NaturalNumbersUsingForLoop() {
	        for (int i = 1; i <= 100; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    public static void printFirst50EvenNumbersUsingForLoop() {
	        for (int i = 2; i <= 100; i += 2) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    public static void printNumbersInReverseFrom100To1UsingForLoop() {
	        for (int i = 100; i >= 1; i--) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    public static void printNumbersInReverseWithSeparationsUsingForLoop() {
	        for (int i = 99; i >= 3; i -= 3) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    public static void printFirst10MultiplesOf5AndSumUsingForLoop() {
	        int sum = 0;
	        for (int i = 1; i <= 10; i++) {
	            int multiple = 5 * i;
	            System.out.print(multiple + " ");
	            sum += multiple;
	        }
	        System.out.println("\nSum of the multiples: " + sum);
	    }

	    public static void printNumbersInReverseFrom100To5AndSumUsingForLoop() {
	        int sum = 0;
	        for (int i = 100; i >= 5; i--) {
	            System.out.print(i + " ");
	            sum += i;
	        }
	        System.out.println("\nSum of the numbers: " + sum);
	    }

	    public static void printFirst100NaturalNumbersUsingWhileLoop() {
	        int i = 1;
	        while (i <= 100) {
	            System.out.print(i + " ");
	            i++;
	        }
	        System.out.println();
	    }

	    public static void printFirst50EvenNumbersUsingWhileLoop() {
	        int i = 2;
	        while (i <= 100) {
	            System.out.print(i + " ");
	            i += 2;
	        }
	        System.out.println();
	    }

	    public static void printNumbersInReverseFrom100To1UsingWhileLoop() {
	        int i = 100;
	        while (i >= 1) {
	            System.out.print(i + " ");
	            i--;
	        }
	        System.out.println();
	    }

	    public static void printNumbersInReverseWithSeparationsUsingWhileLoop() {
	        int i = 99;
	        while (i >= 3) {
	            System.out.print(i + " ");
	            i -= 3;
	        }
	        System.out.println();
	    }

	    public static void printFirst10MultiplesOf5AndSumUsingWhileLoop() {
	        int i = 1;
	        int sum = 0;
	        while (i <= 10) {
	            int multiple = 5 * i;
	            System.out.print(multiple + " ");
	            sum += multiple;
	            i++;
	        }
	        System.out.println("\nSum of the multiples: " + sum);
	    }

	    public static void printNumbersInReverseFrom100To5AndSumUsingWhileLoop() {
	        int i = 100;
	        int sum = 0;
	        while (i >= 5) {
	            System.out.print(i + " ");
	            sum += i;
	            i--;
	        }
	        System.out.println("\nSum of the numbers: " + sum);
	    }
	}
