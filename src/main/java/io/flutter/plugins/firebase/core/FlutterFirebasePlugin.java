package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
@Keep
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    s3.h<Void> didReinitializeFirebaseCore();

    s3.h<Map<String, Object>> getPluginConstantsForFirebaseApp(c4.e eVar);
}
