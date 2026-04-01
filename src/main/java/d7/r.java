package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f21056a = new h0("CONDITION_FALSE");

    public static final Object a() {
        return f21056a;
    }

    public static final s b(Object obj) {
        s sVar;
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null && (sVar = b0Var.f21010a) != null) {
            return sVar;
        }
        kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (s) obj;
    }
}
