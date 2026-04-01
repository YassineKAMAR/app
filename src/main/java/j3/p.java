package j3;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import y2.a;
import y2.e;

/* JADX INFO: loaded from: classes.dex */
public final class p extends y2.e<a.d.c> implements u2.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a.g<d> f24103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a.AbstractC0191a<d, a.d.c> f24104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final y2.a<a.d.c> f24105o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f24106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x2.f f24107l;

    static {
        a.g<d> gVar = new a.g<>();
        f24103m = gVar;
        n nVar = new n();
        f24104n = nVar;
        f24105o = new y2.a<>("AppSet.API", nVar, gVar);
    }

    p(Context context, x2.f fVar) {
        super(context, f24105o, a.d.f27425a, e.a.f27438c);
        this.f24106k = context;
        this.f24107l = fVar;
    }

    @Override // u2.b
    public final s3.h<u2.c> a() {
        return this.f24107l.h(this.f24106k, 212800000) == 0 ? e(com.google.android.gms.common.api.internal.c.a().d(u2.h.f26714a).b(new z2.i() { // from class: j3.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // z2.i
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).D()).H0(new u2.d(null, null), new o(this.f24101a, (s3.i) obj2));
            }
        }).c(false).e(27601).a()) : s3.k.d(new y2.b(new Status(17)));
    }
}
