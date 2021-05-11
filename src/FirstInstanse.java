class FirstInstanse {
    public static void main(String[] args) {

        Car porsche = new Car();
        System.out.println("Цвет Porsche " + porsche.color);
        System.out.println("Кузов Porsche "+ porsche.bodyType);
        System.out.println(porsche.accelerate());
    }
}
