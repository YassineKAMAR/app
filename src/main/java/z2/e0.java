package z2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Fragment implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f27700d = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f27701a = Collections.synchronizedMap(new p.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27702b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f27703c;

    public static e0 f(Activity activity) {
        e0 e0Var;
        WeakHashMap weakHashMap = f27700d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (e0Var = (e0) weakReference.get()) != null) {
            return e0Var;
        }
        try {
            e0 e0Var2 = (e0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (e0Var2 == null || e0Var2.isRemoving()) {
                e0Var2 = new e0();
                activity.getFragmentManager().beginTransaction().add(e0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(e0Var2));
            return e0Var2;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
        }
    }

    @Override // z2.e
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f27701a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f27701a.put(str, lifecycleCallback);
        if (this.f27702b > 0) {
            new l3.e(Looper.getMainLooper()).post(new d0(this, lifecycleCallback, str));
        }
    }

    @Override // z2.e
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.f27701a.get(str));
    }

    @Override // z2.e
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f27701a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        Iterator it = this.f27701a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i8, i9, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27702b = 1;
        this.f27703c = bundle;
        for (Map.Entry entry : this.f27701a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f27702b = 5;
        Iterator it = this.f27701a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f27702b = 3;
        Iterator it = this.f27701a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f27701a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f27702b = 2;
        Iterator it = this.f27701a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f27702b = 4;
        Iterator it = this.f27701a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
