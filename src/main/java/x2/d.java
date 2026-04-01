package x2;

import a3.n;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d extends b3.a {
    public static final Parcelable.Creator<d> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f27252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27253c;

    public d(String str, int i8, long j8) {
        this.f27251a = str;
        this.f27252b = i8;
        this.f27253c = j8;
    }

    public d(String str, long j8) {
        this.f27251a = str;
        this.f27253c = j8;
        this.f27252b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((getName() != null && getName().equals(dVar.getName())) || (getName() == null && dVar.getName() == null)) && g() == dVar.g()) {
                return true;
            }
        }
        return false;
    }

    public long g() {
        long j8 = this.f27253c;
        return j8 == -1 ? this.f27252b : j8;
    }

    public String getName() {
        return this.f27251a;
    }

    public final int hashCode() {
        return a3.n.b(getName(), Long.valueOf(g()));
    }

    public final String toString() {
        n.a aVarC = a3.n.c(this);
        aVarC.a("name", getName());
        aVarC.a("version", Long.valueOf(g()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, getName(), false);
        b3.c.k(parcel, 2, this.f27252b);
        b3.c.n(parcel, 3, g());
        b3.c.b(parcel, iA);
    }
}
