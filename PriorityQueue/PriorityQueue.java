package ru.foxit.grayfox.PriorityQueue;

public class PriorityQueue {

    private int maxSize;
    private int[] queueArray;
    private int items;

    public PriorityQueue(int i) {
        maxSize = i;
        queueArray = new int[maxSize];
        items = 0;
    }

    /**
     * Вот так выглядит метод инзерт
     */
    public void insert(int item) {
        int i;
        // Если у нас очередь пуста, то
        if (items == 0)
            // то вставляем в эту ячейку 0
            queueArray[items++] = item;
        else {
            // если у нас не пустая очередь, то
            for (i = items - 1; i >= 0; i--) {
                // То мы осуществляем пробежку в обратном порядке! Не с первого, а с последнего элемента!
                // Если новый элемент больше, мы его сдвигаем вверх!
                if (item > queueArray[i])
                    queueArray[i + 1] = queueArray[i];
                    // Если меньше, сдвигом решаем вопрос, сдвиг больше не выполняется.
                else break;
            }
            // И осуществляем непосредственно вставку!

            queueArray[i + 1] = item;
            items++;
        }
    }



    /**
     * Удаление элемента
     */
    public int remove() {
        return queueArray[--items];
    }

    /**
     * Читаем минимальный элемент (чтение элемента)
     */
    public int peek() {
        return queueArray[items - 1];
    }

    /**\
     * Если элемент пуст
     */
    public boolean isEmpty() {
        return (items == 0);
    }

    /**
     * Если полон
     */
    public boolean isFull(){
        return (items == maxSize);
    }
}
