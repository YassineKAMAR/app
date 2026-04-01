package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8491a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8493c;

    public gt(boolean z7, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8492b = linkedHashMap;
        this.f8493c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final ct f() {
        return new ct(g2.t.b().b(), null, null);
    }

    public final et a() {
        et etVar;
        boolean zBooleanValue = ((Boolean) h2.y.c().b(ns.O1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f8493c) {
            for (ct ctVar : this.f8491a) {
                long jA = ctVar.a();
                String strC = ctVar.c();
                ct ctVarB = ctVar.b();
                if (ctVarB != null && jA > 0) {
                    long jA2 = jA - ctVarB.a();
                    sb.append(strC);
                    sb.append('.');
                    sb.append(jA2);
                    sb.append(',');
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(ctVarB.a()))) {
                            StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(ctVarB.a()));
                            sb2.append('+');
                            sb2.append(strC);
                        } else {
                            map.put(Long.valueOf(ctVarB.a()), new StringBuilder(strC));
                        }
                    }
                }
            }
            this.f8491a.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(g2.t.b().a() + (((Long) entry.getKey()).longValue() - g2.t.b().b()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            etVar = new et(sb.toString(), string);
        }
        return etVar;
    }

    public final Map b() {
        Map map;
        synchronized (this.f8493c) {
            g2.t.q().f();
            map = this.f8492b;
        }
        return map;
    }

    public final void c(gt gtVar) {
        synchronized (this.f8493c) {
        }
    }

    public final void d(String str, String str2) {
        vs vsVarF;
        if (TextUtils.isEmpty(str2) || (vsVarF = g2.t.q().f()) == null) {
            return;
        }
        synchronized (this.f8493c) {
            bt btVarA = vsVarF.a(str);
            Map map = this.f8492b;
            map.put(str, btVarA.a((String) map.get(str), str2));
        }
    }

    public final boolean e(ct ctVar, long j8, String... strArr) {
        synchronized (this.f8493c) {
            for (int i8 = 0; i8 <= 0; i8++) {
                this.f8491a.add(new ct(j8, strArr[i8], ctVar));
            }
        }
        return true;
    }
}
