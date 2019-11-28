package ejerciciosbasicosjava;

/**
 *
 * @author mirenordonezdearce
 */
public class EjerciciosBasicosJava {
    
    public boolean fiestaArdillas (int numBellotas, boolean finDeSemana) {
        if (numBellotas >= 40 && numBellotas <= 60 && !finDeSemana || numBellotas >=40 && finDeSemana) {
            return true;
        }
        return false;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //es el equivalente al run
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, false));
        System.out.println(ejercicios.fiestaArdillas(70, true));
        
    }
    
}
