package ru.foxit.grayfox.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  конвенция по написанию кода java: https://habr.com/post/112042/
 */
public class JavaStack {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            input = getString();
            if (input.equals("")) break;

            Bracket br = new Bracket(input);
            br.check();
        }
    }
    /**
     *  Метод потенциально может выбросить исключение (кидает, бросает, выбрасывает).
     *  Исключение оно не только ограничено блоком Try Catch, блок Try Catch говорит нам о том, что все что выполнено в блоке Try
     *  может выбрасывать исключения, которое мы обрабатываем в блоке Catch, то есть исключение оно не содержит в себе только блок трай кетч.
     */
    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();

    }
}
