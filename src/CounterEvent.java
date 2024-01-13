import sevo.events.Event;
import sevo.events.IEvent;

public class CounterEvent extends Event implements IEvent{

    public static final String COUNTER_START = "counter-start";
    public static final String COUNTER_CHANGE = "counter-change";
    public static final String COUNTER_FINISH = "counter-finish";


    private String name;

    public CounterEvent(String type, Object sender, String name) {
        super(type, sender);
        this.name = name;
    }


    public String getName() {
        return this.name;

    }
}
