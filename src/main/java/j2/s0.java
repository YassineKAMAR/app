package j2;

import com.google.android.gms.internal.ads.bb;
import com.google.android.gms.internal.ads.jh0;
import com.google.android.gms.internal.ads.pg0;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.xb;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static xb f24041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f24042b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final n0 f24043c = new k0();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x0039, B:14:0x0034, B:16:0x003b), top: B:21:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s0(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
        Ld:
            java.lang.Object r0 = j2.s0.f24042b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.xb r1 = j2.s0.f24041a     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3b
            com.google.android.gms.internal.ads.ns.a(r4)     // Catch: java.lang.Throwable -> L3d
            boolean r1 = e3.d.a()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L34
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.f12143n4     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L34
            com.google.android.gms.internal.ads.xb r4 = j2.a0.b(r4)     // Catch: java.lang.Throwable -> L3d
            goto L39
        L34:
            r1 = 0
            com.google.android.gms.internal.ads.xb r4 = com.google.android.gms.internal.ads.bd.a(r4, r1)     // Catch: java.lang.Throwable -> L3d
        L39:
            j2.s0.f24041a = r4     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.s0.<init>(android.content.Context):void");
    }

    public final x3.d a(String str) {
        jh0 jh0Var = new jh0();
        f24041a.a(new r0(str, null, jh0Var));
        return jh0Var;
    }

    public final x3.d b(int i8, String str, Map map, byte[] bArr) {
        p0 p0Var = new p0(null);
        l0 l0Var = new l0(this, str, p0Var);
        pg0 pg0Var = new pg0(null);
        m0 m0Var = new m0(this, i8, str, p0Var, l0Var, bArr, map, pg0Var);
        if (pg0.k()) {
            try {
                pg0Var.d(str, "GET", m0Var.r(), m0Var.D());
            } catch (bb e8) {
                qg0.g(e8.getMessage());
            }
        }
        f24041a.a(m0Var);
        return p0Var;
    }
}
