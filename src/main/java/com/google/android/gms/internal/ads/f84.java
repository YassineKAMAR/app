package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f84 {
    static HashSet a(int i8) {
        return new HashSet(d(i8));
    }

    public static LinkedHashMap b(int i8) {
        return new LinkedHashMap(d(i8));
    }

    public static List c(int i8) {
        return i8 == 0 ? Collections.emptyList() : new ArrayList(i8);
    }

    private static int d(int i8) {
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((i8 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
