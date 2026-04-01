package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class d73 extends a73 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ s3.i f6603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a73 f6604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k73 f6605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d73(k73 k73Var, s3.i iVar, s3.i iVar2, a73 a73Var) {
        super(iVar);
        this.f6605d = k73Var;
        this.f6603b = iVar2;
        this.f6604c = a73Var;
    }

    @Override // com.google.android.gms.internal.ads.a73
    public final void a() {
        synchronized (this.f6605d.f9971f) {
            k73.n(this.f6605d, this.f6603b);
            if (this.f6605d.f9976k.getAndIncrement() > 0) {
                this.f6605d.f9967b.c("Already connected to the service.", new Object[0]);
            }
            k73.p(this.f6605d, this.f6604c);
        }
    }
}
