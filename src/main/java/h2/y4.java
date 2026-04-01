package h2;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends b3.a {
    public static final Parcelable.Creator<y4> CREATOR = new z4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22381d;

    public y4(int i8, int i9, String str, long j8) {
        this.f22378a = i8;
        this.f22379b = i9;
        this.f22380c = str;
        this.f22381d = j8;
    }

    public static y4 g(JSONObject jSONObject) {
        return new y4(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(com.amazon.a.a.o.b.f3891a), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f22378a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.k(parcel, 2, this.f22379b);
        b3.c.q(parcel, 3, this.f22380c, false);
        b3.c.n(parcel, 4, this.f22381d);
        b3.c.b(parcel, iA);
    }
}
