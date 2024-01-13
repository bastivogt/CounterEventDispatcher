package sevo.events;

public class Event implements IEvent {

    protected Object sender;
    protected String type;


    public Event(String type, Object sender) {
        this.type = type;
        this.sender = sender;
    }

    public Object getSender() {
        return this.sender;
    }

    public String getType() {
        return this.type;
    }

}
