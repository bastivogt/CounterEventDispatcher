package sevo.events;

public interface IEvent {
    public Object getSender();
    public String getType();
}
