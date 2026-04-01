package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dk0 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6777a;

    private static int b(Context context, Map map, String str, int i8) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                h2.v.b();
                i8 = jg0.B(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                qg0.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (j2.v1.m()) {
            j2.v1.k("Parse pixels for " + str + ", got string " + str2 + ", int " + i8 + ".");
        }
        return i8;
    }

    private static void c(qi0 qi0Var, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                qi0Var.c(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                qg0.g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            qi0Var.a(Integer.parseInt(str2));
        }
        if (str3 != null) {
            qi0Var.I(Integer.parseInt(str3));
        }
        if (str4 != null) {
            qi0Var.J(Integer.parseInt(str4));
        }
        if (str5 != null) {
            qi0Var.e(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:180|(1:(11:183|190|(7:192|(0)|215|200|201|203|(2:211|212)(2:207|(2:209|210)(1:232)))(3:195|(1:197)|198)|199|215|200|201|203|(1:205)|211|212)(1:184))(3:185|(1:187)|188)|189|190|(0)(0)|199|215|200|201|203|(0)|211|212) */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0441, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0452  */
    @Override // com.google.android.gms.internal.ads.qz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r22, java.util.Map r23) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dk0.a(java.lang.Object, java.util.Map):void");
    }
}
