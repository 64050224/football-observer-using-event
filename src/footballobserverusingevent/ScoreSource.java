/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverusingevent;

import java.util.ArrayList;

/**
 *
 * @author AreYouG
 */
public class ScoreSource {
    ArrayList<ScoreListener> listeners;
    public ScoreSource(){
        listeners = new ArrayList<>();
    }
    public void register(ScoreListener sl){
        listeners.add(sl);
    }
    public void deregister(ScoreListener sl){
        listeners.remove(sl);
    }
    public void setScoreLine(String s){
        fireScoreEvent(new ScoreEvent(this, s));
    }
    public void fireScoreEvent(ScoreEvent se){
        for(ScoreListener sl: listeners){
            sl.scoreChange(se);
        }
    }
}
