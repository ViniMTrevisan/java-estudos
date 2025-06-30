package mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("aniversario.mp4");
        video.setTitle("Aniversário do Vinicius");
        video.setUser(new User("vinimtrevisan@gmail.com"));

        var encoder = new VideoEncoder();
        var database = new VideoDatabase();
        var sendEmailService = new EmailService();

        var processor = new VideoProcessor(encoder, database, sendEmailService);
        processor.process(video);
    }
}
