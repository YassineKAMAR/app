package y6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 {
    public static final b0 a(Executor executor) {
        b0 b0Var;
        r0 r0Var = executor instanceof r0 ? (r0) executor : null;
        return (r0Var == null || (b0Var = r0Var.f27532a) == null) ? new c1(executor) : b0Var;
    }
}
