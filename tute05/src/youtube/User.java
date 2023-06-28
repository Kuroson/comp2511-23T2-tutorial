package youtube;

/**
 * Observer
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer user) {
        user.addSubscriber(this);
    }

    /**
     * Subject notifies me of a state change
     * @param video
     */
    public void alertNewVideo(Video video) {
        System.out.println(this.name + " " + video.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}