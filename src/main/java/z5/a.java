package z5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: z5.a$a, reason: collision with other inner class name */
    public static class C0201a extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f27757b;
    }

    public interface b {
        Map<String, Object> a(String str, List<String> list);

        Boolean b(String str, List<String> list);

        Boolean c(String str, List<String> list);

        Boolean d(String str, Long l8);

        Boolean e(String str, String str2);

        Boolean f(String str, Boolean bool);

        Boolean g(String str, Double d8);

        Boolean remove(String str);
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0201a) {
            C0201a c0201a = (C0201a) th;
            arrayList.add(c0201a.f27756a);
            arrayList.add(c0201a.getMessage());
            obj = c0201a.f27757b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
