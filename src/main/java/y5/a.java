package y5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: y5.a$a, reason: collision with other inner class name */
    public static class C0194a extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f27447b;
    }

    public interface b {
        List<String> a();

        List<String> b(c cVar);

        String c();

        String d();

        String e();

        String f();

        String g();
    }

    public enum c {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f27460a;

        c(int i8) {
            this.f27460a = i8;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0194a) {
            C0194a c0194a = (C0194a) th;
            arrayList.add(c0194a.f27446a);
            arrayList.add(c0194a.getMessage());
            obj = c0194a.f27447b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
