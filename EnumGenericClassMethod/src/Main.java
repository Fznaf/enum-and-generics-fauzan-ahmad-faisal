enum RectangleColor {
    Magenta,
    Violet,
    Cyan,
    Yellow
}
class Rectangle<R> {
    R obj;

    Rectangle(R obj) {
        this.obj = obj;
    }

    public R getObject() {
        return this.obj;
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("Rectangle Name:\t");
        Rectangle<String> sObj = new Rectangle<String>("Rectangle1");
        RectangleColor color = RectangleColor.Cyan;

        Rectangle<String> sObj2 = new Rectangle<String>("Rectangle2");
        RectangleColor color2 = RectangleColor.Yellow;

        Rectangle<String> sObj3 = new Rectangle<String>("Rectangle3");
        RectangleColor color3 = RectangleColor.Violet;

        System.out.println(sObj.getObject());
        System.out.println("Color:\n" + color);

        System.out.print("\n");

        System.out.println("Rectangle Name:\t");
        System.out.println(sObj2.getObject());
        System.out.println("Color:\n" + color2);

        System.out.print("\n");

        System.out.println("Rectangle Name:\t");
        System.out.println(sObj3.getObject());
        System.out.println("Color:\n" + color3);
    }
}