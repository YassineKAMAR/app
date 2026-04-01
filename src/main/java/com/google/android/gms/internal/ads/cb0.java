package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class cb0 {
    private int A;
    private final String B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f6283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f6284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f6285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f6286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f6287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f6288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f6289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f6290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f6291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f6292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f6293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f6294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f6295y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f6296z;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cb0(android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cb0.<init>(android.content.Context):void");
    }

    public cb0(Context context, db0 db0Var) {
        ns.a(context);
        c(context);
        e(context);
        d(context);
        this.f6285o = Build.FINGERPRINT;
        this.f6286p = Build.DEVICE;
        this.C = qt.g(context);
        this.f6287q = db0Var.f6637a;
        this.f6288r = db0Var.f6638b;
        this.f6289s = db0Var.f6640d;
        this.f6290t = db0Var.f6641e;
        this.f6291u = db0Var.f6642f;
        this.f6292v = db0Var.f6643g;
        this.f6293w = db0Var.f6644h;
        this.f6294x = db0Var.f6645i;
        this.B = db0Var.f6646j;
        this.f6295y = db0Var.f6649m;
        this.f6296z = db0Var.f6650n;
        this.A = db0Var.f6651o;
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            g2.t.q().u(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f6271a = audioManager.getMode();
                this.f6272b = audioManager.isMusicActive();
                this.f6273c = audioManager.isSpeakerphoneOn();
                this.f6274d = audioManager.getStreamVolume(3);
                this.f6275e = audioManager.getRingerMode();
                this.f6276f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                g2.t.q().u(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f6271a = -2;
        this.f6272b = false;
        this.f6273c = false;
        this.f6274d = 0;
        this.f6275e = 2;
        this.f6276f = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) h2.y.c().b(ns.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.f6283m = -1.0d;
            this.f6284n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f6283m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f6284n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f6277g = r2
            boolean r2 = e3.m.k()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.fs r2 = com.google.android.gms.internal.ads.ns.m8
            com.google.android.gms.internal.ads.ls r4 = h2.y.c()
            java.lang.Object r2 = r4.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = 0
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f6279i = r2
            int r0 = r0.getPhoneType()
            r5.f6280j = r0
            r0 = -2
            r5.f6278h = r0
            r5.f6281k = r3
            r0 = -1
            r5.f6282l = r0
            g2.t.r()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = j2.k2.a0(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f6278h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f6282l = r6
            goto L69
        L67:
            r5.f6278h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f6281k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cb0.e(android.content.Context):void");
    }

    public final db0 a() {
        return new db0(this.f6271a, this.f6287q, this.f6288r, this.f6277g, this.f6289s, this.f6290t, this.f6291u, this.f6292v, this.f6272b, this.f6273c, this.f6293w, this.f6294x, this.B, this.f6274d, this.f6278h, this.f6279i, this.f6280j, this.f6275e, this.f6276f, this.f6295y, this.f6296z, this.A, this.f6283m, this.f6284n, this.f6281k, this.f6282l, this.f6285o, this.C, this.f6286p);
    }
}
