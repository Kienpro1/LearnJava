public class Programer extends Employee {
    private String[] programingLanguage;

    public Programer(String name,
                     int age,
                     String address,
                     String experience) {
        super(name, age, address, experience);
    }
    public void writeSomeCode(){
        System.out.println(this.name+" :write some code");
    }
    @Override
    public void sayHi(){
        System.out.println("hello "+this.name);
    }
}
