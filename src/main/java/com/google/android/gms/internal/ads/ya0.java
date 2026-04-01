package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 extends b3.a {
    public static final Parcelable.Creator<ya0> CREATOR = new za0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f17708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wg0 f17709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f17710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f17712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PackageInfo f17713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pu2 f17716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f17719l;

    public ya0(Bundle bundle, wg0 wg0Var, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, pu2 pu2Var, String str4, boolean z7, boolean z8) {
        this.f17708a = bundle;
        this.f17709b = wg0Var;
        this.f17711d = str;
        this.f17710c = applicationInfo;
        this.f17712e = list;
        this.f17713f = packageInfo;
        this.f17714g = str2;
        this.f17715h = str3;
        this.f17716i = pu2Var;
        this.f17717j = str4;
        this.f17718k = z7;
        this.f17719l = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        Bundle bundle = this.f17708a;
        int iA = b3.c.a(parcel);
        b3.c.e(parcel, 1, bundle, false);
        b3.c.p(parcel, 2, this.f17709b, i8, false);
        b3.c.p(parcel, 3, this.f17710c, i8, false);
        b3.c.q(parcel, 4, this.f17711d, false);
        b3.c.s(parcel, 5, this.f17712e, false);
        b3.c.p(parcel, 6, this.f17713f, i8, false);
        b3.c.q(parcel, 7, this.f17714g, false);
        b3.c.q(parcel, 9, this.f17715h, false);
        b3.c.p(parcel, 10, this.f17716i, i8, false);
        b3.c.q(parcel, 11, this.f17717j, false);
        b3.c.c(parcel, 12, this.f17718k);
        b3.c.c(parcel, 13, this.f17719l);
        b3.c.b(parcel, iA);
    }
}
