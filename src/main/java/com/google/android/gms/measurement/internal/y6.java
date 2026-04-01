package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y6 f20721c = new y6(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap<a, Boolean> f20722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20723b;

    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20729a;

        a(String str) {
            this.f20729a = str;
        }
    }

    public y6(Boolean bool, Boolean bool2, int i8) {
        EnumMap<a, Boolean> enumMap = new EnumMap<>(a.class);
        this.f20722a = enumMap;
        enumMap.put(a.AD_STORAGE, bool);
        enumMap.put(a.ANALYTICS_STORAGE, bool2);
        this.f20723b = i8;
    }

    private y6(EnumMap<a, Boolean> enumMap, int i8) {
        EnumMap<a, Boolean> enumMap2 = new EnumMap<>(a.class);
        this.f20722a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f20723b = i8;
    }

    static char a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static y6 c(Bundle bundle, int i8) {
        if (bundle == null) {
            return new y6(null, null, i8);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : x6.STORAGE.f20674a) {
            enumMap.put(aVar, q(bundle.getString(aVar.f20729a)));
        }
        return new y6(enumMap, i8);
    }

    public static y6 e(String str) {
        return f(str, 100);
    }

    public static y6 f(String str, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] aVarArrA = x6.STORAGE.a();
            for (int i9 = 0; i9 < aVarArrA.length; i9++) {
                a aVar = aVarArrA[i9];
                int i10 = i9 + 2;
                if (i10 < str.length()) {
                    enumMap.put(aVar, g(str.charAt(i10)));
                }
            }
        }
        return new y6(enumMap, i8);
    }

    static Boolean g(char c8) {
        if (c8 == '0') {
            return Boolean.FALSE;
        }
        if (c8 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    static String h(int i8) {
        return i8 != -20 ? i8 != -10 ? i8 != 0 ? i8 != 30 ? i8 != 90 ? i8 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    public static String i(Bundle bundle) {
        String string;
        for (a aVar : x6.STORAGE.f20674a) {
            if (bundle.containsKey(aVar.f20729a) && (string = bundle.getString(aVar.f20729a)) != null && q(string) == null) {
                return string;
            }
        }
        return null;
    }

    static String j(boolean z7) {
        return z7 ? "granted" : "denied";
    }

    public static boolean k(int i8, int i9) {
        return i8 <= i9;
    }

    private static int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    static Boolean q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int b() {
        return this.f20723b;
    }

    public final y6 d(y6 y6Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : x6.STORAGE.f20674a) {
            Boolean boolValueOf = this.f20722a.get(aVar);
            Boolean bool = y6Var.f20722a.get(aVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(aVar, boolValueOf);
        }
        return new y6(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        for (a aVar : x6.STORAGE.f20674a) {
            if (n(this.f20722a.get(aVar)) != n(y6Var.f20722a.get(aVar))) {
                return false;
            }
        }
        return this.f20723b == y6Var.f20723b;
    }

    public final int hashCode() {
        int iN = this.f20723b * 17;
        Iterator<Boolean> it = this.f20722a.values().iterator();
        while (it.hasNext()) {
            iN = (iN * 31) + n(it.next());
        }
        return iN;
    }

    public final boolean l(a aVar) {
        Boolean bool = this.f20722a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean m(y6 y6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!y6Var.l(aVar) && l(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        Iterator it = this.f20722a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Boolean bool = (Boolean) entry.getValue();
            if (bool != null) {
                bundle.putString(((a) entry.getKey()).f20729a, j(bool.booleanValue()));
            }
        }
        return bundle;
    }

    public final y6 p(y6 y6Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : x6.STORAGE.f20674a) {
            Boolean bool = this.f20722a.get(aVar);
            if (bool == null) {
                bool = y6Var.f20722a.get(aVar);
            }
            enumMap.put(aVar, bool);
        }
        return new y6(enumMap, this.f20723b);
    }

    public final boolean r(y6 y6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = this.f20722a.get(aVar);
            Boolean bool2 = y6Var.f20722a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean s() {
        return this.f20722a.get(a.AD_STORAGE);
    }

    public final boolean t(y6 y6Var) {
        return r(y6Var, (a[]) this.f20722a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(h(this.f20723b));
        for (a aVar : x6.STORAGE.f20674a) {
            sb.append(com.amazon.a.a.o.b.f.f3942a);
            sb.append(aVar.f20729a);
            sb.append(com.amazon.a.a.o.b.f.f3943b);
            Boolean bool = this.f20722a.get(aVar);
            sb.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }

    public final Boolean u() {
        return this.f20722a.get(a.ANALYTICS_STORAGE);
    }

    public final String v() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : x6.STORAGE.a()) {
            sb.append(a(this.f20722a.get(aVar)));
        }
        return sb.toString();
    }

    public final String w() {
        StringBuilder sb = new StringBuilder("G2");
        for (a aVar : x6.STORAGE.a()) {
            Boolean bool = this.f20722a.get(aVar);
            sb.append(bool == null ? 'g' : bool.booleanValue() ? 'G' : 'D');
        }
        return sb.toString();
    }

    public final boolean x() {
        return l(a.AD_STORAGE);
    }

    public final boolean y() {
        return l(a.ANALYTICS_STORAGE);
    }

    public final boolean z() {
        Iterator<Boolean> it = this.f20722a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }
}
