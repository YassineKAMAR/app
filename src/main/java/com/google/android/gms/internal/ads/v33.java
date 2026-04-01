package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class v33 implements j23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w33 f15977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h43 f15978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g23 f15979d;

    v33(Object obj, w33 w33Var, h43 h43Var, g23 g23Var) {
        this.f15976a = obj;
        this.f15977b = w33Var;
        this.f15978c = h43Var;
        this.f15979d = g23Var;
    }

    private static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        lf lfVarM = mf.M();
        lfVarM.w(5);
        lfVarM.u(rz3.L(bArr, 0, bArr.length));
        return Base64.encodeToString(((mf) lfVarM.q()).g(), 11);
    }

    private final synchronized byte[] j(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e8) {
            this.f15979d.c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e8);
            return null;
        }
        return (byte[]) this.f15976a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f15976a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.j23
    public final synchronized String a(Context context, String str) {
        Map mapK;
        mapK = this.f15978c.k();
        mapK.put("f", "q");
        mapK.put("ctx", context);
        mapK.put("aid", null);
        return i(j(null, mapK));
    }

    @Override // com.google.android.gms.internal.ads.j23
    public final synchronized void b(String str, MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f15976a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f15976a, map);
            this.f15979d.d(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e8) {
            throw new f43(2005, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.j23
    public final synchronized String c(Context context, String str, String str2, View view, Activity activity) {
        Map mapJ;
        mapJ = this.f15978c.j();
        mapJ.put("f", "c");
        mapJ.put("ctx", context);
        mapJ.put("cs", str2);
        mapJ.put("aid", null);
        mapJ.put("view", view);
        mapJ.put("act", activity);
        return i(j(null, mapJ));
    }

    @Override // com.google.android.gms.internal.ads.j23
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map mapL;
        mapL = this.f15978c.l();
        mapL.put("f", "v");
        mapL.put("ctx", context);
        mapL.put("aid", null);
        mapL.put("view", view);
        mapL.put("act", activity);
        return i(j(null, mapL));
    }

    public final synchronized int e() {
        try {
        } catch (Exception e8) {
            throw new f43(2006, e8);
        }
        return ((Integer) this.f15976a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f15976a, new Object[0])).intValue();
    }

    final w33 f() {
        return this.f15977b;
    }

    public final synchronized void g() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f15976a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f15976a, new Object[0]);
            this.f15979d.d(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e8) {
            throw new f43(2003, e8);
        }
    }

    final synchronized boolean h() {
        try {
        } catch (Exception e8) {
            throw new f43(2001, e8);
        }
        return ((Boolean) this.f15976a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f15976a, new Object[0])).booleanValue();
    }
}
