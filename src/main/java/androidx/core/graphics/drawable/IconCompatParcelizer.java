package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2020a = aVar.p(iconCompat.f2020a, 1);
        iconCompat.f2022c = aVar.j(iconCompat.f2022c, 2);
        iconCompat.f2023d = aVar.r(iconCompat.f2023d, 3);
        iconCompat.f2024e = aVar.p(iconCompat.f2024e, 4);
        iconCompat.f2025f = aVar.p(iconCompat.f2025f, 5);
        iconCompat.f2026g = (ColorStateList) aVar.r(iconCompat.f2026g, 6);
        iconCompat.f2028i = aVar.t(iconCompat.f2028i, 7);
        iconCompat.f2029j = aVar.t(iconCompat.f2029j, 8);
        iconCompat.m();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.n(aVar.f());
        int i8 = iconCompat.f2020a;
        if (-1 != i8) {
            aVar.F(i8, 1);
        }
        byte[] bArr = iconCompat.f2022c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2023d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i9 = iconCompat.f2024e;
        if (i9 != 0) {
            aVar.F(i9, 4);
        }
        int i10 = iconCompat.f2025f;
        if (i10 != 0) {
            aVar.F(i10, 5);
        }
        ColorStateList colorStateList = iconCompat.f2026g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f2028i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f2029j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
