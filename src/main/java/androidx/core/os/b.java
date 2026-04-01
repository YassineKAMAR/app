package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static f a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? f.f(a.a(configuration)) : f.a(configuration.locale);
    }
}
