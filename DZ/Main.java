package ru.foxit.grayfox.DZ;

import java.util.Scanner;

public class Main {

    /**
     * 1. Реализовать рассмотренные структуры данных в консольных программах. (Готово)
     * 2. Создать программу, которая переворачивает вводимые строки (Читает справа налево).
     * 2 Задание можно выполнить как и через стринг билдер, можно и через стек
     * (Выполнить с помощью реверса 2 задание)
     * 3. Создать класс для реализации дека.
     * ДЕК должен одновременно удалять и вставлять с обоих сторон - Да.
     */


    /**
     * . Реализовать рассмотренные структуры данных в консольных программах. (Готово)
     */

    /**
     * 2. Создать программу, которая переворачивает вводимые строки (Читает справа налево).
     * Обычное решение без стринг билдера или стека
     * В классе queue и MainQueue написано нормальное решение с помощью метода reverse.
     */
    public static void main(String[] args) {
        int[] arr = new int[5]; // Создаем массив размерностью 5.
        Scanner scanner = new Scanner(System.in); // Создаем экземпляр класса сканер.

        int i = 0; // Объявляем переменную i и присваиваем число 0.
        System.out.println("Введите число 1"); // Спрашивает - введите число.
        do { // Воспользуемся do while
            while (!scanner.hasNextInt()) // Если это не ввод с клавиатуры, ожидаем пока не введет цифру.
                scanner.next(); //Если мы не написали число, он ждет. Если вводит - то выполняет.
            arr[i] = scanner.nextInt(); // К индексу массива привязываем наше введенное число.
            if (i >= 4) break; // Если i >= 4 - отображаем sout, если 4 == 4, то он не будет выводить сообщение и выходит из цикла do while.
            else {
                System.out.println("Введите число " + (i + 2)); // Выводим сообщение
                i++; // +1
            }
        } while (i < 5); // Условие do while

        for (int j = arr.length - 1; j >= 0; j--) { // Получаем массив, привязываем к j наш массив и управляем им.
            System.out.println("index массива: " + j + " | Числа: " + arr[j]); // Выводим в консоль индекс массива и введенные числа наоборот.
        }
    }

}
