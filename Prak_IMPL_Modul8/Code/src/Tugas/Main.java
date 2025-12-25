package Tugas;

public class Main {
    public static void main(String[] args) {
        DrawingContext context = new DrawingContext();

        ConsoleWindow cw = new ConsoleWindow("Console");
        DialogBox db = new DialogBox("Save Dialog");
        DataController dc = new DataController();
        db.setController(dc);

        Frame frame = new Frame(cw);
        frame.getMainWindow().open();
        frame.getMainWindow().display();

        Circle c = new Circle(8f, new Point(60, 60));
        c.draw(context);
        System.out.println("Circle area = " + c.area());
        System.out.println("Circle circum = " + c.circum());

        Rectangle r = new Rectangle(new Point(8, 8), 80, 40);
        r.draw(context);

        Point[] pts = {new Point(0, 0), new Point(10, 0), new Point(10, 10), new Point(0, 10)};
        Polygon p = new Polygon(pts);
        p.draw(context);
    }
}