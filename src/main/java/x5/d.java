package x5;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import s5.j;
import s5.k;
import s5.t;
import t3.b;
import t3.c;
import t3.d;
import t3.f;

/* JADX INFO: loaded from: classes.dex */
public class d implements k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x5.c f27309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f27310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f27311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t3.c f27312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f27313e;

    class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f27314a;

        a(k.d dVar) {
            this.f27314a = dVar;
        }

        @Override // t3.c.b
        public void a() {
            this.f27314a.a(null);
        }
    }

    class b implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f27316a;

        b(k.d dVar) {
            this.f27316a = dVar;
        }

        @Override // t3.c.a
        public void a(t3.e eVar) {
            this.f27316a.b(Integer.toString(eVar.a()), eVar.b(), null);
        }
    }

    class c implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f27318a;

        c(k.d dVar) {
            this.f27318a = dVar;
        }

        @Override // t3.f.b
        public void b(t3.b bVar) {
            d.this.f27309a.s(bVar);
            this.f27318a.a(bVar);
        }
    }

    /* JADX INFO: renamed from: x5.d$d, reason: collision with other inner class name */
    class C0189d implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f27320a;

        C0189d(k.d dVar) {
            this.f27320a = dVar;
        }

        @Override // t3.f.a
        public void a(t3.e eVar) {
            this.f27320a.b(Integer.toString(eVar.a()), eVar.b(), null);
        }
    }

    class e implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f27322a;

        e(k.d dVar) {
            this.f27322a = dVar;
        }

        @Override // t3.b.a
        public void a(t3.e eVar) {
            if (eVar != null) {
                this.f27322a.b(Integer.toString(eVar.a()), eVar.b(), null);
            } else {
                this.f27322a.a(null);
            }
        }
    }

    public d(s5.c cVar, Context context) {
        x5.c cVar2 = new x5.c();
        this.f27309a = cVar2;
        k kVar = new k(cVar, "plugins.flutter.io/google_mobile_ads/ump", new t(cVar2));
        this.f27310b = kVar;
        kVar.e(this);
        this.f27311c = context;
    }

    private t3.c b() {
        t3.c cVar = this.f27312d;
        if (cVar != null) {
            return cVar;
        }
        t3.c cVarA = f.a(this.f27311c);
        this.f27312d = cVarA;
        return cVarA;
    }

    public void c(Activity activity) {
        this.f27313e = activity;
    }

    @Override // s5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        Object objValueOf;
        String str = jVar.f26252a;
        str.hashCode();
        switch (str) {
            case "ConsentInformation#reset":
                b().reset();
                dVar.a(null);
                return;
            case "ConsentInformation#requestConsentInfoUpdate":
                if (this.f27313e == null) {
                    dVar.b("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    return;
                } else {
                    x5.b bVar = (x5.b) jVar.a("params");
                    b().a(this.f27313e, bVar == null ? new d.a().a() : bVar.a(this.f27313e), new a(dVar), new b(dVar));
                    return;
                }
            case "ConsentForm#show":
                t3.b bVar2 = (t3.b) jVar.a("consentForm");
                if (bVar2 == null) {
                    dVar.b("0", "ConsentForm#show", null);
                    return;
                } else {
                    bVar2.a(this.f27313e, new e(dVar));
                    return;
                }
            case "ConsentForm#dispose":
                t3.b bVar3 = (t3.b) jVar.a("consentForm");
                if (bVar3 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    this.f27309a.r(bVar3);
                }
                dVar.a(null);
                return;
            case "ConsentInformation#isConsentFormAvailable":
                objValueOf = Boolean.valueOf(b().c());
                break;
            case "UserMessagingPlatform#loadConsentForm":
                f.b(this.f27311c, new c(dVar), new C0189d(dVar));
                return;
            case "ConsentInformation#getConsentStatus":
                objValueOf = Integer.valueOf(b().b());
                break;
            default:
                dVar.c();
                return;
        }
        dVar.a(objValueOf);
    }
}
