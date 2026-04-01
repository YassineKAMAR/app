package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f2141d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f2142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2143b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2144c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f2145e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f2146f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f2147g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f2148h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f2149i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f2150j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f2151k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f2152l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f2153m = new a(256, null, i.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f2154n = new a(512, null, i.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f2155o = new a(1024, null, i.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f2156p = new a(2048, null, i.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f2157q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f2158r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f2159s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f2160t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f2161u = new a(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f2162v = new a(131072, null, i.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f2163w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f2164x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f2165y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f2166z = new a(2097152, null, i.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f2167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends i.a> f2169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final i f2170d;

        static {
            int i8 = Build.VERSION.SDK_INT;
            A = new a(i8 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(i8 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, i.e.class);
            C = new a(i8 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(i8 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(i8 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(i8 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(i8 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(i8 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, i.f.class);
            M = new a(i8 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, i.d.class);
            N = new a(i8 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i8 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i8 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i8, CharSequence charSequence) {
            this(null, i8, charSequence, null, null);
        }

        private a(int i8, CharSequence charSequence, Class<? extends i.a> cls) {
            this(null, i8, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i8, CharSequence charSequence, i iVar, Class<? extends i.a> cls) {
            this.f2168b = i8;
            this.f2170d = iVar;
            this.f2167a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i8, charSequence) : obj;
            this.f2169c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2167a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2167a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            if (this.f2170d == null) {
                return false;
            }
            i.a aVar = null;
            Class<? extends i.a> cls = this.f2169c;
            if (cls != null) {
                try {
                    i.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e8) {
                        e = e8;
                        aVar = aVarNewInstance;
                        Class<? extends i.a> cls2 = this.f2169c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            }
            return this.f2170d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f2167a;
            Object obj3 = ((a) obj).f2167a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f2167a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strG = f.g(this.f2168b);
            if (strG.equals("ACTION_UNKNOWN") && b() != null) {
                strG = b().toString();
            }
            sb.append(strG);
            return sb.toString();
        }
    }

    private static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    private f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2142a = accessibilityNodeInfo;
    }

    private void G(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayP = p(view);
        if (sparseArrayP != null) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < sparseArrayP.size(); i8++) {
                if (sparseArrayP.valueAt(i8).get() == null) {
                    arrayList.add(Integer.valueOf(i8));
                }
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                sparseArrayP.remove(((Integer) arrayList.get(i9)).intValue());
            }
        }
    }

    private void H(int i8, boolean z7) {
        Bundle bundleM = m();
        if (bundleM != null) {
            int i9 = bundleM.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i8);
            if (!z7) {
                i8 = 0;
            }
            bundleM.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i8 | i9);
        }
    }

    public static f P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new f(accessibilityNodeInfo);
    }

    private void b(ClickableSpan clickableSpan, Spanned spanned, int i8) {
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i8));
    }

    private void d() {
        b.a(this.f2142a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.a(this.f2142a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.a(this.f2142a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.a(this.f2142a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> e(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f2142a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.a(this.f2142a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String g(int i8) {
        if (i8 == 1) {
            return "ACTION_FOCUS";
        }
        if (i8 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i8) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                return "ACTION_CLICK";
            case com.amazon.c.a.a.c.f4053h /* 32 */:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i8) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i8) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i8) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] k(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> n(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayP = p(view);
        if (sparseArrayP != null) {
            return sparseArrayP;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(w.b.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> p(View view) {
        return (SparseArray) view.getTag(w.b.I);
    }

    private boolean t() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int u(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                if (clickableSpan.equals(sparseArray.valueAt(i8).get())) {
                    return sparseArray.keyAt(i8);
                }
            }
        }
        int i9 = f2141d;
        f2141d = i9 + 1;
        return i9;
    }

    public boolean A() {
        return this.f2142a.isFocused();
    }

    public boolean B() {
        return this.f2142a.isLongClickable();
    }

    public boolean C() {
        return this.f2142a.isPassword();
    }

    public boolean D() {
        return this.f2142a.isScrollable();
    }

    public boolean E() {
        return this.f2142a.isSelected();
    }

    public boolean F(int i8, Bundle bundle) {
        return this.f2142a.performAction(i8, bundle);
    }

    public void I(CharSequence charSequence) {
        this.f2142a.setClassName(charSequence);
    }

    public void J(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2142a.setHeading(z7);
        } else {
            H(2, z7);
        }
    }

    public void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2142a.setPaneTitle(charSequence);
        } else {
            b.a(this.f2142a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void L(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2142a.setScreenReaderFocusable(z7);
        } else {
            H(1, z7);
        }
    }

    public void M(boolean z7) {
        this.f2142a.setScrollable(z7);
    }

    public void N(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f2142a.setStateDescription(charSequence);
        } else {
            b.a(this.f2142a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo O() {
        return this.f2142a;
    }

    public void a(a aVar) {
        this.f2142a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2167a);
    }

    public void c(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            d();
            G(view);
            ClickableSpan[] clickableSpanArrK = k(charSequence);
            if (clickableSpanArrK == null || clickableSpanArrK.length <= 0) {
                return;
            }
            m().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", w.b.f26990a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayN = n(view);
            for (int i8 = 0; i8 < clickableSpanArrK.length; i8++) {
                int iU = u(clickableSpanArrK[i8], sparseArrayN);
                sparseArrayN.put(iU, new WeakReference<>(clickableSpanArrK[i8]));
                b(clickableSpanArrK[i8], (Spanned) charSequence, iU);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2142a;
        if (accessibilityNodeInfo == null) {
            if (fVar.f2142a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(fVar.f2142a)) {
            return false;
        }
        return this.f2144c == fVar.f2144c && this.f2143b == fVar.f2143b;
    }

    public List<a> f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2142a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new a(actionList.get(i8)));
        }
        return arrayList;
    }

    @Deprecated
    public void h(Rect rect) {
        this.f2142a.getBoundsInParent(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2142a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Rect rect) {
        this.f2142a.getBoundsInScreen(rect);
    }

    public CharSequence j() {
        return this.f2142a.getClassName();
    }

    public CharSequence l() {
        return this.f2142a.getContentDescription();
    }

    public Bundle m() {
        return b.a(this.f2142a);
    }

    public CharSequence o() {
        return this.f2142a.getPackageName();
    }

    public CharSequence q() {
        if (!t()) {
            return this.f2142a.getText();
        }
        List<Integer> listE = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listE2 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listE3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listE4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2142a.getText(), 0, this.f2142a.getText().length()));
        for (int i8 = 0; i8 < listE.size(); i8++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(listE4.get(i8).intValue(), this, m().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listE.get(i8).intValue(), listE2.get(i8).intValue(), listE3.get(i8).intValue());
        }
        return spannableString;
    }

    public String r() {
        return androidx.core.os.a.d() ? this.f2142a.getUniqueId() : b.a(this.f2142a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String s() {
        return this.f2142a.getViewIdResourceName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        h(rect);
        sb.append("; boundsInParent: " + rect);
        i(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(o());
        sb.append("; className: ");
        sb.append(j());
        sb.append("; text: ");
        sb.append(q());
        sb.append("; contentDescription: ");
        sb.append(l());
        sb.append("; viewId: ");
        sb.append(s());
        sb.append("; uniqueId: ");
        sb.append(r());
        sb.append("; checkable: ");
        sb.append(v());
        sb.append("; checked: ");
        sb.append(w());
        sb.append("; focusable: ");
        sb.append(z());
        sb.append("; focused: ");
        sb.append(A());
        sb.append("; selected: ");
        sb.append(E());
        sb.append("; clickable: ");
        sb.append(x());
        sb.append("; longClickable: ");
        sb.append(B());
        sb.append("; enabled: ");
        sb.append(y());
        sb.append("; password: ");
        sb.append(C());
        sb.append("; scrollable: " + D());
        sb.append("; [");
        List<a> listF = f();
        for (int i8 = 0; i8 < listF.size(); i8++) {
            a aVar = listF.get(i8);
            String strG = g(aVar.a());
            if (strG.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                strG = aVar.b().toString();
            }
            sb.append(strG);
            if (i8 != listF.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean v() {
        return this.f2142a.isCheckable();
    }

    public boolean w() {
        return this.f2142a.isChecked();
    }

    public boolean x() {
        return this.f2142a.isClickable();
    }

    public boolean y() {
        return this.f2142a.isEnabled();
    }

    public boolean z() {
        return this.f2142a.isFocusable();
    }
}
