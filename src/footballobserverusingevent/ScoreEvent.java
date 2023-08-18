/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverusingevent;

import java.util.EventObject;

/**
 *
 * @author AreYouG
 */
public class ScoreEvent extends EventObject{
    private String scoreLine;
    public ScoreEvent(Object source, String s) {
        super(source);
        scoreLine = s;
    }
    public String getScoreLine(){
        return scoreLine;
    }
    
}
