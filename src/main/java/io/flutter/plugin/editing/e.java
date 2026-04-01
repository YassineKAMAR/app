package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import r5.q;

/* JADX INFO: loaded from: classes.dex */
class e extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22870a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22871b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<b> f22872c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<b> f22873d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<g> f22874e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f22875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f22876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BaseInputConnection f22881l;

    class a extends BaseInputConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Editable f22882a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z7, Editable editable) {
            super(view, z7);
            this.f22882a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f22882a;
        }
    }

    interface b {
        void a(boolean z7, boolean z8, boolean z9);
    }

    public e(q.e eVar, View view) {
        this.f22881l = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z7, boolean z8, boolean z9) {
        this.f22871b++;
        bVar.a(z7, z8, z9);
        this.f22871b--;
    }

    private void k(boolean z7, boolean z8, boolean z9) {
        if (z7 || z8 || z9) {
            Iterator<b> it = this.f22872c.iterator();
            while (it.hasNext()) {
                j(it.next(), z7, z8, z9);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f22871b > 0) {
            g5.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f22870a > 0) {
            g5.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f22873d;
        } else {
            arrayList = this.f22872c;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f22870a++;
        if (this.f22871b > 0) {
            g5.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f22870a != 1 || this.f22872c.isEmpty()) {
            return;
        }
        this.f22876g = toString();
        this.f22877h = i();
        this.f22878i = h();
        this.f22879j = g();
        this.f22880k = f();
    }

    public void c() {
        this.f22874e.clear();
    }

    public void d() {
        int i8 = this.f22870a;
        if (i8 == 0) {
            g5.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i8 == 1) {
            Iterator<b> it = this.f22873d.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f22872c.isEmpty()) {
                g5.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f22872c.size()) + " listener(s)");
                k(!toString().equals(this.f22876g), (this.f22877h == i() && this.f22878i == h()) ? false : true, (this.f22879j == g() && this.f22880k == f()) ? false : true);
            }
        }
        this.f22872c.addAll(this.f22873d);
        this.f22873d.clear();
        this.f22870a--;
    }

    public ArrayList<g> e() {
        ArrayList<g> arrayList = new ArrayList<>(this.f22874e);
        this.f22874e.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f22871b > 0) {
            g5.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f22872c.remove(bVar);
        if (this.f22870a > 0) {
            this.f22873d.remove(bVar);
        }
    }

    public void m(int i8, int i9) {
        if (i8 < 0 || i8 >= i9) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f22881l.setComposingRegion(i8, i9);
        }
    }

    public void n(q.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f26100a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f26101b, eVar.f26102c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f26103d, eVar.f26104e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i8, int i9, CharSequence charSequence, int i10, int i11) {
        boolean z7;
        boolean z8;
        if (this.f22871b > 0) {
            g5.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i12 = i9 - i8;
        boolean z9 = i12 != i11 - i10;
        for (int i13 = 0; i13 < i12 && !z9; i13++) {
            z9 |= charAt(i8 + i13) != charSequence.charAt(i10 + i13);
        }
        if (z9) {
            this.f22875f = null;
        }
        int i14 = i();
        int iH = h();
        int iG = g();
        int iF = f();
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i8, i9, charSequence, i10, i11);
        boolean z10 = z9;
        this.f22874e.add(new g(string, i8, i9, charSequence, i(), h(), g(), f()));
        if (this.f22870a > 0) {
            return spannableStringBuilderReplace;
        }
        boolean z11 = (i() == i14 && h() == iH) ? false : true;
        if (g() == iG && f() == iF) {
            z7 = z10;
            z8 = false;
        } else {
            z7 = z10;
            z8 = true;
        }
        k(z7, z11, z8);
        return spannableStringBuilderReplace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i8, int i9, int i10) {
        super.setSpan(obj, i8, i9, i10);
        this.f22874e.add(new g(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f22875f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f22875f = string;
        return string;
    }
}
