/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverusingevent;

/**
 *
 * @author AreYouG
 */
public class Subscriber implements ScoreListener{

    @Override
    public void scoreChange(ScoreEvent se) {
        System.out.println("(Live report )"+se.getScoreLine());
    }
    
}
