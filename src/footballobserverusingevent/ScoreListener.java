/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package footballobserverusingevent;

import java.util.EventListener;

/**
 *
 * @author AreYouG
 */
public interface ScoreListener extends EventListener{
    public void scoreChange(ScoreEvent se);
}
