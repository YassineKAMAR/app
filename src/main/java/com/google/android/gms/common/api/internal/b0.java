package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile boolean f4842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AtomicReference<y> f4843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f4844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final x2.e f4845e;

    b0(z2.e eVar, x2.e eVar2) {
        super(eVar);
        this.f4843c = new AtomicReference<>(null);
        this.f4844d = new k3.f(Looper.getMainLooper());
        this.f4845e = eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(x2.b bVar, int i8) {
        this.f4843c.set(null);
        m(bVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f4843c.set(null);
        n();
    }

    private static final int p(y yVar) {
        if (yVar == null) {
            return -1;
        }
        return yVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i8, int i9, Intent intent) {
        y yVar = this.f4843c.get();
        if (i8 != 1) {
            if (i8 == 2) {
                int iG = this.f4845e.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (yVar == null) {
                        return;
                    }
                    if (yVar.b().g() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i9 == -1) {
            o();
            return;
        } else if (i9 == 0) {
            if (yVar == null) {
                return;
            }
            l(new x2.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, yVar.b().toString()), p(yVar));
            return;
        }
        if (yVar != null) {
            l(yVar.b(), yVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f4843c.set(bundle.getBoolean("resolving_error", false) ? new y(new x2.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        y yVar = this.f4843c.get();
        if (yVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", yVar.a());
        bundle.putInt("failed_status", yVar.b().g());
        bundle.putParcelable("failed_resolution", yVar.b().n());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f4842b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f4842b = false;
    }

    protected abstract void m(x2.b bVar, int i8);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new x2.b(13, null), p(this.f4843c.get()));
    }

    public final void s(x2.b bVar, int i8) {
        y yVar = new y(bVar, i8);
        if (com.amazon.a.a.l.d.a(this.f4843c, null, yVar)) {
            this.f4844d.post(new a0(this, yVar));
        }
    }
}
