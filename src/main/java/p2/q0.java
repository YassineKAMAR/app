package p2;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.g90;
import com.google.android.gms.internal.ads.jz2;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.vf3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class q0 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g90 f25574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f25575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f25576c;

    q0(c cVar, g90 g90Var, boolean z7) {
        this.f25576c = cVar;
        this.f25574a = g90Var;
        this.f25575b = z7;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        try {
            this.f25574a.b("Internal error: " + th.getMessage());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        jz2 jz2Var;
        String string;
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.f25574a.y1(arrayList);
            if (this.f25576c.f25502o || this.f25575b) {
                for (Uri uri : arrayList) {
                    if (this.f25576c.d6(uri)) {
                        Uri uriM6 = c.m6(uri, this.f25576c.f25511x, "1");
                        jz2Var = this.f25576c.f25501n;
                        string = uriM6.toString();
                    } else {
                        if (((Boolean) h2.y.c().b(ns.u7)).booleanValue()) {
                            jz2Var = this.f25576c.f25501n;
                            string = uri.toString();
                        }
                    }
                    jz2Var.c(string, null);
                }
            }
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }
}
