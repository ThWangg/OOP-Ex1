public class TestCircle{
    public static void main(String[]args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(5, "white");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        c3.setColor("blue");
        c2.setRadius(4);
        System.out.println("------------");
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("------------");
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
    }
}