package a2;

import a3.o;
import android.content.Context;
import com.google.android.gms.internal.ads.c20;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import h2.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends k2.a {
    public static void g(final Context context, final String str, final a aVar, final d dVar) {
        o.k(context, "Context cannot be null.");
        o.k(str, "AdUnitId cannot be null.");
        o.k(aVar, "AdManagerAdRequest cannot be null.");
        o.k(dVar, "LoadCallback cannot be null.");
        o.e("#008 Must be called on the main UI thread.");
        ns.a(context);
        if (((Boolean) gu.f8503i.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: a2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        a aVar2 = aVar;
                        try {
                            new c20(context2, str2).i(aVar2.a(), dVar);
                        } catch (IllegalStateException e8) {
                            o90.c(context2).a(e8, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new c20(context, str).i(aVar.a(), dVar);
    }

    public abstract void h(e eVar);
}
