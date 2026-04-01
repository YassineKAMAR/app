package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.f;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f2134c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f2135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f2136b;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0028a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f2137a;

        C0028a(a aVar) {
            this.f2137a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2137a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.g gVarB = this.f2137a.b(view);
            if (gVarB != null) {
                return (AccessibilityNodeProvider) gVarB.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2137a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.f fVarP = androidx.core.view.accessibility.f.P(accessibilityNodeInfo);
            fVarP.L(e0.x(view));
            fVarP.J(e0.u(view));
            fVarP.K(e0.j(view));
            fVarP.N(e0.q(view));
            this.f2137a.g(view, fVarP);
            fVarP.c(accessibilityNodeInfo.getText(), view);
            List<f.a> listC = a.c(view);
            for (int i8 = 0; i8 < listC.size(); i8++) {
                fVarP.a(listC.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2137a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2137a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            return this.f2137a.j(view, i8, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i8) {
            this.f2137a.l(view, i8);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2137a.m(view, accessibilityEvent);
        }
    }

    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i8, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i8, bundle);
        }
    }

    public a() {
        this(f2134c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2135a = accessibilityDelegate;
        this.f2136b = new C0028a(this);
    }

    static List<f.a> c(View view) {
        List<f.a> list = (List) view.getTag(w.b.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrK = androidx.core.view.accessibility.f.k(view.createAccessibilityNodeInfo().getText());
            for (int i8 = 0; clickableSpanArrK != null && i8 < clickableSpanArrK.length; i8++) {
                if (clickableSpan.equals(clickableSpanArrK[i8])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i8, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(w.b.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i8)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2135a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.g b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f2135a, view);
        if (accessibilityNodeProviderA != null) {
            return new androidx.core.view.accessibility.g(accessibilityNodeProviderA);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f2136b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2135a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, androidx.core.view.accessibility.f fVar) {
        this.f2135a.onInitializeAccessibilityNodeInfo(view, fVar.O());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2135a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2135a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i8, Bundle bundle) {
        List<f.a> listC = c(view);
        boolean zB = false;
        int i9 = 0;
        while (true) {
            if (i9 >= listC.size()) {
                break;
            }
            f.a aVar = listC.get(i9);
            if (aVar.a() == i8) {
                zB = aVar.c(view, bundle);
                break;
            }
            i9++;
        }
        if (!zB) {
            zB = b.b(this.f2135a, view, i8, bundle);
        }
        return (zB || i8 != w.b.f26990a || bundle == null) ? zB : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i8) {
        this.f2135a.sendAccessibilityEvent(view, i8);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2135a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
