package youtube;

/**
 * Observer
 */
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer user) {
        user.addSubscriber(this);
    }

    /**
     * update method
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

// System.out.println(name+": A new video "+video.getName()+" was just posted from "+video.getProducer()+"!");