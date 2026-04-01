package io.flutter.plugins.firebase.analytics;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f4.c;
import java.util.Collections;
import java.util.List;
import v4.h;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-analytics", "10.8.0"));
    }
}
