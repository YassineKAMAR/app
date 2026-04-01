package g2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.da0;
import com.google.android.gms.internal.ads.nd0;
import j2.k2;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd0 f21943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final da0 f21944d = new da0(false, Collections.emptyList());

    public b(Context context, nd0 nd0Var, da0 da0Var) {
        this.f21941a = context;
        this.f21943c = nd0Var;
    }

    private final boolean d() {
        nd0 nd0Var = this.f21943c;
        return (nd0Var != null && nd0Var.j().f10032f) || this.f21944d.f6633a;
    }

    public final void a() {
        this.f21942b = true;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            nd0 nd0Var = this.f21943c;
            if (nd0Var != null) {
                nd0Var.a(str, null, 3);
                return;
            }
            da0 da0Var = this.f21944d;
            if (!da0Var.f6633a || (list = da0Var.f6634b) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f21941a;
                    t.r();
                    k2.k(context, "", strReplace);
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.f21942b;
    }
}
