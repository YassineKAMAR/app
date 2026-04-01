package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f8362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f8363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f8364k;

    public gj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, Map map, View view, Context context) {
        super(iiVar, "7qOZVP58PfP3kLkbSBo98onihlohkIEpZC40FvE5nnCJ8ryn0NERK9JAnlww55zq", "SMfJnKfhfLLyTw7dzHC+3CXVRNFLWK4N2mQHKB3gm/o=", ceVar, i8, 85);
        this.f8362i = map;
        this.f8363j = view;
        this.f8364k = context;
    }

    private final long c(int i8) {
        Map map = this.f8362i;
        Integer numValueOf = Integer.valueOf(i8);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f8362i.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        long[] jArr = {c(1), c(2)};
        Context contextB = this.f8364k;
        if (contextB == null) {
            contextB = this.f5293b.b();
        }
        long[] jArr2 = (long[]) this.f5297f.invoke(null, jArr, contextB, this.f8363j);
        long j8 = jArr2[0];
        this.f8362i.put(1, Long.valueOf(jArr2[1]));
        long j9 = jArr2[2];
        this.f8362i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f5296e) {
            this.f5296e.w0(j8);
            this.f5296e.v0(j9);
        }
    }
}
