package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class a1 extends v0 implements w0 {
    private static Method X;
    private w0 W;

    public static class a extends o0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f834o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final int f835p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private w0 f836q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private MenuItem f837r;

        public a(Context context, boolean z7) {
            super(context, z7);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f834o = 21;
                this.f835p = 22;
            } else {
                this.f834o = 22;
                this.f835p = 21;
            }
        }

        @Override // androidx.appcompat.widget.o0
        public /* bridge */ /* synthetic */ int d(int i8, int i9, int i10, int i11, int i12) {
            return super.d(i8, i9, i10, i11, i12);
        }

        @Override // androidx.appcompat.widget.o0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i8) {
            return super.e(motionEvent, i8);
        }

        @Override // androidx.appcompat.widget.o0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.o0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.o0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.o0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.o0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            int iPointToPosition;
            int i8;
            if (this.f836q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) adapter;
                androidx.appcompat.view.menu.g item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i8 = iPointToPosition - headersCount) >= 0 && i8 < dVar.getCount()) {
                    item = dVar.getItem(i8);
                }
                MenuItem menuItem = this.f837r;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f836q.g(eVarB, menuItem);
                    }
                    this.f837r = item;
                    if (item != null) {
                        this.f836q.d(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i8, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i8 == this.f834o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i8 != this.f835p) {
                return super.onKeyDown(i8, keyEvent);
            }
            setSelection(-1);
            ((androidx.appcompat.view.menu.d) getAdapter()).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.o0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(w0 w0Var) {
            this.f836q = w0Var;
        }

        @Override // androidx.appcompat.widget.o0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                X = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public a1(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }

    public void N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setEnterTransition((Transition) obj);
        }
    }

    public void O(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setExitTransition((Transition) obj);
        }
    }

    public void P(w0 w0Var) {
        this.W = w0Var;
    }

    public void Q(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            this.F.setTouchModal(z7);
            return;
        }
        Method method = X;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.w0
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        w0 w0Var = this.W;
        if (w0Var != null) {
            w0Var.d(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.w0
    public void g(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        w0 w0Var = this.W;
        if (w0Var != null) {
            w0Var.g(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.v0
    o0 s(Context context, boolean z7) {
        a aVar = new a(context, z7);
        aVar.setHoverListener(this);
        return aVar;
    }
}
