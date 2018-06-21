package ru.foxit.grayfox.stack;

public class Main {
    private int maxSize;
    private int[] stack;
    private int top;

    public static void main(String[] args) {

    }

    public Main(int size) {
        this.maxSize = size; // Поле maxSize будет хранить максимальное значение.
        this.stack = new int[this.maxSize]; //
        this.top = -1; // Поле топ верхушка стека, позиция элемента как раз в стеке, который последний вышел, последний вошел, первый и вышел.
        // Значение top -1 означает что у нас пусто. В качестве структур данных будем использовать массив.
    }

    /**
     *  Напишем метод, который будем нам осуществлять проверку на пустоту и на переполненность.
     * @return
     */
    public boolean isFull() { // Переполнение
        return (this.top == this.maxSize - 1);
    }

    /**
     *  Нам нужно добавить метод удаления элемента, который находиться на верхушке.
     *  Тут мы используем постфиксную форму дикримента,
     *  this.top-- постфиксная
     *  Нам нужно верхушку элемента смахнуть, если мы будем использовать дикримент префиксный, то мы смахнем
     *  9, а не 10 элемент, по этому с начало смахиваем верхний элемент, потом уменьшаем на 1.
     */
    public char pop() {
        return (char) this.stack[this.top--];
    }

    /**
     *  Так же для получение элемента стека нам нужно написать метод, который получает этот самый элемент.
     */
    public int peek() {
        return this.stack[this.top];
    }

    /**
     *  Далее каждый новый элемент должен быть добавлен в конец стека, по этому нам нужно добавить метод, который будет добавлять элементы в конец стека.
     *  префиксная форма инкримента ++ и постфиксная форма инкримента - отличаются тем, что если префиксная, то прибавка идет до операции или какие то действия сложения вычитания
     *  постфиксная прибавка идет после операции.
     *  ++this.top префиксная
     */
    public void push(int i) {
        this.stack[++this.top] = i;
    }

    /**
     *  Пусто
     */
    public boolean isEmpty() {
        return (this.top == -1); // Если пусто, вернуть минус один.
    }
}
