package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends b3.a {
    public static final Parcelable.Creator<d0> CREATOR = new p3.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f19889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19891d;

    d0(d0 d0Var, long j8) {
        a3.o.j(d0Var);
        this.f19888a = d0Var.f19888a;
        this.f19889b = d0Var.f19889b;
        this.f19890c = d0Var.f19890c;
        this.f19891d = j8;
    }

    public d0(String str, z zVar, String str2, long j8) {
        this.f19888a = str;
        this.f19889b = zVar;
        this.f19890c = str2;
        this.f19891d = j8;
    }

    public final String toString() {
        return "origin=" + this.f19890c + ",name=" + this.f19888a + ",params=" + String.valueOf(this.f19889b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, this.f19888a, false);
        b3.c.p(parcel, 3, this.f19889b, i8, false);
        b3.c.q(parcel, 4, this.f19890c, false);
        b3.c.n(parcel, 5, this.f19891d);
        b3.c.b(parcel, iA);
    }
}
