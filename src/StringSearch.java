public class StringSearch {
    public static void main(String[] args) {
        String[] books = {"Java in easy steps", "XML in easy steps" ,
                "HTML in easy steps" , "CSS in easy steps" ,
                "Gone With the Wind" , "Drop the Defense"};
        int counter1 = 0, counter2 = 0, counter3 = 0;

        for (String book : books)
        {
            System.out.print(book.substring(0,4)+" | ");
            if (book.endsWith("in easy steps")) counter1++;
            if (book.startsWith("Java")) counter2++;
            if (!book.contains("easy")) counter3++;
        }
        System.out.println( "\nНайдено " + counter1 + " названий из этой серии" ) ;
        System.out.println( "Найдено " + counter2 + " названий с Java" ) ;
        System.out.println( "Найдено " + counter3 + " других названий" ) ;

    }
}
