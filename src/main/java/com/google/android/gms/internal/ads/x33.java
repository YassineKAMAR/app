package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class x33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f17039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final File f17040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f17041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17042d;

    public x33(Context context, int i8) {
        this.f17041c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        y33.a(dir, false);
        this.f17039a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        y33.a(dir2, true);
        this.f17040b = dir2;
        this.f17042d = i8;
    }

    private final File d() {
        File file = new File(this.f17039a, Integer.toString(this.f17042d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(this.f17042d - 1);
        return sb.toString();
    }

    private final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(this.f17042d - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.fk r8, com.google.android.gms.internal.ads.d43 r9) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x33.a(com.google.android.gms.internal.ads.fk, com.google.android.gms.internal.ads.d43):boolean");
    }

    final ik b(int i8) {
        SharedPreferences sharedPreferences;
        String strE;
        if (i8 == 1) {
            sharedPreferences = this.f17041c;
            strE = f();
        } else {
            sharedPreferences = this.f17041c;
            strE = e();
        }
        String string = sharedPreferences.getString(strE, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrC = e3.j.c(string);
            rz3 rz3Var = rz3.f14393b;
            ik ikVarS = ik.S(rz3.L(bArrC, 0, bArrC.length));
            String strV = ikVarS.V();
            File fileB = y33.b(strV, "pcam.jar", d());
            if (!fileB.exists()) {
                fileB = y33.b(strV, "pcam", d());
            }
            File fileB2 = y33.b(strV, "pcbc", d());
            if (fileB.exists()) {
                if (fileB2.exists()) {
                    return ikVarS;
                }
            }
        } catch (m14 unused) {
        }
        return null;
    }

    public final w33 c(int i8) {
        ik ikVarB = b(1);
        if (ikVarB == null) {
            return null;
        }
        String strV = ikVarB.V();
        File fileB = y33.b(strV, "pcam.jar", d());
        if (!fileB.exists()) {
            fileB = y33.b(strV, "pcam", d());
        }
        return new w33(ikVarB, fileB, y33.b(strV, "pcbc", d()), y33.b(strV, "pcopt", d()));
    }
}
