package g2;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.qg0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class q extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f21979a;

    /* synthetic */ q(s sVar, p pVar) {
        this.f21979a = sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            s sVar = this.f21979a;
            sVar.f21993h = (gh) sVar.f21988c.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            qg0.h("", e8);
        }
        return this.f21979a.y();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        s sVar = this.f21979a;
        String str = (String) obj;
        if (sVar.f21991f == null || str == null) {
            return;
        }
        sVar.f21991f.loadUrl(str);
    }
}
