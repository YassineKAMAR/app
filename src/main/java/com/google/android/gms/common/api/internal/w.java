package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class w extends t<Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2.f<?> f4905c;

    public w(z2.f<?> fVar, s3.i<Boolean> iVar) {
        super(4, iVar);
        this.f4905c = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final /* bridge */ /* synthetic */ void d(e eVar, boolean z7) {
    }

    @Override // z2.r
    public final boolean f(m<?> mVar) {
        if (mVar.u().get(this.f4905c) == null) {
            return false;
        }
        throw null;
    }

    @Override // z2.r
    public final x2.d[] g(m<?> mVar) {
        if (mVar.u().get(this.f4905c) == null) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.internal.t
    public final void h(m<?> mVar) {
        if (mVar.u().remove(this.f4905c) == null) {
            this.f4901b.e((T) Boolean.FALSE);
        } else {
            mVar.s();
            throw null;
        }
    }
}
