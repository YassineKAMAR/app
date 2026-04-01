package j2;

import com.google.android.gms.internal.ads.ac;
import com.google.android.gms.internal.ads.jh0;
import com.google.android.gms.internal.ads.pg0;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.ub;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends ub {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final jh0 f24032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pg0 f24033n;

    public r0(String str, Map map, jh0 jh0Var) {
        super(0, str, new q0(jh0Var));
        this.f24032m = jh0Var;
        pg0 pg0Var = new pg0(null);
        this.f24033n = pg0Var;
        pg0Var.d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.ub
    protected final ac i(qb qbVar) {
        return ac.b(qbVar, sc.b(qbVar));
    }

    @Override // com.google.android.gms.internal.ads.ub
    protected final /* bridge */ /* synthetic */ void u(Object obj) {
        qb qbVar = (qb) obj;
        this.f24033n.f(qbVar.f13386c, qbVar.f13384a);
        byte[] bArr = qbVar.f13385b;
        if (pg0.k() && bArr != null) {
            this.f24033n.h(bArr);
        }
        this.f24032m.d(qbVar);
    }
}
