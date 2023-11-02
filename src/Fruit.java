public class Fruit {

        // variable declarations
        public String colour;
        public String shape;
        public int numSeeds;
        public boolean isRipe;
        public int numBush;

        public void printInfo() {
            System.out.println("The fruit is:" + colour);
            System.out.println("The fruit is a:" + shape);
            System.out.println("The fruit seedcount is:" + numSeeds);
            if (isRipe == true) {
                System.out.println("The fruit is ripe");
            } else {
                System.out.println("The fruit is not ripe :(");
            }

        }

        public void Print() {

            System.out.println("The fruit is:" + colour);
            System.out.println("The fruit is a:" + shape);
            System.out.println("The fruit seedcount is:" + numSeeds);
            if (isRipe == true) {
                System.out.println("The fruit is ripe");
            }
            else {
                System.out.println("The fruit is not ripe :(");
            }
            System.out.println("The fruit's bushcount is:" + numBush);

        }





    public Fruit() {



    }
}

