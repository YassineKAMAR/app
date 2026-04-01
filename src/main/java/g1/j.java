package g1;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y0.i f21893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f21895c;

    public j(y0.i iVar, String str, WorkerParameters.a aVar) {
        this.f21893a = iVar;
        this.f21894b = str;
        this.f21895c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f21893a.m().k(this.f21894b, this.f21895c);
    }
}
