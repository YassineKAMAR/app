package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public class p9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l8 f19040d = l8.f18924c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o7 f19041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ma f19042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile o7 f19043c;

    private final ma c(ma maVar) {
        if (this.f19042b == null) {
            synchronized (this) {
                if (this.f19042b == null) {
                    try {
                        this.f19042b = maVar;
                        this.f19043c = o7.f19004b;
                    } catch (k9 unused) {
                        this.f19042b = maVar;
                        this.f19043c = o7.f19004b;
                    }
                }
            }
        }
        return this.f19042b;
    }

    public final ma a(ma maVar) {
        ma maVar2 = this.f19042b;
        this.f19041a = null;
        this.f19043c = null;
        this.f19042b = maVar;
        return maVar2;
    }

    public final int b() {
        if (this.f19043c != null) {
            return this.f19043c.y();
        }
        if (this.f19042b != null) {
            return this.f19042b.o0();
        }
        return 0;
    }

    public final o7 d() {
        if (this.f19043c != null) {
            return this.f19043c;
        }
        synchronized (this) {
            if (this.f19043c != null) {
                return this.f19043c;
            }
            this.f19043c = this.f19042b == null ? o7.f19004b : this.f19042b.k0();
            return this.f19043c;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        ma maVar = this.f19042b;
        ma maVar2 = p9Var.f19042b;
        return (maVar == null && maVar2 == null) ? d().equals(p9Var.d()) : (maVar == null || maVar2 == null) ? maVar != null ? maVar.equals(p9Var.c(maVar.c())) : c(maVar2.c()).equals(maVar2) : maVar.equals(maVar2);
    }

    public int hashCode() {
        return 1;
    }
}
