package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
class j implements q0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f2905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q0.c f2907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f2908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2909g;

    j(Context context, String str, File file, int i8, q0.c cVar) {
        this.f2903a = context;
        this.f2904b = str;
        this.f2905c = file;
        this.f2906d = i8;
        this.f2907e = cVar;
    }

    private void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f2904b != null) {
            channel = Channels.newChannel(this.f2903a.getAssets().open(this.f2904b));
        } else {
            if (this.f2905c == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f2905c).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f2903a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        o0.d.a(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void d() {
        String databaseName = getDatabaseName();
        File databasePath = this.f2903a.getDatabasePath(databaseName);
        a aVar = this.f2908f;
        o0.a aVar2 = new o0.a(databaseName, this.f2903a.getFilesDir(), aVar == null || aVar.f2808j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e8) {
                    throw new RuntimeException("Unable to copy database file.", e8);
                }
            }
            if (this.f2908f == null) {
                aVar2.c();
                return;
            }
            try {
                int iC = o0.c.c(databasePath);
                int i8 = this.f2906d;
                if (iC == i8) {
                    aVar2.c();
                    return;
                }
                if (this.f2908f.a(iC, i8)) {
                    aVar2.c();
                    return;
                }
                if (this.f2903a.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e9) {
                        Log.w("ROOM", "Unable to copy database file.", e9);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.c();
                return;
            } catch (IOException e10) {
                Log.w("ROOM", "Unable to read database version.", e10);
                aVar2.c();
                return;
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // q0.c
    public synchronized q0.b H() {
        if (!this.f2909g) {
            d();
            this.f2909g = true;
        }
        return this.f2907e.H();
    }

    void c(a aVar) {
        this.f2908f = aVar;
    }

    @Override // q0.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2907e.close();
        this.f2909g = false;
    }

    @Override // q0.c
    public String getDatabaseName() {
        return this.f2907e.getDatabaseName();
    }

    @Override // q0.c
    public void setWriteAheadLoggingEnabled(boolean z7) {
        this.f2907e.setWriteAheadLoggingEnabled(z7);
    }
}
