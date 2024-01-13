package sevo.events;

import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {

    protected HashMap<String, IListener> listeners;

    public EventDispatcher() {
        this.listeners = new HashMap<String, IListener>();
    }


    public boolean hasListener(String type) {
        return listeners.containsKey(type);
    }

    public boolean addListener(String type, IListener listener) {
        if(!this.hasListener(type)) {
            this.listeners.put(type, listener);
            return true;
        }
        return false;
    }


    public boolean removeListener(String type) {
        if(this.hasListener(type)) {
            this.listeners.remove(type);
            return true;
        }
        return false;
    }


    public void dispatchEvent(Event event) {
        if(this.hasListener(event.getType())) {
            this.listeners.get(event.getType()).update(event);
        }
    }


}
