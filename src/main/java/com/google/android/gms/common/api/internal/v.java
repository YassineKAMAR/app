package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import y2.a;

/* JADX INFO: loaded from: classes.dex */
public final class v<ResultT> extends z2.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<a.b, ResultT> f4902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s3.i<ResultT> f4903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z2.j f4904d;

    public v(int i8, c<a.b, ResultT> cVar, s3.i<ResultT> iVar, z2.j jVar) {
        super(i8);
        this.f4903c = iVar;
        this.f4902b = cVar;
        this.f4904d = jVar;
        if (i8 == 2 && cVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a(Status status) {
        this.f4903c.d(this.f4904d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void b(Exception exc) {
        this.f4903c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void c(m<?> mVar) throws DeadObjectException {
        try {
            this.f4902b.b(mVar.s(), this.f4903c);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            a(x.e(e9));
        } catch (RuntimeException e10) {
            this.f4903c.d(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void d(e eVar, boolean z7) {
        eVar.b(this.f4903c, z7);
    }

    @Override // z2.r
    public final boolean f(m<?> mVar) {
        return this.f4902b.c();
    }

    @Override // z2.r
    public final x2.d[] g(m<?> mVar) {
        return this.f4902b.e();
    }
}
