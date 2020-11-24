package ru.mirea.pr11.zd4;





import java.util.Scanner;

public class Test {
    public static void evaluate1() throws Exception {
        System.out.println("Function: x * (y-2) * z + 1, ");
        System.out.print("Enter the value x, y, z: ");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        ExpressionParser function = new Add(
                new Multiply(
                        new Variable("x"),
                        new Multiply(
                                new Subtract(
                                        new Variable("y"),
                                        new Const(2)
                                ),
                                new Variable("z")
                        )
                ),
                new Const(1)
        );
        System.out.println("Result: "+function.evaluate(x,y,z));

    }

    public static void evaluate2() throws Exception {
        System.out.println("Function: 1000000*x*x*x*x*x/(x-1) ");
        System.out.print("Enter the value x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        ExpressionParser function = new Divide(
                new Multiply(
                        new Const(1000000),
                        new Multiply(
                            new Multiply(
                                    new Multiply(
                                        new Variable("x"),
                                        new Variable("x")
                                    ),
                                    new Multiply(
                                        new Variable("x"),
                                        new Variable("x")
                                    )
                            ),
                                new Variable("x")
                        )
                ),
                new Subtract(
                        new Variable("x"),
                        new Const(1)
                )
        );
        System.out.println("Result: "+function.evaluate(x,0,0));
    }

    public static void main(String[] args) {
        boolean run=true;
        while (run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Expression: [x * (y-2) * z + 1]");
            System.out.println("2. Expression: [1000000*x*x*x*x*x/(x-1)]");
            System.out.println("Enter another number to exit.");
            System.out.print("Please choose: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    try {
                        evaluate1();
                    } catch (Exception e) {
                        System.out.println("Input number! Please try again.");
                    }
                    break;
                case 2:

                    try {
                        evaluate2();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    run=false;
                    System.out.print("Goodbye.");
            }
        }
    }
}
