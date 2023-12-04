public class Main {
    public static void main(String[] args) {
        Programer java = new Programer(
                "Jamal",
                20,
                "London",
                "Fullstack"
        );
        System.out.println(java);
        java.writeSomeCode();
        java.sayHi();
    }
}