package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class mz1 implements dw2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f11582d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ey2 f11584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qy2 f11585c;

    public mz1(String str, qy2 qy2Var, ey2 ey2Var) {
        this.f11583a = str;
        this.f11585c = qy2Var;
        this.f11584b = ey2Var;
    }

    @Override // com.google.android.gms.internal.ads.dw2
    public final /* bridge */ /* synthetic */ Object a(Object obj) throws gu1 {
        gu1 gu1Var;
        String strConcat;
        lz1 lz1Var = (lz1) obj;
        int iOptInt = lz1Var.f11093a.optInt("http_timeout_millis", 60000);
        bb0 bb0Var = lz1Var.f11094b;
        String strJoin = "";
        if (bb0Var.a() != -2) {
            if (bb0Var.a() == 1) {
                if (bb0Var.f() != null) {
                    strJoin = TextUtils.join(", ", bb0Var.f());
                    qg0.d(strJoin);
                }
                gu1Var = new gu1(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                gu1Var = new gu1(1);
            }
            qy2 qy2Var = this.f11585c;
            ey2 ey2Var = this.f11584b;
            ey2Var.E0(gu1Var);
            ey2Var.C0(false);
            qy2Var.a(ey2Var);
            throw gu1Var;
        }
        HashMap map = new HashMap();
        if (lz1Var.f11094b.h() && !TextUtils.isEmpty(this.f11583a)) {
            if (((Boolean) h2.y.c().b(ns.N0)).booleanValue()) {
                String str = this.f11583a;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = f11582d.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", this.f11583a);
            }
        }
        if (lz1Var.f11094b.i()) {
            nz1.a(map, lz1Var.f11093a);
        }
        if (lz1Var.f11094b != null && !TextUtils.isEmpty(lz1Var.f11094b.d())) {
            strJoin = lz1Var.f11094b.d();
        }
        qy2 qy2Var2 = this.f11585c;
        ey2 ey2Var2 = this.f11584b;
        ey2Var2.C0(true);
        qy2Var2.a(ey2Var2);
        return new hz1(lz1Var.f11094b.e(), iOptInt, map, strJoin.getBytes(x73.f17098c), "", lz1Var.f11094b.i());
    }
}
