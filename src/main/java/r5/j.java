package r5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.k f25950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f25951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final k.c f25952c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x012b A[Catch: JSONException -> 0x0234, TryCatch #9 {JSONException -> 0x0234, blocks: (B:6:0x002c, B:7:0x0030, B:53:0x00cf, B:54:0x00d4, B:55:0x00ed, B:56:0x00fc, B:57:0x0101, B:59:0x0105, B:63:0x011f, B:65:0x012b, B:61:0x010a, B:66:0x0138, B:67:0x0142, B:76:0x0174, B:77:0x017f, B:105:0x0200, B:110:0x021a, B:74:0x016b, B:75:0x016f, B:84:0x01a3, B:91:0x01c1, B:96:0x01dd, B:103:0x01fa, B:108:0x0214, B:113:0x022e, B:9:0x0035, B:12:0x0040, B:15:0x004b, B:18:0x0057, B:21:0x0063, B:24:0x006d, B:27:0x0078, B:30:0x0082, B:33:0x008c, B:36:0x0096, B:39:0x00a0, B:42:0x00aa, B:45:0x00b5, B:48:0x00c0, B:93:0x01c6), top: B:124:0x002c, inners: #0, #3, #6, #12 }] */
        @Override // s5.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onMethodCall(s5.j r6, s5.k.d r7) {
            /*
                Method dump skipped, instruction units count: 680
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.j.a.onMethodCall(s5.j, s5.k$d):void");
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f25955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f25956c;

        static {
            int[] iArr = new int[k.values().length];
            f25956c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25956c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25956c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25956c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f25955b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25955b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f25954a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25954a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25954a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25954a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25958b;

        public c(int i8, String str) {
            this.f25957a = i8;
            this.f25958b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25962a;

        d(String str) {
            this.f25962a = str;
        }

        static d a(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f25962a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25965a;

        e(String str) {
            this.f25965a = str;
        }

        static e a(String str) throws NoSuchFieldException {
            for (e eVar : values()) {
                if (eVar.f25965a.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25971a;

        f(String str) {
            this.f25971a = str;
        }

        static f a(String str) throws NoSuchFieldException {
            for (f fVar : values()) {
                if (fVar.f25971a.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25978a;

        g(String str) {
            this.f25978a = str;
        }

        static g a(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                String str2 = gVar.f25978a;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        CharSequence a(e eVar);

        void b();

        void c(List<l> list);

        void d(String str);

        void e(i iVar);

        void f(boolean z7);

        void g(C0165j c0165j);

        void h(c cVar);

        void i(k kVar);

        void j(g gVar);

        void k();

        void l();

        void m(int i8);

        boolean n();
    }

    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25982a;

        i(String str) {
            this.f25982a = str;
        }

        static i a(String str) throws NoSuchFieldException {
            for (i iVar : values()) {
                if (iVar.f25982a.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* JADX INFO: renamed from: r5.j$j, reason: collision with other inner class name */
    public static class C0165j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f25983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f25984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f25985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f25986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f25987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f25988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f25989g;

        public C0165j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f25983a = num;
            this.f25984b = dVar;
            this.f25985c = bool;
            this.f25986d = num2;
            this.f25987e = dVar2;
            this.f25988f = num3;
            this.f25989g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25995a;

        k(String str) {
            this.f25995a = str;
        }

        static k a(String str) throws NoSuchFieldException {
            for (k kVar : values()) {
                if (kVar.f25995a.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25999a;

        l(String str) {
            this.f25999a = str;
        }

        static l a(String str) throws NoSuchFieldException {
            for (l lVar : values()) {
                if (lVar.f25999a.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public j(h5.a aVar) {
        a aVar2 = new a();
        this.f25952c = aVar2;
        s5.k kVar = new s5.k(aVar, "flutter/platform", s5.g.f26251a);
        this.f25950a = kVar;
        kVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c g(JSONObject jSONObject) throws JSONException {
        int i8 = jSONObject.getInt("primaryColor");
        if (i8 != 0) {
            i8 |= -16777216;
        }
        return new c(i8, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            r5.j$f r4 = r5.j.f.a(r4)
            int[] r8 = r5.j.b.f25954a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.j.h(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0165j i(JSONObject jSONObject) {
        return new C0165j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.a(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.a(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k j(String str) {
        int i8 = b.f25956c[k.a(str).ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) throws NoSuchFieldException {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            int i9 = b.f25955b[l.a(jSONArray.getString(i8)).ordinal()];
            if (i9 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i9 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f25951b = hVar;
    }

    public void m(boolean z7) {
        g5.b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f25950a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z7)));
    }
}
