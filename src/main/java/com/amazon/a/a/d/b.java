package com.amazon.a.a.d;

import com.revenuecat.purchases.common.Constants;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f3603a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3606d;

    protected b(String str) {
        this(str, (String) null);
    }

    protected b(String str, String str2) {
        this(str, str2, (String) null);
    }

    protected b(String str, String str2, String str3) {
        super(str + ": " + str2 + ": " + str3);
        this.f3604b = str;
        this.f3605c = str2;
        this.f3606d = str3;
    }

    protected b(String str, String str2, Throwable th) {
        this(str, str2, a(th));
    }

    protected b(String str, Throwable th) {
        this(str, b(th), th);
    }

    private static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        Throwable thC = c(th);
        StringBuilder sb = new StringBuilder();
        sb.append(b(th));
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb.append(th.getMessage());
        if (th != thC) {
            sb.append("/");
            sb.append(b(thC));
            sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb.append(thC.getMessage());
        }
        return sb.toString();
    }

    private static String b(Throwable th) {
        return th.getClass().getName();
    }

    private static Throwable c(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public final String a() {
        return this.f3604b;
    }

    public final String b() {
        return this.f3605c;
    }

    public final String c() {
        return this.f3606d;
    }
}
