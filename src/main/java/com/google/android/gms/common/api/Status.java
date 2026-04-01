package com.google.android.gms.common.api;

import a3.n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b3.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import y2.d;
import y2.j;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends b3.a implements j, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PendingIntent f4796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x2.b f4797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f4785f = new Status(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f4786g = new Status(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f4787h = new Status(14);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f4788i = new Status(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f4789j = new Status(15);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f4790k = new Status(16);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Status f4792m = new Status(17);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f4791l = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    public Status(int i8) {
        this(i8, (String) null);
    }

    Status(int i8, int i9, String str, PendingIntent pendingIntent, x2.b bVar) {
        this.f4793a = i8;
        this.f4794b = i9;
        this.f4795c = str;
        this.f4796d = pendingIntent;
        this.f4797e = bVar;
    }

    public Status(int i8, String str) {
        this(1, i8, str, null, null);
    }

    public Status(x2.b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(x2.b bVar, String str, int i8) {
        this(1, i8, str, bVar.n(), bVar);
    }

    @Override // y2.j
    public Status e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4793a == status.f4793a && this.f4794b == status.f4794b && n.a(this.f4795c, status.f4795c) && n.a(this.f4796d, status.f4796d) && n.a(this.f4797e, status.f4797e);
    }

    public x2.b g() {
        return this.f4797e;
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f4793a), Integer.valueOf(this.f4794b), this.f4795c, this.f4796d, this.f4797e);
    }

    @ResultIgnorabilityUnspecified
    public int i() {
        return this.f4794b;
    }

    public String n() {
        return this.f4795c;
    }

    public boolean p() {
        return this.f4796d != null;
    }

    public String toString() {
        n.a aVarC = n.c(this);
        aVarC.a("statusCode", v());
        aVarC.a("resolution", this.f4796d);
        return aVarC.toString();
    }

    public boolean u() {
        return this.f4794b <= 0;
    }

    public final String v() {
        String str = this.f4795c;
        return str != null ? str : d.a(this.f4794b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.k(parcel, 1, i());
        c.q(parcel, 2, n(), false);
        c.p(parcel, 3, this.f4796d, i8, false);
        c.p(parcel, 4, g(), i8, false);
        c.k(parcel, 1000, this.f4793a);
        c.b(parcel, iA);
    }
}
