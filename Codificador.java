/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.mastermind;

/**
 *
 * @author israe
 */
import java.util.*;
public class Codificador {
    ArrayList<String> colores;
    
    public Codificador()
    {
        colores = new ArrayList<>();
        colores.add("RO");
        colores.add("NA");
        colores.add("AM");
        colores.add("NE");
        colores.add("AZ");
        colores.add("VE");
        colores.add("GR");
        colores.add("MA");
    }
    
    public String generarCombinacion()
    {
        String combinacion = "";
        int[] numerosUsados = new int[6];
        int contador = 0;
        for(int i = 0; i < 6; i++)
        {
           Random rmd = new Random();
           int bandera = 0;
           int numero = rmd.nextInt(8);
           for(int j = 0; j < numerosUsados.length; j++)
           {
              if(numero == numerosUsados[j])
              {
                  i--;
                  j+=10;
                  bandera = 1;
              }
           }
           if(bandera == 0)
           {
               combinacion += colores.get(numero) +" ";
               numerosUsados[contador] = numero;
               contador++;
           }
        }
        return combinacion;
    }
    
}
