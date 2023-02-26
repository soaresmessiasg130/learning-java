public class ArraysInJava {
  public static void main(String[] args) {
    String[] coffeeTypes = {
      "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso",  "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"
    };

    // String[] partOfCoffeeTypes = java.util.Arrays.copyOfRange(coffeeTypes, 0, 6);

    // for (String coffeeType : partOfCoffeeTypes) {
    //   System.out.println(coffeeType);
    // }

    // java.util.Arrays
    //   .stream(coffeeTypes)
    //   .map(coffee -> "* " + coffee)
    //   .forEach(System.out::println);

    System.out.println(java.util.Arrays.toString(coffeeTypes));
  }
}
