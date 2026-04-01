package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Handler f2407l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private Runnable f2408m0 = new a();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    int f2409n0 = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    int f2410o0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f2411p0 = true;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    boolean f2412q0 = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    int f2413r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    Dialog f2414s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    boolean f2415t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    boolean f2416u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    boolean f2417v0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.f2414s0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void V(Bundle bundle) {
        Bundle bundle2;
        super.V(bundle);
        if (this.f2412q0) {
            View viewL = L();
            if (viewL != null) {
                if (viewL.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f2414s0.setContentView(viewL);
            }
            d dVarK = k();
            if (dVarK != null) {
                this.f2414s0.setOwnerActivity(dVarK);
            }
            this.f2414s0.setCancelable(this.f2411p0);
            this.f2414s0.setOnCancelListener(this);
            this.f2414s0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f2414s0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y(Context context) {
        super.Y(context);
        if (this.f2417v0) {
            return;
        }
        this.f2416u0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void b0(Bundle bundle) {
        super.b0(bundle);
        this.f2407l0 = new Handler();
        this.f2412q0 = this.f2364w == 0;
        if (bundle != null) {
            this.f2409n0 = bundle.getInt("android:style", 0);
            this.f2410o0 = bundle.getInt("android:theme", 0);
            this.f2411p0 = bundle.getBoolean("android:cancelable", true);
            this.f2412q0 = bundle.getBoolean("android:showsDialog", this.f2412q0);
            this.f2413r0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0() {
        super.i0();
        Dialog dialog = this.f2414s0;
        if (dialog != null) {
            this.f2415t0 = true;
            dialog.setOnDismissListener(null);
            this.f2414s0.dismiss();
            if (!this.f2416u0) {
                onDismiss(this.f2414s0);
            }
            this.f2414s0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void j0() {
        super.j0();
        if (this.f2417v0 || this.f2416u0) {
            return;
        }
        this.f2416u0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater k0(Bundle bundle) {
        Context contextG;
        if (!this.f2412q0) {
            return super.k0(bundle);
        }
        Dialog dialogQ1 = q1(bundle);
        this.f2414s0 = dialogQ1;
        if (dialogQ1 != null) {
            s1(dialogQ1, this.f2409n0);
            contextG = this.f2414s0.getContext();
        } else {
            contextG = this.f2360s.g();
        }
        return (LayoutInflater) contextG.getSystemService("layout_inflater");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2415t0) {
            return;
        }
        p1(true, true);
    }

    void p1(boolean z7, boolean z8) {
        if (this.f2416u0) {
            return;
        }
        this.f2416u0 = true;
        this.f2417v0 = false;
        Dialog dialog = this.f2414s0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2414s0.dismiss();
            if (!z8) {
                if (Looper.myLooper() == this.f2407l0.getLooper()) {
                    onDismiss(this.f2414s0);
                } else {
                    this.f2407l0.post(this.f2408m0);
                }
            }
        }
        this.f2415t0 = true;
        if (this.f2413r0 >= 0) {
            b1().f(this.f2413r0, 1);
            this.f2413r0 = -1;
            return;
        }
        n nVarA = b1().a();
        nVarA.g(this);
        if (z7) {
            nVarA.e();
        } else {
            nVarA.d();
        }
    }

    public Dialog q1(Bundle bundle) {
        throw null;
    }

    public void r1(boolean z7) {
        this.f2412q0 = z7;
    }

    public void s1(Dialog dialog, int i8) {
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void t1(i iVar, String str) {
        this.f2416u0 = false;
        this.f2417v0 = true;
        n nVarA = iVar.a();
        nVarA.b(this, str);
        nVarA.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void x0(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.x0(bundle);
        Dialog dialog = this.f2414s0;
        if (dialog != null && (bundleOnSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i8 = this.f2409n0;
        if (i8 != 0) {
            bundle.putInt("android:style", i8);
        }
        int i9 = this.f2410o0;
        if (i9 != 0) {
            bundle.putInt("android:theme", i9);
        }
        boolean z7 = this.f2411p0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f2412q0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i10 = this.f2413r0;
        if (i10 != -1) {
            bundle.putInt("android:backStackId", i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y0() {
        super.y0();
        Dialog dialog = this.f2414s0;
        if (dialog != null) {
            this.f2415t0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z0() {
        super.z0();
        Dialog dialog = this.f2414s0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
