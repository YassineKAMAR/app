package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Long f15694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f15695j = new Object();

    public uj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", ceVar, i8, 33);
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        if (f15694i == null) {
            synchronized (f15695j) {
                if (f15694i == null) {
                    f15694i = (Long) this.f5297f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f5296e) {
            this.f5296e.P(f15694i.longValue());
        }
    }
}
