/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo.gonzalez.uabc.mastermind;

/**
 *
 * @author israe
 */
import java.util.Scanner;
/**
 *
 * @author 52686
 */
public class Mastermind {

    public static void main(String[] args) {
        
        GUI gui = new GUI();
        
        Scanner teclado = new Scanner(System.in);
        Jugador jugador = new Jugador();
        Codificador codificador = new Codificador();
        String combinacionSecreta = "";
        combinacionSecreta = codificador.generarCombinacion();
        System.out.println("Bienvenido a MasterMind.");
        System.out.println("Tienes 15 intentos para adivinar la combinacion secreta.");
        gui.colocarColoresDisponibles();
        
        String combinacionIngresada = "";
        int bandera=0;
        int bandera2 = 0;
        int intentosMaximos = 15;
        int intentosRealizados = 0;
        
        for(int i=0;i<intentosMaximos;i++){
            System.out.println("Colores disponibles: ROJO, NARANJA, AMARILLO, NEGRO, AZUL, VERDE, GRIS, MAGENTA");
            System.out.println("la combinación de colores se codificará como: RO NA AZ NE AZ NE.");
            System.out.println("Ingresa combinacion");
            do{
                int bandera3 = 0; int contador = 0;
                while(bandera3 == 0){
                    combinacionIngresada = teclado.nextLine();
                    String[] dividir = combinacionIngresada.split(" ");
                    for(int j=0;j<dividir.length;j++){
                        for(int k=0;k<dividir.length;k++){
                            if(k != j){
                                if(dividir[j].compareTo(dividir[k]) == 0){
                                    System.out.println("No puede haber colores repetidos.");
                                    k+=10;
                                    j+=10;
                                }else{
                                    contador++;
                                }
                            }
                        }
                    }
                    if(contador == 30)
                        bandera3=1;
                    else
                        contador = 0;
                }
                bandera=jugador.verificarCombinacion(combinacionIngresada, i);
            }while(bandera == 0);
            bandera2 = jugador.verificarPalabras(combinacionIngresada, combinacionSecreta,gui);
            if (bandera2 == 1) {
                System.out.println("FELICIDADES, le atinaste.");
                i += intentosMaximos;  // Termina el bucle
                gui.colocarCombinacionIngresada(combinacionIngresada);
            } else {
                System.out.println("Sigue intentando." +"\n");
                gui.colocarCombinacionIngresada(combinacionIngresada);
            }
            intentosRealizados++;
        }
        if (intentosRealizados == intentosMaximos) {
            System.out.println("Has agotado tus 15 intentos. La combinación secreta era: " + combinacionSecreta);
        }
    }
}
