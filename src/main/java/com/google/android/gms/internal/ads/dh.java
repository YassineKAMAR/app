package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class dh implements ch {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static volatile ii f6730u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected MotionEvent f6731a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected double f6740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f6741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f6742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f6743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected float f6744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected float f6745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected float f6746p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected DisplayMetrics f6749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected ai f6750t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final LinkedList f6732b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f6733c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f6734d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f6735e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f6736f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected long f6737g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected long f6738h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f6739i = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f6747q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f6748r = false;

    protected dh(Context context) {
        try {
            uf.d();
            this.f6749s = context.getResources().getDisplayMetrics();
            if (((Boolean) h2.y.c().b(ns.f12219w2)).booleanValue()) {
                this.f6750t = new ai();
            }
        } catch (Throwable unused) {
        }
    }

    private final void n() {
        this.f6737g = 0L;
        this.f6733c = 0L;
        this.f6734d = 0L;
        this.f6735e = 0L;
        this.f6736f = 0L;
        this.f6738h = 0L;
        this.f6739i = 0L;
        if (this.f6732b.isEmpty()) {
            MotionEvent motionEvent = this.f6731a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.f6732b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f6732b.clear();
        }
        this.f6731a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2 A[Catch: Exception -> 0x00f8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f8, blocks: (B:44:0x00ad, B:47:0x00ba, B:55:0x00e2, B:56:0x00f2), top: B:74:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String o(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dh.o(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void b(StackTraceElement[] stackTraceElementArr) {
        ai aiVar;
        if (!((Boolean) h2.y.c().b(ns.f12219w2)).booleanValue() || (aiVar = this.f6750t) == null) {
            return;
        }
        aiVar.b(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String c(Context context) {
        if (li.c()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return o(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final synchronized void d(int i8, int i9, int i10) {
        if (this.f6731a != null) {
            if (((Boolean) h2.y.c().b(ns.f12132m2)).booleanValue()) {
                n();
            } else {
                this.f6731a.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.f6749s;
        if (displayMetrics != null) {
            float f8 = displayMetrics.density;
            this.f6731a = MotionEvent.obtain(0L, i10, 1, i8 * f8, i9 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f6731a = null;
        }
        this.f6748r = false;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String e(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final synchronized void f(MotionEvent motionEvent) {
        Long l8;
        if (this.f6747q) {
            n();
            this.f6747q = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6740j = 0.0d;
            this.f6741k = motionEvent.getRawX();
            this.f6742l = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d8 = rawX - this.f6741k;
            double d9 = rawY - this.f6742l;
            this.f6740j += Math.sqrt((d8 * d8) + (d9 * d9));
            this.f6741k = rawX;
            this.f6742l = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.f6731a = motionEventObtain;
                    this.f6732b.add(motionEventObtain);
                    if (this.f6732b.size() > 6) {
                        ((MotionEvent) this.f6732b.remove()).recycle();
                    }
                    this.f6735e++;
                    this.f6737g = i(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f6734d += (long) (motionEvent.getHistorySize() + 1);
                    ki kiVarM = m(motionEvent);
                    Long l9 = kiVarM.f10089e;
                    if (l9 != null && kiVarM.f10092h != null) {
                        this.f6738h += l9.longValue() + kiVarM.f10092h.longValue();
                    }
                    if (this.f6749s != null && (l8 = kiVarM.f10090f) != null && kiVarM.f10093i != null) {
                        this.f6739i += l8.longValue() + kiVarM.f10093i.longValue();
                    }
                } else if (action2 == 3) {
                    this.f6736f++;
                }
            } catch (yh unused) {
            }
        } else {
            this.f6743m = motionEvent.getX();
            this.f6744n = motionEvent.getY();
            this.f6745o = motionEvent.getRawX();
            this.f6746p = motionEvent.getRawY();
            this.f6733c++;
        }
        this.f6748r = true;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String g(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String h(Context context, String str, View view) {
        return o(context, str, 3, view, null, null);
    }

    protected abstract long i(StackTraceElement[] stackTraceElementArr);

    protected abstract ce j(Context context, View view, Activity activity);

    protected abstract ce k(Context context, vd vdVar);

    protected abstract ce l(Context context, View view, Activity activity);

    protected abstract ki m(MotionEvent motionEvent);
}
