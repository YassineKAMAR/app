package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
final class ym2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zn2 f17855a;

    /* synthetic */ ym2(zn2 zn2Var, vl2 vl2Var) {
        this.f17855a = zn2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 2
            r1 = 9
            r2 = 6
            r3 = 4
            r4 = 1
            r5 = 0
            r6 = 5
            if (r10 != 0) goto L14
        L12:
            r0 = 0
            goto L52
        L14:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L50
            if (r10 == 0) goto L4e
            boolean r7 = r10.isConnected()
            if (r7 != 0) goto L21
            goto L4e
        L21:
            int r7 = r10.getType()
            if (r7 == 0) goto L38
            if (r7 == r4) goto L52
            if (r7 == r3) goto L38
            if (r7 == r6) goto L38
            if (r7 == r2) goto L36
            if (r7 == r1) goto L34
            r0 = 8
            goto L52
        L34:
            r0 = 7
            goto L52
        L36:
            r0 = 5
            goto L52
        L38:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L4c;
                case 2: goto L4c;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L4a;
                case 7: goto L4a;
                case 8: goto L4a;
                case 9: goto L4a;
                case 10: goto L4a;
                case 11: goto L4a;
                case 12: goto L4a;
                case 13: goto L36;
                case 14: goto L4a;
                case 15: goto L4a;
                case 16: goto L3f;
                case 17: goto L4a;
                case 18: goto L52;
                case 19: goto L3f;
                case 20: goto L41;
                default: goto L3f;
            }
        L3f:
            r0 = 6
            goto L52
        L41:
            int r10 = com.google.android.gms.internal.ads.nz2.f12300a
            r0 = 29
            if (r10 < r0) goto L12
            r0 = 9
            goto L52
        L4a:
            r0 = 4
            goto L52
        L4c:
            r0 = 3
            goto L52
        L4e:
            r0 = 1
            goto L52
        L50:
            goto L12
        L52:
            int r10 = com.google.android.gms.internal.ads.nz2.f12300a
            r1 = 31
            if (r10 < r1) goto L7b
            if (r0 != r6) goto L7b
            com.google.android.gms.internal.ads.zn2 r10 = r8.f17855a
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L77
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L77
            r0.getClass()
            com.google.android.gms.internal.ads.uk2 r1 = new com.google.android.gms.internal.ads.uk2     // Catch: java.lang.RuntimeException -> L77
            r1.<init>(r10)     // Catch: java.lang.RuntimeException -> L77
            java.util.concurrent.Executor r9 = androidx.core.content.i.a(r9)     // Catch: java.lang.RuntimeException -> L77
            com.google.android.gms.internal.ads.wm2.a(r0, r9, r1)     // Catch: java.lang.RuntimeException -> L77
            com.google.android.gms.internal.ads.xm2.a(r0, r1)     // Catch: java.lang.RuntimeException -> L77
            return
        L77:
            com.google.android.gms.internal.ads.zn2.c(r10, r6)
            return
        L7b:
            com.google.android.gms.internal.ads.zn2 r9 = r8.f17855a
            com.google.android.gms.internal.ads.zn2.c(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ym2.onReceive(android.content.Context, android.content.Intent):void");
    }
}
