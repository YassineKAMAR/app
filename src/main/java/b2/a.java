package b2;

import a3.o;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.wm;
import h2.y;
import z1.e;
import z1.g;
import z1.m;
import z1.q;
import z1.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0055a extends e<a> {
    }

    @Deprecated
    public static void b(final Context context, final String str, final a2.a aVar, final int i8, final AbstractC0055a abstractC0055a) {
        o.k(context, "Context cannot be null.");
        o.k(str, "adUnitId cannot be null.");
        o.k(aVar, "AdManagerAdRequest cannot be null.");
        o.e("#008 Must be called on the main UI thread.");
        ns.a(context);
        if (((Boolean) gu.f8498d.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: b2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i9 = i8;
                        String str2 = str;
                        a2.a aVar2 = aVar;
                        try {
                            new wm(context2, str2, aVar2.a(), i9, abstractC0055a).a();
                        } catch (IllegalStateException e8) {
                            o90.c(context2).a(e8, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new wm(context, str, aVar.a(), i8, abstractC0055a).a();
    }

    @Deprecated
    public static void c(final Context context, final String str, final g gVar, final int i8, final AbstractC0055a abstractC0055a) {
        o.k(context, "Context cannot be null.");
        o.k(str, "adUnitId cannot be null.");
        o.k(gVar, "AdRequest cannot be null.");
        o.e("#008 Must be called on the main UI thread.");
        ns.a(context);
        if (((Boolean) gu.f8498d.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: b2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i9 = i8;
                        String str2 = str;
                        g gVar2 = gVar;
                        try {
                            new wm(context2, str2, gVar2.a(), i9, abstractC0055a).a();
                        } catch (IllegalStateException e8) {
                            o90.c(context2).a(e8, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new wm(context, str, gVar.a(), i8, abstractC0055a).a();
    }

    public abstract w a();

    public abstract void d(m mVar);

    public abstract void e(boolean z7);

    public abstract void f(q qVar);

    public abstract void g(Activity activity);
}
