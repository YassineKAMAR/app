package c3;

import a3.s;
import a3.u;
import a3.v;
import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import s3.h;
import y2.a;
import y2.e;
import z2.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends y2.e<v> implements u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a.g<e> f3432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0191a<e, v> f3433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final y2.a<v> f3434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3435n = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f3432k = gVar;
        c cVar = new c();
        f3433l = cVar;
        f3434m = new y2.a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, v vVar) {
        super(context, f3434m, vVar, e.a.f27438c);
    }

    @Override // a3.u
    public final h<Void> b(final s sVar) {
        c.a aVarA = com.google.android.gms.common.api.internal.c.a();
        aVarA.d(k3.d.f24203a);
        aVarA.c(false);
        aVarA.b(new i() { // from class: c3.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // z2.i
            public final void accept(Object obj, Object obj2) {
                s sVar2 = sVar;
                int i8 = d.f3435n;
                ((a) ((e) obj).D()).k3(sVar2);
                ((s3.i) obj2).c(null);
            }
        });
        return d(aVarA.a());
    }
}
