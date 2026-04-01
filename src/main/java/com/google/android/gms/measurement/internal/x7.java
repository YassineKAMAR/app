package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class x7 implements kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b7 f20675a;

    x7(b7 b7Var) {
        this.f20675a = b7Var;
    }

    @Override // com.google.android.gms.measurement.internal.kb
    public final void b(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f20675a.x0("auto", str2, bundle);
        } else {
            this.f20675a.W("auto", str2, bundle, str);
        }
    }
}
