package j;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Window.Callback f23874a;

    public m(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f23874a = callback;
    }

    public final Window.Callback a() {
        return this.f23874a;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f23874a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f23874a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f23874a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f23874a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f23874a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f23874a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f23874a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f23874a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f23874a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i8, Menu menu) {
        return this.f23874a.onCreatePanelMenu(i8, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i8) {
        return this.f23874a.onCreatePanelView(i8);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f23874a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        return this.f23874a.onMenuItemSelected(i8, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i8, Menu menu) {
        return this.f23874a.onMenuOpened(i8, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        this.f23874a.onPanelClosed(i8, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z7) {
        this.f23874a.onPointerCaptureChanged(z7);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i8, View view, Menu menu) {
        return this.f23874a.onPreparePanel(i8, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i8) {
        this.f23874a.onProvideKeyboardShortcuts(list, menu, i8);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f23874a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f23874a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f23874a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        this.f23874a.onWindowFocusChanged(z7);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f23874a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i8) {
        return this.f23874a.onWindowStartingActionMode(callback, i8);
    }
}
