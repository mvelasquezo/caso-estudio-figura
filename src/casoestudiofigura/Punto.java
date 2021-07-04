package casoestudiofigura;

public class Punto extends Figura {
    protected double x;
    protected double y;
   
    public Punto(double x, double y){
        setX(x); setY(y);
    }
    
    public Punto() {
        this(0,0);
    }

    public void setY(double y) {
        this.y = y;
    }
   
    public void setX(double x){
        this.x = x;
    }
   
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public String toString() {
        return "[ " + x + ", " + y + " ]";
    }
    
    @Override
    public String getNombre() {
        return "{Punto}";
    }
}