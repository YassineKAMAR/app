package g3;

import a3.o;
import android.content.Context;
import android.os.IBinder;
import x2.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f22023b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.f22022a = str;
    }

    protected abstract T a(IBinder iBinder);

    protected final T b(Context context) throws a {
        if (this.f22023b == null) {
            o.j(context);
            Context contextC = i.c(context);
            if (contextC == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f22023b = a((IBinder) contextC.getClassLoader().loadClass(this.f22022a).newInstance());
            } catch (ClassNotFoundException e8) {
                throw new a("Could not load creator class.", e8);
            } catch (IllegalAccessException e9) {
                throw new a("Could not access creator.", e9);
            } catch (InstantiationException e10) {
                throw new a("Could not instantiate creator.", e10);
            }
        }
        return (T) this.f22023b;
    }
}
