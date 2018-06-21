package ru.foxit.grayfox.queue;

import java.util.ArrayList;

public class Queue {

    /**
     *
     * Переменные
     */
    private int[] queue;
    private int front; // Это маркер начало очереди.
    private int rear; // Маркер конец очереди.
    private int items; // кол-во элементов.
    private int maxSize; // Максимальное значение

    /**
     * Конструктор
     * @param s
     */
    public Queue(int s) {
        maxSize = s;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }

    /**
     * Очередь пуста
     */
    public boolean isEmpty() {
        return (items == 0);
    }

    /**
     *  Очередь полная
     *  @return boolean
     */
    public boolean isFull() {
        return (items == maxSize);
    }

    /**
     *  Метод возвращающий размер
     */
    public int size() {
        return items;
    }

    /**
     *  Добавления данных - тут происходит тот самый циклический перенос (превращение в кольцо).
     */
    public void insert(int i) {
        // Проверка по ключу - аналогия в жизни, опять же почта.
        if (rear == maxSize - 1)
            rear = -1;
        // Увеличение последнего элемента и вставка
        queue[++rear] = i;
        // Увеличение кол-ва элементов.
        items++;
    }


    /**
     *  Метод удаления - тут у нас происходит извлечения элемента из начала очереди, того элемента что первый
     *  пойдет в обработку.
     */
    public int remove() {
        // тут извлекаем элемент и увеличиваем фронт.
        int temp = queue[front++];
        // тут происходит циклический перенос и уменьшение кол-во элементов на 1.
        if (front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    /**\
     *  Метод переворачивает значение, считывает с конца индекса.
     */
    public void reverse() {
        int a = 0, b = queue.length - 1;
        while (a < b) {
            int t = queue[a];
            queue[a] = queue[b];
            queue[b] = t;
            a++;
            b--;
        }
    }

    /**
     *  метод получения вершины
     */
    public int peek() {
        return queue[front];
    }

}