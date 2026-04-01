package z2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends Fragment implements e {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final WeakHashMap f27721o0 = new WeakHashMap();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final Map f27722l0 = Collections.synchronizedMap(new p.a());

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f27723m0 = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Bundle f27724n0;

    public static g0 r1(androidx.fragment.app.d dVar) {
        g0 g0Var;
        WeakHashMap weakHashMap = f27721o0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(dVar);
        if (weakReference != null && (g0Var = (g0) weakReference.get()) != null) {
            return g0Var;
        }
        try {
            g0 g0Var2 = (g0) dVar.s().c("SupportLifecycleFragmentImpl");
            if (g0Var2 == null || g0Var2.S()) {
                g0Var2 = new g0();
                dVar.s().a().b(g0Var2, "SupportLifecycleFragmentImpl").e();
            }
            weakHashMap.put(dVar, new WeakReference(g0Var2));
            return g0Var2;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W(int i8, int i9, Intent intent) {
        super.W(i8, i9, intent);
        Iterator it = this.f27722l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i8, i9, intent);
        }
    }

    @Override // z2.e
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f27722l0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f27722l0.put(str, lifecycleCallback);
        if (this.f27723m0 > 0) {
            new l3.e(Looper.getMainLooper()).post(new f0(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        this.f27723m0 = 1;
        this.f27724n0 = bundle;
        for (Map.Entry entry : this.f27722l0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // z2.e
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.f27722l0.get(str));
    }

    @Override // z2.e
    public final /* synthetic */ Activity d() {
        return k();
    }

    @Override // androidx.fragment.app.Fragment
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f27722l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        this.f27723m0 = 5;
        Iterator it = this.f27722l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void w0() {
        super.w0();
        this.f27723m0 = 3;
        Iterator it = this.f27722l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void x0(Bundle bundle) {
        super.x0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f27722l0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y0() {
        super.y0();
        this.f27723m0 = 2;
        Iterator it = this.f27722l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void z0() {
        super.z0();
        this.f27723m0 = 4;
        Iterator it = this.f27722l0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
