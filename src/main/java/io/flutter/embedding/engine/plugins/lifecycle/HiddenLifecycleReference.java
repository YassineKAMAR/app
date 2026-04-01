package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class HiddenLifecycleReference {
    private final d lifecycle;

    public HiddenLifecycleReference(d dVar) {
        this.lifecycle = dVar;
    }

    public d getLifecycle() {
        return this.lifecycle;
    }
}
