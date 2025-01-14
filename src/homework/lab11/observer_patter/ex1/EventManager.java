package lab11.Observer.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    private HashMap<String,List<EventListeners>> listeners = new HashMap<>();
    public void subscribe(String eventType,EventListeners listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }
    public void unsubscribe(String eventType, EventListeners listener) {
        List<EventListeners> listenerList = listeners.get(eventType);
        if (listenerList != null) {
            listenerList.remove(listener);
        }
    }
    public void notify(String eventType, String data) {
        List<EventListeners> listenerList = listeners.get(eventType);
        if (listenerList != null) {
            for (EventListeners listener : listenerList) {
                listener.update(data);
            }
        }
    }
}
