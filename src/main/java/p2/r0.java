package p2;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.g90;
import com.google.android.gms.internal.ads.jz2;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.vf3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class r0 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g90 f25579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f25580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f25581c;

    r0(c cVar, g90 g90Var, boolean z7) {
        this.f25581c = cVar;
        this.f25579a = g90Var;
        this.f25580b = z7;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        try {
            this.f25579a.b("Internal error: " + th.getMessage());
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        jz2 jz2Var;
        String string;
        List<Uri> list = (List) obj;
        try {
            c.U5(this.f25581c, list);
            this.f25579a.y1(list);
            if (this.f25581c.f25503p || this.f25580b) {
                for (Uri uri : list) {
                    if (this.f25581c.c6(uri)) {
                        Uri uriM6 = c.m6(uri, this.f25581c.f25511x, "1");
                        jz2Var = this.f25581c.f25501n;
                        string = uriM6.toString();
                    } else {
                        if (((Boolean) h2.y.c().b(ns.u7)).booleanValue()) {
                            jz2Var = this.f25581c.f25501n;
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
