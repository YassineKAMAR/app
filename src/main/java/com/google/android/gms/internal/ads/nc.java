package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f11814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f11815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f11816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f11817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f11818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f11819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f11820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final List f11821h;

    /* JADX WARN: Illegal instructions before constructor call */
    nc(String str, cb cbVar) {
        String str2 = cbVar.f6264b;
        long j8 = cbVar.f6265c;
        long j9 = cbVar.f6266d;
        long j10 = cbVar.f6267e;
        long j11 = cbVar.f6268f;
        List arrayList = cbVar.f6270h;
        if (arrayList == null) {
            Map map = cbVar.f6269g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new lb((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j8, j9, j10, j11, arrayList);
    }

    private nc(String str, String str2, long j8, long j9, long j10, long j11, List list) {
        this.f11815b = str;
        this.f11816c = true == "".equals(str2) ? null : str2;
        this.f11817d = j8;
        this.f11818e = j9;
        this.f11819f = j10;
        this.f11820g = j11;
        this.f11821h = list;
    }

    static nc a(pc pcVar) throws IOException {
        if (rc.d(pcVar) != 538247942) {
            throw new IOException();
        }
        String strG = rc.g(pcVar);
        String strG2 = rc.g(pcVar);
        long jE = rc.e(pcVar);
        long jE2 = rc.e(pcVar);
        long jE3 = rc.e(pcVar);
        long jE4 = rc.e(pcVar);
        int iD = rc.d(pcVar);
        if (iD < 0) {
            throw new IOException("readHeaderList size=" + iD);
        }
        List listEmptyList = iD == 0 ? Collections.emptyList() : new ArrayList();
        for (int i8 = 0; i8 < iD; i8++) {
            listEmptyList.add(new lb(rc.g(pcVar).intern(), rc.g(pcVar).intern()));
        }
        return new nc(strG, strG2, jE, jE2, jE3, jE4, listEmptyList);
    }
}
