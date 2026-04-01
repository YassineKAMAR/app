package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class i0 extends io.flutter.plugin.platform.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f23202b;

    class a implements io.flutter.plugin.platform.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23203a;

        a(Context context) {
            this.f23203a = context;
        }

        @Override // io.flutter.plugin.platform.k
        public void a() {
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void b(View view) {
            io.flutter.plugin.platform.j.a(this, view);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void c() {
            io.flutter.plugin.platform.j.c(this);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void d() {
            io.flutter.plugin.platform.j.d(this);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void e() {
            io.flutter.plugin.platform.j.b(this);
        }

        @Override // io.flutter.plugin.platform.k
        public View getView() {
            return new View(this.f23203a);
        }
    }

    public i0(io.flutter.plugins.googlemobileads.a aVar) {
        super(s5.s.f26264a);
        this.f23202b = aVar;
    }

    private static io.flutter.plugin.platform.k c(Context context, int i8) {
        g5.b.b(i0.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", Integer.valueOf(i8)));
        return new a(context);
    }

    @Override // io.flutter.plugin.platform.l
    public io.flutter.plugin.platform.k a(Context context, int i8, Object obj) {
        int iIntValue;
        if (obj == null) {
            iIntValue = 0;
        } else {
            Integer num = (Integer) obj;
            e eVarB = this.f23202b.b(num.intValue());
            if (eVarB != null && eVarB.c() != null) {
                return eVarB.c();
            }
            iIntValue = num.intValue();
        }
        return c(context, iIntValue);
    }
}
