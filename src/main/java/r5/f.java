package r5;

import java.util.Locale;
import s5.u;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f25928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f25929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s5.a<String> f25931d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25932a;

        static {
            int[] iArr = new int[b.values().length];
            f25932a = iArr;
            try {
                iArr[b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25932a[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25932a[b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25932a[b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25932a[b.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public f(h5.a aVar) {
        this((s5.a<String>) new s5.a(aVar, "flutter/lifecycle", u.f26270b));
    }

    public f(s5.a<String> aVar) {
        this.f25928a = null;
        this.f25929b = null;
        this.f25930c = true;
        this.f25931d = aVar;
    }

    private void g(b bVar, boolean z7) {
        b bVar2 = this.f25928a;
        if (bVar2 == bVar && z7 == this.f25930c) {
            return;
        }
        if (bVar == null && bVar2 == null) {
            this.f25930c = z7;
            return;
        }
        b bVar3 = null;
        int i8 = a.f25932a[bVar.ordinal()];
        if (i8 == 1) {
            bVar3 = z7 ? b.RESUMED : b.INACTIVE;
        } else if (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) {
            bVar3 = bVar;
        }
        this.f25928a = bVar;
        this.f25930c = z7;
        if (bVar3 == this.f25929b) {
            return;
        }
        String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
        g5.b.f("LifecycleChannel", "Sending " + str + " message.");
        this.f25931d.c(str);
        this.f25929b = bVar3;
    }

    public void a() {
        g(this.f25928a, true);
    }

    public void b() {
        g(b.DETACHED, this.f25930c);
    }

    public void c() {
        g(b.INACTIVE, this.f25930c);
    }

    public void d() {
        g(b.PAUSED, this.f25930c);
    }

    public void e() {
        g(b.RESUMED, this.f25930c);
    }

    public void f() {
        g(this.f25928a, false);
    }
}
