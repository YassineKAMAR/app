package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zc extends ub {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f18148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zb f18149n;

    public zc(int i8, String str, zb zbVar, yb ybVar) {
        super(i8, str, ybVar);
        this.f18148m = new Object();
        this.f18149n = zbVar;
    }

    protected void F(String str) {
        zb zbVar;
        synchronized (this.f18148m) {
            zbVar = this.f18149n;
        }
        zbVar.a(str);
    }

    @Override // com.google.android.gms.internal.ads.ub
    protected final ac i(qb qbVar) {
        String str;
        String str2;
        try {
            byte[] bArr = qbVar.f13385b;
            Map map = qbVar.f13386c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i8 = 1;
                while (true) {
                    if (i8 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i8].trim().split(com.amazon.a.a.o.b.f.f3943b, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i8++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(qbVar.f13385b);
        }
        return ac.b(str, sc.b(qbVar));
    }
}
