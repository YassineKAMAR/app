package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAdView;
import io.flutter.plugins.googlemobileads.h0;
import java.util.Map;
import o2.b;

/* JADX INFO: loaded from: classes.dex */
class w extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f23340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.c f23342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f23343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f23344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f23345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f23346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private NativeAdView f23347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final z f23348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w5.b f23349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TemplateView f23350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f23351m;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.flutter.plugins.googlemobileads.a f23352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h0.c f23354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l f23355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i f23356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, Object> f23357f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f23358g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private z f23359h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private h f23360i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private w5.b f23361j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Context f23362k;

        a(Context context) {
            this.f23362k = context;
        }

        w a() {
            if (this.f23352a == null) {
                throw new IllegalStateException("AdInstanceManager cannot be null.");
            }
            if (this.f23353b == null) {
                throw new IllegalStateException("AdUnitId cannot be null.");
            }
            if (this.f23354c == null && this.f23361j == null) {
                throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
            }
            l lVar = this.f23355d;
            if (lVar == null && this.f23356e == null) {
                throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
            }
            return lVar == null ? new w(this.f23362k, this.f23358g.intValue(), this.f23352a, this.f23353b, this.f23354c, this.f23356e, this.f23360i, this.f23357f, this.f23359h, this.f23361j) : new w(this.f23362k, this.f23358g.intValue(), this.f23352a, this.f23353b, this.f23354c, this.f23355d, this.f23360i, this.f23357f, this.f23359h, this.f23361j);
        }

        public a b(h0.c cVar) {
            this.f23354c = cVar;
            return this;
        }

        public a c(i iVar) {
            this.f23356e = iVar;
            return this;
        }

        public a d(String str) {
            this.f23353b = str;
            return this;
        }

        public a e(Map<String, Object> map) {
            this.f23357f = map;
            return this;
        }

        public a f(h hVar) {
            this.f23360i = hVar;
            return this;
        }

        public a g(int i8) {
            this.f23358g = Integer.valueOf(i8);
            return this;
        }

        public a h(io.flutter.plugins.googlemobileads.a aVar) {
            this.f23352a = aVar;
            return this;
        }

        public a i(z zVar) {
            this.f23359h = zVar;
            return this;
        }

        public a j(w5.b bVar) {
            this.f23361j = bVar;
            return this;
        }

        public a k(l lVar) {
            this.f23355d = lVar;
            return this;
        }
    }

    protected w(Context context, int i8, io.flutter.plugins.googlemobileads.a aVar, String str, h0.c cVar, i iVar, h hVar, Map<String, Object> map, z zVar, w5.b bVar) {
        super(i8);
        this.f23351m = context;
        this.f23340b = aVar;
        this.f23341c = str;
        this.f23342d = cVar;
        this.f23345g = iVar;
        this.f23343e = hVar;
        this.f23346h = map;
        this.f23348j = zVar;
        this.f23349k = bVar;
    }

    protected w(Context context, int i8, io.flutter.plugins.googlemobileads.a aVar, String str, h0.c cVar, l lVar, h hVar, Map<String, Object> map, z zVar, w5.b bVar) {
        super(i8);
        this.f23351m = context;
        this.f23340b = aVar;
        this.f23341c = str;
        this.f23342d = cVar;
        this.f23344f = lVar;
        this.f23343e = hVar;
        this.f23346h = map;
        this.f23348j = zVar;
        this.f23349k = bVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        NativeAdView nativeAdView = this.f23347i;
        if (nativeAdView != null) {
            nativeAdView.a();
            this.f23347i = null;
        }
        TemplateView templateView = this.f23350l;
        if (templateView != null) {
            templateView.c();
            this.f23350l = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    public io.flutter.plugin.platform.k c() {
        NativeAdView nativeAdView = this.f23347i;
        if (nativeAdView != null) {
            return new b0(nativeAdView);
        }
        TemplateView templateView = this.f23350l;
        if (templateView != null) {
            return new b0(templateView);
        }
        return null;
    }

    void d() {
        y yVar = new y(this);
        x xVar = new x(this.f23147a, this.f23340b);
        z zVar = this.f23348j;
        o2.b bVarA = zVar == null ? new b.a().a() : zVar.a();
        l lVar = this.f23344f;
        if (lVar != null) {
            h hVar = this.f23343e;
            String str = this.f23341c;
            hVar.h(str, yVar, bVarA, xVar, lVar.b(str));
        } else {
            i iVar = this.f23345g;
            if (iVar != null) {
                this.f23343e.c(this.f23341c, yVar, bVarA, xVar, iVar.k(this.f23341c));
            } else {
                Log.e("FlutterNativeAd", "A null or invalid ad request was provided.");
            }
        }
    }

    void e(com.google.android.gms.ads.nativead.a aVar) {
        w5.b bVar = this.f23349k;
        if (bVar != null) {
            TemplateView templateViewB = bVar.b(this.f23351m);
            this.f23350l = templateViewB;
            templateViewB.setNativeAd(aVar);
        } else {
            this.f23347i = this.f23342d.a(aVar, this.f23346h);
        }
        aVar.j(new a0(this.f23340b, this));
        this.f23340b.m(this.f23147a, aVar.g());
    }
}
