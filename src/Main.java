import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nested classes");
        int x = ClassA.ClassB.number(6);
        System.out.println(x);

        System.out.println("Enum Time");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What should I eat at this time (in 24 format, hours only): ");
        int meal = scanner.nextInt();
        if (meal <= 24) {
            if (meal < 5) {
                System.out.println("It is better to go to sleep");
            } else if (meal < 9) {
                System.out.println(TIME.BREAKFAST.getValue());
            } else if (meal < 14) {
                System.out.println(TIME.LUNCH.getValue());
            } else if (meal < 18) {
                System.out.println(TIME.DINNER.getValue());
            } else if (meal < 20) {
                System.out.println(TIME.SUPPER.getValue());
            } else {
                System.out.println("Don't eat if you don't want to be FAT");
            }
        } else {
            System.out.println("Incorrect hours were entered");
        }

        System.out.println("Calculator");
        System.out.println(Calc.SUM.action(10, 5));
        System.out.println(Calc.SUBTRACK.action(41, 11));
        System.out.println(Calc.DIVIDE.action(30, 3));
        System.out.println(Calc.MULTIPLY.action(4, 6));
        System.out.println(Calc.INVOLUTION.action(2, 3));

    }
    }
    enum TIME {
        BREAKFAST("French toast"),
        LUNCH ("Avocado and egg sandwich"),
        DINNER("Rice with chicken and salad"),
        SUPPER("Oven-Baked Fench Bread Pizzas");
        String time;
        TIME(String time) {
            this.time = time;
        }
        public String getValue() {
            return time;
        }
    }
    // Calculator
    enum Calc {
        SUM {
            @Override
            public int action(int a, int b) {
                return a + b;
            }
        },
        SUBTRACK {
            @Override
            public int action(int a, int b) {
                return a - b;
            }
        },
        MULTIPLY {
            @Override
            public int action(int a, int b) {
                return a * b;
            }
        },
        DIVIDE {
            @Override
            public int action(int a, int b) {
                return a / b;
            }
        },
        INVOLUTION {
            @Override
            public int action(int a, int b) {
                int power = 1;
                for (int i =1; i<=b; i++) {
                    power = power * a;
                }
                return power;
            }
        };

        public abstract int action(int a, int b);
}