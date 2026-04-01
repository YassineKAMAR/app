package t0;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
final class f {
    public static void a(String str, int i8) {
        Trace.beginAsyncSection(str, i8);
    }

    public static void b(String str, int i8) {
        Trace.endAsyncSection(str, i8);
    }
}
