public class Scope {
    public static String txt = "Это глобальная переменная класса Scope";
    public static void main(String[] args) {
        System.out.println(Scope.txt);
        String txt = "Строка гл. метода";
        System.out.println(txt);
        sub();
    }
    public static void sub() {
       // String txt = "Строка метода sub";
        System.out.println(txt);
    }
}

