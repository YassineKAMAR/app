package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, e.c> f2062a = new ConcurrentHashMap<>();

    class a implements b<g.b> {
        a() {
        }

        @Override // androidx.core.graphics.j.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.j.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        int a(T t7);

        boolean b(T t7);
    }

    j() {
    }

    private static <T> T e(T[] tArr, int i8, b<T> bVar) {
        return (T) f(tArr, (i8 & 1) == 0 ? RCHTTPStatusCodes.BAD_REQUEST : 700, (i8 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i8, boolean z7, b<T> bVar) {
        T t7 = null;
        int i9 = Integer.MAX_VALUE;
        for (T t8 : tArr) {
            int iAbs = (Math.abs(bVar.a(t8) - i8) * 2) + (bVar.b(t8) == z7 ? 0 : 1);
            if (t7 == null || i9 > iAbs) {
                t7 = t8;
                i9 = iAbs;
            }
        }
        return t7;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i8) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i8) {
        throw null;
    }

    protected Typeface c(Context context, InputStream inputStream) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i8, String str, int i9) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.c(fileE, resources, i8)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected g.b g(g.b[] bVarArr, int i8) {
        return (g.b) e(bVarArr, i8, new a());
    }
}
