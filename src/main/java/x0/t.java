package x0;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class t {
    protected t() {
    }

    public static t d(Context context) {
        return y0.i.k(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        y0.i.e(context, aVar);
    }

    public abstract m a(String str);

    public abstract m b(List<? extends u> list);

    public final m c(u uVar) {
        return b(Collections.singletonList(uVar));
    }
}
