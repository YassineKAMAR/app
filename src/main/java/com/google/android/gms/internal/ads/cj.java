package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class cj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f6357i;

    public cj(ii iiVar, String str, String str2, ce ceVar, long j8, int i8, int i9) {
        super(iiVar, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", ceVar, i8, 25);
        this.f6357i = j8;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        long jLongValue = ((Long) this.f5297f.invoke(null, new Object[0])).longValue();
        synchronized (this.f5296e) {
            this.f5296e.u0(jLongValue);
            long j8 = this.f6357i;
            if (j8 != 0) {
                this.f5296e.N(jLongValue - j8);
                this.f5296e.O(this.f6357i);
            }
        }
    }
}
