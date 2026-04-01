package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e2 implements Comparator<d1>, Parcelable {
    public static final Parcelable.Creator<e2> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1[] f7094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7097d;

    e2(Parcel parcel) {
        this.f7096c = parcel.readString();
        d1[] d1VarArr = (d1[]) parcel.createTypedArray(d1.CREATOR);
        int i8 = nz2.f12300a;
        this.f7094a = d1VarArr;
        this.f7097d = d1VarArr.length;
    }

    private e2(String str, boolean z7, d1... d1VarArr) {
        this.f7096c = str;
        d1VarArr = z7 ? (d1[]) d1VarArr.clone() : d1VarArr;
        this.f7094a = d1VarArr;
        this.f7097d = d1VarArr.length;
        Arrays.sort(d1VarArr, this);
    }

    public e2(String str, d1... d1VarArr) {
        this(null, true, d1VarArr);
    }

    public e2(List list) {
        this(null, false, (d1[]) list.toArray(new d1[0]));
    }

    public final d1 b(int i8) {
        return this.f7094a[i8];
    }

    public final e2 c(String str) {
        return nz2.e(this.f7096c, str) ? this : new e2(str, false, this.f7094a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(d1 d1Var, d1 d1Var2) {
        d1 d1Var3 = d1Var;
        d1 d1Var4 = d1Var2;
        UUID uuid = dg4.f6725a;
        return uuid.equals(d1Var3.f6536b) ? !uuid.equals(d1Var4.f6536b) ? 1 : 0 : d1Var3.f6536b.compareTo(d1Var4.f6536b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e2.class == obj.getClass()) {
            e2 e2Var = (e2) obj;
            if (nz2.e(this.f7096c, e2Var.f7096c) && Arrays.equals(this.f7094a, e2Var.f7094a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f7095b;
        if (i8 != 0) {
            return i8;
        }
        String str = this.f7096c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7094a);
        this.f7095b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f7096c);
        parcel.writeTypedArray(this.f7094a, 0);
    }
}
