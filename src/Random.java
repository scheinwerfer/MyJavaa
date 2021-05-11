public class Random {
    public static void main(String[] args) {
        float random = (float) Math.random();
        float multiplied = random * 10;
        int rndInt = (int) Math.ceil(multiplied);

        System.out.println("Рандомное число "+random);
        System.out.println("Умноженное на 10 "+multiplied);
        System.out.println("Рандомное целое "+rndInt);
    }
}
