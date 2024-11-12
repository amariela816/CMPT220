

public class classes {
    public static void main(String[] args) {
      Dog dg = new Dog("Cooper", 10, "Cavapoo", "boy");
      Dog dg1 = new Dog("Peanut", 4, "Corgi", "girl");
      Dog dg2 = new Dog("Jesse", 14, "German Shorthand Pointer", "boy");


      System.out.println(dg.name);
      System.out.println(dg1.name);
      System.out.println(dg2.name);

      System.out.println();
      dg.isSenior();
      dg1.isSenior();
      dg2.isSenior();

      System.out.println();
      dg.favBreed();
      dg1.favBreed();
      dg2.favBreed();

      System.out.println();
      dg.gender();
      dg1.gender();
      dg2.gender();

      cars car1 = new cars("Hyundai", "Sonata", "White", 2019);
      cars car2 = new cars("Kia", "K5", "White",2023);
      System.out.println();
      System.out.println(car1.make);
      System.out.println(car2.year);
    }
} 