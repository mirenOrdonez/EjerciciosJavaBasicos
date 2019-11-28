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
        
    }
    
}
