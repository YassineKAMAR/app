package a3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s extends b3.a {
    public static final Parcelable.Creator<s> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<m> f163b;

    public s(int i8, List<m> list) {
        this.f162a = i8;
        this.f163b = list;
    }

    public final int g() {
        return this.f162a;
    }

    public final List<m> i() {
        return this.f163b;
    }

    public final void n(m mVar) {
        if (this.f163b == null) {
            this.f163b = new ArrayList();
        }
        this.f163b.add(mVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f162a);
        b3.c.u(parcel, 2, this.f163b, false);
        b3.c.b(parcel, iA);
    }
}
