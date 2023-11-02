public class Main {

    public static void main(String[] args) {
        Main myFactory = new Main();

    }

    // constructor method
    // a constructor is a method with no return type
    // that has the same name as the class it's in
    public Main() {
        // strawberry : red, triangle, 200, yes, 20
        Fruit strawberry;                             // declare strawberry
        strawberry = new Fruit();                     // construct strawberry
        strawberry.colour = "red";
        strawberry.shape = "triangle";
        strawberry.numBush = 20;
        strawberry.isRipe = true;
        strawberry.numSeeds = 200;
        strawberry.printInfo();

        Fruit apple;                             // declare strawberry
        apple = new Fruit();                     // construct strawberry
        apple.colour = "red";
        apple.shape = "sphere";
        apple.numBush = 1000;
        apple.isRipe = true;
        apple.numSeeds = 10;
        apple.Print();





        // apple : red, circle, 10, yes, 30  <---HW do this

    }
}
