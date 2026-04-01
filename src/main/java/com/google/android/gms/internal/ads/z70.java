package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z70 extends a80 implements qz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fm0 f18055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f18056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WindowManager f18057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wr f18058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    DisplayMetrics f18059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f18060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f18061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f18062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f18063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f18064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f18065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f18067o;

    public z70(fm0 fm0Var, Context context, wr wrVar) {
        super(fm0Var, "");
        this.f18061i = -1;
        this.f18062j = -1;
        this.f18064l = -1;
        this.f18065m = -1;
        this.f18066n = -1;
        this.f18067o = -1;
        this.f18055c = fm0Var;
        this.f18056d = context;
        this.f18058f = wrVar;
        this.f18057e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* synthetic */ void a(Object obj, Map map) {
        int iZ;
        JSONObject jSONObjectPut;
        this.f18059g = new DisplayMetrics();
        Display defaultDisplay = this.f18057e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f18059g);
        this.f18060h = this.f18059g.density;
        this.f18063k = defaultDisplay.getRotation();
        h2.v.b();
        DisplayMetrics displayMetrics = this.f18059g;
        this.f18061i = jg0.z(displayMetrics, displayMetrics.widthPixels);
        h2.v.b();
        DisplayMetrics displayMetrics2 = this.f18059g;
        this.f18062j = jg0.z(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityR = this.f18055c.r();
        if (activityR == null || activityR.getWindow() == null) {
            this.f18064l = this.f18061i;
            iZ = this.f18062j;
        } else {
            g2.t.r();
            int[] iArrP = j2.k2.p(activityR);
            h2.v.b();
            this.f18064l = jg0.z(this.f18059g, iArrP[0]);
            h2.v.b();
            iZ = jg0.z(this.f18059g, iArrP[1]);
        }
        this.f18065m = iZ;
        if (this.f18055c.I().i()) {
            this.f18066n = this.f18061i;
            this.f18067o = this.f18062j;
        } else {
            this.f18055c.measure(0, 0);
        }
        e(this.f18061i, this.f18062j, this.f18064l, this.f18065m, this.f18060h, this.f18063k);
        y70 y70Var = new y70();
        wr wrVar = this.f18058f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        y70Var.e(wrVar.a(intent));
        wr wrVar2 = this.f18058f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        y70Var.c(wrVar2.a(intent2));
        y70Var.a(this.f18058f.b());
        y70Var.d(this.f18058f.c());
        y70Var.b(true);
        boolean z7 = y70Var.f17604a;
        boolean z8 = y70Var.f17605b;
        boolean z9 = y70Var.f17606c;
        boolean z10 = y70Var.f17607d;
        boolean z11 = y70Var.f17608e;
        fm0 fm0Var = this.f18055c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z7).put("tel", z8).put("calendar", z9).put("storePicture", z10).put("inlineVideo", z11);
        } catch (JSONException e8) {
            qg0.e("Error occurred while obtaining the MRAID capabilities.", e8);
            jSONObjectPut = null;
        }
        fm0Var.e("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f18055c.getLocationOnScreen(iArr);
        h(h2.v.b().f(this.f18056d, iArr[0]), h2.v.b().f(this.f18056d, iArr[1]));
        if (qg0.j(2)) {
            qg0.f("Dispatching Ready Event.");
        }
        d(this.f18055c.v().f16723a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[PHI: r3
  0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f18056d
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L13
            g2.t.r()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = j2.k2.q(r0)
            r0 = r0[r2]
            goto L14
        L13:
            r0 = 0
        L14:
            com.google.android.gms.internal.ads.fm0 r1 = r6.f18055c
            com.google.android.gms.internal.ads.vn0 r1 = r1.I()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.fm0 r1 = r6.f18055c
            com.google.android.gms.internal.ads.vn0 r1 = r1.I()
            boolean r1 = r1.i()
            if (r1 != 0) goto L84
        L28:
            com.google.android.gms.internal.ads.fm0 r1 = r6.f18055c
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            com.google.android.gms.internal.ads.fs r4 = com.google.android.gms.internal.ads.ns.R
            com.google.android.gms.internal.ads.ls r5 = h2.y.c()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L58
            com.google.android.gms.internal.ads.fm0 r3 = r6.f18055c
            com.google.android.gms.internal.ads.vn0 r3 = r3.I()
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.fm0 r3 = r6.f18055c
            com.google.android.gms.internal.ads.vn0 r3 = r3.I()
            int r3 = r3.f16379c
            goto L58
        L57:
            r3 = 0
        L58:
            if (r1 != 0) goto L6b
            com.google.android.gms.internal.ads.fm0 r1 = r6.f18055c
            com.google.android.gms.internal.ads.vn0 r1 = r1.I()
            if (r1 == 0) goto L6c
            com.google.android.gms.internal.ads.fm0 r1 = r6.f18055c
            com.google.android.gms.internal.ads.vn0 r1 = r1.I()
            int r2 = r1.f16378b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            android.content.Context r1 = r6.f18056d
            com.google.android.gms.internal.ads.jg0 r4 = h2.v.b()
            int r1 = r4.f(r1, r3)
            r6.f18066n = r1
            android.content.Context r1 = r6.f18056d
            com.google.android.gms.internal.ads.jg0 r3 = h2.v.b()
            int r1 = r3.f(r1, r2)
            r6.f18067o = r1
        L84:
            int r0 = r8 - r0
            int r1 = r6.f18066n
            int r2 = r6.f18067o
            r6.b(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.fm0 r0 = r6.f18055c
            com.google.android.gms.internal.ads.tn0 r0 = r0.H()
            r0.t0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z70.h(int, int):void");
    }
}
