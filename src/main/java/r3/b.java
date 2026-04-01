package r3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class b extends b3.a implements y2.j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f25873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f25875c;

    public b() {
        this(2, 0, null);
    }

    b(int i8, int i9, Intent intent) {
        this.f25873a = i8;
        this.f25874b = i9;
        this.f25875c = intent;
    }

    @Override // y2.j
    public final Status e() {
        return this.f25874b == 0 ? Status.f4786g : Status.f4790k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f25873a);
        b3.c.k(parcel, 2, this.f25874b);
        b3.c.p(parcel, 3, this.f25875c, i8, false);
        b3.c.b(parcel, iA);
    }
}
