package h2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends b3.a {
    public static final Parcelable.Creator<n3> CREATOR = new o3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22236c;

    public n3() {
        this(ModuleDescriptor.MODULE_VERSION, 233702000, "22.5.0");
    }

    public n3(int i8, int i9, String str) {
        this.f22234a = i8;
        this.f22235b = i9;
        this.f22236c = str;
    }

    public final int g() {
        return this.f22235b;
    }

    public final String i() {
        return this.f22236c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f22234a);
        b3.c.k(parcel, 2, this.f22235b);
        b3.c.q(parcel, 3, this.f22236c, false);
        b3.c.b(parcel, iA);
    }
}
