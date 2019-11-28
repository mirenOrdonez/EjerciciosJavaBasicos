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
    
    public int multa (int velocidad, boolean birthday) {
        if (birthday) { //si es mi cumple me quitan 5 puntos de velocidad
            velocidad -= 5;
        }
        if (velocidad <= 60) {
            return 0;
        }
        if (velocidad > 60 && velocidad <= 80) {
            return 1;
        }
        return 2; //el resto de casos que voy a más de 80
    }
    
    public boolean vanidoso (int multiplo) {
        if ((multiplo % 11) == 0){
            return true;
        }
        return false;
    }
    
    public boolean movil (boolean morning, boolean mama, boolean dormido) {
        if (mama) {
            return true;
        }
        if (dormido || morning && !mama) {
            return false;
        }
        return true;
    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //es el equivalente al run
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, false));
        System.out.println(ejercicios.fiestaArdillas(70, true));
        
            //testeo del ejercicio 2
        System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(65, true));
        
            //testeo del ejercicio 3
        System.out.println(ejercicios.vanidoso(22));
        System.out.println(ejercicios.vanidoso(23));
        System.out.println(ejercicios.vanidoso(24));
        
            //testeo del ejercicio 4
        System.out.println(ejercicios.movil(false, false, false));
        System.out.println(ejercicios.movil(false, false, true));
        System.out.println(ejercicios.movil(true, false, false));
        
    }
    
}
