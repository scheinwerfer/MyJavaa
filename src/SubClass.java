class SubClass extends SuperClass {
    public static void main(String[] args) {
        hello();
        SuperClass.hello();
        try {
            echo(args[0]);
        } catch (Exception e) {
            System.out.println("аргумент введи, чмо");
        }
    }
    public static void hello() {
        System.out.println("hello from SubClass");
    }
}
