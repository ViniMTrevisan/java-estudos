package threads;

import threads.DownloadStatus;

public class DownloadFileTask implements Runnable{

    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for(var i = 0; i < 10_000; i++){
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementBytes();
        }

        System.out.println("Download completed: " + Thread.currentThread().getName());
    }
}