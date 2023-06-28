package youtube;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 */
public class Producer {
    private String name;
    private List<User> subscribers = new ArrayList<User>();
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
     * Notify method
     * @param name
     * @param length
     */
    public void postVideo(String name, int length) {
        Video video = new Video(name, length, this);
        this.videos.add(video);
        // notify all my subscribers
        for (User u : this.subscribers) {
            u.alertNewVideo(video); // notifying single subscriber of state change
        }
    }

    @Override
    public String toString() {
        return name;
    }
}