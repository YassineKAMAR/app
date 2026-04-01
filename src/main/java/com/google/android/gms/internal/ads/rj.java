package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class rj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final StackTraceElement[] f14153i;

    public rj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, StackTraceElement[] stackTraceElementArr) {
        super(iiVar, "fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", ceVar, i8, 45);
        this.f14153i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.f14153i;
        if (stackTraceElementArr != null) {
            zh zhVar = new zh((String) this.f5297f.invoke(null, stackTraceElementArr));
            synchronized (this.f5296e) {
                this.f5296e.z(zhVar.f18230b.longValue());
                if (zhVar.f18231c.booleanValue()) {
                    this.f5296e.X(true != zhVar.f18232d.booleanValue() ? 2 : 1);
                } else {
                    this.f5296e.X(3);
                }
            }
        }
    }
}
