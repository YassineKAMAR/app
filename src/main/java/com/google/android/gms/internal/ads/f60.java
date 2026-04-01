package com.google.android.gms.internal.ads;

import android.location.Location;
import c2.e;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f60 implements l2.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f7630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f7632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Location f7634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lv f7636g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7638i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f7640k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7637h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f7639j = new HashMap();

    public f60(Date date, int i8, Set set, Location location, boolean z7, int i9, lv lvVar, List list, boolean z8, int i10, String str) {
        Map map;
        String str2;
        Boolean bool;
        this.f7630a = date;
        this.f7631b = i8;
        this.f7632c = set;
        this.f7634e = location;
        this.f7633d = z7;
        this.f7635f = i9;
        this.f7636g = lvVar;
        this.f7638i = z8;
        this.f7640k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.startsWith("custom:")) {
                    String[] strArrSplit = str3.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, 3);
                    if (strArrSplit.length == 3) {
                        if (com.amazon.a.a.o.b.ac.equals(strArrSplit[2])) {
                            map = this.f7639j;
                            str2 = strArrSplit[1];
                            bool = Boolean.TRUE;
                        } else if (com.amazon.a.a.o.b.ad.equals(strArrSplit[2])) {
                            map = this.f7639j;
                            str2 = strArrSplit[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.f7637h.add(str3);
                }
            }
        }
    }

    @Override // l2.u
    public final o2.b a() {
        return lv.g(this.f7636g);
    }

    @Override // l2.e
    public final int b() {
        return this.f7635f;
    }

    @Override // l2.u
    public final boolean c() {
        return this.f7637h.contains("6");
    }

    @Override // l2.e
    @Deprecated
    public final boolean d() {
        return this.f7638i;
    }

    @Override // l2.e
    @Deprecated
    public final Date e() {
        return this.f7630a;
    }

    @Override // l2.e
    public final boolean f() {
        return this.f7633d;
    }

    @Override // l2.e
    public final Set<String> g() {
        return this.f7632c;
    }

    @Override // l2.u
    public final c2.e h() {
        e.a aVar = new e.a();
        lv lvVar = this.f7636g;
        if (lvVar != null) {
            int i8 = lvVar.f11055a;
            if (i8 == 2) {
                aVar.b(lvVar.f11059e);
                aVar.g(lvVar.f11056b);
                aVar.c(lvVar.f11057c);
                aVar.f(lvVar.f11058d);
            } else {
                if (i8 != 3) {
                    if (i8 == 4) {
                        aVar.e(lvVar.f11061g);
                        aVar.d(lvVar.f11062h);
                    }
                    aVar.g(lvVar.f11056b);
                    aVar.c(lvVar.f11057c);
                    aVar.f(lvVar.f11058d);
                }
                h2.k4 k4Var = lvVar.f11060f;
                if (k4Var != null) {
                    aVar.h(new z1.z(k4Var));
                }
                aVar.b(lvVar.f11059e);
                aVar.g(lvVar.f11056b);
                aVar.c(lvVar.f11057c);
                aVar.f(lvVar.f11058d);
            }
        }
        return aVar.a();
    }

    @Override // l2.e
    @Deprecated
    public final int i() {
        return this.f7631b;
    }

    @Override // l2.u
    public final Map j() {
        return this.f7639j;
    }

    @Override // l2.u
    public final boolean k() {
        return this.f7637h.contains("3");
    }
}
