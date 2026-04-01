package j2;

import android.content.Context;
import com.google.android.gms.internal.ads.dc;
import com.google.android.gms.internal.ads.e10;
import com.google.android.gms.internal.ads.ic;
import com.google.android.gms.internal.ads.jc;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rc;
import com.google.android.gms.internal.ads.ub;
import com.google.android.gms.internal.ads.vc;
import com.google.android.gms.internal.ads.xb;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends jc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f23908d;

    private a0(Context context, ic icVar) {
        super(icVar);
        this.f23908d = context;
    }

    public static xb b(Context context) {
        xb xbVar = new xb(new rc(new File(context.getCacheDir(), "admob_volley"), 20971520), new a0(context, new vc()), 4);
        xbVar.d();
        return xbVar;
    }

    @Override // com.google.android.gms.internal.ads.jc, com.google.android.gms.internal.ads.mb
    public final qb a(ub ubVar) throws dc {
        if (ubVar.j() == 0) {
            if (Pattern.matches((String) h2.y.c().b(ns.f12152o4), ubVar.q())) {
                Context context = this.f23908d;
                h2.v.b();
                if (jg0.w(context, 13400000)) {
                    qb qbVarA = new e10(this.f23908d).a(ubVar);
                    if (qbVarA != null) {
                        v1.k("Got gmscore asset response: ".concat(String.valueOf(ubVar.q())));
                        return qbVarA;
                    }
                    v1.k("Failed to get gmscore asset response: ".concat(String.valueOf(ubVar.q())));
                }
            }
        }
        return super.a(ubVar);
    }
}
