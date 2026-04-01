package i2;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b3.a {
    public static final Parcelable.Creator<i> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f22504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f22505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f22506j;

    public i(Intent intent, d0 d0Var) {
        this(null, null, null, null, null, null, null, intent, g3.b.k3(d0Var).asBinder(), false);
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z7) {
        this.f22497a = str;
        this.f22498b = str2;
        this.f22499c = str3;
        this.f22500d = str4;
        this.f22501e = str5;
        this.f22502f = str6;
        this.f22503g = str7;
        this.f22504h = intent;
        this.f22505i = (d0) g3.b.H0(a.AbstractBinderC0110a.v0(iBinder));
        this.f22506j = z7;
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, d0 d0Var) {
        this(str, str2, str3, str4, str5, str6, str7, null, g3.b.k3(d0Var).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f22497a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, str, false);
        b3.c.q(parcel, 3, this.f22498b, false);
        b3.c.q(parcel, 4, this.f22499c, false);
        b3.c.q(parcel, 5, this.f22500d, false);
        b3.c.q(parcel, 6, this.f22501e, false);
        b3.c.q(parcel, 7, this.f22502f, false);
        b3.c.q(parcel, 8, this.f22503g, false);
        b3.c.p(parcel, 9, this.f22504h, i8, false);
        b3.c.j(parcel, 10, g3.b.k3(this.f22505i).asBinder(), false);
        b3.c.c(parcel, 11, this.f22506j);
        b3.c.b(parcel, iA);
    }
}
