package accessmodifier.movable;

public class Truck {
   static int stopSpeed;

        public static void truckRuns() {
            Car someOnesCar = new Car(10);
            System.out.println(someOnesCar.modelName);
        }

        public static void truckStops(int speed) {
            stopSpeed = 10;
        }

        static {
            System.out.println(1);
        }

        static {
            System.out.println(2);
        }

    }

