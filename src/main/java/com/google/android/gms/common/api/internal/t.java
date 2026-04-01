package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
abstract class t<T> extends z2.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final s3.i<T> f4901b;

    public t(int i8, s3.i<T> iVar) {
        super(i8);
        this.f4901b = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a(Status status) {
        this.f4901b.d(new y2.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void b(Exception exc) {
        this.f4901b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void c(m<?> mVar) throws DeadObjectException {
        try {
            h(mVar);
        } catch (DeadObjectException e8) {
            a(x.e(e8));
            throw e8;
        } catch (RemoteException e9) {
            a(x.e(e9));
        } catch (RuntimeException e10) {
            this.f4901b.d(e10);
        }
    }

    protected abstract void h(m<?> mVar);
}
