/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.mastermind;

/**
 *
 * @author israe
 */
import java.awt.Color;
public class GUI {
    private Canvas canvas;
    int yPos;
    int yPos2;
    
    public GUI()
    {
        canvas = new Canvas("MasterMind",500,635);
        yPos = 550;
        yPos2 = 560;
    }
    
    public void colocarCombinacionSecreta(String CS)
    {
        String[] dividir = CS.split(" ");
        Color color = new Color(0,0,0);
        int diametro = 34;
        int xPosition = 100;
        int yPosition = 0;
        for(int i = 0; i < dividir.length; i++)
        {
            switch(dividir[i])
            {
               case "RO":
                    canvas.setForegroundColor(color.red);
                    break;
                case "NA":
                    canvas.setForegroundColor(color.orange);
                    break;
                case "AM":
                    canvas.setForegroundColor(color.yellow);
                    break;
                case "NE":
                    canvas.setForegroundColor(color.black);
                    break;
                case "AZ":
                    canvas.setForegroundColor(color.blue);
                    break;
                case "VE":
                    canvas.setForegroundColor(color.green);
                    break;
                case "GR":
                    canvas.setForegroundColor(color.gray);
                    break;
                case "MA":
                    canvas.setForegroundColor(color.magenta);
                    break;
                default: System.out.println("ERROR");  
            }
            canvas.fillCircle(xPosition, yPosition,diametro);
            xPosition += 40;
        }
    }
    
    public void colocarCombinacionIngresada(String CI)
    {
        String[] dividir = CI.split(" ");
        Color color = new Color(0,0,0);
        int diametro = 34;
        int xPosition = 100;
        for(int i=0;i < dividir.length;i++){
            switch(dividir[i]){
                case "RO":
                    canvas.setForegroundColor(color.red);
                    break;
                case "NA":
                    canvas.setForegroundColor(color.orange);
                    break;
                case "AM":
                    canvas.setForegroundColor(color.yellow);
                    break;
                case "NE":
                    canvas.setForegroundColor(color.black);
                    break;
                case "AZ":
                    canvas.setForegroundColor(color.blue);
                    break;
                case "VE":
                    canvas.setForegroundColor(color.green);
                    break;
                case "GR":
                    canvas.setForegroundColor(color.gray);
                    break;
                case "MA":
                    canvas.setForegroundColor(color.magenta);
                    break;
                default: System.out.println("ERROR"); 
            }
            canvas.fillCircle(xPosition, yPos, diametro);
            xPosition+=40;
        }
        yPos -= 40; 
    }
    
    public void colocarPistas(int[] pista)
    {
        int xPosition = 20;
        Color color = new Color(0,0,0);
        for(int i = 0; i < 6; i++)
        {
            if(pista[i] == 1)
            {
                //Color en la posicion correcta.
                canvas.setForegroundColor(color.black);
            } else {
                if(pista[i] == 0)
                {
                    //Color que es de la combinacion pero en posicion incorrecta.
                   canvas.setForegroundColor(color.gray); 
                }else{
                    //Color que no es parte de la combinacion.
                    canvas.setForegroundColor(color.white);
                }
            }
            canvas.fillRectangle(xPosition, yPos2, 5, 10);
            xPosition += 10;
        }
        yPos2 -= 40;
    }
    
    public void colocarColoresDisponibles()
    {
        int xPosition = 400;
        int yPosition = 550;
        Color color = new Color(0,0,0);
        for(int i = 0;i < 8;i++){
            switch(i){
                case 0:
                    canvas.setForegroundColor(color.red);
                    break;
                case 1:
                    canvas.setForegroundColor(color.orange);
                    break;
                case 2:
                    canvas.setForegroundColor(color.yellow);
                    break;
                case 3:
                    canvas.setForegroundColor(color.black);
                    break;
                case 4:
                    canvas.setForegroundColor(color.blue);
                    break;
                case 5:
                    canvas.setForegroundColor(color.green);
                    break;
                case 6:
                    canvas.setForegroundColor(color.gray);
                    break;
                case 7:
                    canvas.setForegroundColor(color.magenta);
                    break;
                default: System.out.println("ERROR"); 
            }
            canvas.fillRectangle(xPosition, yPosition, 34, 34);
            yPosition -= 40;
        }
    }
}
