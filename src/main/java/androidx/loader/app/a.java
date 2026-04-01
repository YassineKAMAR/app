package androidx.loader.app;

import androidx.lifecycle.a0;
import androidx.lifecycle.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static <T extends i & a0> a b(T t7) {
        return new b(t7, t7.e());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
