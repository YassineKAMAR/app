package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class g4 extends f4 {
    g4() {
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    final int a(int i8, byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return 0;
        }
        while (i9 < i10) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 < 0) {
                if (b8 < -32) {
                    if (i11 >= i10) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i9 = i11 + 1;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 >= -16) {
                    if (i11 >= i10 - 2) {
                        return i4.a(bArr, i11, i10);
                    }
                    int i12 = i11 + 1;
                    byte b9 = bArr[i11];
                    if (b9 <= -65 && (((b8 << 28) + (b9 + 112)) >> 30) == 0) {
                        int i13 = i12 + 1;
                        if (bArr[i12] <= -65) {
                            i11 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 >= i10 - 1) {
                    return i4.a(bArr, i11, i10);
                }
                int i14 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 <= -65 && ((b8 != -32 || b10 >= -96) && (b8 != -19 || b10 < -96))) {
                    i9 = i14 + 1;
                    if (bArr[i14] > -65) {
                    }
                }
                return -1;
            }
            i9 = i11;
        }
        return 0;
    }
}
