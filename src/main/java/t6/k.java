package t6;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
class k {
    public static final void a(boolean z7, Number step) {
        q.f(step, "step");
        if (z7) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
