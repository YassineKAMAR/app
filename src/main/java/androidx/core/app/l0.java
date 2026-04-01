package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.p;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1866a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f1867b = new Object();

    static Bundle a(p.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.h() : 0);
        bundle.putCharSequence(com.amazon.a.a.o.b.S, aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(q0 q0Var) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(q0[] q0VarArr) {
        if (q0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[q0VarArr.length];
        for (int i8 = 0; i8 < q0VarArr.length; i8++) {
            q0 q0Var = q0VarArr[i8];
            bundleArr[i8] = b(null);
        }
        return bundleArr;
    }
}
