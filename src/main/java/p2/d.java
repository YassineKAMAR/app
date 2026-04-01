package p2;

import android.content.Context;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.j84;
import com.google.android.gms.internal.ads.jq1;
import com.google.android.gms.internal.ads.jz2;
import com.google.android.gms.internal.ads.lg3;
import com.google.android.gms.internal.ads.r84;
import com.google.android.gms.internal.ads.rt2;
import com.google.android.gms.internal.ads.uo0;
import com.google.android.gms.internal.ads.w84;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f25516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f25517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f25518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f25519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f25520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f25521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f25522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f25523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f25524i;

    public d(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7, w84 w84Var8, w84 w84Var9) {
        this.f25516a = w84Var;
        this.f25517b = w84Var2;
        this.f25518c = w84Var3;
        this.f25519d = w84Var4;
        this.f25520e = w84Var5;
        this.f25521f = w84Var6;
        this.f25522g = w84Var7;
        this.f25523h = w84Var8;
        this.f25524i = w84Var9;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        bo0 bo0Var = (bo0) this.f25516a.k();
        Context contextA = ((io0) this.f25517b).a();
        gh ghVar = (gh) this.f25518c.k();
        rt2 rt2Var = (rt2) this.f25519d.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new c(bo0Var, contextA, ghVar, rt2Var, lg3Var, (ScheduledExecutorService) this.f25521f.k(), (jq1) this.f25522g.k(), (jz2) this.f25523h.k(), ((uo0) this.f25524i).a());
    }
}
