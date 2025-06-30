package mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var encoder = new VideoEncoder();
        var database = new VideoDatabase();
        var sendEmailService = new EmailService();

        var processor = new VideoProcessor(encoder, database, sendEmailService);
        processor.process(video);
    }
}
