abstract class CShape {
    protected String color;

    public void setColor(String str) {
        color = str;
    }

    public abstract void show();
}

class CTriangle extends CShape {
    protected double base, height, slide;

    public CTriangle(double a, double b, double c) {
        base = a;
        height = b;
        slide = c;
    }

    public void show() {
        System.out.println("color = " + color);
        System.out.println("area = " + base * height / 2);
    }
}

class app11_1 {

    public static void main(String args[]) {
        CShape atriangle = new CTriangle(3, 4, 5);
        atriangle.setColor("red");
        atriangle.show();
    }
}
