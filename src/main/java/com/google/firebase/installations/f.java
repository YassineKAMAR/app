package com.google.firebase.installations;

import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20859b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f20860c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static f f20861d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t4.a f20862a;

    private f(t4.a aVar) {
        this.f20862a = aVar;
    }

    public static f c() {
        return d(t4.b.b());
    }

    public static f d(t4.a aVar) {
        if (f20861d == null) {
            f20861d = new f(aVar);
        }
        return f20861d;
    }

    static boolean g(String str) {
        return f20860c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
    }

    public long a() {
        return this.f20862a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(r4.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f20859b;
    }
}
