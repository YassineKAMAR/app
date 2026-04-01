package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.w40;
import com.google.android.gms.internal.ads.z40;
import h2.j1;
import h2.n3;

/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends j1 {
    public LiteSdkInfo(Context context) {
    }

    @Override // h2.k1
    public z40 getAdapterCreator() {
        return new w40();
    }

    @Override // h2.k1
    public n3 getLiteSdkVersion() {
        return new n3(ModuleDescriptor.MODULE_VERSION, 233702000, "22.5.0");
    }
}
