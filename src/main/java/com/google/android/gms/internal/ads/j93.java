package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class j93 extends ba3 implements vb3 {
    protected j93(Map map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ba3
    final Collection h(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.ba3
    final Collection i(Object obj, Collection collection) {
        return k(obj, (List) collection, null);
    }
}
