package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    static s3.h<Void> didReinitializeFirebaseCore() {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.j
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(iVar);
            }
        });
        return iVar.a();
    }

    static s3.h<Map<String, Object>> getPluginConstantsForFirebaseApp(final c4.e eVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(eVar, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(s3.i iVar) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                s3.k.a(it.next().getValue().didReinitializeFirebaseCore());
            }
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(c4.e eVar, s3.i iVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                map2.put(entry.getKey(), s3.k.a(entry.getValue().getPluginConstantsForFirebaseApp(eVar)));
            }
            iVar.c(map2);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
