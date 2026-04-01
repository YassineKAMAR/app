package s2;

import a3.o;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.cd0;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import h2.y;
import r2.e;
import z1.g;
import z1.m;
import z1.q;
import z1.r;
import z1.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void b(final Context context, final String str, final a2.a aVar, final b bVar) {
        o.k(context, "Context cannot be null.");
        o.k(str, "AdUnitId cannot be null.");
        o.k(aVar, "AdManagerAdRequest cannot be null.");
        o.k(bVar, "LoadCallback cannot be null.");
        o.e("#008 Must be called on the main UI thread.");
        ns.a(context);
        if (((Boolean) gu.f8506l.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: s2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        a2.a aVar2 = aVar;
                        try {
                            new cd0(context2, str2).j(aVar2.a(), bVar);
                        } catch (IllegalStateException e8) {
                            o90.c(context2).a(e8, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new cd0(context, str).j(aVar.a(), bVar);
    }

    public static void c(final Context context, final String str, final g gVar, final b bVar) {
        o.k(context, "Context cannot be null.");
        o.k(str, "AdUnitId cannot be null.");
        o.k(gVar, "AdRequest cannot be null.");
        o.k(bVar, "LoadCallback cannot be null.");
        o.e("#008 Must be called on the main UI thread.");
        ns.a(context);
        if (((Boolean) gu.f8506l.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: s2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        g gVar2 = gVar;
                        try {
                            new cd0(context2, str2).j(gVar2.a(), bVar);
                        } catch (IllegalStateException e8) {
                            o90.c(context2).a(e8, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new cd0(context, str).j(gVar.a(), bVar);
    }

    public abstract w a();

    public abstract void d(m mVar);

    public abstract void e(boolean z7);

    public abstract void f(r2.a aVar);

    public abstract void g(q qVar);

    public abstract void h(e eVar);

    public abstract void i(Activity activity, r rVar);
}
