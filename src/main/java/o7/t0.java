package o7;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<k7.f> f25387a = f6.p0.d(j7.a.u(e6.a0.f21403b).getDescriptor(), j7.a.v(e6.c0.f21409b).getDescriptor(), j7.a.t(e6.y.f21456b).getDescriptor(), j7.a.w(e6.f0.f21419b).getDescriptor());

    public static final boolean a(k7.f fVar) {
        kotlin.jvm.internal.q.f(fVar, "<this>");
        return fVar.isInline() && f25387a.contains(fVar);
    }
}
