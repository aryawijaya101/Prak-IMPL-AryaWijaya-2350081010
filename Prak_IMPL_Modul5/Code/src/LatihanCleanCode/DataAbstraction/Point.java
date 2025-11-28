package LatihanCleanCode.DataAbstraction;

public interface Point {

    double getX();
    double getY();

    void setCartesian(double x, double y);

    double getR(); // Radius (r)
    double getTheta(); // Angle (θ)

    void setPolar(double r, double theta);
}
