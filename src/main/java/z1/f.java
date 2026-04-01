package z1;

import android.content.Context;
import android.os.RemoteException;
import c2.f;
import c2.h;
import com.google.android.gms.ads.nativead.a;
import com.google.android.gms.internal.ads.ay;
import com.google.android.gms.internal.ads.cy;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.g80;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.w40;
import h2.k4;
import h2.l0;
import h2.m4;
import h2.o0;
import h2.u3;
import h2.v4;
import h2.w2;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v4 f27613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0 f27615c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f27616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f27617b;

        public a(Context context, String str) {
            Context context2 = (Context) a3.o.k(context, "context cannot be null");
            o0 o0VarC = h2.v.a().c(context, str, new w40());
            this.f27616a = context2;
            this.f27617b = o0VarC;
        }

        public f a() {
            try {
                return new f(this.f27616a, this.f27617b.m(), v4.f22331a);
            } catch (RemoteException e8) {
                qg0.e("Failed to build AdLoader.", e8);
                return new f(this.f27616a, new u3().P5(), v4.f22331a);
            }
        }

        @Deprecated
        public a b(String str, f.b bVar, f.a aVar) {
            ay ayVar = new ay(bVar, aVar);
            try {
                this.f27617b.f4(str, ayVar.e(), ayVar.d());
            } catch (RemoteException e8) {
                qg0.h("Failed to add custom template ad listener", e8);
            }
            return this;
        }

        public a c(a.c cVar) {
            try {
                this.f27617b.M5(new g80(cVar));
            } catch (RemoteException e8) {
                qg0.h("Failed to add google native ad listener", e8);
            }
            return this;
        }

        @Deprecated
        public a d(h.a aVar) {
            try {
                this.f27617b.M5(new cy(aVar));
            } catch (RemoteException e8) {
                qg0.h("Failed to add google native ad listener", e8);
            }
            return this;
        }

        public a e(d dVar) {
            try {
                this.f27617b.y3(new m4(dVar));
            } catch (RemoteException e8) {
                qg0.h("Failed to set AdListener.", e8);
            }
            return this;
        }

        @Deprecated
        public a f(c2.e eVar) {
            try {
                this.f27617b.j4(new lv(eVar));
            } catch (RemoteException e8) {
                qg0.h("Failed to specify native ad options", e8);
            }
            return this;
        }

        public a g(o2.b bVar) {
            try {
                this.f27617b.j4(new lv(4, bVar.e(), -1, bVar.d(), bVar.a(), bVar.c() != null ? new k4(bVar.c()) : null, bVar.h(), bVar.b(), bVar.f(), bVar.g()));
            } catch (RemoteException e8) {
                qg0.h("Failed to specify native ad options", e8);
            }
            return this;
        }
    }

    f(Context context, l0 l0Var, v4 v4Var) {
        this.f27614b = context;
        this.f27615c = l0Var;
        this.f27613a = v4Var;
    }

    private final void d(final w2 w2Var) {
        ns.a(this.f27614b);
        if (((Boolean) gu.f8497c.e()).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: z1.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27600a.c(w2Var);
                    }
                });
                return;
            }
        }
        try {
            this.f27615c.k1(this.f27613a.a(this.f27614b, w2Var));
        } catch (RemoteException e8) {
            qg0.e("Failed to load ad.", e8);
        }
    }

    public void a(a2.a aVar) {
        d(aVar.f27620a);
    }

    public void b(g gVar) {
        d(gVar.f27620a);
    }

    final /* synthetic */ void c(w2 w2Var) {
        try {
            this.f27615c.k1(this.f27613a.a(this.f27614b, w2Var));
        } catch (RemoteException e8) {
            qg0.e("Failed to load ad.", e8);
        }
    }
}
