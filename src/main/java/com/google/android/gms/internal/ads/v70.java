package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: loaded from: classes.dex */
final class v70 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ x70 f16031c;

    v70(x70 x70Var, String str, String str2) {
        this.f16031c = x70Var;
        this.f16029a = str;
        this.f16030b = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        DownloadManager downloadManager = (DownloadManager) this.f16031c.f17084d.getSystemService("download");
        try {
            String str = this.f16029a;
            String str2 = this.f16030b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            g2.t.r();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f16031c.c("Could not store picture.");
        }
    }
}
