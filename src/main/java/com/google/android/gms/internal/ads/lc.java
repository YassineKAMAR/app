package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Comparator f10578d = new kc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f10579a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10580b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10581c = 0;

    public lc(int i8) {
    }

    private final synchronized void c() {
        while (this.f10581c > 4096) {
            byte[] bArr = (byte[]) this.f10579a.remove(0);
            this.f10580b.remove(bArr);
            this.f10581c -= bArr.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f10579a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f10580b, bArr, f10578d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f10580b.add(iBinarySearch, bArr);
                this.f10581c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i8) {
        for (int i9 = 0; i9 < this.f10580b.size(); i9++) {
            byte[] bArr = (byte[]) this.f10580b.get(i9);
            int length = bArr.length;
            if (length >= i8) {
                this.f10581c -= length;
                this.f10580b.remove(i9);
                this.f10579a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i8];
    }
}
