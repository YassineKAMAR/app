package j2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.ot;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.x84;

/* JADX INFO: loaded from: classes.dex */
final class f2 implements ot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qt f23960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f23962c;

    f2(k2 k2Var, qt qtVar, Context context, Uri uri) {
        this.f23960a = qtVar;
        this.f23961b = context;
        this.f23962c = uri;
    }

    @Override // com.google.android.gms.internal.ads.ot
    public final void j() {
        androidx.browser.customtabs.d dVarA = new d.b(this.f23960a.a()).a();
        dVarA.f1207a.setPackage(x84.a(this.f23961b));
        dVarA.a(this.f23961b, this.f23962c);
        this.f23960a.f((Activity) this.f23961b);
    }
}
