package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class u3 implements tc0 {
    public static final Parcelable.Creator<u3> CREATOR = new t3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15461b;

    protected u3(Parcel parcel) {
        String string = parcel.readString();
        int i8 = nz2.f12300a;
        this.f15460a = string;
        this.f15461b = parcel.readString();
    }

    public u3(String str, String str2) {
        this.f15460a = str;
        this.f15461b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.tc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.v80 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f15460a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L36;
                case 79833656: goto L2c;
                case 428414940: goto L22;
                case 1746739798: goto L18;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 1
            goto L41
        L18:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 3
            goto L41
        L22:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 4
            goto L41
        L2c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 2
            goto L41
        L40:
            r0 = -1
        L41:
            if (r0 == 0) goto L64
            if (r0 == r5) goto L5e
            if (r0 == r4) goto L58
            if (r0 == r3) goto L52
            if (r0 == r2) goto L4c
            return
        L4c:
            java.lang.String r0 = r6.f15461b
            r7.z(r0)
            return
        L52:
            java.lang.String r0 = r6.f15461b
            r7.u(r0)
            return
        L58:
            java.lang.String r0 = r6.f15461b
            r7.v(r0)
            return
        L5e:
            java.lang.String r0 = r6.f15461b
            r7.w(r0)
            return
        L64:
            java.lang.String r0 = r6.f15461b
            r7.I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u3.a(com.google.android.gms.internal.ads.v80):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u3 u3Var = (u3) obj;
            if (this.f15460a.equals(u3Var.f15460a) && this.f15461b.equals(u3Var.f15461b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15460a.hashCode() + 527) * 31) + this.f15461b.hashCode();
    }

    public final String toString() {
        return "VC: " + this.f15460a + com.amazon.a.a.o.b.f.f3943b + this.f15461b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f15460a);
        parcel.writeString(this.f15461b);
    }
}
