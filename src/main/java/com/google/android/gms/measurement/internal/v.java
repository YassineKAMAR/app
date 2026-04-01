package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.y6;
import com.revenuecat.purchases.common.Constants;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f20539f = new v((Boolean) null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f20542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumMap<y6.a, Boolean> f20544e;

    v(Boolean bool, int i8) {
        this(bool, i8, (Boolean) null, (String) null);
    }

    v(Boolean bool, int i8, Boolean bool2, String str) {
        EnumMap<y6.a, Boolean> enumMap = new EnumMap<>(y6.a.class);
        this.f20544e = enumMap;
        enumMap.put(y6.a.AD_USER_DATA, bool);
        this.f20540a = i8;
        this.f20541b = k();
        this.f20542c = bool2;
        this.f20543d = str;
    }

    private v(EnumMap<y6.a, Boolean> enumMap, int i8) {
        this(enumMap, i8, (Boolean) null, (String) null);
    }

    private v(EnumMap<y6.a, Boolean> enumMap, int i8, Boolean bool, String str) {
        EnumMap<y6.a, Boolean> enumMap2 = new EnumMap<>(y6.a.class);
        this.f20544e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f20540a = i8;
        this.f20541b = k();
        this.f20542c = bool;
        this.f20543d = str;
    }

    public static v b(Bundle bundle, int i8) {
        if (bundle == null) {
            return new v((Boolean) null, i8);
        }
        EnumMap enumMap = new EnumMap(y6.a.class);
        for (y6.a aVar : x6.DMA.a()) {
            enumMap.put(aVar, y6.q(bundle.getString(aVar.f20729a)));
        }
        return new v((EnumMap<y6.a, Boolean>) enumMap, i8, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static v c(String str) {
        if (str == null || str.length() <= 0) {
            return f20539f;
        }
        String[] strArrSplit = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        int i8 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(y6.a.class);
        y6.a[] aVarArrA = x6.DMA.a();
        int length = aVarArrA.length;
        int i9 = 1;
        int i10 = 0;
        while (i10 < length) {
            enumMap.put(aVarArrA[i10], y6.g(strArrSplit[i9].charAt(0)));
            i10++;
            i9++;
        }
        return new v((EnumMap<y6.a, Boolean>) enumMap, i8);
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return y6.q(bundle.getString("ad_personalization"));
    }

    private final String k() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20540a);
        for (y6.a aVar : x6.DMA.a()) {
            sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb.append(y6.a(this.f20544e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.f20540a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        Iterator it = this.f20544e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Boolean bool = (Boolean) entry.getValue();
            if (bool != null) {
                bundle.putString(((y6.a) entry.getKey()).f20729a, y6.j(bool.booleanValue()));
            }
        }
        Boolean bool2 = this.f20542c;
        if (bool2 != null) {
            bundle.putString("is_dma_region", bool2.toString());
        }
        String str = this.f20543d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f20541b.equalsIgnoreCase(vVar.f20541b) && p3.d.a(this.f20542c, vVar.f20542c)) {
            return p3.d.a(this.f20543d, vVar.f20543d);
        }
        return false;
    }

    public final Boolean f() {
        return this.f20544e.get(y6.a.AD_USER_DATA);
    }

    public final Boolean g() {
        return this.f20542c;
    }

    public final String h() {
        return this.f20543d;
    }

    public final int hashCode() {
        Boolean bool = this.f20542c;
        int i8 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f20543d;
        return this.f20541b.hashCode() + (i8 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f20541b;
    }

    public final boolean j() {
        Iterator<Boolean> it = this.f20544e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(y6.h(this.f20540a));
        for (y6.a aVar : x6.DMA.a()) {
            sb.append(com.amazon.a.a.o.b.f.f3942a);
            sb.append(aVar.f20729a);
            sb.append(com.amazon.a.a.o.b.f.f3943b);
            Boolean bool = this.f20544e.get(aVar);
            sb.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        if (this.f20542c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f20542c);
        }
        if (this.f20543d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f20543d);
        }
        return sb.toString();
    }
}
