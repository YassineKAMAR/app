package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f1196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f1197d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0013a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f1198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f1199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f1200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f1201d;

        public a a() {
            return new a(this.f1198a, this.f1199b, this.f1200c, this.f1201d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1194a = num;
        this.f1195b = num2;
        this.f1196c = num3;
        this.f1197d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1194a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1195b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1196c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1197d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
