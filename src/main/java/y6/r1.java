package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d7.h0 f27533a = new d7.h0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d7.h0 f27534b = new d7.h0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d7.h0 f27535c = new d7.h0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d7.h0 f27536d = new d7.h0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d7.h0 f27537e = new d7.h0("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u0 f27538f = new u0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final u0 f27539g = new u0(true);

    public static final Object g(Object obj) {
        return obj instanceof f1 ? new g1((f1) obj) : obj;
    }

    public static final Object h(Object obj) {
        f1 f1Var;
        g1 g1Var = obj instanceof g1 ? (g1) obj : null;
        return (g1Var == null || (f1Var = g1Var.f27495a) == null) ? obj : f1Var;
    }
}
