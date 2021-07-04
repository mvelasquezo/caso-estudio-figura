package casoestudiofigura;

public class Cilindro extends Circulo {
    protected double altura;
    
    public Cilindro(double x, double y, double radio, double altura){
        super(x,y,radio);
        setAltura(altura);
    }
    
    public Cilindro() {
        this(0,0,0,0);
    }

    public void setAltura(double altura) {
        this.altura = (altura>0)?altura:0;
    }

    public double getAltura() {
        return altura;
    }
    
    @Override
    public double area() {
        //areaSuperficial
        return 2 * super.area() + 2 * Math.PI * super.radio * altura;
    }
    
    @Override
    public double volumen() {
        return super.area() * altura;
    }
    
    public String toString() {
        return super.toString() + "; altura = " + altura;
    }
    
    @Override
    public String getNombre() {
        return "{Cilindro}";
    }
}
