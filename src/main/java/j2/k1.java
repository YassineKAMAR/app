package j2;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.qg0;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    @Deprecated
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            qg0.e("Unexpected exception.", th);
            o90.c(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
