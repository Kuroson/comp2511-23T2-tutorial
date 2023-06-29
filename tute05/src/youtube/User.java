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
        // TODO
    }

    public void alertNewVideo(Video video) {
        // TODO
    }

    @Override
    public String toString() {
        return name;
    }
}

// System.out.println(name+": A new video "+video.getName()+" was just posted from "+video.getProducer()+"!");