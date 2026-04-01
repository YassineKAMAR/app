package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class xi extends ak {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final bk f17237j = new bk();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f17238i;

    public xi(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, Context context) {
        super(iiVar, "gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", ceVar, i8, 29);
        this.f17238i = context;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        this.f5296e.o0("E");
        AtomicReference atomicReferenceA = f17237j.a(this.f17238i.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                if (atomicReferenceA.get() == null) {
                    atomicReferenceA.set((String) this.f5297f.invoke(null, this.f17238i));
                }
            }
        }
        String str = (String) atomicReferenceA.get();
        synchronized (this.f5296e) {
            this.f5296e.o0(pf.a(str.getBytes(), true));
        }
    }
}
