package casoestudiofigura;

public class CasoEstudioFigura {
    
    private static void init(Figura []figuras) {
        figuras[ 0 ] = new Punto(1,1);
        figuras[ 1 ] = new Circulo(1,1,2);
        figuras[ 2 ] = new Cilindro(1,1,2,4);
    }
    
    private static void imprimir(Figura []figuras) {
        
        for(int i = 0; i < figuras.length; i++ ){
            System.out.println( "--- " + figuras[i].getNombre() + " ---" );
            System.out.println(" coor:\t\t"+figuras[i]);
            System.out.println(" area:\t\t"+figuras[i].area());
            System.out.println(" volumen:\t"+figuras[i].volumen());
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Figura []figuras = new Figura[3];
        init(figuras);
        imprimir(figuras);
    }
}
