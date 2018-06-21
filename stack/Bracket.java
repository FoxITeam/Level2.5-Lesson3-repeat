package ru.foxit.grayfox.stack;

public class Bracket {
    private String input;

    public Bracket(String in) {
        input = in;
    }

    public void check() {
        int size = input.length();
        Main st = new Main(size);

        //charAt возвращает символ.

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                /* Аналогичный пример, только ниже мы сделали проще.
                  case '[':
                      st.push(ch);
                      break;
                  case '{':
                      st.push(ch);
                      break;
                  case '(':
                      st.push(ch);
                      break;
                      */
                case '[':
                case '{':
                case '(':
                    st.push(ch);
                    break;
                case ']':
                case '}':
                case ')':
                    if (!st.isEmpty()) {
                        char chr = st.pop();
                        if ((ch == '}' && chr != '{') || (ch == ']' && chr != '[') || (ch == ')' && chr != '(')) {
                            System.out.println("Ошибка в: " + ch + " в " + i);
                        }
                    } else {
                        System.out.println("Ошибка в: " + ch + " в " + i);
                    }
                    break;
                default:
                    break;
            }
            if(!st.isEmpty()){
                System.out.println("Нету правого разделителя");
            }
        }
    }
}
