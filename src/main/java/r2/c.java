package r2;

import a3.o;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.rc0;
import h2.y;
import z1.m;
import z1.q;
import z1.r;
import z1.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void b(final Context context, final String str, final a2.a aVar, final d dVar) {
        o.k(context, "Context cannot be null.");
        o.k(str, "AdUnitId cannot be null.");
        o.k(aVar, "AdManagerAdRequest cannot be null.");
        o.k(dVar, "LoadCallback cannot be null.");
        o.e("#008 Must be called on the main UI thread.");
        ns.a(context);
        if (((Boolean) gu.f8506l.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                qg0.b("Loading on background thread");
                fg0.f7750b.execute(new Runnable() { // from class: r2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        a2.a aVar2 = aVar;
                        try {
                            new rc0(context2, str2).j(aVar2.a(), dVar);
                        } catch (IllegalStateException e8) {
                            o90.c(context2).a(e8, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        qg0.b("Loading on UI thread");
        new rc0(context, str).j(aVar.a(), dVar);
    }

    public static void c(final Context context, final String str, final z1.g gVar, final d dVar) {
        o.k(context, "Context cannot be null.");
        o.k(str, "AdUnitId cannot be null.");
        o.k(gVar, "AdRequest cannot be null.");
        o.k(dVar, "LoadCallback cannot be null.");
        o.e("#008 Must be called on the main UI thread.");
        ns.a(context);
        if (((Boolean) gu.f8506l.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: r2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        z1.g gVar2 = gVar;
                        try {
                            new rc0(context2, str2).j(gVar2.a(), dVar);
                        } catch (IllegalStateException e8) {
                            o90.c(context2).a(e8, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        qg0.b("Loading on UI thread");
        new rc0(context, str).j(gVar.a(), dVar);
    }

    public abstract w a();

    public abstract void d(m mVar);

    public abstract void e(boolean z7);

    public abstract void f(a aVar);

    public abstract void g(q qVar);

    public abstract void h(e eVar);

    public abstract void i(Activity activity, r rVar);
}
