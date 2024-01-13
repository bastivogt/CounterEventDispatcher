import sevo.events.EventDispatcher;

public class Counter extends EventDispatcher {

    private int start;
    private int end;
    private int step;
    private int count;





    public Counter(int start, int end, int step) {
        super();
        this.start = start;
        this.end = end;
        this.step = step;
        this.count = start;
    }

    public Counter() {
        this(0, 10, 1);
    }

    public int getCount() {
        return this.count;
    }





    public void run() {
        this.count = this.start;
        this.dispatchEvent(new CounterEvent(CounterEvent.COUNTER_START, this, "Sevo"));
        for(; this.count < this.end; this.count += this.step) {
            this.dispatchEvent(new CounterEvent(CounterEvent.COUNTER_CHANGE, this, "Ute"));
        }
        this.dispatchEvent(new CounterEvent(CounterEvent.COUNTER_FINISH, this, "Günther"));

    }

    public void reset(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.count = this.start;
    }




}
