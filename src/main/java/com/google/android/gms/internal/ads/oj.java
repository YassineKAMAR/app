package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class oj extends ak {
    public oj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", ceVar, i8, 73);
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        try {
            int i8 = 1;
            boolean zBooleanValue = ((Boolean) this.f5297f.invoke(null, this.f5293b.b())).booleanValue();
            ce ceVar = this.f5296e;
            if (true == zBooleanValue) {
                i8 = 2;
            }
            ceVar.a0(i8);
        } catch (InvocationTargetException unused) {
            this.f5296e.a0(3);
        }
    }
}
