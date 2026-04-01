package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c extends k.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x.b f24160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f24161e;

    private class a extends androidx.core.view.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ActionProvider f24162d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f24162d = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f24162d.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View c() {
            return this.f24162d.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean e() {
            return this.f24162d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void f(SubMenu subMenu) {
            this.f24162d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b.InterfaceC0029b f24164f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f24162d.isVisible();
        }

        @Override // androidx.core.view.b
        public View d(MenuItem menuItem) {
            return this.f24162d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean g() {
            return this.f24162d.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void j(b.InterfaceC0029b interfaceC0029b) {
            this.f24164f = interfaceC0029b;
            this.f24162d.setVisibilityListener(interfaceC0029b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z7) {
            b.InterfaceC0029b interfaceC0029b = this.f24164f;
            if (interfaceC0029b != null) {
                interfaceC0029b.onActionProviderVisibilityChanged(z7);
            }
        }
    }

    /* JADX INFO: renamed from: k.c$c, reason: collision with other inner class name */
    static class C0136c extends FrameLayout implements j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f24166a;

        /* JADX WARN: Multi-variable type inference failed */
        C0136c(View view) {
            super(view.getContext());
            this.f24166a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f24166a;
        }

        @Override // j.c
        public void onActionViewCollapsed() {
            this.f24166a.onActionViewCollapsed();
        }

        @Override // j.c
        public void onActionViewExpanded() {
            this.f24166a.onActionViewExpanded();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f24167a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f24167a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f24167a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f24167a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f24169a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f24169a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f24169a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, x.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f24160d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f24160d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f24160d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b bVarB = this.f24160d.b();
        if (bVarB instanceof a) {
            return ((a) bVarB).f24162d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f24160d.getActionView();
        return actionView instanceof C0136c ? ((C0136c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f24160d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f24160d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f24160d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f24160d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f24160d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f24160d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f24160d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f24160d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f24160d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f24160d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f24160d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f24160d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f24160d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f24160d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f24160d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f24160d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f24160d.getTooltipText();
    }

    public void h(boolean z7) {
        try {
            if (this.f24161e == null) {
                this.f24161e = this.f24160d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f24161e.invoke(this.f24160d, Boolean.valueOf(z7));
        } catch (Exception e8) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f24160d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f24160d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f24160d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f24160d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f24160d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f24160d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f24157a, actionProvider);
        x.b bVar2 = this.f24160d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i8) {
        this.f24160d.setActionView(i8);
        View actionView = this.f24160d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f24160d.setActionView(new C0136c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0136c(view);
        }
        this.f24160d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.f24160d.setAlphabeticShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        this.f24160d.setAlphabeticShortcut(c8, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z7) {
        this.f24160d.setCheckable(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z7) {
        this.f24160d.setChecked(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f24160d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z7) {
        this.f24160d.setEnabled(z7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f24160d.setIcon(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f24160d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24160d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24160d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f24160d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.f24160d.setNumericShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        this.f24160d.setNumericShortcut(c8, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24160d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24160d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f24160d.setShortcut(c8, c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f24160d.setShortcut(c8, c9, i8, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i8) {
        this.f24160d.setShowAsAction(i8);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i8) {
        this.f24160d.setShowAsActionFlags(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.f24160d.setTitle(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f24160d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24160d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f24160d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z7) {
        return this.f24160d.setVisible(z7);
    }
}
