package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
class g53 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f8216g = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h53 f8222f;

    g53(Context context, String str, String str2, String str3) {
        this.f8222f = h53.b(context);
        this.f8217a = str;
        this.f8218b = str.concat("_3p");
        this.f8219c = str2;
        this.f8220d = str2.concat("_3p");
        this.f8221e = str3;
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f8221e;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 != null ? "not null" : "null");
        throw new IllegalArgumentException(sb.toString());
    }

    final long a(boolean z7) {
        return this.f8222f.a(z7 ? this.f8220d : this.f8219c, -1L);
    }

    final f53 b(String str, String str2, long j8, boolean z7) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f8216g)) {
                    String strE = e(true);
                    String strC = this.f8222f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new f53();
        }
        boolean z8 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f8221e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jA = a(z8);
        if (jA != -1) {
            if (jCurrentTimeMillis < jA) {
                this.f8222f.d(z8 ? this.f8220d : this.f8219c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jA + j8) {
                return c(str, str2);
            }
        }
        String strE2 = e(z8);
        return (strE2 != null || z7) ? new f53(strE2, a(z8)) : c(str, str2);
    }

    final f53 c(String str, String str2) throws IOException {
        String strH;
        boolean z7;
        if (str == null) {
            strH = UUID.randomUUID().toString();
            z7 = false;
        } else {
            String string = UUID.randomUUID().toString();
            this.f8222f.d("paid_3p_hash_key", string);
            strH = h(str, str2, string);
            z7 = true;
        }
        return d(strH, z7);
    }

    final f53 d(String str, boolean z7) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f8221e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.f8222f.d(z7 ? this.f8220d : this.f8219c, Long.valueOf(jCurrentTimeMillis));
        this.f8222f.d(z7 ? this.f8218b : this.f8217a, str);
        return new f53(str, jCurrentTimeMillis);
    }

    final String e(boolean z7) {
        return this.f8222f.c(z7 ? this.f8218b : this.f8217a, null);
    }

    final void f(boolean z7) throws IOException {
        this.f8222f.e(z7 ? this.f8220d : this.f8219c);
        this.f8222f.e(z7 ? this.f8218b : this.f8217a);
    }

    final boolean g(boolean z7) {
        return this.f8222f.g(this.f8217a);
    }
}
