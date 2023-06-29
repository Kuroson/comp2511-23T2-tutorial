package youtube;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 */
public class Producer {
    private String name;
    private List<Observer> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<Video>();

    public Producer(String name) {
        this.name = name;
    }

    public void addSubscriber(User user) {
        this.subscribers.add(user);
    }

    public void removeSubscriber(User user) {
        this.subscribers.remove(user);
    }

    /**
     * Change of state
     * @param name
     * @param length
     */
    public void postVideo(String name, int length) {
        Video video = new Video(name, length, this);
        this.videos.add(video);

        // NOtifies all subscribers (users) that a new video has been posted
        for (Observer subscriber : this.subscribers) {
            subscriber.alertNewVideo(video);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}