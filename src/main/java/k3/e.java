package k3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f24205a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = 0
            r3 = 31
            if (r0 < r3) goto La
            goto L29
        La:
            r3 = 30
            if (r0 < r3) goto L28
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r3 = r0.length()
            r4 = 1
            if (r3 != r4) goto L28
            char r3 = r0.charAt(r2)
            r4 = 83
            if (r3 < r4) goto L28
            char r0 = r0.charAt(r2)
            r3 = 90
            if (r0 > r3) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            k3.e.f24205a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.e.<clinit>():void");
    }

    public static PendingIntent a(Context context, int i8, Intent intent, int i9) {
        return PendingIntent.getActivity(context, i8, intent, i9);
    }
}
