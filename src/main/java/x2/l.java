package x2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class l extends androidx.fragment.app.c {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Dialog f27281w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f27282x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private Dialog f27283y0;

    public static l u1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        Dialog dialog2 = (Dialog) a3.o.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f27281w0 = dialog2;
        if (onCancelListener != null) {
            lVar.f27282x0 = onCancelListener;
        }
        return lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f27282x0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog q1(Bundle bundle) {
        Dialog dialog = this.f27281w0;
        if (dialog != null) {
            return dialog;
        }
        r1(false);
        if (this.f27283y0 == null) {
            this.f27283y0 = new AlertDialog.Builder((Context) a3.o.j(q())).create();
        }
        return this.f27283y0;
    }

    @Override // androidx.fragment.app.c
    public void t1(androidx.fragment.app.i iVar, String str) {
        super.t1(iVar, str);
    }
}
