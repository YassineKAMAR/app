package androidx.core.util;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class c extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f2131b = new StringBuilder(128);

    public c(String str) {
        this.f2130a = str;
    }

    private void a() {
        if (this.f2131b.length() > 0) {
            Log.d(this.f2130a, this.f2131b.toString());
            StringBuilder sb = this.f2131b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c8 = cArr[i8 + i10];
            if (c8 == '\n') {
                a();
            } else {
                this.f2131b.append(c8);
            }
        }
    }
}
