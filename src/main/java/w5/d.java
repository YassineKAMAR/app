package w5;

import android.util.Log;
import io.flutter.plugins.googlemobileads.l0;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    SMALL(l0.f23247d),
    MEDIUM(l0.f23246c);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27127a;

    d(int i8) {
        this.f27127a = i8;
    }

    public static d c(int i8) {
        if (i8 >= 0 && i8 < values().length) {
            return values()[i8];
        }
        Log.w("NativeTemplateType", "Invalid template type index: " + i8);
        return MEDIUM;
    }

    public int d() {
        return this.f27127a;
    }
}
