package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f2392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<String> f2393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f2394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f2395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f2396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f2397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f2398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f2399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f2400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final CharSequence f2401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f2402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final CharSequence f2403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList<String> f2404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ArrayList<String> f2405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f2406o;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b(Parcel parcel) {
        this.f2392a = parcel.createIntArray();
        this.f2393b = parcel.createStringArrayList();
        this.f2394c = parcel.createIntArray();
        this.f2395d = parcel.createIntArray();
        this.f2396e = parcel.readInt();
        this.f2397f = parcel.readInt();
        this.f2398g = parcel.readString();
        this.f2399h = parcel.readInt();
        this.f2400i = parcel.readInt();
        this.f2401j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2402k = parcel.readInt();
        this.f2403l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2404m = parcel.createStringArrayList();
        this.f2405n = parcel.createStringArrayList();
        this.f2406o = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2520a.size();
        this.f2392a = new int[size * 5];
        if (!aVar.f2527h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2393b = new ArrayList<>(size);
        this.f2394c = new int[size];
        this.f2395d = new int[size];
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            n.a aVar2 = aVar.f2520a.get(i8);
            int i10 = i9 + 1;
            this.f2392a[i9] = aVar2.f2538a;
            ArrayList<String> arrayList = this.f2393b;
            Fragment fragment = aVar2.f2539b;
            arrayList.add(fragment != null ? fragment.f2340e : null);
            int[] iArr = this.f2392a;
            int i11 = i10 + 1;
            iArr[i10] = aVar2.f2540c;
            int i12 = i11 + 1;
            iArr[i11] = aVar2.f2541d;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f2542e;
            iArr[i13] = aVar2.f2543f;
            this.f2394c[i8] = aVar2.f2544g.ordinal();
            this.f2395d[i8] = aVar2.f2545h.ordinal();
            i8++;
            i9 = i13 + 1;
        }
        this.f2396e = aVar.f2525f;
        this.f2397f = aVar.f2526g;
        this.f2398g = aVar.f2529j;
        this.f2399h = aVar.f2391u;
        this.f2400i = aVar.f2530k;
        this.f2401j = aVar.f2531l;
        this.f2402k = aVar.f2532m;
        this.f2403l = aVar.f2533n;
        this.f2404m = aVar.f2534o;
        this.f2405n = aVar.f2535p;
        this.f2406o = aVar.f2536q;
    }

    public androidx.fragment.app.a b(j jVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(jVar);
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.f2392a.length) {
            n.a aVar2 = new n.a();
            int i10 = i8 + 1;
            aVar2.f2538a = this.f2392a[i8];
            if (j.H) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i9 + " base fragment #" + this.f2392a[i10]);
            }
            String str = this.f2393b.get(i9);
            aVar2.f2539b = str != null ? jVar.f2443g.get(str) : null;
            aVar2.f2544g = d.b.values()[this.f2394c[i9]];
            aVar2.f2545h = d.b.values()[this.f2395d[i9]];
            int[] iArr = this.f2392a;
            int i11 = i10 + 1;
            int i12 = iArr[i10];
            aVar2.f2540c = i12;
            int i13 = i11 + 1;
            int i14 = iArr[i11];
            aVar2.f2541d = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f2542e = i16;
            int i17 = iArr[i15];
            aVar2.f2543f = i17;
            aVar.f2521b = i12;
            aVar.f2522c = i14;
            aVar.f2523d = i16;
            aVar.f2524e = i17;
            aVar.c(aVar2);
            i9++;
            i8 = i15 + 1;
        }
        aVar.f2525f = this.f2396e;
        aVar.f2526g = this.f2397f;
        aVar.f2529j = this.f2398g;
        aVar.f2391u = this.f2399h;
        aVar.f2527h = true;
        aVar.f2530k = this.f2400i;
        aVar.f2531l = this.f2401j;
        aVar.f2532m = this.f2402k;
        aVar.f2533n = this.f2403l;
        aVar.f2534o = this.f2404m;
        aVar.f2535p = this.f2405n;
        aVar.f2536q = this.f2406o;
        aVar.h(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeIntArray(this.f2392a);
        parcel.writeStringList(this.f2393b);
        parcel.writeIntArray(this.f2394c);
        parcel.writeIntArray(this.f2395d);
        parcel.writeInt(this.f2396e);
        parcel.writeInt(this.f2397f);
        parcel.writeString(this.f2398g);
        parcel.writeInt(this.f2399h);
        parcel.writeInt(this.f2400i);
        TextUtils.writeToParcel(this.f2401j, parcel, 0);
        parcel.writeInt(this.f2402k);
        TextUtils.writeToParcel(this.f2403l, parcel, 0);
        parcel.writeStringList(this.f2404m);
        parcel.writeStringList(this.f2405n);
        parcel.writeInt(this.f2406o ? 1 : 0);
    }
}
