package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class m4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference<String[]> f20252b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReference<String[]> f20253c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReference<String[]> f20254d = new AtomicReference<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p3.j f20255a;

    public m4(p3.j jVar) {
        this.f20255a = jVar;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        a3.o.j(strArr);
        a3.o.j(strArr2);
        a3.o.j(atomicReference);
        a3.o.a(strArr.length == strArr2.length);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            Object obj = strArr[i8];
            if (str == obj || (str != null && str.equals(obj))) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i8] == null) {
                        strArr3[i8] = strArr2[i8] + "(" + strArr[i8] + ")";
                    }
                    str2 = strArr3[i8];
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strA);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f20255a.j()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append(com.amazon.a.a.o.b.f.f3943b);
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String b(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        if (!this.f20255a.j()) {
            return d0Var.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(d0Var.f19890c);
        sb.append(",name=");
        sb.append(c(d0Var.f19888a));
        sb.append(",params=");
        z zVar = d0Var.f19889b;
        sb.append(zVar != null ? !this.f20255a.j() ? zVar.toString() : a(zVar.p()) : null);
        return sb.toString();
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20255a.j() ? str : d(str, p3.r.f25613c, p3.r.f25611a, f20252b);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20255a.j() ? str : d(str, p3.t.f25618b, p3.t.f25617a, f20253c);
    }

    protected final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f20255a.j()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, p3.s.f25616b, p3.s.f25615a, f20254d);
        }
        return "experiment_id(" + str + ")";
    }
}
