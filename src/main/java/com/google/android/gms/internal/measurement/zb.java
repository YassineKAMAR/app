package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zb extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f19440a;

    public zb(ma maVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f19440a = null;
    }
}
