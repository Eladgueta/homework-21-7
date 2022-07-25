public class Animal {

    String name ;

    public Animal(String name) {
        this.name = name;
    }

  void suond(){}

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
