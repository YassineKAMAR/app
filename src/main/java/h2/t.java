package h2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.ic0;
import com.google.android.gms.internal.ads.j80;
import com.google.android.gms.internal.ads.n80;
import com.google.android.gms.internal.ads.q80;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.r90;
import com.google.android.gms.internal.ads.ux;
import com.google.android.gms.internal.ads.vc0;
import com.google.android.gms.internal.ads.vx;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q4 f22293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o4 f22294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q3 f22295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ux f22296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vc0 f22297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n80 f22298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vx f22299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r90 f22300h;

    public t(q4 q4Var, o4 o4Var, q3 q3Var, ux uxVar, vc0 vc0Var, n80 n80Var, vx vxVar) {
        this.f22293a = q4Var;
        this.f22294b = o4Var;
        this.f22295c = q3Var;
        this.f22296d = uxVar;
        this.f22297e = vc0Var;
        this.f22298f = n80Var;
        this.f22299g = vxVar;
    }

    static /* bridge */ /* synthetic */ void q(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        v.b().r(context, v.c().f16723a, "gmob-apps", bundle, true);
    }

    public final o0 c(Context context, String str, z40 z40Var) {
        return (o0) new n(this, context, str, z40Var).d(context, false);
    }

    public final s0 d(Context context, w4 w4Var, String str, z40 z40Var) {
        return (s0) new j(this, context, w4Var, str, z40Var).d(context, false);
    }

    public final s0 e(Context context, w4 w4Var, String str, z40 z40Var) {
        return (s0) new l(this, context, w4Var, str, z40Var).d(context, false);
    }

    public final i2 f(Context context, z40 z40Var) {
        return (i2) new d(this, context, z40Var).d(context, false);
    }

    public final aw h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (aw) new r(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final j80 j(Context context, z40 z40Var) {
        return (j80) new h(this, context, z40Var).d(context, false);
    }

    public final q80 l(Activity activity) {
        b bVar = new b(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            qg0.d("useClientJar flag not found in activity intent extras.");
        }
        return (q80) bVar.d(activity, booleanExtra);
    }

    public final ic0 n(Context context, String str, z40 z40Var) {
        return (ic0) new s(this, context, str, z40Var).d(context, false);
    }

    public final ff0 o(Context context, z40 z40Var) {
        return (ff0) new f(this, context, z40Var).d(context, false);
    }
}
