package ejerciciosbasicosjava;

/**
 *
 * @author mirenordonezdearce
 */
public class EjerciciosBasicosJava {
        //ejercicio 1
    public boolean fiestaArdillas (int numBellotas, boolean finDeSemana) {
        if (numBellotas >= 40 && numBellotas <= 60 && !finDeSemana || numBellotas >=40 && finDeSemana) {
            return true;
        }
        return false;
    }
        //ejercicio 2
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
        //ejercicio 3
    public boolean muyVanidoso (int multiplo) {
        if ((multiplo % 11) == 0 || (multiplo % 11) == 1 ){
            return true;
        }
        return false;
    }
        //ejercicio 4
    public boolean movil (boolean morning, boolean mama, boolean dormido) {
        if (morning && mama && dormido || !morning && !dormido) {
            return true;
        }
        return false;
    }
    
        //ejercicio 5 
    public boolean menorPor10 (int a, int b, int c) {
        if (Math.abs (a - b) >= 10 || Math.abs (a - c) >= 10 || Math.abs (b - c) >= 10 || Math.abs (b - a) >= 10 || Math.abs (c - a) >= 10 || Math.abs (c - b) >= 10) {
            return true;
        }
        return false;
    }
    
        //ejercicio 6
    public boolean digitoIgual (int num1, int num2) {
        if (num1/10 == num2/10 || num1/10 == num2%10 || num1%10 == num2/10) {
            return true;
        }
        return false;
    }
    
        //ejercicio 7 
    public boolean multiploMultiple (int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return false;
        }
        if (num % 3 == 0 || num % 5 == 0) {
            return true;
        }
        return false;
    }
    
        //ejercicio 8 
    public boolean menos20 (int num) {
        if ((num + 1) % 20 == 0 || (num + 2) % 20 == 0) {
            return true;
        }
        return false;
    }
   
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //es el equivalente al run
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        
            //testeo del ejercicio 1
        System.out.println("fiestaArdillas (30, false): " + ejercicios.fiestaArdillas(30, false));
        System.out.println("fiestaArdillas (50, false): " + ejercicios.fiestaArdillas(50, false));
        System.out.println("fiestaArdillas (70, true): " + ejercicios.fiestaArdillas(70, true));
        
            //testeo del ejercicio 2
        System.out.println("multa (60, false): " + ejercicios.multa(60, false));
        System.out.println("multa (65, false): " + ejercicios.multa(65, false));
        System.out.println("multa (65, true): " + ejercicios.multa(65, true));
        
            //testeo del ejercicio 3
        System.out.println("muyVanidoso (22): " + ejercicios.muyVanidoso(22));
        System.out.println("muyVanidoso (23): " + ejercicios.muyVanidoso(23));
        System.out.println("muyVanidoso (24): " + ejercicios.muyVanidoso(24));
        
            //testeo del ejercicio 4
        System.out.println("movil (false, false, false): " + ejercicios.movil(false, false, false));
        System.out.println("movil (false, false, true): " + ejercicios.movil(false, false, true));
        System.out.println("movil (true, false, false): " + ejercicios.movil(true, false, false));
        
            //testeo del ejercicio 5 
        System.out.println("menorPor10 (1,7,11): " + ejercicios.menorPor10(1, 7, 11)); 
        System.out.println("menorPor10 (1,7,10): " + ejercicios.menorPor10(1, 7, 10));
        System.out.println("menorPor10 (11,1,7): " + ejercicios.menorPor10(11, 1, 7));
        
            //testeo del ejercicio 6 
        System.out.println("digitoIgual (12, 23): " + ejercicios.digitoIgual(12,23));
        System.out.println("digitoIgual (12, 43): " + ejercicios.digitoIgual(12,43));
        System.out.println("digitoIgual (12, 44): " + ejercicios.digitoIgual(12,44));
        
            //testeo del ejercicio 7 
        System.out.println("multiploMultiple (3): " + ejercicios.multiploMultiple(3));
        System.out.println("multiploMultiple (10): " + ejercicios.multiploMultiple(10));
        System.out.println("multiploMultiple (15): " + ejercicios.multiploMultiple(15));
        
            //testeo del ejercicio 8
        System.out.println("menos20 (18): " + ejercicios.menos20(18));
        System.out.println("menos20 (19): " + ejercicios.menos20(19));
        System.out.println("menos20 (20): " + ejercicios.menos20(20));
    }
    
}
