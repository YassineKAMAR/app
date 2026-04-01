package z2;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
public interface e {
    void b(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T c(String str, Class<T> cls);

    Activity d();

    void startActivityForResult(Intent intent, int i8);
}
