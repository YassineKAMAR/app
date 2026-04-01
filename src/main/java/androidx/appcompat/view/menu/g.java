package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;

/* JADX INFO: loaded from: classes.dex */
public final class g implements x.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f573h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f575j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f577l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f584s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f591z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f574i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f576k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f578m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f585t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f586u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f587v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f588w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f589x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f590y = 16;
    private boolean D = false;

    class a implements b.InterfaceC0029b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0029b
        public void onActionProviderVisibilityChanged(boolean z7) {
            g gVar = g.this;
            gVar.f579n.J(gVar);
        }
    }

    g(e eVar, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.f579n = eVar;
        this.f566a = i9;
        this.f567b = i8;
        this.f568c = i10;
        this.f569d = i11;
        this.f570e = charSequence;
        this.f591z = i12;
    }

    private static void d(StringBuilder sb, int i8, int i9, String str) {
        if ((i8 & i9) == i9) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f589x && (this.f587v || this.f588w)) {
            drawable = androidx.core.graphics.drawable.a.p(drawable).mutate();
            if (this.f587v) {
                androidx.core.graphics.drawable.a.n(drawable, this.f585t);
            }
            if (this.f588w) {
                androidx.core.graphics.drawable.a.o(drawable, this.f586u);
            }
            this.f589x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f579n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f591z & 4) == 4;
    }

    @Override // x.b
    public x.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f579n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // x.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f579n.I(this);
    }

    @Override // x.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f591z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f579n.f(this);
        }
        return false;
    }

    @Override // x.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f579n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f569d;
    }

    char g() {
        return this.f579n.G() ? this.f575j : this.f573h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // x.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // x.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f576k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f575j;
    }

    @Override // x.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f583r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f567b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f577l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f578m == 0) {
            return null;
        }
        Drawable drawableD = g.b.d(this.f579n.u(), this.f578m);
        this.f578m = 0;
        this.f577l = drawableD;
        return e(drawableD);
    }

    @Override // x.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f585t;
    }

    @Override // x.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f586u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f572g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f566a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // x.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f574i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f573h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f568c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f580o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f570e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f571f;
        return charSequence != null ? charSequence : this.f570e;
    }

    @Override // x.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f584s;
    }

    String h() {
        int i8;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f579n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f579n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(e.h.f21216k));
        }
        int i9 = this.f579n.G() ? this.f576k : this.f574i;
        d(sb, i9, 65536, resources.getString(e.h.f21212g));
        d(sb, i9, 4096, resources.getString(e.h.f21208c));
        d(sb, i9, 2, resources.getString(e.h.f21207b));
        d(sb, i9, 1, resources.getString(e.h.f21213h));
        d(sb, i9, 4, resources.getString(e.h.f21215j));
        d(sb, i9, 8, resources.getString(e.h.f21211f));
        if (cG == '\b') {
            i8 = e.h.f21209d;
        } else if (cG == '\n') {
            i8 = e.h.f21210e;
        } else {
            if (cG != ' ') {
                sb.append(cG);
                return sb.toString();
            }
            i8 = e.h.f21214i;
        }
        sb.append(resources.getString(i8));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f580o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // x.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f590y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f590y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f590y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f590y & 8) == 0 : (this.f590y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f591z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f582q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f579n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f581p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f572g != null) {
            try {
                this.f579n.u().startActivity(this.f572g);
                return true;
            } catch (ActivityNotFoundException e8) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e8);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f590y & 32) == 32;
    }

    public boolean m() {
        return (this.f590y & 4) != 0;
    }

    public boolean n() {
        return (this.f591z & 1) == 1;
    }

    public boolean o() {
        return (this.f591z & 2) == 2;
    }

    @Override // x.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public x.b setActionView(int i8) {
        Context contextU = this.f579n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i8, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // x.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public x.b setActionView(View view) {
        int i8;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i8 = this.f566a) > 0) {
            view.setId(i8);
        }
        this.f579n.I(this);
        return this;
    }

    public void r(boolean z7) {
        this.D = z7;
        this.f579n.K(false);
    }

    void s(boolean z7) {
        int i8 = this.f590y;
        int i9 = (z7 ? 2 : 0) | (i8 & (-3));
        this.f590y = i9;
        if (i8 != i9) {
            this.f579n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        if (this.f575j == c8) {
            return this;
        }
        this.f575j = Character.toLowerCase(c8);
        this.f579n.K(false);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        if (this.f575j == c8 && this.f576k == i8) {
            return this;
        }
        this.f575j = Character.toLowerCase(c8);
        this.f576k = KeyEvent.normalizeMetaState(i8);
        this.f579n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        int i8 = this.f590y;
        int i9 = (z7 ? 1 : 0) | (i8 & (-2));
        this.f590y = i9;
        if (i8 != i9) {
            this.f579n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        if ((this.f590y & 4) != 0) {
            this.f579n.T(this);
        } else {
            s(z7);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public x.b setContentDescription(CharSequence charSequence) {
        this.f583r = charSequence;
        this.f579n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f590y = z7 ? this.f590y | 16 : this.f590y & (-17);
        this.f579n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f577l = null;
        this.f578m = i8;
        this.f589x = true;
        this.f579n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f578m = 0;
        this.f577l = drawable;
        this.f589x = true;
        this.f579n.K(false);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f585t = colorStateList;
        this.f587v = true;
        this.f589x = true;
        this.f579n.K(false);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f586u = mode;
        this.f588w = true;
        this.f589x = true;
        this.f579n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f572g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        if (this.f573h == c8) {
            return this;
        }
        this.f573h = c8;
        this.f579n.K(false);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        if (this.f573h == c8 && this.f574i == i8) {
            return this;
        }
        this.f573h = c8;
        this.f574i = KeyEvent.normalizeMetaState(i8);
        this.f579n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f582q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f573h = c8;
        this.f575j = Character.toLowerCase(c9);
        this.f579n.K(false);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f573h = c8;
        this.f574i = KeyEvent.normalizeMetaState(i8);
        this.f575j = Character.toLowerCase(c9);
        this.f576k = KeyEvent.normalizeMetaState(i9);
        this.f579n.K(false);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public void setShowAsAction(int i8) {
        int i9 = i8 & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f591z = i8;
        this.f579n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        return setTitle(this.f579n.u().getString(i8));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f570e = charSequence;
        this.f579n.K(false);
        m mVar = this.f580o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f571f = charSequence;
        this.f579n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public x.b setTooltipText(CharSequence charSequence) {
        this.f584s = charSequence;
        this.f579n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        if (y(z7)) {
            this.f579n.J(this);
        }
        return this;
    }

    public void t(boolean z7) {
        this.f590y = (z7 ? 4 : 0) | (this.f590y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f570e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z7) {
        this.f590y = z7 ? this.f590y | 32 : this.f590y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // x.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public x.b setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    public void x(m mVar) {
        this.f580o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z7) {
        int i8 = this.f590y;
        int i9 = (z7 ? 0 : 8) | (i8 & (-9));
        this.f590y = i9;
        return i8 != i9;
    }

    public boolean z() {
        return this.f579n.A();
    }
}
