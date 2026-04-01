package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final pi f15126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f15127j;

    public tj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, pi piVar) {
        super(iiVar, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", ceVar, i8, 53);
        this.f15126i = piVar;
        if (piVar != null) {
            this.f15127j = piVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        if (this.f15126i != null) {
            this.f5296e.J(((Long) this.f5297f.invoke(null, Long.valueOf(this.f15127j))).longValue());
        }
    }
}
