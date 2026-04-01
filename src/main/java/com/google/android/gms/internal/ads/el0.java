package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class el0 extends ji3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f7399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final po3 f7400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputStream f7404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uri f7406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile hn f7407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f7412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private x3.d f7413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicLong f7414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final pl0 f7415u;

    public el0(Context context, po3 po3Var, String str, int i8, g94 g94Var, pl0 pl0Var) {
        super(false);
        this.f7399e = context;
        this.f7400f = po3Var;
        this.f7415u = pl0Var;
        this.f7401g = str;
        this.f7402h = i8;
        this.f7408n = false;
        this.f7409o = false;
        this.f7410p = false;
        this.f7411q = false;
        this.f7412r = 0L;
        this.f7414t = new AtomicLong(-1L);
        this.f7413s = null;
        this.f7403i = ((Boolean) h2.y.c().b(ns.O1)).booleanValue();
        a(g94Var);
    }

    private final boolean q() {
        if (!this.f7403i) {
            return false;
        }
        if (!((Boolean) h2.y.c().b(ns.f12098i4)).booleanValue() || this.f7410p) {
            return ((Boolean) h2.y.c().b(ns.f12107j4)).booleanValue() && !this.f7411q;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws IOException {
        if (!this.f7405k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f7404j;
        int iH = inputStream != null ? inputStream.read(bArr, i8, i9) : this.f7400f.H(bArr, i8, i9);
        if (!this.f7403i || this.f7404j != null) {
            F(iH);
        }
        return iH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.rl0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws Throwable {
        en enVarB;
        boolean z7;
        boolean z8;
        long jB;
        tn tnVar;
        String string = "ms";
        if (this.f7405k) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r22 = 1;
        this.f7405k = true;
        this.f7406l = ut3Var.f15867a;
        if (!this.f7403i) {
            e(ut3Var);
        }
        this.f7407m = hn.g(ut3Var.f15867a);
        ?? sb = -1;
        if (!((Boolean) h2.y.c().b(ns.f12071f4)).booleanValue()) {
            if (this.f7407m != null) {
                this.f7407m.f8839h = ut3Var.f15872f;
                this.f7407m.f8840i = b93.c(this.f7401g);
                this.f7407m.f8841j = this.f7402h;
                enVarB = g2.t.e().b(this.f7407m);
            } else {
                enVarB = null;
            }
            if (enVarB != null && enVarB.u()) {
                this.f7408n = enVarB.p();
                this.f7410p = enVarB.w();
                this.f7411q = enVarB.v();
                this.f7412r = enVarB.g();
                this.f7409o = true;
                if (!q()) {
                    this.f7404j = enVarB.n();
                    if (this.f7403i) {
                        e(ut3Var);
                    }
                    return -1L;
                }
            }
        } else if (this.f7407m != null) {
            this.f7407m.f8839h = ut3Var.f15872f;
            this.f7407m.f8840i = b93.c(this.f7401g);
            this.f7407m.f8841j = this.f7402h;
            long jLongValue = ((Long) h2.y.c().b(this.f7407m.f8838g ? ns.f12089h4 : ns.f12080g4)).longValue();
            long jB2 = g2.t.b().b();
            g2.t.f();
            Future futureA = sn.a(this.f7399e, this.f7407m);
            try {
                try {
                    tnVar = (tn) futureA.get(jLongValue, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    z8 = false;
                } catch (ExecutionException | TimeoutException unused2) {
                    z7 = false;
                } catch (Throwable th) {
                    th = th;
                    r22 = 0;
                }
                try {
                    this.f7408n = tnVar.d();
                    this.f7410p = tnVar.f();
                    this.f7411q = tnVar.e();
                    this.f7412r = tnVar.a();
                    if (!q()) {
                        this.f7404j = tnVar.c();
                        if (this.f7403i) {
                            e(ut3Var);
                        }
                        long jB3 = g2.t.b().b() - jB2;
                        this.f7415u.f12933a.b0(true, jB3);
                        this.f7409o = true;
                        j2.v1.k("Cache connection took " + jB3 + "ms");
                        return -1L;
                    }
                    long jB4 = g2.t.b().b() - jB2;
                    this.f7415u.f12933a.b0(true, jB4);
                    this.f7409o = true;
                    string = "Cache connection took " + jB4 + "ms";
                } catch (InterruptedException unused3) {
                    z8 = true;
                    futureA.cancel(true);
                    Thread.currentThread().interrupt();
                    jB = g2.t.b().b() - jB2;
                    this.f7415u.f12933a.b0(z8, jB);
                    this.f7409o = z8;
                    sb = new StringBuilder();
                    sb.append("Cache connection took ");
                    sb.append(jB);
                    sb.append("ms");
                    string = sb.toString();
                } catch (ExecutionException | TimeoutException unused4) {
                    z7 = true;
                    futureA.cancel(true);
                    jB = g2.t.b().b() - jB2;
                    this.f7415u.f12933a.b0(z7, jB);
                    this.f7409o = z7;
                    sb = new StringBuilder();
                    sb.append("Cache connection took ");
                    sb.append(jB);
                    sb.append("ms");
                    string = sb.toString();
                } catch (Throwable th2) {
                    th = th2;
                    long jB5 = g2.t.b().b() - jB2;
                    this.f7415u.f12933a.b0(r22, jB5);
                    this.f7409o = r22;
                    j2.v1.k("Cache connection took " + jB5 + string);
                    throw th;
                }
                j2.v1.k(string);
            } catch (Throwable th3) {
                th = th3;
                r22 = sb;
            }
        }
        this.f7409o = false;
        if (this.f7407m != null) {
            ut3Var = new ut3(Uri.parse(this.f7407m.f8832a), null, ut3Var.f15871e, ut3Var.f15872f, ut3Var.f15873g, null, ut3Var.f15875i);
        }
        return this.f7400f.b(ut3Var);
    }

    public final long f() {
        return this.f7412r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long g() {
        if (this.f7407m == null) {
            return -1L;
        }
        if (this.f7414t.get() == -1) {
            synchronized (this) {
                if (this.f7413s == null) {
                    this.f7413s = eh0.f7322a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.dl0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f6790a.h();
                        }
                    });
                }
            }
            if (!this.f7413s.isDone()) {
                return -1L;
            }
            try {
                this.f7414t.compareAndSet(-1L, ((Long) this.f7413s.get()).longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.f7414t.get();
    }

    final /* synthetic */ Long h() {
        return Long.valueOf(g2.t.e().a(this.f7407m));
    }

    public final boolean i() {
        return this.f7408n;
    }

    public final boolean j() {
        return this.f7411q;
    }

    public final boolean k() {
        return this.f7410p;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f7406l;
    }

    public final boolean o() {
        return this.f7409o;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() throws IOException {
        if (!this.f7405k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f7405k = false;
        this.f7406l = null;
        boolean z7 = (this.f7403i && this.f7404j == null) ? false : true;
        InputStream inputStream = this.f7404j;
        if (inputStream != null) {
            e3.k.a(inputStream);
            this.f7404j = null;
        } else {
            this.f7400f.p();
        }
        if (z7) {
            c();
        }
    }
}
