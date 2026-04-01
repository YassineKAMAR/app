package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o42 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce1 f12366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f12367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vr2 f12368d;

    public o42(Context context, Executor executor, ce1 ce1Var, vr2 vr2Var) {
        this.f12365a = context;
        this.f12366b = ce1Var;
        this.f12367c = executor;
        this.f12368d = vr2Var;
    }

    private static String d(wr2 wr2Var) {
        try {
            return wr2Var.f16909x.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(final ks2 ks2Var, final wr2 wr2Var) {
        String strD = d(wr2Var);
        final Uri uri = strD != null ? Uri.parse(strD) : null;
        return zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.m42
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f11155a.c(uri, ks2Var, wr2Var, obj);
            }
        }, this.f12367c);
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        Context context = this.f12365a;
        return (context instanceof Activity) && qt.g(context) && !TextUtils.isEmpty(d(wr2Var));
    }

    final /* synthetic */ x3.d c(Uri uri, ks2 ks2Var, wr2 wr2Var, Object obj) {
        try {
            androidx.browser.customtabs.d dVarA = new d.b().a();
            dVarA.f1207a.setData(uri);
            i2.i iVar = new i2.i(dVarA.f1207a, null);
            final jh0 jh0Var = new jh0();
            bd1 bd1VarC = this.f12366b.c(new d01(ks2Var, wr2Var, null), new fd1(new ke1() { // from class: com.google.android.gms.internal.ads.n42
                @Override // com.google.android.gms.internal.ads.ke1
                public final void a(boolean z7, Context context, t41 t41Var) {
                    jh0 jh0Var2 = jh0Var;
                    try {
                        g2.t.k();
                        i2.t.a(context, (AdOverlayInfoParcel) jh0Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            jh0Var.d(new AdOverlayInfoParcel(iVar, null, bd1VarC.h(), null, new wg0(0, 0, false, false, false), null, null));
            this.f12368d.a();
            return zf3.h(bd1VarC.i());
        } catch (Throwable th) {
            qg0.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
