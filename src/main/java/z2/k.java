package z2;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static <TResult> void a(Status status, TResult tresult, s3.i<TResult> iVar) {
        if (status.u()) {
            iVar.c(tresult);
        } else {
            iVar.b(new y2.b(status));
        }
    }
}
