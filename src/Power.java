public class Power {
    public static void main(String[] args) {
        try {
        int num = Integer.parseInt(args[0]);
        int square = (int) Math.pow(num, 2);
        int cube = (int) Math.pow(num, 3);
        int sqrt = (int) Math.sqrt(num);

        System.out.println("Квадрат " + num + " равен " + square);
        System.out.println("Куб " + num + " равен " + cube);
        System.out.println("Корень " + num + " равен " + sqrt);}
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Вы не ввели аргумент");
        }
    }
}
