package androidx.fragment.app;

import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f2525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f2527h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f2529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f2530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    CharSequence f2531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f2532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f2533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList<String> f2534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<String> f2535p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList<Runnable> f2537r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<a> f2520a = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f2528i = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f2536q = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f2539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        d.b f2544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        d.b f2545h;

        a() {
        }

        a(int i8, Fragment fragment) {
            this.f2538a = i8;
            this.f2539b = fragment;
            d.b bVar = d.b.RESUMED;
            this.f2544g = bVar;
            this.f2545h = bVar;
        }
    }

    public n b(Fragment fragment, String str) {
        f(0, fragment, str, 1);
        return this;
    }

    void c(a aVar) {
        this.f2520a.add(aVar);
        aVar.f2540c = this.f2521b;
        aVar.f2541d = this.f2522c;
        aVar.f2542e = this.f2523d;
        aVar.f2543f = this.f2524e;
    }

    public abstract int d();

    public abstract int e();

    void f(int i8, Fragment fragment, String str, int i9) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f2365x;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2365x + " now " + str);
            }
            fragment.f2365x = str;
        }
        if (i8 != 0) {
            if (i8 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i10 = fragment.f2363v;
            if (i10 != 0 && i10 != i8) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2363v + " now " + i8);
            }
            fragment.f2363v = i8;
            fragment.f2364w = i8;
        }
        c(new a(i9, fragment));
    }

    public n g(Fragment fragment) {
        c(new a(3, fragment));
        return this;
    }
}
