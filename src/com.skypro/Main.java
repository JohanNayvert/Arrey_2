package com.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array_2");
        System.out.println();

        generateRandomArray();
        taskOneByOne();
        taskOneByTwo();
        taskOneByThree();
        taskOneByFour();

        System.out.println("HomeWork Complete");
    }

    //task_1-4
    private static void taskOneByFour() {
        System.out.println("task_1-4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println();
    }

    //task_1-3
    private static void taskOneByThree() {
        System.out.println("task_1-3");
        double averageSum = 0;
        int[] arr = generateRandomArray();
        for (int j : arr) {
            averageSum = (averageSum + j)/ arr.length;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", averageSum);
        System.out.println();
    }

    //task_1-2
    private static void taskOneByTwo() {
        System.out.println("task_1-2");
        int[] arr = generateRandomArray();
        int maxExpense = arr[0];
        int minExpense = arr[0];
        for (int current : arr) {
            if (current < minExpense) {
                minExpense = current;
            } else if (current > maxExpense) {
                maxExpense = current;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей.\n", minExpense);
        System.out.printf("Максимальная сумма трат за день составила %d рублей.\n", maxExpense);
        System.out.println();
    }

    //task_1-1
    private static void taskOneByOne() {
        System.out.println("task_1-1");
        int sumExpense = 0;
        int[] arr = generateRandomArray();
        for (int j : arr) {
            sumExpense = sumExpense + j;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sumExpense);
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
