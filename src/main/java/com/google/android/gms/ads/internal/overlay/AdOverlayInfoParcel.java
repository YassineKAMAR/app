package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b3.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.ey;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.hc1;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.j80;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.t41;
import com.google.android.gms.internal.ads.wg0;
import g2.j;
import g3.a;
import g3.b;
import h2.y;
import i2.f0;
import i2.i;
import i2.u;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends b3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f4724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2.a f4725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f4726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fm0 f4727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hy f4728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f0 f4732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wg0 f4736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f4738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ey f4739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f4741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t41 f4743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final hc1 f4744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j80 f4745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f4746w;

    public AdOverlayInfoParcel(fm0 fm0Var, wg0 wg0Var, String str, String str2, int i8, j80 j80Var) {
        this.f4724a = null;
        this.f4725b = null;
        this.f4726c = null;
        this.f4727d = fm0Var;
        this.f4739p = null;
        this.f4728e = null;
        this.f4729f = null;
        this.f4730g = false;
        this.f4731h = null;
        this.f4732i = null;
        this.f4733j = 14;
        this.f4734k = 5;
        this.f4735l = null;
        this.f4736m = wg0Var;
        this.f4737n = null;
        this.f4738o = null;
        this.f4740q = str;
        this.f4741r = str2;
        this.f4742s = null;
        this.f4743t = null;
        this.f4744u = null;
        this.f4745v = j80Var;
        this.f4746w = false;
    }

    public AdOverlayInfoParcel(h2.a aVar, u uVar, ey eyVar, hy hyVar, f0 f0Var, fm0 fm0Var, boolean z7, int i8, String str, wg0 wg0Var, hc1 hc1Var, j80 j80Var, boolean z8) {
        this.f4724a = null;
        this.f4725b = aVar;
        this.f4726c = uVar;
        this.f4727d = fm0Var;
        this.f4739p = eyVar;
        this.f4728e = hyVar;
        this.f4729f = null;
        this.f4730g = z7;
        this.f4731h = null;
        this.f4732i = f0Var;
        this.f4733j = i8;
        this.f4734k = 3;
        this.f4735l = str;
        this.f4736m = wg0Var;
        this.f4737n = null;
        this.f4738o = null;
        this.f4740q = null;
        this.f4741r = null;
        this.f4742s = null;
        this.f4743t = null;
        this.f4744u = hc1Var;
        this.f4745v = j80Var;
        this.f4746w = z8;
    }

    public AdOverlayInfoParcel(h2.a aVar, u uVar, ey eyVar, hy hyVar, f0 f0Var, fm0 fm0Var, boolean z7, int i8, String str, String str2, wg0 wg0Var, hc1 hc1Var, j80 j80Var) {
        this.f4724a = null;
        this.f4725b = aVar;
        this.f4726c = uVar;
        this.f4727d = fm0Var;
        this.f4739p = eyVar;
        this.f4728e = hyVar;
        this.f4729f = str2;
        this.f4730g = z7;
        this.f4731h = str;
        this.f4732i = f0Var;
        this.f4733j = i8;
        this.f4734k = 3;
        this.f4735l = null;
        this.f4736m = wg0Var;
        this.f4737n = null;
        this.f4738o = null;
        this.f4740q = null;
        this.f4741r = null;
        this.f4742s = null;
        this.f4743t = null;
        this.f4744u = hc1Var;
        this.f4745v = j80Var;
        this.f4746w = false;
    }

    public AdOverlayInfoParcel(h2.a aVar, u uVar, f0 f0Var, fm0 fm0Var, int i8, wg0 wg0Var, String str, j jVar, String str2, String str3, String str4, t41 t41Var, j80 j80Var) {
        this.f4724a = null;
        this.f4725b = null;
        this.f4726c = uVar;
        this.f4727d = fm0Var;
        this.f4739p = null;
        this.f4728e = null;
        this.f4730g = false;
        if (((Boolean) y.c().b(ns.H0)).booleanValue()) {
            this.f4729f = null;
            this.f4731h = null;
        } else {
            this.f4729f = str2;
            this.f4731h = str3;
        }
        this.f4732i = null;
        this.f4733j = i8;
        this.f4734k = 1;
        this.f4735l = null;
        this.f4736m = wg0Var;
        this.f4737n = str;
        this.f4738o = jVar;
        this.f4740q = null;
        this.f4741r = null;
        this.f4742s = str4;
        this.f4743t = t41Var;
        this.f4744u = null;
        this.f4745v = j80Var;
        this.f4746w = false;
    }

    public AdOverlayInfoParcel(h2.a aVar, u uVar, f0 f0Var, fm0 fm0Var, boolean z7, int i8, wg0 wg0Var, hc1 hc1Var, j80 j80Var) {
        this.f4724a = null;
        this.f4725b = aVar;
        this.f4726c = uVar;
        this.f4727d = fm0Var;
        this.f4739p = null;
        this.f4728e = null;
        this.f4729f = null;
        this.f4730g = z7;
        this.f4731h = null;
        this.f4732i = f0Var;
        this.f4733j = i8;
        this.f4734k = 2;
        this.f4735l = null;
        this.f4736m = wg0Var;
        this.f4737n = null;
        this.f4738o = null;
        this.f4740q = null;
        this.f4741r = null;
        this.f4742s = null;
        this.f4743t = null;
        this.f4744u = hc1Var;
        this.f4745v = j80Var;
        this.f4746w = false;
    }

    AdOverlayInfoParcel(i iVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z7, String str2, IBinder iBinder5, int i8, int i9, String str3, wg0 wg0Var, String str4, j jVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z8) {
        this.f4724a = iVar;
        this.f4725b = (h2.a) b.H0(a.AbstractBinderC0110a.v0(iBinder));
        this.f4726c = (u) b.H0(a.AbstractBinderC0110a.v0(iBinder2));
        this.f4727d = (fm0) b.H0(a.AbstractBinderC0110a.v0(iBinder3));
        this.f4739p = (ey) b.H0(a.AbstractBinderC0110a.v0(iBinder6));
        this.f4728e = (hy) b.H0(a.AbstractBinderC0110a.v0(iBinder4));
        this.f4729f = str;
        this.f4730g = z7;
        this.f4731h = str2;
        this.f4732i = (f0) b.H0(a.AbstractBinderC0110a.v0(iBinder5));
        this.f4733j = i8;
        this.f4734k = i9;
        this.f4735l = str3;
        this.f4736m = wg0Var;
        this.f4737n = str4;
        this.f4738o = jVar;
        this.f4740q = str5;
        this.f4741r = str6;
        this.f4742s = str7;
        this.f4743t = (t41) b.H0(a.AbstractBinderC0110a.v0(iBinder7));
        this.f4744u = (hc1) b.H0(a.AbstractBinderC0110a.v0(iBinder8));
        this.f4745v = (j80) b.H0(a.AbstractBinderC0110a.v0(iBinder9));
        this.f4746w = z8;
    }

    public AdOverlayInfoParcel(i iVar, h2.a aVar, u uVar, f0 f0Var, wg0 wg0Var, fm0 fm0Var, hc1 hc1Var) {
        this.f4724a = iVar;
        this.f4725b = aVar;
        this.f4726c = uVar;
        this.f4727d = fm0Var;
        this.f4739p = null;
        this.f4728e = null;
        this.f4729f = null;
        this.f4730g = false;
        this.f4731h = null;
        this.f4732i = f0Var;
        this.f4733j = -1;
        this.f4734k = 4;
        this.f4735l = null;
        this.f4736m = wg0Var;
        this.f4737n = null;
        this.f4738o = null;
        this.f4740q = null;
        this.f4741r = null;
        this.f4742s = null;
        this.f4743t = null;
        this.f4744u = hc1Var;
        this.f4745v = null;
        this.f4746w = false;
    }

    public AdOverlayInfoParcel(u uVar, fm0 fm0Var, int i8, wg0 wg0Var) {
        this.f4726c = uVar;
        this.f4727d = fm0Var;
        this.f4733j = 1;
        this.f4736m = wg0Var;
        this.f4724a = null;
        this.f4725b = null;
        this.f4739p = null;
        this.f4728e = null;
        this.f4729f = null;
        this.f4730g = false;
        this.f4731h = null;
        this.f4732i = null;
        this.f4734k = 1;
        this.f4735l = null;
        this.f4737n = null;
        this.f4738o = null;
        this.f4740q = null;
        this.f4741r = null;
        this.f4742s = null;
        this.f4743t = null;
        this.f4744u = null;
        this.f4745v = null;
        this.f4746w = false;
    }

    public static AdOverlayInfoParcel g(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        i iVar = this.f4724a;
        int iA = c.a(parcel);
        c.p(parcel, 2, iVar, i8, false);
        c.j(parcel, 3, b.k3(this.f4725b).asBinder(), false);
        c.j(parcel, 4, b.k3(this.f4726c).asBinder(), false);
        c.j(parcel, 5, b.k3(this.f4727d).asBinder(), false);
        c.j(parcel, 6, b.k3(this.f4728e).asBinder(), false);
        c.q(parcel, 7, this.f4729f, false);
        c.c(parcel, 8, this.f4730g);
        c.q(parcel, 9, this.f4731h, false);
        c.j(parcel, 10, b.k3(this.f4732i).asBinder(), false);
        c.k(parcel, 11, this.f4733j);
        c.k(parcel, 12, this.f4734k);
        c.q(parcel, 13, this.f4735l, false);
        c.p(parcel, 14, this.f4736m, i8, false);
        c.q(parcel, 16, this.f4737n, false);
        c.p(parcel, 17, this.f4738o, i8, false);
        c.j(parcel, 18, b.k3(this.f4739p).asBinder(), false);
        c.q(parcel, 19, this.f4740q, false);
        c.q(parcel, 24, this.f4741r, false);
        c.q(parcel, 25, this.f4742s, false);
        c.j(parcel, 26, b.k3(this.f4743t).asBinder(), false);
        c.j(parcel, 27, b.k3(this.f4744u).asBinder(), false);
        c.j(parcel, 28, b.k3(this.f4745v).asBinder(), false);
        c.c(parcel, 29, this.f4746w);
        c.b(parcel, iA);
    }
}
