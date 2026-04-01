package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5159d;

    public aa(int i8, String str, List list, byte[] bArr) {
        this.f5156a = i8;
        this.f5157b = str;
        this.f5158c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f5159d = bArr;
    }
}
