package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.a0;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.e;
import io.flutter.plugin.platform.w;
import java.util.HashMap;
import r5.q;

/* JADX INFO: loaded from: classes.dex */
public class m implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f22896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputMethodManager f22897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AutofillManager f22898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f22899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f22900e = new d(d.a.NO_TARGET, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q.b f22901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SparseArray<q.b> f22902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.flutter.plugin.editing.e f22903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputConnection f22905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w f22906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f22907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f22908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q.e f22909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f22910o;

    class a implements ImeSyncDeferringInsetsCallback.b {
        a() {
        }

        @Override // io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.b
        public void a(boolean z7) {
            if (z7) {
                return;
            }
            m.this.z();
        }
    }

    class b implements q.f {
        b() {
        }

        @Override // r5.q.f
        public void a(String str, Bundle bundle) {
            m.this.C(str, bundle);
        }

        @Override // r5.q.f
        public void b() {
            m mVar = m.this;
            mVar.G(mVar.f22896a);
        }

        @Override // r5.q.f
        public void c(int i8, boolean z7) {
            m.this.D(i8, z7);
        }

        @Override // r5.q.f
        public void d(double d8, double d9, double[] dArr) {
            m.this.B(d8, d9, dArr);
        }

        @Override // r5.q.f
        public void e() {
            m.this.x();
        }

        @Override // r5.q.f
        public void f(boolean z7) {
            if (Build.VERSION.SDK_INT < 26 || m.this.f22898c == null) {
                return;
            }
            if (z7) {
                m.this.f22898c.commit();
            } else {
                m.this.f22898c.cancel();
            }
        }

        @Override // r5.q.f
        public void g() {
            m.this.m();
        }

        @Override // r5.q.f
        public void h(q.e eVar) {
            m mVar = m.this;
            mVar.F(mVar.f22896a, eVar);
        }

        @Override // r5.q.f
        public void i(int i8, q.b bVar) {
            m.this.E(i8, bVar);
        }

        @Override // r5.q.f
        public void j() {
            if (m.this.f22900e.f22917a == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                m.this.y();
            } else {
                m mVar = m.this;
                mVar.s(mVar.f22896a);
            }
        }
    }

    class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f22914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double[] f22915c;

        c(boolean z7, double[] dArr, double[] dArr2) {
            this.f22913a = z7;
            this.f22914b = dArr;
            this.f22915c = dArr2;
        }

        @Override // io.flutter.plugin.editing.m.e
        public void a(double d8, double d9) {
            double d10 = 1.0d;
            if (!this.f22913a) {
                double[] dArr = this.f22914b;
                d10 = 1.0d / (((dArr[3] * d8) + (dArr[7] * d9)) + dArr[15]);
            }
            double[] dArr2 = this.f22914b;
            double d11 = ((dArr2[0] * d8) + (dArr2[4] * d9) + dArr2[12]) * d10;
            double d12 = ((dArr2[1] * d8) + (dArr2[5] * d9) + dArr2[13]) * d10;
            double[] dArr3 = this.f22915c;
            if (d11 < dArr3[0]) {
                dArr3[0] = d11;
            } else if (d11 > dArr3[1]) {
                dArr3[1] = d11;
            }
            if (d12 < dArr3[2]) {
                dArr3[2] = d12;
            } else if (d12 > dArr3[3]) {
                dArr3[3] = d12;
            }
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f22917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22918b;

        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public d(a aVar, int i8) {
            this.f22917a = aVar;
            this.f22918b = i8;
        }
    }

    private interface e {
        void a(double d8, double d9);
    }

    @SuppressLint({"NewApi"})
    public m(View view, q qVar, w wVar) {
        this.f22896a = view;
        this.f22903h = new io.flutter.plugin.editing.e(null, view);
        this.f22897b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i8 = Build.VERSION.SDK_INT;
        this.f22898c = i8 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (i8 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f22908m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            this.f22908m.setImeVisibleListener(new a());
        }
        this.f22899d = qVar;
        qVar.o(new b());
        qVar.l();
        this.f22906k = wVar;
        wVar.D(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(double d8, double d9, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z7 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d10 = dArr[12];
        double d11 = dArr[15];
        double d12 = d10 / d11;
        dArr2[1] = d12;
        dArr2[0] = d12;
        double d13 = dArr[13] / d11;
        dArr2[3] = d13;
        dArr2[2] = d13;
        c cVar = new c(z7, dArr, dArr2);
        cVar.a(d8, 0.0d);
        cVar.a(d8, d9);
        cVar.a(0.0d, d9);
        Float fValueOf = Float.valueOf(this.f22896a.getContext().getResources().getDisplayMetrics().density);
        this.f22907l = new Rect((int) (dArr2[0] * ((double) fValueOf.floatValue())), (int) (dArr2[2] * ((double) fValueOf.floatValue())), (int) Math.ceil(dArr2[1] * ((double) fValueOf.floatValue())), (int) Math.ceil(dArr2[3] * ((double) fValueOf.floatValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i8, boolean z7) {
        if (!z7) {
            this.f22900e = new d(d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i8);
            this.f22905j = null;
        } else {
            this.f22896a.requestFocus();
            this.f22900e = new d(d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i8);
            this.f22897b.restartInput(this.f22896a);
            this.f22904i = false;
        }
    }

    private void I(q.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f26084j == null) {
            this.f22902g = null;
            return;
        }
        q.b[] bVarArr = bVar.f26086l;
        SparseArray<q.b> sparseArray = new SparseArray<>();
        this.f22902g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f26084j.f26087a.hashCode(), bVar);
            return;
        }
        for (q.b bVar2 : bVarArr) {
            q.b.a aVar = bVar2.f26084j;
            if (aVar != null) {
                this.f22902g.put(aVar.f26087a.hashCode(), bVar2);
                this.f22898c.notifyValueChanged(this.f22896a, aVar.f26087a.hashCode(), AutofillValue.forText(aVar.f26089c.f26100a));
            }
        }
    }

    private boolean k() {
        q.c cVar;
        q.b bVar = this.f22901f;
        return bVar == null || (cVar = bVar.f26081g) == null || cVar.f26091a != q.g.NONE;
    }

    private static boolean n(q.e eVar, q.e eVar2) {
        int i8 = eVar.f26104e - eVar.f26103d;
        if (i8 != eVar2.f26104e - eVar2.f26103d) {
            return true;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (eVar.f26100a.charAt(eVar.f26103d + i9) != eVar2.f26100a.charAt(eVar2.f26103d + i9)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f22897b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(q.c cVar, boolean z7, boolean z8, boolean z9, boolean z10, q.d dVar) {
        q.g gVar = cVar.f26091a;
        if (gVar == q.g.DATETIME) {
            return 4;
        }
        if (gVar == q.g.NUMBER) {
            int i8 = cVar.f26092b ? 4098 : 2;
            return cVar.f26093c ? i8 | 8192 : i8;
        }
        if (gVar == q.g.PHONE) {
            return 3;
        }
        if (gVar == q.g.NONE) {
            return 0;
        }
        int i9 = 1;
        if (gVar == q.g.MULTILINE) {
            i9 = 131073;
        } else if (gVar == q.g.EMAIL_ADDRESS) {
            i9 = 33;
        } else if (gVar == q.g.URL) {
            i9 = 17;
        } else if (gVar == q.g.VISIBLE_PASSWORD) {
            i9 = 145;
        } else if (gVar == q.g.NAME) {
            i9 = 97;
        } else if (gVar == q.g.POSTAL_ADDRESS) {
            i9 = 113;
        }
        if (z7) {
            i9 = i9 | 524288 | 128;
        } else {
            if (z8) {
                i9 |= 32768;
            }
            if (!z9) {
                i9 = i9 | 524288 | 144;
            }
        }
        return dVar == q.d.CHARACTERS ? i9 | 4096 : dVar == q.d.WORDS ? i9 | 8192 : dVar == q.d.SENTENCES ? i9 | 16384 : i9;
    }

    private boolean v() {
        return this.f22902g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f22898c == null || !v()) {
            return;
        }
        this.f22898c.notifyValueChanged(this.f22896a, this.f22901f.f26084j.f26087a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT < 26 || this.f22898c == null || !v()) {
            return;
        }
        String str = this.f22901f.f26084j.f26087a;
        int[] iArr = new int[2];
        this.f22896a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f22907l);
        rect.offset(iArr[0], iArr[1]);
        this.f22898c.notifyViewEntered(this.f22896a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        q.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f22898c == null || (bVar = this.f22901f) == null || bVar.f26084j == null || !v()) {
            return;
        }
        this.f22898c.notifyViewExited(this.f22896a, this.f22901f.f26084j.f26087a.hashCode());
    }

    public void A(ViewStructure viewStructure, int i8) {
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.f22901f.f26084j.f26087a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i9 = 0; i9 < this.f22902g.size(); i9++) {
            int iKeyAt = this.f22902g.keyAt(i9);
            q.b.a aVar = this.f22902g.valueAt(i9).f26084j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i9);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                String[] strArr = aVar.f26088b;
                if (strArr.length > 0) {
                    viewStructureNewChild.setAutofillHints(strArr);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                String str2 = aVar.f26090d;
                if (str2 != null) {
                    viewStructureNewChild.setHint(str2);
                }
                if (str.hashCode() != iKeyAt || (rect = this.f22907l) == null) {
                    viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(aVar.f26089c.f26100a));
                } else {
                    viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f22907l.height());
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.f22903h));
                }
            }
        }
    }

    public void C(String str, Bundle bundle) {
        this.f22897b.sendAppPrivateCommand(this.f22896a, str, bundle);
    }

    void E(int i8, q.b bVar) {
        y();
        this.f22901f = bVar;
        this.f22900e = k() ? new d(d.a.FRAMEWORK_CLIENT, i8) : new d(d.a.NO_TARGET, i8);
        this.f22903h.l(this);
        q.b.a aVar = bVar.f26084j;
        this.f22903h = new io.flutter.plugin.editing.e(aVar != null ? aVar.f26089c : null, this.f22896a);
        I(bVar);
        this.f22904i = true;
        H();
        this.f22907l = null;
        this.f22903h.a(this);
    }

    void F(View view, q.e eVar) {
        q.e eVar2;
        if (!this.f22904i && (eVar2 = this.f22909n) != null && eVar2.b()) {
            boolean zN = n(this.f22909n, eVar);
            this.f22904i = zN;
            if (zN) {
                g5.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f22909n = eVar;
        this.f22903h.n(eVar);
        if (this.f22904i) {
            this.f22897b.restartInput(view);
            this.f22904i = false;
        }
    }

    void G(View view) {
        if (!k()) {
            s(view);
        } else {
            view.requestFocus();
            this.f22897b.showSoftInput(view, 0);
        }
    }

    public void H() {
        if (this.f22900e.f22917a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f22910o = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // io.flutter.plugin.editing.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.e r9 = r8.f22903h
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        Lb:
            io.flutter.plugin.editing.e r9 = r8.f22903h
            int r9 = r9.i()
            io.flutter.plugin.editing.e r10 = r8.f22903h
            int r10 = r10.h()
            io.flutter.plugin.editing.e r11 = r8.f22903h
            int r11 = r11.g()
            io.flutter.plugin.editing.e r0 = r8.f22903h
            int r7 = r0.f()
            io.flutter.plugin.editing.e r0 = r8.f22903h
            java.util.ArrayList r0 = r0.e()
            r5.q$e r1 = r8.f22909n
            if (r1 == 0) goto L52
            io.flutter.plugin.editing.e r1 = r8.f22903h
            java.lang.String r1 = r1.toString()
            r5.q$e r2 = r8.f22909n
            java.lang.String r2 = r2.f26100a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            r5.q$e r1 = r8.f22909n
            int r2 = r1.f26101b
            if (r9 != r2) goto L50
            int r2 = r1.f26102c
            if (r10 != r2) goto L50
            int r2 = r1.f26103d
            if (r11 != r2) goto L50
            int r1 = r1.f26104e
            if (r7 != r1) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.e r2 = r8.f22903h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            g5.b.f(r2, r1)
            r5.q$b r1 = r8.f22901f
            boolean r1 = r1.f26079e
            if (r1 == 0) goto L86
            r5.q r1 = r8.f22899d
            io.flutter.plugin.editing.m$d r2 = r8.f22900e
            int r2 = r2.f22918b
            r1.r(r2, r0)
            io.flutter.plugin.editing.e r0 = r8.f22903h
            r0.c()
            goto L99
        L86:
            r5.q r0 = r8.f22899d
            io.flutter.plugin.editing.m$d r1 = r8.f22900e
            int r1 = r1.f22918b
            io.flutter.plugin.editing.e r2 = r8.f22903h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.q(r1, r2, r3, r4, r5, r6)
        L99:
            r5.q$e r6 = new r5.q$e
            io.flutter.plugin.editing.e r0 = r8.f22903h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f22909n = r6
            goto Lb1
        Lac:
            io.flutter.plugin.editing.e r9 = r8.f22903h
            r9.c()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.m.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        q.b bVar;
        q.b.a aVar;
        q.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f22901f) == null || this.f22902g == null || (aVar = bVar.f26084j) == null) {
            return;
        }
        HashMap<String, q.e> map = new HashMap<>();
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            q.b bVar2 = this.f22902g.get(sparseArray.keyAt(i8));
            if (bVar2 != null && (aVar2 = bVar2.f26084j) != null) {
                String string = sparseArray.valueAt(i8).getTextValue().toString();
                q.e eVar = new q.e(string, string.length(), string.length(), -1, -1);
                if (aVar2.f26087a.equals(aVar.f26087a)) {
                    this.f22903h.n(eVar);
                } else {
                    map.put(aVar2.f26087a, eVar);
                }
            }
        }
        this.f22899d.s(this.f22900e.f22918b, map);
    }

    public void l(int i8) {
        d dVar = this.f22900e;
        d.a aVar = dVar.f22917a;
        if ((aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && dVar.f22918b == i8) {
            this.f22900e = new d(d.a.NO_TARGET, 0);
            y();
            this.f22897b.hideSoftInputFromWindow(this.f22896a.getApplicationWindowToken(), 0);
            this.f22897b.restartInput(this.f22896a);
            this.f22904i = false;
        }
    }

    void m() {
        if (this.f22900e.f22917a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f22903h.l(this);
        y();
        this.f22901f = null;
        I(null);
        this.f22900e = new d(d.a.NO_TARGET, 0);
        H();
        this.f22907l = null;
    }

    public InputConnection o(View view, a0 a0Var, EditorInfo editorInfo) {
        d dVar = this.f22900e;
        d.a aVar = dVar.f22917a;
        if (aVar == d.a.NO_TARGET) {
            this.f22905j = null;
            return null;
        }
        if (aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f22910o) {
                return this.f22905j;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.f22906k.b(dVar.f22918b).onCreateInputConnection(editorInfo);
            this.f22905j = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        q.b bVar = this.f22901f;
        int iT = t(bVar.f26081g, bVar.f26075a, bVar.f26076b, bVar.f26077c, bVar.f26078d, bVar.f26080f);
        editorInfo.inputType = iT;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f22901f.f26078d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f22901f.f26082h;
        int iIntValue = num == null ? (iT & 131072) != 0 ? 1 : 6 : num.intValue();
        q.b bVar2 = this.f22901f;
        String str = bVar2.f26083i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        String[] strArr = bVar2.f26085k;
        if (strArr != null) {
            a0.a.a(editorInfo, strArr);
        }
        io.flutter.plugin.editing.d dVar2 = new io.flutter.plugin.editing.d(view, this.f22900e.f22918b, this.f22899d, a0Var, this.f22903h, editorInfo);
        editorInfo.initialSelStart = this.f22903h.i();
        editorInfo.initialSelEnd = this.f22903h.h();
        this.f22905j = dVar2;
        return dVar2;
    }

    @SuppressLint({"NewApi"})
    public void p() {
        this.f22906k.Q();
        this.f22899d.o(null);
        y();
        this.f22903h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f22908m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f22897b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f22905j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.d ? ((io.flutter.plugin.editing.d) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f22900e.f22917a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f22910o = true;
        }
    }

    public void z() {
        this.f22899d.i(this.f22900e.f22918b);
    }
}
