package io.flutter.view;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.view.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import r5.a;

/* JADX INFO: loaded from: classes.dex */
public class g extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f23665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r5.a f23666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AccessibilityManager f23667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AccessibilityViewEmbedder f23668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.flutter.plugin.platform.q f23669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ContentResolver f23670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, l> f23671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<Integer, h> f23672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f23673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f23674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f23675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f23677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f23678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f23679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<Integer> f23680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f23682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k f23683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a.b f23686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f23687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @TargetApi(19)
    private final AccessibilityManager.TouchExplorationStateChangeListener f23688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ContentObserver f23689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f23664z = ((EnumC0132g.SCROLL_RIGHT.f23728a | EnumC0132g.SCROLL_LEFT.f23728a) | EnumC0132g.SCROLL_UP.f23728a) | EnumC0132g.SCROLL_DOWN.f23728a;
    private static final int A = ((((((((((i.HAS_CHECKED_STATE.f23759a | i.IS_CHECKED.f23759a) | i.IS_SELECTED.f23759a) | i.IS_TEXT_FIELD.f23759a) | i.IS_FOCUSED.f23759a) | i.HAS_ENABLED_STATE.f23759a) | i.IS_ENABLED.f23759a) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f23759a) | i.HAS_TOGGLED_STATE.f23759a) | i.IS_TOGGLED.f23759a) | i.IS_FOCUSABLE.f23759a) | i.IS_SLIDER.f23759a;
    private static int B = 267386881;
    static int C = (EnumC0132g.DID_GAIN_ACCESSIBILITY_FOCUS.f23728a & EnumC0132g.DID_LOSE_ACCESSIBILITY_FOCUS.f23728a) & EnumC0132g.SHOW_ON_SCREEN.f23728a;

    class a implements a.b {
        a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            g.this.d0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            g.this.c0(byteBuffer, strArr);
        }

        @Override // r5.a.b
        public void c(int i8) {
            g.this.T(i8, 1);
        }

        @Override // r5.a.b
        public void d(String str) {
            g.this.f23665a.announceForAccessibility(str);
        }

        @Override // r5.a.b
        public void e(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent accessibilityEventI = g.this.I(0, 32);
            accessibilityEventI.getText().add(str);
            g.this.U(accessibilityEventI);
        }

        @Override // r5.a.b
        public void f(int i8) {
            g.this.T(i8, 8);
        }

        @Override // r5.a.b
        public void g(int i8) {
            g.this.T(i8, 2);
        }
    }

    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z7) {
            if (g.this.f23685u) {
                return;
            }
            g gVar = g.this;
            if (z7) {
                gVar.f23666b.g(g.this.f23686v);
                g.this.f23666b.e();
            } else {
                gVar.Y(false);
                g.this.f23666b.g(null);
                g.this.f23666b.d();
            }
            if (g.this.f23683s != null) {
                g.this.f23683s.a(z7, g.this.f23667c.isTouchExplorationEnabled());
            }
        }
    }

    class c extends ContentObserver {
        c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            onChange(z7, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7, Uri uri) {
            if (g.this.f23685u) {
                return;
            }
            String string = Settings.Global.getString(g.this.f23670f, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                g.f(g.this, f.DISABLE_ANIMATIONS.f23704a);
            } else {
                g.e(g.this, ~f.DISABLE_ANIMATIONS.f23704a);
            }
            g.this.V();
        }
    }

    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f23693a;

        d(AccessibilityManager accessibilityManager) {
            this.f23693a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z7) {
            if (g.this.f23685u) {
                return;
            }
            if (!z7) {
                g.this.Y(false);
                g.this.N();
            }
            if (g.this.f23683s != null) {
                g.this.f23683s.a(this.f23693a.isEnabled(), z7);
            }
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23695a;

        static {
            int[] iArr = new int[o.values().length];
            f23695a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23695a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f23704a;

        f(int i8) {
            this.f23704a = i8;
        }
    }

    /* JADX INFO: renamed from: io.flutter.view.g$g, reason: collision with other inner class name */
    public enum EnumC0132g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23728a;

        EnumC0132g(int i8) {
            this.f23728a = i8;
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23729a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23730b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23731c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23733e;

        h() {
        }
    }

    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f23759a;

        i(int i8) {
            this.f23759a = i8;
        }
    }

    private static class j extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f23760d;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z7, boolean z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l {
        private p A;
        private int C;
        private int D;
        private int E;
        private int F;
        private float G;
        private float H;
        private float I;
        private String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        private l Q;
        private List<h> T;
        private h U;
        private h V;
        private float[] X;
        private float[] Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f23761a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private Rect f23762a0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f23767f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f23768g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f23769h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f23770i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f23771j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f23772k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f23773l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f23774m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f23775n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f23776o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<n> f23777p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f23778q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<n> f23779r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private String f23780s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List<n> f23781t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private String f23782u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private List<n> f23783v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private String f23784w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private List<n> f23785x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f23786y;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23763b = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f23787z = -1;
        private boolean B = false;
        private List<l> R = new ArrayList();
        private List<l> S = new ArrayList();
        private boolean W = true;
        private boolean Y = true;

        l(g gVar) {
            this.f23761a = gVar;
        }

        private float A0(float f8, float f9, float f10, float f11) {
            return Math.min(f8, Math.min(f9, Math.min(f10, f11)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean B0(l lVar, b6.d<l> dVar) {
            return (lVar == null || lVar.k0(dVar) == null) ? false : true;
        }

        private void C0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f8 = fArr[3];
            fArr[0] = fArr[0] / f8;
            fArr[1] = fArr[1] / f8;
            fArr[2] = fArr[2] / f8;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D0(float[] fArr, Set<l> set, boolean z7) {
            set.add(this);
            if (this.Y) {
                z7 = true;
            }
            if (z7) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                if (this.P == null) {
                    this.P = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = {this.L, this.M, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                C0(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                C0(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                C0(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                C0(fArr6, this.Z, fArr2);
                if (this.f23762a0 == null) {
                    this.f23762a0 = new Rect();
                }
                this.f23762a0.set(Math.round(A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(z0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(z0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int i8 = -1;
            for (l lVar : this.R) {
                lVar.f23787z = i8;
                i8 = lVar.f23763b;
                lVar.D0(this.Z, set, z7);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.B = true;
            this.J = this.f23778q;
            this.K = this.f23776o;
            this.C = this.f23764c;
            this.D = this.f23765d;
            this.E = this.f23768g;
            this.F = this.f23769h;
            this.G = this.f23773l;
            this.H = this.f23774m;
            this.I = this.f23775n;
            this.f23764c = byteBuffer.getInt();
            this.f23765d = byteBuffer.getInt();
            this.f23766e = byteBuffer.getInt();
            this.f23767f = byteBuffer.getInt();
            this.f23768g = byteBuffer.getInt();
            this.f23769h = byteBuffer.getInt();
            this.f23770i = byteBuffer.getInt();
            this.f23771j = byteBuffer.getInt();
            this.f23772k = byteBuffer.getInt();
            this.f23773l = byteBuffer.getFloat();
            this.f23774m = byteBuffer.getFloat();
            this.f23775n = byteBuffer.getFloat();
            int i8 = byteBuffer.getInt();
            this.f23776o = i8 == -1 ? null : strArr[i8];
            this.f23777p = p0(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            this.f23778q = i9 == -1 ? null : strArr[i9];
            this.f23779r = p0(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            this.f23780s = i10 == -1 ? null : strArr[i10];
            this.f23781t = p0(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            this.f23782u = i11 == -1 ? null : strArr[i11];
            this.f23783v = p0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.f23784w = i12 == -1 ? null : strArr[i12];
            this.f23785x = p0(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.f23786y = i13 == -1 ? null : strArr[i13];
            this.A = p.a(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int i14 = 0; i14 < 16; i14++) {
                this.P[i14] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int i15 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int i16 = 0; i16 < i15; i16++) {
                l lVarZ = this.f23761a.z(byteBuffer.getInt());
                lVarZ.Q = this;
                this.R.add(lVarZ);
            }
            for (int i17 = 0; i17 < i15; i17++) {
                l lVarZ2 = this.f23761a.z(byteBuffer.getInt());
                lVarZ2.Q = this;
                this.S.add(lVarZ2);
            }
            int i18 = byteBuffer.getInt();
            if (i18 == 0) {
                this.T = null;
                return;
            }
            List<h> list = this.T;
            if (list == null) {
                this.T = new ArrayList(i18);
            } else {
                list.clear();
            }
            for (int i19 = 0; i19 < i18; i19++) {
                h hVarY = this.f23761a.y(byteBuffer.getInt());
                if (hVarY.f23731c == EnumC0132g.TAP.f23728a) {
                    this.U = hVarY;
                } else if (hVarY.f23731c == EnumC0132g.LONG_PRESS.f23728a) {
                    this.V = hVarY;
                } else {
                    this.T.add(hVarY);
                }
                this.T.add(hVarY);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(List<l> list) {
            if (w0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<l> it = this.R.iterator();
            while (it.hasNext()) {
                it.next().f0(list);
            }
        }

        @TargetApi(21)
        private SpannableString g0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n nVar : list) {
                    int i8 = e.f23695a[nVar.f23790c.ordinal()];
                    if (i8 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f23788a, nVar.f23789b, 0);
                    } else if (i8 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f23760d)), nVar.f23788a, nVar.f23789b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h0() {
            String str;
            String str2 = this.f23776o;
            if (str2 == null && this.K == null) {
                return false;
            }
            return str2 == null || (str = this.K) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i0() {
            return (Float.isNaN(this.f23773l) || Float.isNaN(this.G) || this.G == this.f23773l) ? false : true;
        }

        private void j0() {
            if (this.W) {
                this.W = false;
                if (this.X == null) {
                    this.X = new float[16];
                }
                if (Matrix.invertM(this.X, 0, this.P, 0)) {
                    return;
                }
                Arrays.fill(this.X, 0.0f);
            }
        }

        private l k0(b6.d<l> dVar) {
            for (l lVar = this.Q; lVar != null; lVar = lVar.Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect l0() {
            return this.f23762a0;
        }

        static /* synthetic */ int m(l lVar, int i8) {
            int i9 = lVar.f23769h + i8;
            lVar.f23769h = i9;
            return i9;
        }

        private CharSequence m0() {
            return g0(this.f23784w, this.f23785x);
        }

        static /* synthetic */ int n(l lVar, int i8) {
            int i9 = lVar.f23769h - i8;
            lVar.f23769h = i9;
            return i9;
        }

        private CharSequence n0() {
            return g0(this.f23776o, this.f23777p);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String o0() {
            String str;
            if (w0(i.NAMES_ROUTE) && (str = this.f23776o) != null && !str.isEmpty()) {
                return this.f23776o;
            }
            Iterator<l> it = this.R.iterator();
            while (it.hasNext()) {
                String strO0 = it.next().o0();
                if (strO0 != null && !strO0.isEmpty()) {
                    return strO0;
                }
            }
            return null;
        }

        private List<n> p0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i8 = byteBuffer.getInt();
            a aVar = null;
            if (i8 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = byteBuffer.getInt();
                int i11 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i12 = e.f23695a[oVar.ordinal()];
                if (i12 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f23788a = i10;
                    mVar.f23789b = i11;
                    mVar.f23790c = oVar;
                    arrayList.add(mVar);
                } else if (i12 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(aVar);
                    jVar.f23788a = i10;
                    jVar.f23789b = i11;
                    jVar.f23790c = oVar;
                    jVar.f23760d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence q0() {
            CharSequence[] charSequenceArr = {n0(), m0()};
            CharSequence charSequenceConcat = null;
            for (int i8 = 0; i8 < 2; i8++) {
                CharSequence charSequence = charSequenceArr[i8];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence r0() {
            return g0(this.f23778q, this.f23779r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence s0() {
            CharSequence[] charSequenceArr = {r0(), n0(), m0()};
            CharSequence charSequenceConcat = null;
            for (int i8 = 0; i8 < 3; i8++) {
                CharSequence charSequence = charSequenceArr[i8];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean t0(EnumC0132g enumC0132g) {
            return (enumC0132g.f23728a & this.D) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean u0(i iVar) {
            return (iVar.f23759a & this.C) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v0(EnumC0132g enumC0132g) {
            return (enumC0132g.f23728a & this.f23765d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean w0(i iVar) {
            return (iVar.f23759a & this.f23764c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l x0(float[] fArr, boolean z7) {
            float f8 = fArr[3];
            boolean z8 = false;
            float f9 = fArr[0] / f8;
            float f10 = fArr[1] / f8;
            if (f9 < this.L || f9 >= this.N || f10 < this.M || f10 >= this.O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.S) {
                if (!lVar.w0(i.IS_HIDDEN)) {
                    lVar.j0();
                    Matrix.multiplyMV(fArr2, 0, lVar.X, 0, fArr, 0);
                    l lVarX0 = lVar.x0(fArr2, z7);
                    if (lVarX0 != null) {
                        return lVarX0;
                    }
                }
            }
            if (z7 && this.f23770i != -1) {
                z8 = true;
            }
            if (y0() || z8) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean y0() {
            String str;
            String str2;
            String str3;
            if (w0(i.SCOPES_ROUTE)) {
                return false;
            }
            return (!w0(i.IS_FOCUSABLE) && (this.f23765d & (~g.f23664z)) == 0 && (this.f23764c & g.A) == 0 && ((str = this.f23776o) == null || str.isEmpty()) && (((str2 = this.f23778q) == null || str2.isEmpty()) && ((str3 = this.f23784w) == null || str3.isEmpty()))) ? false : true;
        }

        private float z0(float f8, float f9, float f10, float f11) {
            return Math.max(f8, Math.max(f9, Math.max(f10, f11)));
        }
    }

    private static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        o f23790c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private enum o {
        SPELLOUT,
        LOCALE
    }

    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p a(int i8) {
            return i8 != 1 ? i8 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public g(View view, r5.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.q qVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), qVar);
    }

    public g(View view, r5.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.q qVar) {
        this.f23671g = new HashMap();
        this.f23672h = new HashMap();
        this.f23676l = 0;
        this.f23680p = new ArrayList();
        this.f23681q = 0;
        this.f23682r = 0;
        this.f23684t = false;
        this.f23685u = false;
        this.f23686v = new a();
        b bVar = new b();
        this.f23687w = bVar;
        c cVar = new c(new Handler());
        this.f23689y = cVar;
        this.f23665a = view;
        this.f23666b = aVar;
        this.f23667c = accessibilityManager;
        this.f23670f = contentResolver;
        this.f23668d = accessibilityViewEmbedder;
        this.f23669e = qVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i8 = Build.VERSION.SDK_INT;
        d dVar = new d(accessibilityManager);
        this.f23688x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (i8 >= 31) {
            Z();
        }
        qVar.a(this);
    }

    private l A() {
        return this.f23671g.get(0);
    }

    private void B(float f8, float f9, boolean z7) {
        l lVarX0;
        if (this.f23671g.isEmpty() || (lVarX0 = A().x0(new float[]{f8, f9, 0.0f, 1.0f}, z7)) == this.f23679o) {
            return;
        }
        if (lVarX0 != null) {
            T(lVarX0.f23763b, 128);
        }
        l lVar = this.f23679o;
        if (lVar != null) {
            T(lVar.f23763b, 256);
        }
        this.f23679o = lVarX0;
    }

    private boolean D(l lVar) {
        if (lVar.w0(i.SCOPES_ROUTE)) {
            return false;
        }
        return (lVar.s0() == null && (lVar.f23765d & (~C)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean G(l lVar) {
        return lVar.w0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent I(int i8, int i9) {
        AccessibilityEvent accessibilityEventH = H(i9);
        accessibilityEventH.setPackageName(this.f23665a.getContext().getPackageName());
        accessibilityEventH.setSource(this.f23665a, i8);
        return accessibilityEventH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        l lVar = this.f23679o;
        if (lVar != null) {
            T(lVar.f23763b, 256);
            this.f23679o = null;
        }
    }

    private void O(l lVar) {
        String strO0 = lVar.o0();
        if (strO0 == null) {
            strO0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            X(strO0);
            return;
        }
        AccessibilityEvent accessibilityEventI = I(lVar.f23763b, 32);
        accessibilityEventI.getText().add(strO0);
        U(accessibilityEventI);
    }

    @TargetApi(18)
    private boolean P(l lVar, int i8, Bundle bundle, boolean z7) {
        int i9 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z8 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i10 = lVar.f23768g;
        int i11 = lVar.f23769h;
        R(lVar, i9, z7, z8);
        if (i10 != lVar.f23768g || i11 != lVar.f23769h) {
            String str = lVar.f23778q != null ? lVar.f23778q : "";
            AccessibilityEvent accessibilityEventI = I(lVar.f23763b, 8192);
            accessibilityEventI.getText().add(str);
            accessibilityEventI.setFromIndex(lVar.f23768g);
            accessibilityEventI.setToIndex(lVar.f23769h);
            accessibilityEventI.setItemCount(str.length());
            U(accessibilityEventI);
        }
        if (i9 == 1) {
            if (z7) {
                EnumC0132g enumC0132g = EnumC0132g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.v0(enumC0132g)) {
                    this.f23666b.c(i8, enumC0132g, Boolean.valueOf(z8));
                    return true;
                }
            }
            if (z7) {
                return false;
            }
            EnumC0132g enumC0132g2 = EnumC0132g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.v0(enumC0132g2)) {
                return false;
            }
            this.f23666b.c(i8, enumC0132g2, Boolean.valueOf(z8));
            return true;
        }
        if (i9 != 2) {
            return i9 == 4 || i9 == 8 || i9 == 16;
        }
        if (z7) {
            EnumC0132g enumC0132g3 = EnumC0132g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.v0(enumC0132g3)) {
                this.f23666b.c(i8, enumC0132g3, Boolean.valueOf(z8));
                return true;
            }
        }
        if (z7) {
            return false;
        }
        EnumC0132g enumC0132g4 = EnumC0132g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.v0(enumC0132g4)) {
            return false;
        }
        this.f23666b.c(i8, enumC0132g4, Boolean.valueOf(z8));
        return true;
    }

    @TargetApi(21)
    private boolean Q(l lVar, int i8, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f23666b.c(i8, EnumC0132g.SET_TEXT, string);
        lVar.f23778q = string;
        lVar.f23779r = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        r5 = r4.f23778q.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        r4.f23769h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        r4.f23769h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        io.flutter.view.g.l.m(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void R(io.flutter.view.g.l r4, int r5, boolean r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.g.R(io.flutter.view.g$l, int, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(AccessibilityEvent accessibilityEvent) {
        if (this.f23667c.isEnabled()) {
            this.f23665a.getParent().requestSendAccessibilityEvent(this.f23665a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.f23666b.f(this.f23676l);
    }

    private void W(int i8) {
        AccessibilityEvent accessibilityEventI = I(i8, 2048);
        accessibilityEventI.setContentChangeTypes(1);
        U(accessibilityEventI);
    }

    @TargetApi(28)
    private void X(String str) {
        this.f23665a.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(boolean z7) {
        if (this.f23684t == z7) {
            return;
        }
        this.f23684t = z7;
        this.f23676l = z7 ? this.f23676l | f.ACCESSIBLE_NAVIGATION.f23704a : this.f23676l & (~f.ACCESSIBLE_NAVIGATION.f23704a);
        V();
    }

    @TargetApi(31)
    private void Z() {
        View view = this.f23665a;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i8 = this.f23665a.getResources().getConfiguration().fontWeightAdjustment;
        this.f23676l = i8 != Integer.MAX_VALUE && i8 >= 300 ? this.f23676l | f.BOLD_TEXT.f23704a : this.f23676l & f.BOLD_TEXT.f23704a;
        V();
    }

    private boolean b0(final l lVar) {
        return lVar.f23771j > 0 && (l.B0(this.f23673i, new b6.d() { // from class: io.flutter.view.e
            @Override // b6.d
            public final boolean test(Object obj) {
                return g.F(lVar, (g.l) obj);
            }
        }) || !l.B0(this.f23673i, new b6.d() { // from class: io.flutter.view.f
            @Override // b6.d
            public final boolean test(Object obj) {
                return g.G((g.l) obj);
            }
        }));
    }

    static /* synthetic */ int e(g gVar, int i8) {
        int i9 = i8 & gVar.f23676l;
        gVar.f23676l = i9;
        return i9;
    }

    @TargetApi(19)
    private void e0(l lVar) {
        View viewB;
        Integer num;
        lVar.Q = null;
        if (lVar.f23770i != -1 && (num = this.f23674j) != null && this.f23668d.platformViewOfNode(num.intValue()) == this.f23669e.b(lVar.f23770i)) {
            T(this.f23674j.intValue(), 65536);
            this.f23674j = null;
        }
        if (lVar.f23770i != -1 && (viewB = this.f23669e.b(lVar.f23770i)) != null) {
            viewB.setImportantForAccessibility(4);
        }
        l lVar2 = this.f23673i;
        if (lVar2 == lVar) {
            T(lVar2.f23763b, 65536);
            this.f23673i = null;
        }
        if (this.f23677m == lVar) {
            this.f23677m = null;
        }
        if (this.f23679o == lVar) {
            this.f23679o = null;
        }
    }

    static /* synthetic */ int f(g gVar, int i8) {
        int i9 = i8 | gVar.f23676l;
        gVar.f23676l = i9;
        return i9;
    }

    private AccessibilityEvent u(int i8, String str, String str2) {
        AccessibilityEvent accessibilityEventI = I(i8, 16);
        accessibilityEventI.setBeforeText(str);
        accessibilityEventI.getText().add(str2);
        int i9 = 0;
        while (i9 < str.length() && i9 < str2.length() && str.charAt(i9) == str2.charAt(i9)) {
            i9++;
        }
        if (i9 >= str.length() && i9 >= str2.length()) {
            return null;
        }
        accessibilityEventI.setFromIndex(i9);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i9 && length2 >= i9 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        accessibilityEventI.setRemovedCount((length - i9) + 1);
        accessibilityEventI.setAddedCount((length2 - i9) + 1);
        return accessibilityEventI;
    }

    @TargetApi(28)
    private boolean v() {
        Activity activityF = b6.h.f(this.f23665a.getContext());
        if (activityF == null || activityF.getWindow() == null) {
            return false;
        }
        int i8 = activityF.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i8 == 2 || i8 == 0;
    }

    private Rect x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f23665a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h y(int i8) {
        h hVar = this.f23672h.get(Integer.valueOf(i8));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f23730b = i8;
        hVar2.f23729a = B + i8;
        this.f23672h.put(Integer.valueOf(i8), hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l z(int i8) {
        l lVar = this.f23671g.get(Integer.valueOf(i8));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f23763b = i8;
        this.f23671g.put(Integer.valueOf(i8), lVar2);
        return lVar2;
    }

    public boolean C() {
        return this.f23667c.isEnabled();
    }

    public boolean E() {
        return this.f23667c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent H(int i8) {
        return AccessibilityEvent.obtain(i8);
    }

    public AccessibilityNodeInfo J(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo K(View view, int i8) {
        return AccessibilityNodeInfo.obtain(view, i8);
    }

    public boolean L(MotionEvent motionEvent) {
        return M(motionEvent, false);
    }

    public boolean M(MotionEvent motionEvent, boolean z7) {
        if (!this.f23667c.isTouchExplorationEnabled() || this.f23671g.isEmpty()) {
            return false;
        }
        l lVarX0 = A().x0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z7);
        if (lVarX0 != null && lVarX0.f23770i != -1) {
            if (z7) {
                return false;
            }
            return this.f23668d.onAccessibilityHoverEvent(lVarX0.f23763b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            B(motionEvent.getX(), motionEvent.getY(), z7);
        } else {
            if (motionEvent.getAction() != 10) {
                g5.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            N();
        }
        return true;
    }

    public void S() {
        this.f23685u = true;
        this.f23669e.d();
        a0(null);
        this.f23667c.removeAccessibilityStateChangeListener(this.f23687w);
        this.f23667c.removeTouchExplorationStateChangeListener(this.f23688x);
        this.f23670f.unregisterContentObserver(this.f23689y);
        this.f23666b.g(null);
    }

    public void T(int i8, int i9) {
        if (this.f23667c.isEnabled()) {
            U(I(i8, i9));
        }
    }

    public void a0(k kVar) {
        this.f23683s = kVar;
    }

    void c0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h hVarY = y(byteBuffer.getInt());
            hVarY.f23731c = byteBuffer.getInt();
            int i8 = byteBuffer.getInt();
            String str = null;
            hVarY.f23732d = i8 == -1 ? null : strArr[i8];
            int i9 = byteBuffer.getInt();
            if (i9 != -1) {
                str = strArr[i9];
            }
            hVarY.f23733e = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0466  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r14) {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.g.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    void d0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f8;
        float f9;
        WindowInsets rootWindowInsets;
        View viewB;
        ArrayList<l> arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l lVarZ = z(byteBuffer.getInt());
            lVarZ.E0(byteBuffer, strArr, byteBufferArr);
            if (!lVarZ.w0(i.IS_HIDDEN)) {
                if (lVarZ.w0(i.IS_FOCUSED)) {
                    this.f23677m = lVarZ;
                }
                if (lVarZ.B) {
                    arrayList.add(lVarZ);
                }
                if (lVarZ.f23770i != -1 && !this.f23669e.c(lVarZ.f23770i) && (viewB = this.f23669e.b(lVarZ.f23770i)) != null) {
                    viewB.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l lVarA = A();
        ArrayList<l> arrayList2 = new ArrayList();
        if (lVarA != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 23) {
                if ((i8 >= 28 ? v() : true) && (rootWindowInsets = this.f23665a.getRootWindowInsets()) != null) {
                    if (!this.f23682r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                        lVarA.Y = true;
                        lVarA.W = true;
                    }
                    this.f23682r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                    Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
                }
            }
            lVarA.D0(fArr, hashSet, false);
            lVarA.f0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f23680p.contains(Integer.valueOf(lVar4.f23763b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f23763b != this.f23681q || arrayList2.size() != this.f23680p.size())) {
            this.f23681q = lVar3.f23763b;
            O(lVar3);
        }
        this.f23680p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f23680p.add(Integer.valueOf(((l) it.next()).f23763b));
        }
        Iterator<Map.Entry<Integer, l>> it2 = this.f23671g.entrySet().iterator();
        while (it2.hasNext()) {
            l value = it2.next().getValue();
            if (!hashSet.contains(value)) {
                e0(value);
                it2.remove();
            }
        }
        W(0);
        for (l lVar5 : arrayList) {
            if (lVar5.i0()) {
                AccessibilityEvent accessibilityEventI = I(lVar5.f23763b, 4096);
                float f10 = lVar5.f23773l;
                float f11 = lVar5.f23774m;
                if (Float.isInfinite(lVar5.f23774m)) {
                    if (f10 > 70000.0f) {
                        f10 = 70000.0f;
                    }
                    f11 = 100000.0f;
                }
                if (Float.isInfinite(lVar5.f23775n)) {
                    f8 = f11 + 100000.0f;
                    if (f10 < -70000.0f) {
                        f10 = -70000.0f;
                    }
                    f9 = f10 + 100000.0f;
                } else {
                    f8 = f11 - lVar5.f23775n;
                    f9 = f10 - lVar5.f23775n;
                }
                if (lVar5.t0(EnumC0132g.SCROLL_UP) || lVar5.t0(EnumC0132g.SCROLL_DOWN)) {
                    accessibilityEventI.setScrollY((int) f9);
                    accessibilityEventI.setMaxScrollY((int) f8);
                } else if (lVar5.t0(EnumC0132g.SCROLL_LEFT) || lVar5.t0(EnumC0132g.SCROLL_RIGHT)) {
                    accessibilityEventI.setScrollX((int) f9);
                    accessibilityEventI.setMaxScrollX((int) f8);
                }
                if (lVar5.f23771j > 0) {
                    accessibilityEventI.setItemCount(lVar5.f23771j);
                    accessibilityEventI.setFromIndex(lVar5.f23772k);
                    Iterator it3 = lVar5.S.iterator();
                    int i9 = 0;
                    while (it3.hasNext()) {
                        if (!((l) it3.next()).w0(i.IS_HIDDEN)) {
                            i9++;
                        }
                    }
                    accessibilityEventI.setToIndex((lVar5.f23772k + i9) - 1);
                }
                U(accessibilityEventI);
            }
            if (lVar5.w0(i.IS_LIVE_REGION) && lVar5.h0()) {
                W(lVar5.f23763b);
            }
            l lVar6 = this.f23673i;
            if (lVar6 != null && lVar6.f23763b == lVar5.f23763b) {
                i iVar = i.IS_SELECTED;
                if (!lVar5.u0(iVar) && lVar5.w0(iVar)) {
                    AccessibilityEvent accessibilityEventI2 = I(lVar5.f23763b, 4);
                    accessibilityEventI2.getText().add(lVar5.f23776o);
                    U(accessibilityEventI2);
                }
            }
            l lVar7 = this.f23677m;
            if (lVar7 != null && lVar7.f23763b == lVar5.f23763b && ((lVar2 = this.f23678n) == null || lVar2.f23763b != this.f23677m.f23763b)) {
                this.f23678n = this.f23677m;
                U(I(lVar5.f23763b, 8));
            } else if (this.f23677m == null) {
                this.f23678n = null;
            }
            l lVar8 = this.f23677m;
            if (lVar8 != null && lVar8.f23763b == lVar5.f23763b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar5.u0(iVar2) && lVar5.w0(iVar2) && ((lVar = this.f23673i) == null || lVar.f23763b == this.f23677m.f23763b)) {
                    String str = lVar5.J != null ? lVar5.J : "";
                    String str2 = lVar5.f23778q != null ? lVar5.f23778q : "";
                    AccessibilityEvent accessibilityEventU = u(lVar5.f23763b, str, str2);
                    if (accessibilityEventU != null) {
                        U(accessibilityEventU);
                    }
                    if (lVar5.E != lVar5.f23768g || lVar5.F != lVar5.f23769h) {
                        AccessibilityEvent accessibilityEventI3 = I(lVar5.f23763b, 8192);
                        accessibilityEventI3.getText().add(str2);
                        accessibilityEventI3.setFromIndex(lVar5.f23768g);
                        accessibilityEventI3.setToIndex(lVar5.f23769h);
                        accessibilityEventI3.setItemCount(str2.length());
                        U(accessibilityEventI3);
                    }
                }
            }
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i8) {
        l lVar;
        Integer num;
        int iIntValue;
        if (i8 == 1) {
            lVar = this.f23677m;
            if (lVar == null) {
                num = this.f23675k;
                if (num == null) {
                }
                iIntValue = num.intValue();
                return createAccessibilityNodeInfo(iIntValue);
            }
            iIntValue = lVar.f23763b;
            return createAccessibilityNodeInfo(iIntValue);
        }
        if (i8 != 2) {
            return null;
        }
        lVar = this.f23673i;
        if (lVar == null) {
            num = this.f23674j;
            if (num == null) {
                return null;
            }
            iIntValue = num.intValue();
            return createAccessibilityNodeInfo(iIntValue);
        }
        iIntValue = lVar.f23763b;
        return createAccessibilityNodeInfo(iIntValue);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i8, int i9, Bundle bundle) {
        int i10;
        if (i8 >= 65536) {
            boolean zPerformAction = this.f23668d.performAction(i8, i9, bundle);
            if (zPerformAction && i9 == 128) {
                this.f23674j = null;
            }
            return zPerformAction;
        }
        l lVar = this.f23671g.get(Integer.valueOf(i8));
        boolean z7 = false;
        if (lVar == null) {
            return false;
        }
        switch (i9) {
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                this.f23666b.b(i8, EnumC0132g.TAP);
                return true;
            case com.amazon.c.a.a.c.f4053h /* 32 */:
                this.f23666b.b(i8, EnumC0132g.LONG_PRESS);
                return true;
            case 64:
                if (this.f23673i == null) {
                    this.f23665a.invalidate();
                }
                this.f23673i = lVar;
                this.f23666b.b(i8, EnumC0132g.DID_GAIN_ACCESSIBILITY_FOCUS);
                T(i8, 32768);
                if (lVar.v0(EnumC0132g.INCREASE) || lVar.v0(EnumC0132g.DECREASE)) {
                    T(i8, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f23673i;
                if (lVar2 != null && lVar2.f23763b == i8) {
                    this.f23673i = null;
                }
                Integer num = this.f23674j;
                if (num != null && num.intValue() == i8) {
                    this.f23674j = null;
                }
                this.f23666b.b(i8, EnumC0132g.DID_LOSE_ACCESSIBILITY_FOCUS);
                T(i8, 65536);
                return true;
            case 256:
                return P(lVar, i8, bundle, true);
            case 512:
                return P(lVar, i8, bundle, false);
            case 4096:
                EnumC0132g enumC0132g = EnumC0132g.SCROLL_UP;
                if (!lVar.v0(enumC0132g)) {
                    enumC0132g = EnumC0132g.SCROLL_LEFT;
                    if (!lVar.v0(enumC0132g)) {
                        enumC0132g = EnumC0132g.INCREASE;
                        if (!lVar.v0(enumC0132g)) {
                            return false;
                        }
                        lVar.f23778q = lVar.f23780s;
                        lVar.f23779r = lVar.f23781t;
                        T(i8, 4);
                    }
                }
                this.f23666b.b(i8, enumC0132g);
                return true;
            case 8192:
                EnumC0132g enumC0132g2 = EnumC0132g.SCROLL_DOWN;
                if (!lVar.v0(enumC0132g2)) {
                    enumC0132g2 = EnumC0132g.SCROLL_RIGHT;
                    if (!lVar.v0(enumC0132g2)) {
                        enumC0132g2 = EnumC0132g.DECREASE;
                        if (!lVar.v0(enumC0132g2)) {
                            return false;
                        }
                        lVar.f23778q = lVar.f23782u;
                        lVar.f23779r = lVar.f23783v;
                        T(i8, 4);
                    }
                }
                this.f23666b.b(i8, enumC0132g2);
                return true;
            case 16384:
                this.f23666b.b(i8, EnumC0132g.COPY);
                return true;
            case 32768:
                this.f23666b.b(i8, EnumC0132g.PASTE);
                return true;
            case 65536:
                this.f23666b.b(i8, EnumC0132g.CUT);
                return true;
            case 131072:
                HashMap map = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z7 = true;
                }
                if (z7) {
                    map.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i10 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    map.put("base", Integer.valueOf(lVar.f23769h));
                    i10 = lVar.f23769h;
                }
                map.put("extent", Integer.valueOf(i10));
                this.f23666b.c(i8, EnumC0132g.SET_SELECTION, map);
                l lVar3 = this.f23671g.get(Integer.valueOf(i8));
                lVar3.f23768g = ((Integer) map.get("base")).intValue();
                lVar3.f23769h = ((Integer) map.get("extent")).intValue();
                return true;
            case 1048576:
                this.f23666b.b(i8, EnumC0132g.DISMISS);
                return true;
            case 2097152:
                return Q(lVar, i8, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f23666b.b(i8, EnumC0132g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f23672h.get(Integer.valueOf(i9 - B));
                if (hVar == null) {
                    return false;
                }
                this.f23666b.c(i8, EnumC0132g.CUSTOM_ACTION, Integer.valueOf(hVar.f23730b));
                return true;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f23668d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f23668d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f23675k = recordFlutterId;
            this.f23677m = null;
            return true;
        }
        if (eventType == 128) {
            this.f23679o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f23674j = recordFlutterId;
            this.f23673i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f23675k = null;
        this.f23674j = null;
        return true;
    }
}
