public class StringComparison {
    public static void main(String[] args) {
        String password = "bingo123";
        try
        {
            if (args[0].toLowerCase().equals(password))
            {
                System.out.println("Верный пароль");
            }
            else System.out.println("Неверный пароль");
        }
        catch (Exception e)
        {
            System.out.println("Введите пароль!");
        }
    }
}
