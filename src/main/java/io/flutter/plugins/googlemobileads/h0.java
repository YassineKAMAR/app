package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import io.flutter.plugins.googlemobileads.e;
import io.flutter.plugins.googlemobileads.m;
import io.flutter.plugins.googlemobileads.w;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l5.a;
import s5.k;
import z1.v;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements l5.a, m5.a, k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.b f23184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.flutter.plugins.googlemobileads.a f23185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.flutter.plugins.googlemobileads.b f23186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppStateNotifier f23187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x5.d f23188e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j0 f23190g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, c> f23189f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v f23191h = new v();

    class a implements z1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f23192a;

        a(k.d dVar) {
            this.f23192a = dVar;
        }

        @Override // z1.p
        public void a(z1.c cVar) {
            if (cVar == null) {
                this.f23192a.a(null);
            } else {
                this.f23192a.b(Integer.toString(cVar.a()), cVar.c(), cVar.b());
            }
        }
    }

    private static final class b implements f2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k.d f23194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23195b;

        private b(k.d dVar) {
            this.f23194a = dVar;
            this.f23195b = false;
        }

        /* synthetic */ b(k.d dVar, a aVar) {
            this(dVar);
        }

        @Override // f2.c
        public void a(f2.b bVar) {
            if (this.f23195b) {
                return;
            }
            try {
                Method declaredMethod = MobileAds.class.getDeclaredMethod("setPlugin", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, "Flutter-GMA-4.0.0");
            } catch (Exception unused) {
            }
            this.f23194a.a(new t(bVar));
            this.f23195b = true;
        }
    }

    public interface c {
        NativeAdView a(com.google.android.gms.ads.nativead.a aVar, Map<String, Object> map);
    }

    private static <T> T b(T t7) {
        if (t7 != null) {
            return t7;
        }
        throw new IllegalArgumentException();
    }

    io.flutter.plugins.googlemobileads.c a(Context context) {
        return new io.flutter.plugins.googlemobileads.c(context);
    }

    @Override // m5.a
    public void onAttachedToActivity(m5.c cVar) {
        io.flutter.plugins.googlemobileads.a aVar = this.f23185b;
        if (aVar != null) {
            aVar.v(cVar.g());
        }
        io.flutter.plugins.googlemobileads.b bVar = this.f23186c;
        if (bVar != null) {
            bVar.r(cVar.g());
        }
        x5.d dVar = this.f23188e;
        if (dVar != null) {
            dVar.c(cVar.g());
        }
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        this.f23184a = bVar;
        io.flutter.plugins.googlemobileads.b bVar2 = new io.flutter.plugins.googlemobileads.b(bVar.a(), new c0(bVar.a()));
        this.f23186c = bVar2;
        j0 j0Var = this.f23190g;
        if (j0Var != null) {
            bVar2.s(j0Var);
        }
        s5.k kVar = new s5.k(bVar.b(), "plugins.flutter.io/google_mobile_ads", new s5.t(this.f23186c));
        kVar.e(this);
        this.f23185b = new io.flutter.plugins.googlemobileads.a(kVar);
        bVar.e().a("plugins.flutter.io/google_mobile_ads/ad_widget", new i0(this.f23185b));
        this.f23187d = new AppStateNotifier(bVar.b());
        this.f23188e = new x5.d(bVar.b(), bVar.a());
    }

    @Override // m5.a
    public void onDetachedFromActivity() {
        a.b bVar;
        io.flutter.plugins.googlemobileads.b bVar2 = this.f23186c;
        if (bVar2 != null && (bVar = this.f23184a) != null) {
            bVar2.r(bVar.a());
        }
        io.flutter.plugins.googlemobileads.a aVar = this.f23185b;
        if (aVar != null) {
            aVar.v(null);
        }
        x5.d dVar = this.f23188e;
        if (dVar != null) {
            dVar.c(null);
        }
    }

    @Override // m5.a
    public void onDetachedFromActivityForConfigChanges() {
        a.b bVar;
        io.flutter.plugins.googlemobileads.b bVar2 = this.f23186c;
        if (bVar2 != null && (bVar = this.f23184a) != null) {
            bVar2.r(bVar.a());
        }
        io.flutter.plugins.googlemobileads.a aVar = this.f23185b;
        if (aVar != null) {
            aVar.v(null);
        }
        x5.d dVar = this.f23188e;
        if (dVar != null) {
            dVar.c(null);
        }
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        AppStateNotifier appStateNotifier = this.f23187d;
        if (appStateNotifier != null) {
            appStateNotifier.e();
            this.f23187d = null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // s5.k.c
    public void onMethodCall(s5.j jVar, k.d dVar) {
        d0 d0Var;
        Object objB;
        String str;
        String str2;
        String str3;
        e0 e0Var;
        io.flutter.plugins.googlemobileads.a aVar = this.f23185b;
        if (aVar == null || this.f23184a == null) {
            Log.e("GoogleMobileAdsPlugin", "method call received before instanceManager initialized: " + jVar.f26252a);
            return;
        }
        Context contextF = aVar.f() != null ? this.f23185b.f() : this.f23184a.a();
        String str4 = jVar.f26252a;
        str4.hashCode();
        byte b8 = -1;
        switch (str4.hashCode()) {
            case -1959534605:
                if (str4.equals("MobileAds#openDebugMenu")) {
                    b8 = 0;
                }
                break;
            case -1941808395:
                if (str4.equals("loadInterstitialAd")) {
                    b8 = 1;
                }
                break;
            case -1826439721:
                if (str4.equals("MobileAds#setAppMuted")) {
                    b8 = 2;
                }
                break;
            case -1771320504:
                if (str4.equals("loadAppOpenAd")) {
                    b8 = 3;
                }
                break;
            case -1557947903:
                if (str4.equals("MobileAds#registerWebView")) {
                    b8 = 4;
                }
                break;
            case -1548893609:
                if (str4.equals("loadRewardedAd")) {
                    b8 = 5;
                }
                break;
            case -1395015128:
                if (str4.equals("MobileAds#getRequestConfiguration")) {
                    b8 = 6;
                }
                break;
            case -1273455673:
                if (str4.equals("loadFluidAd")) {
                    b8 = 7;
                }
                break;
            case -965504608:
                if (str4.equals("loadNativeAd")) {
                    b8 = 8;
                }
                break;
            case -918684377:
                if (str4.equals("setServerSideVerificationOptions")) {
                    b8 = 9;
                }
                break;
            case -768079951:
                if (str4.equals("AdSize#getAnchoredAdaptiveBannerAdSize")) {
                    b8 = 10;
                }
                break;
            case -676596397:
                if (str4.equals("loadAdManagerInterstitialAd")) {
                    b8 = 11;
                }
                break;
            case -572043403:
                if (str4.equals("loadBannerAd")) {
                    b8 = 12;
                }
                break;
            case -533157842:
                if (str4.equals("MobileAds#setAppVolume")) {
                    b8 = 13;
                }
                break;
            case -436783448:
                if (str4.equals("MobileAds#getVersionString")) {
                    b8 = 14;
                }
                break;
            case -172783533:
                if (str4.equals("loadAdManagerBannerAd")) {
                    b8 = 15;
                }
                break;
            case 90971631:
                if (str4.equals("_init")) {
                    b8 = 16;
                }
                break;
            case 250880674:
                if (str4.equals("disposeAd")) {
                    b8 = 17;
                }
                break;
            case 273004986:
                if (str4.equals("getAdSize")) {
                    b8 = 18;
                }
                break;
            case 288452133:
                if (str4.equals("MobileAds#updateRequestConfiguration")) {
                    b8 = 19;
                }
                break;
            case 316173893:
                if (str4.equals("MobileAds#disableMediationInitialization")) {
                    b8 = 20;
                }
                break;
            case 1064076149:
                if (str4.equals("MobileAds#openAdInspector")) {
                    b8 = 21;
                }
                break;
            case 1355848557:
                if (str4.equals("showAdWithoutView")) {
                    b8 = 22;
                }
                break;
            case 1403601573:
                if (str4.equals("MobileAds#initialize")) {
                    b8 = 23;
                }
                break;
            case 1661969852:
                if (str4.equals("setImmersiveMode")) {
                    b8 = 24;
                }
                break;
            case 1882741923:
                if (str4.equals("loadRewardedInterstitialAd")) {
                    b8 = 25;
                }
                break;
        }
        a aVar2 = null;
        switch (b8) {
            case 0:
                this.f23191h.f(contextF, (String) jVar.a("adUnitId"));
                dVar.a(null);
                break;
            case 1:
                u uVar = new u(((Integer) jVar.a("adId")).intValue(), this.f23185b, (String) jVar.a("adUnitId"), (l) jVar.a("request"), new h(contextF));
                this.f23185b.x(uVar, ((Integer) jVar.a("adId")).intValue());
                uVar.f();
                dVar.a(null);
                break;
            case 2:
                this.f23191h.h(((Boolean) jVar.a("muted")).booleanValue());
                dVar.a(null);
                break;
            case 3:
                p pVar = new p(((Integer) jVar.a("adId")).intValue(), ((Integer) jVar.a("orientation")).intValue(), (io.flutter.plugins.googlemobileads.a) b(this.f23185b), (String) b((String) jVar.a("adUnitId")), (l) jVar.a("request"), (i) jVar.a("adManagerRequest"), new h(contextF));
                this.f23185b.x(pVar, ((Integer) jVar.a("adId")).intValue());
                pVar.i();
                dVar.a(null);
                break;
            case 4:
                this.f23191h.g(((Integer) jVar.a("webViewId")).intValue(), this.f23184a.d());
                dVar.a(null);
                break;
            case 5:
                String str5 = (String) b((String) jVar.a("adUnitId"));
                l lVar = (l) jVar.a("request");
                i iVar = (i) jVar.a("adManagerRequest");
                if (lVar == null) {
                    if (iVar != null) {
                        d0Var = new d0(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) b(this.f23185b), str5, iVar, new h(contextF));
                    }
                    dVar.b("InvalidRequest", "A null or invalid ad request was provided.", null);
                } else {
                    d0Var = new d0(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) b(this.f23185b), str5, lVar, new h(contextF));
                }
                this.f23185b.x(d0Var, ((Integer) b((Integer) jVar.a("adId"))).intValue());
                d0Var.f();
                dVar.a(null);
                break;
            case 6:
                objB = this.f23191h.b();
                dVar.a(objB);
                break;
            case 7:
                d dVar2 = new d(((Integer) jVar.a("adId")).intValue(), this.f23185b, (String) jVar.a("adUnitId"), (i) jVar.a("request"), a(contextF));
                this.f23185b.x(dVar2, ((Integer) jVar.a("adId")).intValue());
                dVar2.e();
                dVar.a(null);
                break;
            case 8:
                String str6 = (String) jVar.a("factoryId");
                c cVar = this.f23189f.get(str6);
                w5.b bVar = (w5.b) jVar.a("nativeTemplateStyle");
                if (cVar == null && bVar == null) {
                    str = String.format("No NativeAdFactory with id: %s or nativeTemplateStyle", str6);
                    str2 = "NativeAdError";
                    dVar.b(str2, str, null);
                } else {
                    w wVarA = new w.a(contextF).h(this.f23185b).d((String) jVar.a("adUnitId")).b(cVar).k((l) jVar.a("request")).c((i) jVar.a("adManagerRequest")).e((Map) jVar.a("customOptions")).g(((Integer) jVar.a("adId")).intValue()).i((z) jVar.a("nativeAdOptions")).f(new h(contextF)).j((w5.b) jVar.a("nativeTemplateStyle")).a();
                    this.f23185b.x(wVarA, ((Integer) jVar.a("adId")).intValue());
                    wVarA.d();
                    dVar.a(null);
                }
                break;
            case 9:
                e eVarB = this.f23185b.b(((Integer) jVar.a("adId")).intValue());
                f0 f0Var = (f0) jVar.a("serverSideVerificationOptions");
                if (eVarB != null) {
                    if (eVarB instanceof d0) {
                        ((d0) eVarB).k(f0Var);
                    } else if (eVarB instanceof e0) {
                        ((e0) eVarB).k(f0Var);
                    } else {
                        str3 = "Error - setServerSideVerificationOptions called on non-rewarded ad";
                    }
                    dVar.a(null);
                } else {
                    str3 = "Error - null ad in setServerSideVerificationOptions";
                }
                Log.w("GoogleMobileAdsPlugin", str3);
                dVar.a(null);
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                m.b bVar2 = new m.b(contextF, new m.a(), (String) jVar.a("orientation"), ((Integer) jVar.a("width")).intValue());
                if (!z1.h.f27632q.equals(bVar2.f23248a)) {
                    objB = Integer.valueOf(bVar2.f23250c);
                    dVar.a(objB);
                }
                dVar.a(null);
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                k kVar = new k(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) b(this.f23185b), (String) b((String) jVar.a("adUnitId")), (i) jVar.a("request"), new h(contextF));
                this.f23185b.x(kVar, ((Integer) b((Integer) jVar.a("adId"))).intValue());
                kVar.f();
                dVar.a(null);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                q qVar = new q(((Integer) jVar.a("adId")).intValue(), this.f23185b, (String) jVar.a("adUnitId"), (l) jVar.a("request"), (m) jVar.a("size"), a(contextF));
                this.f23185b.x(qVar, ((Integer) jVar.a("adId")).intValue());
                qVar.e();
                dVar.a(null);
                break;
            case 13:
                this.f23191h.i(((Double) jVar.a("volume")).doubleValue());
                dVar.a(null);
                break;
            case 14:
                objB = this.f23191h.c();
                dVar.a(objB);
                break;
            case 15:
                j jVar2 = new j(((Integer) jVar.a("adId")).intValue(), this.f23185b, (String) jVar.a("adUnitId"), (List) jVar.a("sizes"), (i) jVar.a("request"), a(contextF));
                this.f23185b.x(jVar2, ((Integer) jVar.a("adId")).intValue());
                jVar2.e();
                dVar.a(null);
                break;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                this.f23185b.e();
                dVar.a(null);
                break;
            case 17:
                this.f23185b.d(((Integer) jVar.a("adId")).intValue());
                dVar.a(null);
                break;
            case 18:
                e eVarB2 = this.f23185b.b(((Integer) jVar.a("adId")).intValue());
                if (eVarB2 != null) {
                    if (eVarB2 instanceof q) {
                        objB = ((q) eVarB2).d();
                    } else if (!(eVarB2 instanceof j)) {
                        str = "Unexpected ad type for getAdSize: " + eVarB2;
                        str2 = "unexpected_ad_type";
                        dVar.b(str2, str, null);
                    } else {
                        objB = ((j) eVarB2).d();
                    }
                    dVar.a(objB);
                }
                dVar.a(null);
                break;
            case 19:
                v.a aVarF = MobileAds.b().f();
                String str7 = (String) jVar.a("maxAdContentRating");
                Integer num = (Integer) jVar.a("tagForChildDirectedTreatment");
                Integer num2 = (Integer) jVar.a("tagForUnderAgeOfConsent");
                List<String> list = (List) jVar.a("testDeviceIds");
                if (str7 != null) {
                    aVarF.b(str7);
                }
                if (num != null) {
                    aVarF.c(num.intValue());
                }
                if (num2 != null) {
                    aVarF.d(num2.intValue());
                }
                if (list != null) {
                    aVarF.e(list);
                }
                MobileAds.j(aVarF.a());
                dVar.a(null);
                break;
            case 20:
                this.f23191h.a(contextF);
                dVar.a(null);
                break;
            case 21:
                this.f23191h.e(contextF, new a(dVar));
                break;
            case 22:
                if (!this.f23185b.w(((Integer) jVar.a("adId")).intValue())) {
                    dVar.b("AdShowError", "Ad failed to show.", null);
                }
                dVar.a(null);
                break;
            case 23:
                this.f23191h.d(contextF, new b(dVar, aVar2));
                break;
            case 24:
                ((e.d) this.f23185b.b(((Integer) jVar.a("adId")).intValue())).d(((Boolean) jVar.a("immersiveModeEnabled")).booleanValue());
                dVar.a(null);
                break;
            case 25:
                String str8 = (String) b((String) jVar.a("adUnitId"));
                l lVar2 = (l) jVar.a("request");
                i iVar2 = (i) jVar.a("adManagerRequest");
                if (lVar2 == null) {
                    if (iVar2 != null) {
                        e0Var = new e0(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) b(this.f23185b), str8, iVar2, new h(contextF));
                    }
                    dVar.b("InvalidRequest", "A null or invalid ad request was provided.", null);
                } else {
                    e0Var = new e0(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) b(this.f23185b), str8, lVar2, new h(contextF));
                }
                this.f23185b.x(e0Var, ((Integer) b((Integer) jVar.a("adId"))).intValue());
                e0Var.f();
                dVar.a(null);
                break;
            default:
                dVar.c();
                break;
        }
    }

    @Override // m5.a
    public void onReattachedToActivityForConfigChanges(m5.c cVar) {
        io.flutter.plugins.googlemobileads.a aVar = this.f23185b;
        if (aVar != null) {
            aVar.v(cVar.g());
        }
        io.flutter.plugins.googlemobileads.b bVar = this.f23186c;
        if (bVar != null) {
            bVar.r(cVar.g());
        }
        x5.d dVar = this.f23188e;
        if (dVar != null) {
            dVar.c(cVar.g());
        }
    }
}
