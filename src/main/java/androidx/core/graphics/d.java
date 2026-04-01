package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f2016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p.f<String, Typeface> f2017b;

    public static class a extends g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h.e f2018a;

        public a(h.e eVar) {
            this.f2018a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i8) {
            h.e eVar = this.f2018a;
            if (eVar != null) {
                eVar.f(i8);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f2018a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        f2016a = i8 >= 29 ? new i() : i8 >= 28 ? new h() : i8 >= 26 ? new g() : (i8 < 24 || !f.j()) ? new e() : new f();
        f2017b = new p.f<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i8) {
        if (context != null) {
            return Typeface.create(typeface, i8);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i8) {
        return f2016a.b(context, cancellationSignal, bVarArr, i8);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i8, String str, int i9, int i10, h.e eVar, Handler handler, boolean z7) {
        Typeface typefaceA;
        if (bVar instanceof e.C0022e) {
            e.C0022e c0022e = (e.C0022e) bVar;
            Typeface typefaceG = g(c0022e.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = androidx.core.provider.g.a(context, c0022e.b(), i10, !z7 ? eVar != null : c0022e.a() != 0, z7 ? c0022e.d() : -1, h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f2016a.a(context, (e.c) bVar, resources, i10);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f2017b.d(e(resources, i8, str, i9, i10), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i8, String str, int i9, int i10) {
        Typeface typefaceD = f2016a.d(context, resources, i8, str, i10);
        if (typefaceD != null) {
            f2017b.d(e(resources, i8, str, i9, i10), typefaceD);
        }
        return typefaceD;
    }

    private static String e(Resources resources, int i8, String str, int i9, int i10) {
        return resources.getResourcePackageName(i8) + '-' + str + '-' + i9 + '-' + i8 + '-' + i10;
    }

    public static Typeface f(Resources resources, int i8, String str, int i9, int i10) {
        return f2017b.c(e(resources, i8, str, i9, i10));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
