package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ba0 extends b3.a {
    public static final Parcelable.Creator<ba0> CREATOR = new ca0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f5668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PackageInfo f5670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f5674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5676i;

    public ba0(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i8, String str3, List list, boolean z7, boolean z8) {
        this.f5669b = str;
        this.f5668a = applicationInfo;
        this.f5670c = packageInfo;
        this.f5671d = str2;
        this.f5672e = i8;
        this.f5673f = str3;
        this.f5674g = list;
        this.f5675h = z7;
        this.f5676i = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        ApplicationInfo applicationInfo = this.f5668a;
        int iA = b3.c.a(parcel);
        b3.c.p(parcel, 1, applicationInfo, i8, false);
        b3.c.q(parcel, 2, this.f5669b, false);
        b3.c.p(parcel, 3, this.f5670c, i8, false);
        b3.c.q(parcel, 4, this.f5671d, false);
        b3.c.k(parcel, 5, this.f5672e);
        b3.c.q(parcel, 6, this.f5673f, false);
        b3.c.s(parcel, 7, this.f5674g, false);
        b3.c.c(parcel, 8, this.f5675h);
        b3.c.c(parcel, 9, this.f5676i);
        b3.c.b(parcel, iA);
    }
}
