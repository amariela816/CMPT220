public class Dog {
    String name;
    int age;
    String breed;
    String sex;

    public Dog(String n, int a, String b, String s){
        name = n;
        age = a;
        breed = b;
        sex = s;

    }


    void isSenior(){
        if(this.age> 8){
            System.out.println(this.name + " is a senior dog.");
        } else {
            System.out.println(this.name + " is not a senior dog");
        }
    }

    void favBreed(){
        if(this.breed.equals("Pug")){
            System.out.println(this.name + " is a pug!");
        } else{
            System.out.println(this.name + " is not a pug :(");
        }
    }

    void gender(){
        if(this.sex.equalsIgnoreCase("Boy")){
            System.out.println(this.name + " is a boy");

        }else {
            System.out.println(this.name+ " is a girl");

        }
    }
}
