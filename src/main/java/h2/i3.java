package h2;

import com.google.android.gms.internal.ads.l10;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i3 extends l10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j3 f22195a;

    /* synthetic */ i3(j3 j3Var, h3 h3Var) {
        this.f22195a = j3Var;
    }

    @Override // com.google.android.gms.internal.ads.m10
    public final void v4(List list) {
        int i8;
        ArrayList arrayList;
        synchronized (this.f22195a.f22202a) {
            this.f22195a.f22204c = false;
            this.f22195a.f22205d = true;
            arrayList = new ArrayList(this.f22195a.f22203b);
            this.f22195a.f22203b.clear();
        }
        f2.b bVarV = j3.v(list);
        int size = arrayList.size();
        for (i8 = 0; i8 < size; i8++) {
            ((f2.c) arrayList.get(i8)).a(bVarV);
        }
    }
}
