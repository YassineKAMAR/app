package androidx.fragment.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final g f2437b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f2438a = null;

    public interface a {
        void onBackStackChanged();
    }

    public abstract n a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Fragment c(String str);

    public g d() {
        if (this.f2438a == null) {
            this.f2438a = f2437b;
        }
        return this.f2438a;
    }

    public abstract List<Fragment> e();

    public abstract void f(int i8, int i9);

    public abstract boolean g();

    public void h(g gVar) {
        this.f2438a = gVar;
    }
}
