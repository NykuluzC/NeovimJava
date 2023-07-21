
public class main {
  public static void main(String[] args) {
    Animals dog = new Animals("Nykz",4,"Syberian");
    System.out.println(dog.getName());
    System.out.println("\n");
    Dog carldog = new Dog();
    System.out.println(carldog.getName());
    carldog.bark();
  }
}

