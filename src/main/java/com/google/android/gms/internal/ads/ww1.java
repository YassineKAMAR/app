package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ww1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f16968a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f16969b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16970c = 0;

    public static String a(int i8, int i9, int i10) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static String b(int i8, boolean z7, int i9, int i10, int[] iArr, int i11) {
        Object[] objArr = new Object[5];
        objArr[0] = f16969b[i8];
        objArr[1] = Integer.valueOf(i9);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Character.valueOf(true != z7 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i11);
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i12 = 6;
        while (i12 > 0) {
            int i13 = i12 - 1;
            if (iArr[i13] != 0) {
                break;
            }
            i12 = i13;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb.toString();
    }

    public static byte[] c(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9 + 4];
        System.arraycopy(f16968a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i8, bArr2, 4, i9);
        return bArr2;
    }
}
