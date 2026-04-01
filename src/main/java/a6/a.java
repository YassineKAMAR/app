package a6;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import s5.s;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a6.a$a, reason: collision with other inner class name */
    public static class C0006a extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f223b;

        public C0006a(String str, String str2, Object obj) {
            super(str2);
            this.f222a = str;
            this.f223b = obj;
        }
    }

    public interface b {
        Boolean a(String str);

        Boolean b(String str, Boolean bool, d dVar);

        Boolean c();

        void d();

        Boolean e(String str, Map<String, String> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends s {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f224d = new c();

        private c() {
        }

        @Override // s5.s
        protected Object g(byte b8, ByteBuffer byteBuffer) {
            return b8 != -128 ? super.g(b8, byteBuffer) : d.a((ArrayList) f(byteBuffer));
        }

        @Override // s5.s
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof d)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((d) obj).h());
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f227c;

        d() {
        }

        static d a(ArrayList<Object> arrayList) {
            d dVar = new d();
            dVar.f((Boolean) arrayList.get(0));
            dVar.e((Boolean) arrayList.get(1));
            dVar.g((Map) arrayList.get(2));
            return dVar;
        }

        public Boolean b() {
            return this.f226b;
        }

        public Boolean c() {
            return this.f225a;
        }

        public Map<String, String> d() {
            return this.f227c;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.f226b = bool;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.f225a = bool;
        }

        public void g(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.f227c = map;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f225a);
            arrayList.add(this.f226b);
            arrayList.add(this.f227c);
            return arrayList;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0006a) {
            C0006a c0006a = (C0006a) th;
            arrayList.add(c0006a.f222a);
            arrayList.add(c0006a.getMessage());
            obj = c0006a.f223b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
