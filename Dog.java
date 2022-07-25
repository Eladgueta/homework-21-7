public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void suond() {
        System.out.println("bark");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

