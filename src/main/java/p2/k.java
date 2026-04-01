package p2;

import com.google.android.gms.internal.ads.bx2;
import com.google.android.gms.internal.ads.j84;
import com.google.android.gms.internal.ads.k31;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.vw2;
import com.google.android.gms.internal.ads.w84;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f25547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f25548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f25549c;

    public k(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f25547a = w84Var;
        this.f25548b = w84Var2;
        this.f25549c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return ((bx2) this.f25547a.k()).b(vw2.GENERATE_SIGNALS, ((k31) this.f25549c).k().c()).f(((n) this.f25548b).k()).i(((Integer) h2.y.c().b(ns.f12206u5)).intValue(), TimeUnit.SECONDS).a();
    }
}
