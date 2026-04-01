package k2;

import a3.o;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.c20;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import h2.y;
import z1.g;
import z1.m;
import z1.q;
import z1.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void b(final Context context, final String str, final g gVar, final b bVar) {
        o.k(context, "Context cannot be null.");
        o.k(str, "AdUnitId cannot be null.");
        o.k(gVar, "AdRequest cannot be null.");
        o.k(bVar, "LoadCallback cannot be null.");
        o.e("#008 Must be called on the main UI thread.");
        ns.a(context);
        if (((Boolean) gu.f8503i.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: k2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        g gVar2 = gVar;
                        try {
                            new c20(context2, str2).i(gVar2.a(), bVar);
                        } catch (IllegalStateException e8) {
                            o90.c(context2).a(e8, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new c20(context, str).i(gVar.a(), bVar);
    }

    public abstract w a();

    public abstract void c(m mVar);

    public abstract void d(boolean z7);

    public abstract void e(q qVar);

    public abstract void f(Activity activity);
}
