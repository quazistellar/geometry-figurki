package org.example;

//abstract
abstract class Shape {
    public abstract double SquareShape();
    public abstract double PerShape();
}

//круг
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double SquareShape() {
        return Math.PI * radius * radius;
    }
    @Override
    public double PerShape() {
        return 2 * Math.PI * radius;
    }
}

//квадрат
class Squiarty extends Shape {
    private double storona;
    public Squiarty(double storona) {
        this.storona = storona;
    }
    @Override
    public double SquareShape() {
        return storona*storona;
    }
    @Override
    public double PerShape() {
        return storona*4;
    }
}

//треугольник
class Triangle extends Shape {
    private double storona1;
    private double storona2;
    private double storona3;
    private double height_tr;
    public Triangle(double storona1, double storona2, double storona3, double height) {
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
        this.height_tr = height;
    }

    @Override
    public double SquareShape() {
        double sq_treyg = (storona3*height_tr)/2;
        return sq_treyg;
    }
    @Override
    public double PerShape() {
        return storona1+storona2+storona3;
    }
}

// пятиугольник, еще можно площадь так искать -> S = n/4 × a 2 × ctg (pi/n),
class FiveSides extends Shape {
    private double storona_five;

    public FiveSides(double storona_five) {
        this.storona_five = storona_five;
    }
        @Override
        public double SquareShape () {
            double sq_pent = (1.72*(storona_five*2));
            return sq_pent;
        }
        @Override
        public double PerShape () {

            double per_pent = storona_five*5;
            return per_pent;
        }
    }

//трапеция
class Trapez extends Shape {
    private double osnovanie1;
    private double osnovanie2;
    private double storona3;
    private double storona4;
    private double trapez_hei;

    public Trapez(double osnovanie1, double osnovanie2, double storona3, double storona4, double trapez_hei){
        this.osnovanie1 = osnovanie1;
        this.osnovanie2 = osnovanie2;
        this.storona3 = storona3;
        this.storona4 = storona4;
        this.trapez_hei = trapez_hei;
    }

    @Override
    public double SquareShape() {
        double sq_trapez = ((osnovanie1+osnovanie2)/2)*trapez_hei;
        return sq_trapez;
    }

    @Override
    public double PerShape() {
        double per_trapez = osnovanie1+osnovanie2+storona3+storona4;
        return per_trapez;
    }
}

//прямоугольник
class Pryamoyg extends Shape {
    private double dlina_pryam;
    private double shir_pryam;

    public Pryamoyg(double dlina_pryam, double shir_pryam){
        this.dlina_pryam = dlina_pryam;
        this.shir_pryam = shir_pryam;
    }

    @Override
    public double SquareShape() {
        double sq_pryam = dlina_pryam*shir_pryam;
        return sq_pryam;
    }

    @Override
    public double PerShape() {
        double per_pryam = (dlina_pryam+shir_pryam)*2;
        return per_pryam;
    }
}

//параллелограмм
class Parallelogramm extends Shape {
    private double prllgrm_side;
    private double prllgrm_side2;
    private double prllgrm_side3;
    private double prllgrm_side4;
    private double prllgrm_hei;

    public Parallelogramm(double prllgrm_side, double prllgrm_hei, double prllgrm_side2, double prllgrm_side3, double prllgrm_side4){
        this.prllgrm_side = prllgrm_side;
        this.prllgrm_hei = prllgrm_hei;
        this.prllgrm_side2 = prllgrm_side2;
        this.prllgrm_side3 = prllgrm_side3;
        this.prllgrm_side4 = prllgrm_side4;
    }

    @Override
    public double SquareShape() {
        double sq_prllgrm = prllgrm_side*prllgrm_hei;
        return sq_prllgrm;
    }

    @Override
    public double PerShape() {
        double per_prllgrm = (prllgrm_side+prllgrm_side2)*2;
        return per_prllgrm;
    }
}

//параллелепипед
class Parallelepiped extends Shape {
    private double osnov_1;
    private double osnov_2;
    private double bok_rebro;

    public Parallelepiped(double osnov_1, double osnov_2, double bok_rebro) {
        this.osnov_1 = osnov_1;
        this.osnov_2 = osnov_2;
        this.bok_rebro = bok_rebro;
    }
    @Override
    public double SquareShape() {
        double sq_prllppd =  (2*bok_rebro)*(osnov_1+osnov_2);
        return sq_prllppd;
    }
    @Override
    public double PerShape() {
        double ob_prllppd = osnov_1*osnov_2*bok_rebro;
        return ob_prllppd;
    }

}

//сфера
class Sphere extends Shape {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double SquareShape() {
        return 4*Math.PI * radius * radius;
    }
    @Override
    public double PerShape() {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
}

//цилиндр
class Cilindr extends Shape {
    private double r_cil;
    private double h_cil;
    public Cilindr(double r_cil, double h_cil) {
        this.r_cil = r_cil;
        this.h_cil = h_cil;
    }
    @Override
    public double SquareShape() {
        return (2*Math.PI*r_cil*h_cil)+(2*Math.PI*(r_cil*r_cil));
    }
    @Override
    public double PerShape() {
        return Math.PI*(r_cil*r_cil)*h_cil;
    }
}

//ромб
class Romb extends Shape {
    private double h_romb;
    private double s_romb;
    public Romb(double h_romb, double s_romb) {
        this.h_romb = h_romb;
        this.s_romb = s_romb;
    }
    @Override
    public double SquareShape() {
        return h_romb*s_romb;
    }
    @Override
    public double PerShape() {
        return s_romb*4;
    }
}

//конус
class Konus extends Shape {
    private double r_konus;
    private double l_konus;
    private double h_konus;
    public Konus(double r_konus, double l_konus, double h_konus) {
        this.r_konus = r_konus;
        this.l_konus = l_konus;
        this.h_konus = h_konus;
    }
    @Override
    public double SquareShape() {
        return Math.PI*r_konus*(r_konus+l_konus);
    }
    @Override
    public double PerShape() {
        return (double) 1 /3*Math.PI*(r_konus*r_konus)*h_konus;
    }
}
