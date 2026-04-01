package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p.f<String, Typeface> f2098a = new p.f<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f2099b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f2100c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final p.h<String, ArrayList<androidx.core.util.a<e>>> f2101d = new p.h<>();

    class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f2103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f2104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2105d;

        a(String str, Context context, androidx.core.provider.e eVar, int i8) {
            this.f2102a = str;
            this.f2103b = context;
            this.f2104c = eVar;
            this.f2105d = i8;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f2102a, this.f2103b, this.f2104c, this.f2105d);
        }
    }

    class b implements androidx.core.util.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f2106a;

        b(androidx.core.provider.a aVar) {
            this.f2106a = aVar;
        }

        @Override // androidx.core.util.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f2106a.b(eVar);
        }
    }

    class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f2108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f2109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2110d;

        c(String str, Context context, androidx.core.provider.e eVar, int i8) {
            this.f2107a = str;
            this.f2108b = context;
            this.f2109c = eVar;
            this.f2110d = i8;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f2107a, this.f2108b, this.f2109c, this.f2110d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements androidx.core.util.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2111a;

        d(String str) {
            this.f2111a = str;
        }

        @Override // androidx.core.util.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f2100c) {
                p.h<String, ArrayList<androidx.core.util.a<e>>> hVar = f.f2101d;
                ArrayList<androidx.core.util.a<e>> arrayList = hVar.get(this.f2111a);
                if (arrayList == null) {
                    return;
                }
                hVar.remove(this.f2111a);
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    arrayList.get(i8).accept(eVar);
                }
            }
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f2112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f2113b;

        e(int i8) {
            this.f2112a = null;
            this.f2113b = i8;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f2112a = typeface;
            this.f2113b = 0;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f2113b == 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i8) {
        return eVar.d() + "-" + i8;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i8 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i8 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i8;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i8) {
        p.f<String, Typeface> fVar = f2098a;
        Typeface typefaceC = fVar.c(str);
        if (typefaceC != null) {
            return new e(typefaceC);
        }
        try {
            g.a aVarE = androidx.core.provider.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = androidx.core.graphics.d.b(context, null, aVarE.b(), i8);
            if (typefaceB == null) {
                return new e(-3);
            }
            fVar.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, androidx.core.provider.e eVar, int i8, Executor executor, androidx.core.provider.a aVar) {
        String strA = a(eVar, i8);
        Typeface typefaceC = f2098a.c(strA);
        if (typefaceC != null) {
            aVar.b(new e(typefaceC));
            return typefaceC;
        }
        b bVar = new b(aVar);
        synchronized (f2100c) {
            p.h<String, ArrayList<androidx.core.util.a<e>>> hVar = f2101d;
            ArrayList<androidx.core.util.a<e>> arrayList = hVar.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            hVar.put(strA, arrayList2);
            c cVar = new c(strA, context, eVar, i8);
            if (executor == null) {
                executor = f2099b;
            }
            h.b(executor, cVar, new d(strA));
            return null;
        }
    }

    static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i8, int i9) {
        String strA = a(eVar, i8);
        Typeface typefaceC = f2098a.c(strA);
        if (typefaceC != null) {
            aVar.b(new e(typefaceC));
            return typefaceC;
        }
        if (i9 == -1) {
            e eVarC = c(strA, context, eVar, i8);
            aVar.b(eVarC);
            return eVarC.f2112a;
        }
        try {
            e eVar2 = (e) h.c(f2099b, new a(strA, context, eVar, i8), i9);
            aVar.b(eVar2);
            return eVar2.f2112a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
