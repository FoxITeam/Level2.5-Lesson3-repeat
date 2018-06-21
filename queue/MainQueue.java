package ru.foxit.grayfox.queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5); // Создаем 5 элементов в очереди.
        q.insert(11);
        q.insert(22);
        q.insert(33);
        q.insert(44);
        q.insert(55);

        // Переворачиваем введенные значения.
        q.reverse();


        //[11][22][33][44][55]
        //q.remove();
        //q.remove();
        //[][][33][44][55] <<

        //[33][44][55][][] <<
        //q.insert(66);
        //q.insert(77);
        //[33][44][55][66][77]

        /**
         *  Удаление последнего элемента
         *  Пока наша очередь не пуста, мы будем удалять элемент.
         */
        while (!q.isEmpty()) {
            int n = q.remove();
            System.out.println(n + " ");
        }

    }
}