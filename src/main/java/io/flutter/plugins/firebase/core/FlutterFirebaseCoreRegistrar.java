package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<f4.c<?>> getComponents() {
        return Collections.singletonList(v4.h.b("flutter-fire-core", "2.24.2"));
    }
}
