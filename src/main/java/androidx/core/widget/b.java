package androidx.core.widget;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    @Deprecated
    public static final boolean J;

    static {
        J = Build.VERSION.SDK_INT >= 27;
    }
}
