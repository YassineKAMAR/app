package a2;

import a3.o;
import android.content.Context;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import h2.y;
import z1.l;
import z1.z;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l {
    public b(Context context) {
        super(context, 0);
        o.k(context, "Context cannot be null");
    }

    public void e(final a aVar) {
        o.e("#008 Must be called on the main UI thread.");
        ns.a(getContext());
        if (((Boolean) gu.f8500f.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: a2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10a.f(aVar);
                    }
                });
                return;
            }
        }
        this.f27648a.p(aVar.a());
    }

    final /* synthetic */ void f(a aVar) {
        try {
            this.f27648a.p(aVar.a());
        } catch (IllegalStateException e8) {
            o90.c(getContext()).a(e8, "AdManagerAdView.loadAd");
        }
    }

    public z1.h[] getAdSizes() {
        return this.f27648a.a();
    }

    public e getAppEventListener() {
        return this.f27648a.k();
    }

    public z1.y getVideoController() {
        return this.f27648a.i();
    }

    public z getVideoOptions() {
        return this.f27648a.j();
    }

    public void setAdSizes(z1.h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f27648a.v(hVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f27648a.x(eVar);
    }

    public void setManualImpressionsEnabled(boolean z7) {
        this.f27648a.y(z7);
    }

    public void setVideoOptions(z zVar) {
        this.f27648a.A(zVar);
    }
}
