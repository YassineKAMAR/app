package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class ug0 {
    public static Context a(Context context) {
        return c(context).b();
    }

    public static Object b(Context context, String str, sg0 sg0Var) throws tg0 {
        try {
            return sg0Var.a(c(context).d(str));
        } catch (Exception e8) {
            throw new tg0(e8);
        }
    }

    private static DynamiteModule c(Context context) throws tg0 {
        try {
            return DynamiteModule.e(context, DynamiteModule.f4911b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e8) {
            throw new tg0(e8);
        }
    }
}
