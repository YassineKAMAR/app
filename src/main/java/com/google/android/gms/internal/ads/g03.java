package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g03 implements j03 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g03 f8146f = new g03(new k03());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final g13 f8147a = new g13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f8148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k03 f8150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8151e;

    private g03(k03 k03Var) {
        this.f8150d = k03Var;
    }

    public static g03 a() {
        return f8146f;
    }

    @Override // com.google.android.gms.internal.ads.j03
    public final void b(boolean z7) {
        if (!this.f8151e && z7) {
            Date date = new Date();
            Date date2 = this.f8148b;
            if (date2 == null || date.after(date2)) {
                this.f8148b = date;
                if (this.f8149c) {
                    Iterator it = i03.a().b().iterator();
                    while (it.hasNext()) {
                        ((uz2) it.next()).g().e(c());
                    }
                }
            }
        }
        this.f8151e = z7;
    }

    public final Date c() {
        Date date = this.f8148b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void d(Context context) {
        if (this.f8149c) {
            return;
        }
        this.f8150d.d(context);
        this.f8150d.e(this);
        this.f8150d.f();
        this.f8151e = this.f8150d.f9862b;
        this.f8149c = true;
    }
}
