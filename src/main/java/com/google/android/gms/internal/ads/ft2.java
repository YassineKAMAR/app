package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ft2 {
    public static Bundle a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void b(Bundle bundle, String str, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void c(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void d(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void e(Bundle bundle, String str, int i8, boolean z7) {
        if (z7) {
            bundle.putInt(str, i8);
        }
    }

    public static void f(Bundle bundle, String str, String str2, boolean z7) {
        if (!z7 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void g(Bundle bundle, String str, boolean z7, boolean z8) {
        if (z8) {
            bundle.putBoolean(str, z7);
        }
    }
}
