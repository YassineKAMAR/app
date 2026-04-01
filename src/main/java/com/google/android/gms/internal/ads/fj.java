package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ji f7771i;

    public fj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, ji jiVar) {
        super(iiVar, "8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", ceVar, i8, 85);
        this.f7771i = jiVar;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        long[] jArr = (long[]) this.f5297f.invoke(null, Long.valueOf(this.f7771i.d()), Long.valueOf(this.f7771i.h()), Long.valueOf(this.f7771i.b()), Long.valueOf(this.f7771i.f()));
        synchronized (this.f5296e) {
            this.f5296e.w0(jArr[0]);
            this.f5296e.v0(jArr[1]);
        }
    }
}
