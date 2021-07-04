package casoestudiofigura;

public class Circulo extends Punto {
    protected double radio;
    
    public Circulo(double x, double y, double radio){
        super(x,y);
        setRadio(radio);
    }
    
    public Circulo(){
        this(0,0,0);
    }

    public void setRadio(double radio) {
        this.radio = (radio > 0)?radio:0;
    }

    public double getRadio() {
        return radio;
    }
    
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    
    public String toString(){
        return super.toString() + "; radio = " + radio;
    }
    
    @Override
    public String getNombre() {
        return "{Círculo}";
    }
    
}
