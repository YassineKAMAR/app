package v5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l5.a;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class n implements FlutterFirebasePlugin, k.c, l5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FirebaseAnalytics f26977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s5.k f26978b;

    class a extends HashMap<String, Object> {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(s3.i iVar) {
        try {
            iVar.c((Long) s3.k.a(this.f26977a.b()));
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(Map map, s3.i iVar) {
        try {
            Object obj = map.get("eventName");
            Objects.requireNonNull(obj);
            Bundle bundleN = n((Map) map.get("parameters"));
            this.f26977a.c((String) obj, bundleN);
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(s3.i iVar) {
        try {
            this.f26977a.d();
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Map map, s3.i iVar) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            this.f26977a.e(((Boolean) obj).booleanValue());
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Map map, s3.i iVar) {
        try {
            Objects.requireNonNull(map.get("milliseconds"));
            this.f26977a.h(((Integer) r4).intValue());
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Map map, s3.i iVar) {
        try {
            this.f26977a.i((String) map.get("userId"));
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Map map, s3.i iVar) {
        try {
            Object obj = map.get("name");
            Objects.requireNonNull(obj);
            String str = (String) map.get("value");
            this.f26977a.j((String) obj, str);
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(k.d dVar, s3.h hVar) {
        if (hVar.m()) {
            dVar.a(hVar.j());
        } else {
            Exception excI = hVar.i();
            dVar.b("firebase_analytics", excI != null ? excI.getMessage() : "An unknown error occurred", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Map map, s3.i iVar) {
        try {
            Boolean bool = (Boolean) map.get("adStorageConsentGranted");
            Boolean bool2 = (Boolean) map.get("analyticsStorageConsentGranted");
            HashMap map2 = new HashMap();
            if (bool != null) {
                map2.put(FirebaseAnalytics.b.AD_STORAGE, bool.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool2 != null) {
                map2.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, bool2.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            this.f26977a.f(map2);
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(Map map, s3.i iVar) {
        try {
            this.f26977a.g(n(map));
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    private s3.h<Void> K(final Map<String, Object> map) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f26974a.I(map, iVar);
            }
        });
        return iVar.a();
    }

    private s3.h<Void> L(final Map<String, Object> map) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f26968a.J(map, iVar);
            }
        });
        return iVar.a();
    }

    private static Bundle n(Map<String, Object> map) {
        long jIntValue;
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else {
                if (value instanceof Integer) {
                    jIntValue = ((Integer) value).intValue();
                } else if (value instanceof Long) {
                    jIntValue = ((Long) value).longValue();
                } else if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value == null) {
                    bundle.putString(key, null);
                } else if (value instanceof Iterable) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Object obj : (Iterable) value) {
                        if (!(obj instanceof Map)) {
                            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass().getCanonicalName() + " in list at key " + key);
                        }
                        arrayList.add(n((Map) obj));
                    }
                    bundle.putParcelableArrayList(key, arrayList);
                } else {
                    if (!(value instanceof Map)) {
                        throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
                    }
                    bundle.putParcelable(key, n((Map) value));
                }
                bundle.putLong(key, jIntValue);
            }
        }
        return bundle;
    }

    private s3.h<String> o() {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f26963a.z(iVar);
            }
        });
        return iVar.a();
    }

    private s3.h<Long> p() {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f26950a.A(iVar);
            }
        });
        return iVar.a();
    }

    private s3.h<Void> q(final Map<String, Object> map) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f26971a.B(map, iVar);
            }
        });
        return iVar.a();
    }

    private s3.h<Void> r() {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f26952a.C(iVar);
            }
        });
        return iVar.a();
    }

    private s3.h<Void> s(final Map<String, Object> map) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f26947a.D(map, iVar);
            }
        });
        return iVar.a();
    }

    private s3.h<Void> t(final Map<String, Object> map) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f26960a.E(map, iVar);
            }
        });
        return iVar.a();
    }

    private s3.h<Void> u(final Map<String, Object> map) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f26957a.F(map, iVar);
            }
        });
        return iVar.a();
    }

    private s3.h<Void> v(final Map<String, Object> map) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f26965a.G(map, iVar);
            }
        });
        return iVar.a();
    }

    private void w(s5.c cVar, Context context) {
        this.f26977a = FirebaseAnalytics.getInstance(context);
        s5.k kVar = new s5.k(cVar, "plugins.flutter.io/firebase_analytics");
        this.f26978b = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(s3.i iVar) {
        try {
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(s3.i iVar) {
        try {
            iVar.c(new a());
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(s3.i iVar) {
        try {
            iVar.c((String) s3.k.a(this.f26977a.a()));
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public s3.h<Void> didReinitializeFirebaseCore() {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.a
            @Override // java.lang.Runnable
            public final void run() {
                n.x(iVar);
            }
        });
        return iVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public s3.h<Map<String, Object>> getPluginConstantsForFirebaseApp(c4.e eVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v5.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f26954a.y(iVar);
            }
        });
        return iVar.a();
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        w(bVar.b(), bVar.a());
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        s5.k kVar = this.f26978b;
        if (kVar != null) {
            kVar.e(null);
            this.f26978b = null;
        }
    }

    @Override // s5.k.c
    public void onMethodCall(s5.j jVar, final k.d dVar) {
        s3.h hVarO;
        String str = jVar.f26252a;
        str.hashCode();
        switch (str) {
            case "Analytics#getAppInstanceId":
                hVarO = o();
                break;
            case "Analytics#resetAnalyticsData":
                hVarO = r();
                break;
            case "Analytics#setConsent":
                hVarO = K((Map) jVar.b());
                break;
            case "Analytics#setAnalyticsCollectionEnabled":
                hVarO = s((Map) jVar.b());
                break;
            case "Analytics#setDefaultEventParameters":
                hVarO = L((Map) jVar.b());
                break;
            case "Analytics#logEvent":
                hVarO = q((Map) jVar.b());
                break;
            case "Analytics#getSessionId":
                hVarO = p();
                break;
            case "Analytics#setUserProperty":
                hVarO = v((Map) jVar.b());
                break;
            case "Analytics#setSessionTimeoutDuration":
                hVarO = t((Map) jVar.b());
                break;
            case "Analytics#setUserId":
                hVarO = u((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        hVarO.c(new s3.d() { // from class: v5.f
            @Override // s3.d
            public final void a(s3.h hVar) {
                n.H(dVar, hVar);
            }
        });
    }
}
