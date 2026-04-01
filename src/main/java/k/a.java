package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a implements x.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f24140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f24141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f24142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f24143g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f24145i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f24147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f24148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f24149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f24150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f24151o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f24144h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f24146j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f24152p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f24153q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f24154r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f24155s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f24156t = 16;

    public a(Context context, int i8, int i9, int i10, int i11, CharSequence charSequence) {
        this.f24148l = context;
        this.f24137a = i9;
        this.f24138b = i8;
        this.f24139c = i11;
        this.f24140d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f24147k;
        if (drawable != null) {
            if (this.f24154r || this.f24155s) {
                Drawable drawableP = androidx.core.graphics.drawable.a.p(drawable);
                this.f24147k = drawableP;
                Drawable drawableMutate = drawableP.mutate();
                this.f24147k = drawableMutate;
                if (this.f24154r) {
                    androidx.core.graphics.drawable.a.n(drawableMutate, this.f24152p);
                }
                if (this.f24155s) {
                    androidx.core.graphics.drawable.a.o(this.f24147k, this.f24153q);
                }
            }
        }
    }

    @Override // x.b
    public x.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // x.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // x.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // x.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public x.b setActionView(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // x.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public x.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // x.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // x.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public x.b setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // x.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // x.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f24146j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f24145i;
    }

    @Override // x.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f24150n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f24138b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f24147k;
    }

    @Override // x.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f24152p;
    }

    @Override // x.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f24153q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f24142f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f24137a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // x.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f24144h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f24143g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f24139c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f24140d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24141e;
        return charSequence != null ? charSequence : this.f24140d;
    }

    @Override // x.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f24151o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // x.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f24156t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f24156t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f24156t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f24156t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.f24145i = Character.toLowerCase(c8);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        this.f24145i = Character.toLowerCase(c8);
        this.f24146j = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f24156t = (z7 ? 1 : 0) | (this.f24156t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f24156t = (z7 ? 2 : 0) | (this.f24156t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public x.b setContentDescription(CharSequence charSequence) {
        this.f24150n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f24156t = (z7 ? 16 : 0) | (this.f24156t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f24147k = androidx.core.content.a.e(this.f24148l, i8);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f24147k = drawable;
        c();
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24152p = colorStateList;
        this.f24154r = true;
        c();
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24153q = mode;
        this.f24155s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f24142f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.f24143g = c8;
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        this.f24143g = c8;
        this.f24144h = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24149m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f24143g = c8;
        this.f24145i = Character.toLowerCase(c9);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f24143g = c8;
        this.f24144h = KeyEvent.normalizeMetaState(i8);
        this.f24145i = Character.toLowerCase(c9);
        this.f24146j = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // x.b, android.view.MenuItem
    public void setShowAsAction(int i8) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.f24140d = this.f24148l.getResources().getString(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f24140d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24141e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public x.b setTooltipText(CharSequence charSequence) {
        this.f24151o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        this.f24156t = (this.f24156t & 8) | (z7 ? 0 : 8);
        return this;
    }
}
