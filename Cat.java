public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void suond() {
        System.out.println("miaooo");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
