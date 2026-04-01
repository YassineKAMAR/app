package j2;

import com.google.android.gms.internal.ads.pg0;
import com.google.android.gms.internal.ads.yb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zc;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class m0 extends zc {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ byte[] f24008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ Map f24009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ pg0 f24010q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m0(s0 s0Var, int i8, String str, zb zbVar, yb ybVar, byte[] bArr, Map map, pg0 pg0Var) {
        super(i8, str, zbVar, ybVar);
        this.f24008o = bArr;
        this.f24009p = map;
        this.f24010q = pg0Var;
    }

    @Override // com.google.android.gms.internal.ads.ub
    public final byte[] D() {
        byte[] bArr = this.f24008o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zc
    protected final void F(String str) {
        this.f24010q.g(str);
        super.F(str);
    }

    @Override // com.google.android.gms.internal.ads.ub
    public final Map r() {
        Map map = this.f24009p;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.ub
    protected final /* bridge */ /* synthetic */ void u(Object obj) {
        F((String) obj);
    }
}
