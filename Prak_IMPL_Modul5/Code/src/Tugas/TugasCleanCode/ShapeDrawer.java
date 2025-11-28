package Tugas.TugasCleanCode;

public class ShapeDrawer {

    private final int mouseX;
    private final int mouseY;
    private final int numCircles = 6;

    public ShapeDrawer(int initialX, int initialY) {
        this.mouseX = initialX;
        this.mouseY = initialY;
    }

    public void drawShape() {
        System.out.println("--- Proses Drawing dengan Clean Formatting ---");

        System.out.println("Menggambar Rectangle: (100, 0) dengan Fill Color (80, 204, 55).");

        for (int i = numCircles; i > 1; i--) {
            int radius = i * 7;

            if (mouseX > 100 && mouseX < 300) {
                System.out.print("[Lingkaran " + i + "] Fill Color (255, 255, 255) | ");
            } else {
                System.out.print("[Lingkaran " + i + "] Fill Color (80, 204, 55) | ");
            }

            System.out.println("Draw Ellipse di (" + mouseX + ", " + mouseY + ") dengan Radius: " + radius);
        }

        System.out.println("-------------------------------");
    }
}

class MainDrawingApp {

    public static void main(String[] args) {
        ShapeDrawer caseIn = new ShapeDrawer(200, 150);
        caseIn.drawShape();

        ShapeDrawer caseOut = new ShapeDrawer(50, 150);
        caseOut.drawShape();
    }
}
