package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f13386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13388e;

    private qb(int i8, byte[] bArr, Map map, List list, boolean z7, long j8) {
        this.f13384a = i8;
        this.f13385b = bArr;
        this.f13386c = map;
        this.f13387d = list == null ? null : Collections.unmodifiableList(list);
        this.f13388e = z7;
    }

    @Deprecated
    public qb(int i8, byte[] bArr, Map map, boolean z7, long j8) {
        this(i8, bArr, map, a(map), z7, j8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qb(int i8, byte[] bArr, boolean z7, long j8, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lb lbVar = (lb) it.next();
                treeMap.put(lbVar.a(), lbVar.b());
            }
        }
        this(i8, bArr, treeMap, list, z7, j8);
    }

    @Deprecated
    public qb(byte[] bArr, Map map) {
        this(RCHTTPStatusCodes.SUCCESS, bArr, map, a(map), false, 0L);
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new lb((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
