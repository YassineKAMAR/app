package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.a f479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected k f482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f483j;

    public a(Context context, int i8, int i9) {
        this.f474a = context;
        this.f477d = LayoutInflater.from(context);
        this.f480g = i8;
        this.f481h = i9;
    }

    protected void a(View view, int i8) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f482i).addView(view, i8);
    }

    public abstract void b(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z7) {
        j.a aVar = this.f479f;
        if (aVar != null) {
            aVar.c(eVar, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        ViewGroup viewGroup = (ViewGroup) this.f482i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f476c;
        int i8 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> arrayListE = this.f476c.E();
            int size = arrayListE.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = arrayListE.get(i10);
                if (q(i9, gVar)) {
                    View childAt = viewGroup.getChildAt(i9);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i9);
                    }
                    i9++;
                }
            }
            i8 = i9;
        }
        while (i8 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i8)) {
                i8++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f479f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f475b = context;
        this.f478e = LayoutInflater.from(context);
        this.f476c = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.f477d.inflate(this.f481h, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        j.a aVar = this.f479f;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f476c;
        }
        return aVar.d(eVar);
    }

    protected boolean l(ViewGroup viewGroup, int i8) {
        viewGroup.removeViewAt(i8);
        return true;
    }

    public j.a m() {
        return this.f479f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarJ = view instanceof k.a ? (k.a) view : j(viewGroup);
        b(gVar, aVarJ);
        return (View) aVarJ;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f482i == null) {
            k kVar = (k) this.f477d.inflate(this.f480g, viewGroup, false);
            this.f482i = kVar;
            kVar.b(this.f476c);
            d(true);
        }
        return this.f482i;
    }

    public void p(int i8) {
        this.f483j = i8;
    }

    public abstract boolean q(int i8, g gVar);
}
