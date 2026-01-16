
package testing;
import java.util.Scanner;


public class BluetoothSimulation
    {
    static int numHeadphones; 

 
    public static void main( String[] args )
        {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("how many Headphones would you like to generate? - ");
        numHeadphones = input.nextInt();  
        
        // System.out.print("how many audio files do you want to send? - "); 
        input.close();
        
        Headphone[] headphones = new Headphone[numHeadphones];
        
        for (int i = 0; i < numHeadphones; i++) {
            headphones[i] = new Headphone(i);
        }
       
        Host host = new Host(headphones);
        host.start();
        
        System.out.println("Simulaton Done");
    
        }

    }