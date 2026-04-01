package r3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b3.a implements y2.j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f25876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25877b;

    public h(List<String> list, String str) {
        this.f25876a = list;
        this.f25877b = str;
    }

    @Override // y2.j
    public final Status e() {
        return this.f25877b != null ? Status.f4786g : Status.f4790k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.s(parcel, 1, this.f25876a, false);
        b3.c.q(parcel, 2, this.f25877b, false);
        b3.c.b(parcel, iA);
    }
}
