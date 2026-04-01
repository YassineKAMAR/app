package o0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, Lock> f25226e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f25227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f25228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f25230d;

    public a(String str, File file, boolean z7) {
        File file2 = new File(file, str + ".lck");
        this.f25227a = file2;
        this.f25228b = a(file2.getAbsolutePath());
        this.f25229c = z7;
    }

    private static Lock a(String str) {
        Lock reentrantLock;
        Map<String, Lock> map = f25226e;
        synchronized (map) {
            reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
        }
        return reentrantLock;
    }

    public void b() {
        this.f25228b.lock();
        if (this.f25229c) {
            try {
                FileChannel channel = new FileOutputStream(this.f25227a).getChannel();
                this.f25230d = channel;
                channel.lock();
            } catch (IOException e8) {
                throw new IllegalStateException("Unable to grab copy lock.", e8);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f25230d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f25228b.unlock();
    }
}
