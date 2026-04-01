package j2;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.b22;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.kn0;
import com.google.android.gms.internal.ads.mm0;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.vn;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class l2 extends c {
    public l2() {
        super(null);
    }

    @Override // j2.c
    public final int a() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // j2.c
    public final CookieManager b(Context context) {
        g2.t.r();
        if (k2.e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            qg0.e("Failed to obtain CookieManager.", th);
            g2.t.q().t(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // j2.c
    public final WebResourceResponse c(String str, String str2, int i8, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i8, str3, map, inputStream);
    }

    @Override // j2.c
    public final mm0 d(fm0 fm0Var, vn vnVar, boolean z7, b22 b22Var) {
        return new kn0(fm0Var, vnVar, z7, b22Var);
    }
}
