package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vh1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ul1 f16270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e3.e f16271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private px f16272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qz f16273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f16274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Long f16275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    WeakReference f16276g;

    public vh1(ul1 ul1Var, e3.e eVar) {
        this.f16270a = ul1Var;
        this.f16271b = eVar;
    }

    private final void d() {
        View view;
        this.f16274e = null;
        this.f16275f = null;
        WeakReference weakReference = this.f16276g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f16276g = null;
    }

    public final px a() {
        return this.f16272c;
    }

    public final void b() {
        if (this.f16272c == null || this.f16275f == null) {
            return;
        }
        d();
        try {
            this.f16272c.m();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void c(final px pxVar) {
        this.f16272c = pxVar;
        qz qzVar = this.f16273d;
        if (qzVar != null) {
            this.f16270a.k("/unconfirmedClick", qzVar);
        }
        qz qzVar2 = new qz() { // from class: com.google.android.gms.internal.ads.uh1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                vh1 vh1Var = this.f15661a;
                try {
                    vh1Var.f16275f = Long.valueOf(Long.parseLong((String) map.get(DiagnosticsEntry.Event.TIMESTAMP_KEY)));
                } catch (NumberFormatException unused) {
                    qg0.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                px pxVar2 = pxVar;
                vh1Var.f16274e = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (pxVar2 == null) {
                    qg0.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    pxVar2.O(str);
                } catch (RemoteException e8) {
                    qg0.i("#007 Could not call remote method.", e8);
                }
            }
        };
        this.f16273d = qzVar2;
        this.f16270a.i("/unconfirmedClick", qzVar2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f16276g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f16274e != null && this.f16275f != null) {
            HashMap map = new HashMap();
            map.put("id", this.f16274e);
            map.put("time_interval", String.valueOf(this.f16271b.a() - this.f16275f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f16270a.g("sendMessageToNativeJs", map);
        }
        d();
    }
}
