package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends o4 {
    public static final Parcelable.Creator<w4> CREATOR = new v4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f16624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb3 f16625d;

    /* JADX WARN: Multi-variable type inference failed */
    public w4(String str, String str2, List list) {
        super(str);
        uu1.d(!list.isEmpty());
        this.f16623b = str2;
        jb3 jb3VarX = jb3.x(list);
        this.f16625d = jb3VarX;
        this.f16624c = (String) jb3VarX.get(0);
    }

    private static List b(String str) {
        int i8;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                i8 = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        i8 = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                i8 = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(i8));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    @Override // com.google.android.gms.internal.ads.o4, com.google.android.gms.internal.ads.tc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.v80 r9) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w4.a(com.google.android.gms.internal.ads.v80):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w4.class == obj.getClass()) {
            w4 w4Var = (w4) obj;
            if (nz2.e(this.f12359a, w4Var.f12359a) && nz2.e(this.f16623b, w4Var.f16623b) && this.f16625d.equals(w4Var.f16625d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f12359a.hashCode() + 527;
        String str = this.f16623b;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f16625d.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.o4
    public final String toString() {
        return this.f12359a + ": description=" + this.f16623b + ": values=" + String.valueOf(this.f16625d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f12359a);
        parcel.writeString(this.f16623b);
        parcel.writeStringArray((String[]) this.f16625d.toArray(new String[0]));
    }
}
