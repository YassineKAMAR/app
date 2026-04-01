package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class og3 extends tf3 implements ScheduledFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f12476b;

    public og3(x3.d dVar, ScheduledFuture scheduledFuture) {
        super(dVar);
        this.f12476b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        boolean zCancel = d().cancel(z7);
        if (zCancel) {
            this.f12476b.cancel(z7);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f12476b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f12476b.getDelay(timeUnit);
    }
}
