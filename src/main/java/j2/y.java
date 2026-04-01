package j2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f24070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f24071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f24072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f24073d;

    y(z zVar, Context context, String str, boolean z7, boolean z8) {
        this.f24070a = context;
        this.f24071b = str;
        this.f24072c = z7;
        this.f24073d = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g2.t.r();
        AlertDialog.Builder builderJ = k2.j(this.f24070a);
        builderJ.setMessage(this.f24071b);
        builderJ.setTitle(this.f24072c ? "Error" : "Info");
        if (this.f24073d) {
            builderJ.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderJ.setPositiveButton("Learn More", new x(this));
            builderJ.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderJ.create().show();
    }
}
