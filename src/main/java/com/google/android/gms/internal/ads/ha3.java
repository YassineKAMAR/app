package com.google.android.gms.internal.ads;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class ha3 {
    static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
