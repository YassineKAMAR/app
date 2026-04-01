package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class g84 extends qp3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ut3 f8260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8261c;

    public g84(ut3 ut3Var, int i8, int i9) {
        super(b(2008, 1));
        this.f8260b = ut3Var;
        this.f8261c = 1;
    }

    public g84(IOException iOException, ut3 ut3Var, int i8, int i9) {
        super(iOException, b(i8, i9));
        this.f8260b = ut3Var;
        this.f8261c = i9;
    }

    public g84(String str, ut3 ut3Var, int i8, int i9) {
        super(str, b(i8, i9));
        this.f8260b = ut3Var;
        this.f8261c = i9;
    }

    public g84(String str, IOException iOException, ut3 ut3Var, int i8, int i9) {
        super(str, iOException, b(i8, i9));
        this.f8260b = ut3Var;
        this.f8261c = i9;
    }

    public static g84 a(IOException iOException, ut3 ut3Var, int i8) {
        String message = iOException.getMessage();
        int i9 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i9 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i9 = 1004;
        } else if (message != null && r73.a(message).matches("cleartext.*not permitted.*")) {
            i9 = 2007;
        }
        return i9 == 2007 ? new f74(iOException, ut3Var) : new g84(iOException, ut3Var, i9, i8);
    }

    private static int b(int i8, int i9) {
        return i8 == 2000 ? i9 != 1 ? 2000 : 2001 : i8;
    }
}
