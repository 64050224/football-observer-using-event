/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballobserverusingevent;

import java.util.Scanner;

/**
 *
 * @author AreYouG
 */
public class FootballObserverUsingEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreSource ss = new ScoreSource();
        Subscriber sb1 = new Subscriber();
        Subscriber sb2 = new Subscriber();
        ss.register(sb1);
        ss.register(sb2);
        
                
        String result;
        while(true){
            System.out.println("Enter match score/result <submit empty String to end>: ");
            result = sc.nextLine();
            if(result.length() == 0){
                break;
            }else{
                ss.setScoreLine(result);
            }
        }
        
        sc.close();
    }
    
}
