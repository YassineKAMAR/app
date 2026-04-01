package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class hb extends ib {
    hb(int i8) {
        super(i8);
    }

    @Override // com.google.android.gms.internal.measurement.ib
    public final void g() {
        if (!p()) {
            for (int i8 = 0; i8 < h(); i8++) {
                Map.Entry entryI = i(i8);
                if (((t8) entryI.getKey()).m()) {
                    entryI.setValue(Collections.unmodifiableList((List) entryI.getValue()));
                }
            }
            for (Map.Entry entry : k()) {
                if (((t8) entry.getKey()).m()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.g();
    }
}
