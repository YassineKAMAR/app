package h0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22134a = new a();

    /* JADX INFO: renamed from: h0.a$a, reason: collision with other inner class name */
    private static final class C0116a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0116a f22135a = new C0116a();

        private C0116a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(UtilsKt.MICROS_MULTIPLIER);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0116a.f22135a.a();
        }
        return 0;
    }
}
