package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f20604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f20605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f20607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f20608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final z f20609f;

    w(w5 w5Var, String str, String str2, String str3, long j8, long j9, Bundle bundle) {
        z zVar;
        a3.o.f(str2);
        a3.o.f(str3);
        this.f20604a = str2;
        this.f20605b = str3;
        this.f20606c = TextUtils.isEmpty(str) ? null : str;
        this.f20607d = j8;
        this.f20608e = j9;
        if (j9 != 0 && j9 > j8) {
            w5Var.t().L().b("Event created with reverse previous/current timestamps. appId", n4.v(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zVar = new z(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w5Var.t().G().a("Param name can't be null");
                } else {
                    Object objS0 = w5Var.L().s0(next, bundle2.get(next));
                    if (objS0 == null) {
                        w5Var.t().L().b("Param value can't be null", w5Var.D().f(next));
                    } else {
                        w5Var.L().N(bundle2, next, objS0);
                    }
                }
                it.remove();
            }
            zVar = new z(bundle2);
        }
        this.f20609f = zVar;
    }

    private w(w5 w5Var, String str, String str2, String str3, long j8, long j9, z zVar) {
        a3.o.f(str2);
        a3.o.f(str3);
        a3.o.j(zVar);
        this.f20604a = str2;
        this.f20605b = str3;
        this.f20606c = TextUtils.isEmpty(str) ? null : str;
        this.f20607d = j8;
        this.f20608e = j9;
        if (j9 != 0 && j9 > j8) {
            w5Var.t().L().c("Event created with reverse previous/current timestamps. appId, name", n4.v(str2), n4.v(str3));
        }
        this.f20609f = zVar;
    }

    final w a(w5 w5Var, long j8) {
        return new w(w5Var, this.f20606c, this.f20604a, this.f20605b, this.f20607d, j8, this.f20609f);
    }

    public final String toString() {
        return "Event{appId='" + this.f20604a + "', name='" + this.f20605b + "', params=" + String.valueOf(this.f20609f) + "}";
    }
}
