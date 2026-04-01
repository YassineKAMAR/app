package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class h34 extends r34 {
    h34(int i8) {
        super(i8, null);
    }

    @Override // com.google.android.gms.internal.ads.r34
    public final void a() {
        if (!k()) {
            for (int i8 = 0; i8 < b(); i8++) {
                Map.Entry entryH = h(i8);
                if (((q04) entryH.getKey()).l()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((q04) entry.getKey()).l()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
