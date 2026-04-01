package h2;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.jg0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4 f22331a = new v4();

    protected v4() {
    }

    public final r4 a(Context context, w2 w2Var) {
        Context context2;
        List listUnmodifiableList;
        String strU;
        Date dateL = w2Var.l();
        long time = dateL != null ? dateL.getTime() : -1L;
        String strI = w2Var.i();
        int iA = w2Var.a();
        Set setO = w2Var.o();
        if (setO.isEmpty()) {
            context2 = context;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(setO));
            context2 = context;
        }
        boolean zQ = w2Var.q(context2);
        Bundle bundleE = w2Var.e(AdMobAdapter.class);
        String strJ = w2Var.j();
        w2Var.g();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            v.b();
            strU = jg0.u(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strU = null;
        }
        boolean zP = w2Var.p();
        z1.v vVarD = j3.g().d();
        return new r4(8, time, bundleE, iA, listUnmodifiableList, zQ, Math.max(w2Var.c(), vVarD.c()), false, strJ, null, null, strI, w2Var.f(), w2Var.d(), Collections.unmodifiableList(new ArrayList(w2Var.n())), w2Var.k(), strU, zP, null, vVarD.d(), (String) Collections.max(Arrays.asList(null, vVarD.a()), new Comparator() { // from class: h2.u4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = z1.v.f27656f;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), w2Var.m(), w2Var.b(), w2Var.h(), vVarD.b().a());
    }
}
