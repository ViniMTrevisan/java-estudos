package threads;

import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private volatile boolean isDone;
    private LongAdder totalBytes = new LongAdder();

    public void incrementBytes() {
        totalBytes.increment();
    }

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}

