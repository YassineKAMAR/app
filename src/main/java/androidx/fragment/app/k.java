package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<m> f2494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<String> f2495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b[] f2496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f2497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2498e;

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i8) {
            return new k[i8];
        }
    }

    public k() {
        this.f2497d = null;
    }

    public k(Parcel parcel) {
        this.f2497d = null;
        this.f2494a = parcel.createTypedArrayList(m.CREATOR);
        this.f2495b = parcel.createStringArrayList();
        this.f2496c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2497d = parcel.readString();
        this.f2498e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeTypedList(this.f2494a);
        parcel.writeStringList(this.f2495b);
        parcel.writeTypedArray(this.f2496c, i8);
        parcel.writeString(this.f2497d);
        parcel.writeInt(this.f2498e);
    }
}
