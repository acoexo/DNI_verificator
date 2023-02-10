import java.util.Scanner;
import java.util.Arrays;

public class DNI {
    public static void main(String[] args) {
        boolean validation1 = false;
        boolean validation2 = false;
        //Creamos un vector de caracteres que guarde todos los caracteres del String previamente solicitado.
        char[] dni_char = new char[9];
        String dni;
        do {
            Scanner in = new Scanner(System.in);
            //Le pedimos al usuario que introduzca una cadena de caracteres que corresponde a su DNI.
            System.out.print("Introduzca el DNI: ");
            dni = in.nextLine();
            //Transformamos el String en un array
            for (int i = 0; i < dni_char.length; i++) {
                dni_char[i] = dni.charAt(i);
            }
            if (dni.length() == 9) {
                for (int i = 0; i < dni.length(); i++) {
                    if (dni.charAt(i) >= 48 && dni.charAt(i) <= 59) {
                        validation1 = true;
                        break;
                    }
                }
                if ((dni_char[8] >= 65 && dni_char[8] <= 90) || (dni_char[8] >= 97 && dni_char[8] <= 122)) {
                    validation2 = true;
                }
            } else {
                System.out.println("Ha introducido un DNI inválido por favor introduzca un DNI con 8 números y una letra al final ");
            }
        } while (!validation1 && validation2);
        //Creamos un vector que solo guarde los números del DNI.
        int[] dni_int = new int[8];
        //Creamos una variable que sirva para guardar la validación(true/false)
        boolean correct = false;
        //Creamos una variable que extraiga el valor numérico de todos los valores del vector de enteros.
        int number = 0;
        /*
         * Le asignamos el valor numérico del vector de caracteres al de enteros, transformando los valores del vector de caracteres que se guardan
         * en código ASCII al valor entero que corresponde, o sea, en ASCII el número 1 equivale a 49 en decimal,
         * no queremos el 49, queremos el 1 y por eso lo transformamos.
         */
        for (int i = 0; i < dni_char.length - 1; i++) {
            //Lo transformamos usando la sentencia Character.getNumericValue(char) que realiza la función previamente explicada
            dni_int[i] = Character.getNumericValue(dni_char[i]);
        }
        //Extraemos el número que previamente hemos introducido en un vector.
        //Multiplicamos cada dígito para transformarlo en decenas, centenas, unidades de millar, etc.
        for (int i = 0; i < dni_int.length; i++) {
            switch (i) {
                case 0 -> number += (dni_int[i] * 10000000);
                case 1 -> number += (dni_int[i] * 1000000);
                case 2 -> number += (dni_int[i] * 100000);
                case 3 -> number += (dni_int[i] * 10000);
                case 4 -> number += (dni_int[i] * 1000);
                case 5 -> number += (dni_int[i] * 100);
                case 6 -> number += (dni_int[i] * 10);
                case 7 -> number += (dni_int[i]);
            }
        }
        //Hallamos el módulo del número transformado anteriormente entre 23.
        int module = number % 23;
        //Le asignamos al String letra el valor como carácter del último valor del vector dni_char, el cual es la letra del DNI.
        String letterChar = String.valueOf(dni_char[8]);
        letterChar = letterChar.toUpperCase();
        //Creamos un String al que le asignaremos una letra dependiendo del resto que nos dé.
        String letterString = "";
        //A cada letra se le ha asignado un resto por la U.U.E.E. (0 equivale a T, 18 equivale a H...)
        /*
         * Además, comparamos si al String que corresponde con la letra correspondiente al resto es equivalente al String que corresponde
         * a la letra que el usuario ha introducido.
         */
        switch (module) {
            case 0 -> {
                letterString = ("T");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 1 -> {
                letterString = ("R");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 2 -> {
                letterString = ("W");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 3 -> {
                letterString = ("A");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 4 -> {
                letterString = ("G");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 5 -> {
                letterString = ("M");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 6 -> {
                letterString = ("Y");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 7 -> {
                letterString = ("F");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 8 -> {
                letterString = ("P");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 9 -> {
                letterString = ("D");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 10 -> {
                letterString = ("X");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 11 -> {
                letterString = ("B");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 12 -> {
                letterString = ("N");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 13 -> {
                letterString = ("J");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 14 -> {
                letterString = ("Z");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 15 -> {
                letterString = ("S");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 16 -> {
                letterString = ("Q");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 17 -> {
                letterString = ("V");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 18 -> {
                letterString = ("H");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 19 -> {
                letterString = ("L");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 20 -> {
                letterString = ("C");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 21 -> {
                letterString = ("K");
                if (letterString.equals(letterChar)) correct = true;
            }
            case 22 -> {
                letterString = ("E");
                if (letterString.equals(letterChar)) correct = true;
            }
        } System.out.println("""

                ─────────────────────────
                 Resultado del análisis
                ─────────────────────────
                 """);
        //Devolvemos la respuesta correspondiente
        if (correct) System.out.println(letterChar + " es correcta");
        else System.out.println(letterChar + " no es la correcta");

        //Hacemos un debugger con el array dni_char, number, letra, letra_calc, letras y validation
        System.out.println("""
                ─────────────────────────
                 Debugger
                ─────────────────────────
                 """);
        System.out.println(Arrays.toString(dni_char));
        System.out.println("Número: " + number);
        System.out.println("Letra(char): " + letterChar);
        System.out.println("Resto: " + module);
        System.out.println("Letras(String): " + letterString);
        System.out.println("Validación: " + correct);
    }
}