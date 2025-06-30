package mytube;

public class VideoProcessor {
    private CanVideoEncoder encoder;
    private CanVideoDatabase database;
    private CanEmailService sendEmailService;

    public VideoProcessor(CanVideoEncoder encoder, CanVideoDatabase database, CanEmailService sendEmailService) {
        this.encoder = encoder;
        this.database = database;
        this.sendEmailService = sendEmailService;
    }

    public void process(Video video) {
       encoder.encode(video);
       database.store(video);
       sendEmailService.sendEmail(video.getUser());
    }
}

