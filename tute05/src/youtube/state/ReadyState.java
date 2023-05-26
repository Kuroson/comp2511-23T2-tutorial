package youtube.state;

import youtube.Viewing;

public class ReadyState extends ViewingState {
    public ReadyState(Viewing viewing) {
        super(viewing);
    }

    @Override
    public String onLock() {
        // TODO
        return "";
    }

    @Override
    public String onPlay() {
        // TODO
        return "";
    }

    @Override
    public String onNext() {
        // TODO
        return "";
    }
}