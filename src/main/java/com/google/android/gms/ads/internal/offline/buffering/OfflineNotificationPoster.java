package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.j80;
import com.google.android.gms.internal.ads.w40;
import g3.b;
import h2.v;

/* JADX INFO: loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j80 f4722g;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4722g = v.a().j(context, new w40());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f4722g.l1(b.k3(getApplicationContext()), getInputData().i("uri"), getInputData().i("gws_query_id"));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
