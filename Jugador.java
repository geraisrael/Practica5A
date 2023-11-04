/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.mastermind;

/**
 *
 * @author israe
 */
import java.util.HashMap;
public class Jugador {
    HashMap<String, Integer> combinaciones;
    
    public Jugador()
    {
        combinaciones = new HashMap<>();
    }
    
    public int verificarCombinacion(String combinacion, int intento)
    {
        int bandera = 0;
        if(combinaciones.containsKey(combinacion))
        {
            System.out.print("Combinacion repetida, ingresa otra combinacion.");
            bandera = 0;
        }else{
            combinaciones.put(combinacion, intento);
            bandera = 1;
        }
        return bandera;
    }
    
        public int verificarPalabras(String combinacion, String combinacionSecreta, GUI gui) {
        String[] dividir = combinacion.split(" ");
        String[] dividirSecreta = combinacionSecreta.split(" ");
        int[] retro = new int[6];
        int contador = 0;
        int bandera = 0;

        for (int i = 0; i < 6; i++) {
            retro[i] = 3;
        }

        for (int i = 0; i < 6; i++) {
            if (dividir[i].compareTo(dividirSecreta[i]) == 0) {
                System.out.println("Color Negro.");
                contador++;
                retro[i] = 1;
            } else {
                for (int j = 0; j < 6; j++) {
                    if (dividir[i].compareTo(dividirSecreta[j]) == 0 && retro[j] != 1) {
                        System.out.println("Color Blanco");
                        retro[j] = 0;
                        break; // Importante: salir del bucle interno una vez que se ha encontrado una coincidencia.
                    }
                }
            }
        }
        gui.colocarPistas(retro);

        if (contador == 6) {
            bandera = 1;
        }

        return bandera;
    }

}
