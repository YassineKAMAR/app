package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z84 extends g84 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f18118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f18119g;

    public z84(int i8, String str, IOException iOException, Map map, ut3 ut3Var, byte[] bArr) {
        super("Response code: " + i8, iOException, ut3Var, 2004, 1);
        this.f18116d = i8;
        this.f18117e = str;
        this.f18118f = map;
        this.f18119g = bArr;
    }
}
