import sevo.events.Event;
import sevo.events.IEvent;
import sevo.events.IListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.addListener(CounterEvent.COUNTER_START, new IListener() {
            @Override
            public void update(Event event) {
                var c = (Counter) event.getSender();
                var ce = (CounterEvent) event;
                System.out.println(event.getType() + " count: " + c.getCount() + " name: " + ce.getName());
            }
        });

        counter.addListener(CounterEvent.COUNTER_CHANGE, new IListener() {
            @Override
            public void update(Event event) {
                var c = (Counter) event.getSender();
                System.out.println(event.getType() + " count: " + c.getCount() + " name: " + ((CounterEvent) event).getName());
            }
        });

        counter.addListener(CounterEvent.COUNTER_FINISH, new IListener() {
            @Override
            public void update(Event event) {
                var c = (Counter) event.getSender();
                CounterEvent ce = (CounterEvent) event;
                System.out.println(ce.getType() + " count: " + c.getCount() + " name: " + ce.getName());
            }
        });

        // counter.removeListener(CounterEvent.COUNTER_CHANGE);


        counter.run();
    }
}