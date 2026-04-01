package r5;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.g;
import java.util.HashMap;
import s5.a;
import s5.s;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.a<Object> f25909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f25910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f25911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.d<Object> f25912d;

    /* JADX INFO: renamed from: r5.a$a, reason: collision with other inner class name */
    class C0164a implements a.d<Object> {
        C0164a() {
        }

        @Override // s5.a.d
        public void a(Object obj, a.e<Object> eVar) {
            HashMap map;
            HashMap map2;
            if (a.this.f25911c == null) {
                eVar.a(null);
                return;
            }
            map = (HashMap) obj;
            String str = (String) map.get("type");
            map2 = (HashMap) map.get("data");
            g5.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) map2.get("message");
                    if (str2 != null) {
                        a.this.f25911c.e(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) map2.get("message");
                    if (str3 != null) {
                        a.this.f25911c.d(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) map.get("nodeId");
                    if (num != null) {
                        a.this.f25911c.c(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) map.get("nodeId");
                    if (num2 != null) {
                        a.this.f25911c.f(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) map.get("nodeId");
                    if (num3 != null) {
                        a.this.f25911c.g(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void c(int i8);

        void d(String str);

        void e(String str);

        void f(int i8);

        void g(int i8);
    }

    public a(h5.a aVar, FlutterJNI flutterJNI) {
        C0164a c0164a = new C0164a();
        this.f25912d = c0164a;
        s5.a<Object> aVar2 = new s5.a<>(aVar, "flutter/accessibility", s.f26264a);
        this.f25909a = aVar2;
        aVar2.e(c0164a);
        this.f25910b = flutterJNI;
    }

    public void b(int i8, g.EnumC0132g enumC0132g) {
        this.f25910b.dispatchSemanticsAction(i8, enumC0132g);
    }

    public void c(int i8, g.EnumC0132g enumC0132g, Object obj) {
        this.f25910b.dispatchSemanticsAction(i8, enumC0132g, obj);
    }

    public void d() {
        this.f25910b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f25910b.setSemanticsEnabled(true);
    }

    public void f(int i8) {
        this.f25910b.setAccessibilityFeatures(i8);
    }

    public void g(b bVar) {
        this.f25911c = bVar;
        this.f25910b.setAccessibilityDelegate(bVar);
    }
}
