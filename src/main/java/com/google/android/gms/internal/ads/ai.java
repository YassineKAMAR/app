package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f5274a = Collections.emptyList();

    public final List a() {
        List list = this.f5274a;
        this.f5274a = Collections.emptyList();
        return list;
    }

    public final void b(List list) {
        this.f5274a = new ArrayList(list);
    }
}
