package m3;

import android.app.Application;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f24608a;

    public a(Application application) {
        this.f24608a = application;
    }

    public final String a() {
        try {
            return d2.a.a(this.f24608a).a();
        } catch (IOException | x2.g e8) {
            Log.d("UserMessagingPlatform", "Failed to get ad id.", e8);
            return null;
        }
    }
}
