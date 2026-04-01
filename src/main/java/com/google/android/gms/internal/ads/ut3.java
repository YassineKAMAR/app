package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ut3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15866j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f15867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f15869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f15870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public final long f15871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15875i;

    static {
        c60.b("media3.datasource");
    }

    public ut3(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    private ut3(Uri uri, long j8, int i8, byte[] bArr, Map map, long j9, long j10, String str, int i9, Object obj) {
        long j11 = j8 + j9;
        boolean z7 = false;
        uu1.d(j11 >= 0);
        uu1.d(j9 >= 0);
        long j12 = -1;
        if (j10 <= 0) {
            if (j10 != -1) {
                j12 = j10;
            }
            uu1.d(z7);
            this.f15867a = uri;
            this.f15868b = 1;
            this.f15869c = null;
            this.f15870d = Collections.unmodifiableMap(new HashMap(map));
            this.f15872f = j9;
            this.f15871e = j11;
            this.f15873g = j12;
            this.f15874h = null;
            this.f15875i = i9;
        }
        j12 = j10;
        z7 = true;
        uu1.d(z7);
        this.f15867a = uri;
        this.f15868b = 1;
        this.f15869c = null;
        this.f15870d = Collections.unmodifiableMap(new HashMap(map));
        this.f15872f = j9;
        this.f15871e = j11;
        this.f15873g = j12;
        this.f15874h = null;
        this.f15875i = i9;
    }

    @Deprecated
    public ut3(Uri uri, byte[] bArr, long j8, long j9, long j10, String str, int i8) {
        this(uri, j8 - j9, 1, null, Collections.emptyMap(), j9, j10, null, i8, null);
    }

    public final boolean a(int i8) {
        return (this.f15875i & i8) == i8;
    }

    public final String toString() {
        return "DataSpec[GET " + String.valueOf(this.f15867a) + ", " + this.f15872f + ", " + this.f15873g + ", null, " + this.f15875i + "]";
    }
}
