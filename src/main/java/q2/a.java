package q2;

import android.content.Context;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.i90;
import com.google.android.gms.internal.ads.ns;
import h2.m3;
import h2.w2;
import h2.y;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m3 f25789a;

    public a(m3 m3Var) {
        this.f25789a = m3Var;
    }

    public static void a(Context context, z1.b bVar, g gVar, b bVar2) {
        c(context, bVar, gVar, null, bVar2);
    }

    private static void c(final Context context, final z1.b bVar, final g gVar, final String str, final b bVar2) {
        ns.a(context);
        if (((Boolean) gu.f8505k.e()).booleanValue()) {
            if (((Boolean) y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: q2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar2 = gVar;
                        w2 w2VarA = gVar2 == null ? null : gVar2.a();
                        new i90(context, bVar, w2VarA, str).b(bVar2);
                    }
                });
                return;
            }
        }
        new i90(context, bVar, gVar == null ? null : gVar.a(), str).b(bVar2);
    }

    public String b() {
        return this.f25789a.a();
    }
}
