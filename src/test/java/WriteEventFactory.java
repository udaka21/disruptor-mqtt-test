
import com.lmax.disruptor.EventFactory;

/**
 * @author Anindya Chatterjee.
 */
public class WriteEventFactory implements EventFactory<WriteEvent> {

    public WriteEvent newInstance() {
        return new WriteEvent();
    }
}
