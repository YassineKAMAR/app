package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import g3.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j90 extends b3.a {
    public static final Parcelable.Creator<j90> CREATOR = new k90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9527b;

    public j90(IBinder iBinder, IBinder iBinder2) {
        this.f9526a = (View) g3.b.H0(a.AbstractBinderC0110a.v0(iBinder));
        this.f9527b = (Map) g3.b.H0(a.AbstractBinderC0110a.v0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        View view = this.f9526a;
        int iA = b3.c.a(parcel);
        b3.c.j(parcel, 1, g3.b.k3(view).asBinder(), false);
        b3.c.j(parcel, 2, g3.b.k3(this.f9527b).asBinder(), false);
        b3.c.b(parcel, iA);
    }
}
