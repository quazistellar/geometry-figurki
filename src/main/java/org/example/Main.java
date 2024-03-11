package org.example;
import java.util.*;

public class Main {

    public static final String GREEN = "\u001B[32m";
    public static final String RES_COLOR = "\u001B[0m";
    public static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) throws InterruptedException {
        ActionShape();
    }

    public static void ActionShape() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println(PURPLE + "                >   figurki   <                 " + PURPLE);
        System.out.println(RES_COLOR + "------------------------------------------------");
        System.out.println(PURPLE + "\nВыберите фигуру для того, чтобы с ней работать: " + RES_COLOR);
        System.out.println("------------------------------------------------");
        System.out.println(GREEN + "1. Круг");
        System.out.println("2. Квадрат");
        System.out.println("3. Треугольник");
        System.out.println("4. Пятиугольник");
        System.out.println("5. Трапеция");
        System.out.println("6. Прямоугольник");
        System.out.println("7. Параллелограмм");
        System.out.println("8. Параллелепипед");
        System.out.println("9. Цилиндр");
        System.out.println("10. Сфера");
        System.out.println("11. Ромб");
        System.out.println("12. Конус");
        System.out.println("0. Выход" + RES_COLOR);


        while (true) {

            if (sc.hasNextInt()) {

                int choice = sc.nextInt();

                Shape _shape = null;

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Введите радиус круга: ");
                            double radius = sc.nextDouble();
                            _shape = new Circle(radius);

                            if (_shape != null) {
                                System.out.println();
                                System.out.printf("> площадь круга: %.2f\n", _shape.SquareShape());
                                System.out.printf("> периметр круга:  %.2f\n", _shape.PerShape());
                                System.out.println();
                                tryagain();
                            }
                        case 2:
                            System.out.print("Введите сторону квадрата: ");
                            double storona = sc.nextDouble();
                            _shape = new Squiarty(storona);

                                System.out.println();
                                System.out.printf("> площадь квадрата: %.2f\n", _shape.SquareShape());
                                System.out.printf("> периметр квадрата: %.2f\n", _shape.PerShape());
                                tryagain();
                            break;
                        case 3:
                            System.out.print("Введите первую сторону треугольника: ");
                            double storona_treyg1 = sc.nextDouble();
                            System.out.print("Введите вторую сторону треугольника: ");
                            double storona_treyg2 = sc.nextDouble();
                            System.out.print("Введите третью (основание) сторону треугольника: ");
                            double storona_treyg3 = sc.nextDouble();
                            System.out.print("Введите высоту треугольника: ");
                            double height_treyg = sc.nextDouble();

                            if ((storona_treyg1 + storona_treyg2 > storona_treyg3) &&
                                    (storona_treyg1 + storona_treyg3 > storona_treyg2)
                                    && (storona_treyg2 + storona_treyg3 > storona_treyg1)) {
                                System.out.println();
                                System.out.println("треугольник с такими сторонами не может существовать!");
                                System.out.println();
                                ActionShape();
                            }

                            _shape = new Triangle(storona_treyg1, storona_treyg2, storona_treyg3, height_treyg);

                                System.out.println();
                                System.out.printf("> площадь треугольника: %.2f\n", _shape.SquareShape());
                                System.out.printf("> периметр треугольника: %.2f\n", _shape.PerShape());
                                tryagain();
                            break;

                        case 4:
                            System.out.print("Введите длину одной стороны пятиугольника: ");
                            double storona_five = sc.nextDouble();

                            _shape = new FiveSides(storona_five);

                                System.out.println();
                                System.out.printf("> площадь пятиугольника: %.2f\n", _shape.SquareShape());
                                System.out.printf("> периметр пятиугольника: %.2f\n", _shape.PerShape());
                                tryagain();

                            break;
                        case 5:
                            System.out.print("Введите длину первого основания трапеции: ");
                            double trapez_osn1 = sc.nextDouble();
                            System.out.print("Введите длину второго основания трапеции: ");
                            double trapez_osn2= sc.nextDouble();
                            System.out.print("Введите длину третьей стороны трапеции: ");
                            double trapez_side3 = sc.nextDouble();
                            System.out.print("Введите длину четвертой стороны трапеции: ");
                            double trapez_side4 = sc.nextDouble();
                            System.out.print("Введите высоту трапеции: ");
                            double trapez_hei = sc.nextDouble();

                            _shape = new Trapez(trapez_osn1, trapez_osn2, trapez_side3, trapez_side4, trapez_hei);

                                System.out.println();
                                System.out.printf("> площадь трапеции: %.2f\n", _shape.SquareShape());
                                System.out.printf("> периметр трапеции: %.2f\n", _shape.PerShape());
                                tryagain();

                            break;
                        case 6:
                            System.out.print("Введите длину прямоугольника: ");
                            double pryamoyg_dlina = sc.nextDouble();
                            System.out.print("Введите ширину прямоугольника: ");
                            double pryamoyg_width = sc.nextDouble();

                            _shape = new Pryamoyg(pryamoyg_dlina, pryamoyg_width);

                                System.out.println();
                                System.out.printf("> площадь прямоугольника: %.2f\n", _shape.SquareShape());
                                System.out.printf("> периметр прямоугольника: %.2f\n", _shape.PerShape());
                                tryagain();
                            break;
                        case 7:
                            System.out.print("Введите высоту параллелограмма: ");
                            double prlgrm_hei = sc.nextDouble();
                            System.out.print("Введите первую сторону параллелограмма: ");
                            double prlgrm_side1 = sc.nextDouble();
                            System.out.print("Введите вторую сторону параллелограмма: ");
                            double prlgrm_side2 = sc.nextDouble();
                            System.out.print("Введите третью сторону параллелограмма: ");
                            double prlgrm_side3 = sc.nextDouble();
                            System.out.print("Введите четвертую сторону параллелограмма: ");
                            double prlgrm_side4 = sc.nextDouble();

                            _shape = new Parallelogramm(prlgrm_hei, prlgrm_side1, prlgrm_side2, prlgrm_side3, prlgrm_side4);
                                System.out.println();
                                System.out.printf("> площадь прямоугольника: %.2f\n", _shape.SquareShape());
                                System.out.printf("> периметр прямоугольника: %.2f\n", _shape.PerShape());
                                tryagain();
                            break;
                        case 8:

                            System.out.print("Введите первую сторону основания параллелепипеда: ");
                            double prllppd_osn1 = sc.nextDouble();
                            System.out.print("Введите вторую сторону основания параллелепипеда: ");
                            double prllppd_osn2 = sc.nextDouble();
                            System.out.print("Введите боковое ребро параллелепипеда: ");
                            double prllppd_bok_rebro = sc.nextDouble();

                            _shape = new Parallelepiped(prllppd_osn1, prllppd_osn2,prllppd_bok_rebro);
                            System.out.println();
                            System.out.printf("> площадь параллелепипеда: %.2f\n", _shape.SquareShape());
                            System.out.printf("> объем параллелепипеда: %.2f\n", _shape.PerShape());

                            double per_prllppd = (4*prllppd_osn1)+(4*prllppd_osn2)+(4*prllppd_bok_rebro);
                            System.out.printf("> периметр параллелепипеда: %.2f\n", per_prllppd);

                            tryagain();
                            break;
                        case 9:
                            System.out.print("Введите радиус основания цилиндра: ");
                            double r_cilindr = sc.nextDouble();
                            System.out.print("Введите высоту цилиндра: ");
                            double h_cilindr = sc.nextDouble();

                            _shape = new Cilindr(r_cilindr, h_cilindr);
                            System.out.println();
                            System.out.printf("> площадь цилиндра: %.2f\n", _shape.SquareShape());
                            System.out.printf("> объем цилиндра: %.2f\n", _shape.PerShape());
                            tryagain();


                            break;
                        case 10:
                            System.out.print("Введите радиус сферы: ");
                            double r_sphere = sc.nextDouble();
                            _shape = new Sphere(r_sphere);
                            System.out.println();
                            System.out.printf("> площадь сферы: %.2f\n", _shape.SquareShape());
                            System.out.printf("> объем сферы: %.2f\n", _shape.PerShape());
                            tryagain();
                            break;
                        case 11:
                            System.out.print("Введите высоту ромба: ");
                            double h_romb = sc.nextDouble();
                            System.out.print("Введите сторону ромба, на которую опирается указанная Вами высота: ");
                            double s_romb = sc.nextDouble();
                            _shape = new Romb(h_romb, s_romb);
                            System.out.println();
                            System.out.printf("> площадь ромба: %.2f\n", _shape.SquareShape());
                            System.out.printf("> периметр ромба: %.2f\n", _shape.PerShape());
                            tryagain();
                            break;
                        case 12:
                            System.out.print("Введите радиус конуса: ");
                            double r_konus = sc.nextDouble();
                            System.out.print("Введите образующую конуса: ");
                            double l_konus = sc.nextDouble();
                            System.out.print("Введите высоту конуса: ");
                            double h_konus = sc.nextDouble();

                            _shape = new Konus(r_konus, l_konus, h_konus);
                            System.out.println();
                            System.out.printf("> площадь конуса: %.2f\n", _shape.SquareShape());
                            System.out.printf("> объём конуса: %.2f\n", _shape.PerShape());
                            tryagain();
                            break;
                        case 0:
                            System.out.println(GREEN + "------------------------------------------" + GREEN);
                            System.out.println( GREEN + "    Вы завершили работу с программой!!!" + GREEN);
                            System.out.println("------------------------------------------");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("--------------------------------------");
                            System.out.println("упс, такого варианта в менюшке нет! попробуйте ещё раз!");
                            ActionShape();
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println();
                    System.out.println("----------------------------------");
                    System.out.println("Ошибка: неверный ввод для числа!");
                    System.out.println();
                    Thread.sleep(500);
                    ActionShape();
                }
            }
                  else {
                    System.out.println("\n-----------------------------------");
                    System.out.println("попробуйте ещё раз и введите число!");
                    System.out.println();
                    Thread.sleep(500);
                    System.out.println();
                    ActionShape();
                }
            }
    }

    public static void tryagain() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Хотите продолжить работу с фигурами (да/нет)?");
        System.out.println("--------------------------------------");

        while (true) {

            String answer = sc.nextLine().toLowerCase();

            if (answer.equals("да")) {
                ActionShape();
                break;
            }

            else if (answer.equals("нет")) {

                System.out.println();
                System.out.println(GREEN + "------------------------------------------" + GREEN);
                System.out.println( GREEN + "    Вы завершили работу с программой!!!" + GREEN);
                System.out.println("------------------------------------------");
                System.out.println();
                System.exit(0);
            }
            else {
                System.out.println("Такого варианта ответа нет, попробуйте ещё раз :( ");
                tryagain();
                break;
            }
        }
}   }