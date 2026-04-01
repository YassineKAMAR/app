package j2;

import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
final class x implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f24069a;

    x(y yVar) {
        this.f24069a = yVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        g2.t.r();
        k2.t(this.f24069a.f24070a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
