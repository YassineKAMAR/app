package p2;

import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.gv1;
import com.google.android.gms.internal.ads.j84;
import com.google.android.gms.internal.ads.lg3;
import com.google.android.gms.internal.ads.r84;
import com.google.android.gms.internal.ads.w84;

/* JADX INFO: loaded from: classes.dex */
public final class n implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f25556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f25557b;

    public n(w84 w84Var, w84 w84Var2) {
        this.f25556a = w84Var;
        this.f25557b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m k() {
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new m(lg3Var, ((gv1) this.f25557b).k());
    }
}
