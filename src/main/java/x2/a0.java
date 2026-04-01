package x2;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b3.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f27236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f27238f;

    a0(String str, boolean z7, boolean z8, IBinder iBinder, boolean z9, boolean z10) {
        this.f27233a = str;
        this.f27234b = z7;
        this.f27235c = z8;
        this.f27236d = (Context) g3.b.H0(a.AbstractBinderC0110a.v0(iBinder));
        this.f27237e = z9;
        this.f27238f = z10;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, g3.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, this.f27233a, false);
        b3.c.c(parcel, 2, this.f27234b);
        b3.c.c(parcel, 3, this.f27235c);
        b3.c.j(parcel, 4, g3.b.k3(this.f27236d), false);
        b3.c.c(parcel, 5, this.f27237e);
        b3.c.c(parcel, 6, this.f27238f);
        b3.c.b(parcel, iA);
    }
}
