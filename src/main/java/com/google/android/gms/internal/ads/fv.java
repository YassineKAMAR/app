package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fv extends ov {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f8066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f8067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f8068k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8070b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8071c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8076h;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f8066i = iRgb;
        f8067j = Color.rgb(204, 204, 204);
        f8068k = iRgb;
    }

    public fv(String str, List list, Integer num, Integer num2, Integer num3, int i8, int i9, boolean z7) {
        this.f8069a = str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            jv jvVar = (jv) list.get(i10);
            this.f8070b.add(jvVar);
            this.f8071c.add(jvVar);
        }
        this.f8072d = num != null ? num.intValue() : f8067j;
        this.f8073e = num2 != null ? num2.intValue() : f8068k;
        this.f8074f = num3 != null ? num3.intValue() : 12;
        this.f8075g = i8;
        this.f8076h = i9;
    }

    public final int P5() {
        return this.f8074f;
    }

    public final List Q5() {
        return this.f8070b;
    }

    public final int k() {
        return this.f8075g;
    }

    public final int l() {
        return this.f8076h;
    }

    public final int m() {
        return this.f8073e;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final List o() {
        return this.f8071c;
    }

    public final int p() {
        return this.f8072d;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final String q() {
        return this.f8069a;
    }
}
