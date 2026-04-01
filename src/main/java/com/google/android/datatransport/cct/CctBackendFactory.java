package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import o1.h;
import o1.m;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements o1.d {
    @Override // o1.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
