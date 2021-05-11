public class CharacterSwap {
    public static void main(String[] args) {
        String txt = "";

        if ( txt.isEmpty() )
        {
            txt = " hello ";
        }
        System.out.println("Строка: "+txt);
        System.out.println("Длина первоначальное строки "+txt.length());

        txt = txt.trim();
        System.out.println("Длина после редактирования "+txt.length());

        char first = txt.charAt(0);
        System.out.println("Первый символ: "+first);

        first = txt.charAt((txt.length() - 1));
        System.out.println("Последний символ: "+first);

        txt = txt.replace('o', 'i');
        System.out.println(txt);


    }
}
