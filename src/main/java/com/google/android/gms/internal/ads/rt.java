package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f14328a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MotionEvent f14329b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f14331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qy2 f14332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final tt f14333f;

    public rt(Context context, ScheduledExecutorService scheduledExecutorService, tt ttVar, qy2 qy2Var) {
        this.f14330c = context;
        this.f14331d = scheduledExecutorService;
        this.f14333f = ttVar;
        this.f14332e = qy2Var;
    }

    public final x3.d a() {
        return (qf3) zf3.o(qf3.C(zf3.h(null)), ((Long) iu.f9357c.e()).longValue(), TimeUnit.MILLISECONDS, this.f14331d);
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f14328a.getEventTime()) {
            this.f14328a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f14329b.getEventTime()) {
                return;
            }
            this.f14329b = MotionEvent.obtain(motionEvent);
        }
    }
}
