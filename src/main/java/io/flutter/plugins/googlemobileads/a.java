package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugins.googlemobileads.d0;
import io.flutter.plugins.googlemobileads.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f23119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, e> f23120b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s5.k f23121c;

    /* JADX INFO: renamed from: io.flutter.plugins.googlemobileads.a$a, reason: collision with other inner class name */
    class RunnableC0126a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f23122a;

        RunnableC0126a(Map map) {
            this.f23122a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f23121c.c("onAdEvent", this.f23122a);
        }
    }

    a(s5.k kVar) {
        this.f23121c = kVar;
    }

    private void g(Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0126a(map));
    }

    e b(int i8) {
        return this.f23120b.get(Integer.valueOf(i8));
    }

    Integer c(e eVar) {
        for (Integer num : this.f23120b.keySet()) {
            if (this.f23120b.get(num) == eVar) {
                return num;
            }
        }
        return null;
    }

    void d(int i8) {
        if (this.f23120b.containsKey(Integer.valueOf(i8))) {
            e eVar = this.f23120b.get(Integer.valueOf(i8));
            if (eVar != null) {
                eVar.b();
            }
            this.f23120b.remove(Integer.valueOf(i8));
        }
    }

    void e() {
        for (Map.Entry<Integer, e> entry : this.f23120b.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().b();
            }
        }
        this.f23120b.clear();
    }

    Activity f() {
        return this.f23119a;
    }

    void h(int i8) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdClicked");
        g(map);
    }

    void i(int i8) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdClosed");
        g(map);
    }

    void j(int i8) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdDismissedFullScreenContent");
        g(map);
    }

    void k(int i8, e.c cVar) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdFailedToLoad");
        map.put("loadAdError", cVar);
        g(map);
    }

    void l(int i8) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdImpression");
        g(map);
    }

    void m(int i8, z1.w wVar) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdLoaded");
        map.put("responseInfo", wVar == null ? null : new e.C0127e(wVar));
        g(map);
    }

    void n(int i8) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdMetadataChanged");
        g(map);
    }

    void o(int i8) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdOpened");
        g(map);
    }

    void p(int i8) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAdShowedFullScreenContent");
        g(map);
    }

    void q(int i8, String str, String str2) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onAppEvent");
        map.put("name", str);
        map.put("data", str2);
        g(map);
    }

    void r(int i8, z1.a aVar) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onFailedToShowFullScreenContent");
        map.put("error", new e.a(aVar));
        g(map);
    }

    void s(int i8, int i9) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onFluidAdHeightChanged");
        map.put("height", Integer.valueOf(i9));
        g(map);
    }

    void t(e eVar, n nVar) {
        HashMap map = new HashMap();
        map.put("adId", c(eVar));
        map.put("eventName", "onPaidEvent");
        map.put("valueMicros", Long.valueOf(nVar.f23308c));
        map.put("precision", Integer.valueOf(nVar.f23306a));
        map.put("currencyCode", nVar.f23307b);
        g(map);
    }

    void u(int i8, d0.b bVar) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i8));
        map.put("eventName", "onRewardedAdUserEarnedReward");
        map.put("rewardItem", bVar);
        g(map);
    }

    void v(Activity activity) {
        this.f23119a = activity;
    }

    boolean w(int i8) {
        e.d dVar = (e.d) b(i8);
        if (dVar == null) {
            return false;
        }
        dVar.e();
        return true;
    }

    void x(e eVar, int i8) {
        if (this.f23120b.get(Integer.valueOf(i8)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i8)));
        }
        this.f23120b.put(Integer.valueOf(i8), eVar);
    }
}
