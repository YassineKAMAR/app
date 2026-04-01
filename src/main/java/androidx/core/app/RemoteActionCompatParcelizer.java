package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1836a = (IconCompat) aVar.v(remoteActionCompat.f1836a, 1);
        remoteActionCompat.f1837b = aVar.l(remoteActionCompat.f1837b, 2);
        remoteActionCompat.f1838c = aVar.l(remoteActionCompat.f1838c, 3);
        remoteActionCompat.f1839d = (PendingIntent) aVar.r(remoteActionCompat.f1839d, 4);
        remoteActionCompat.f1840e = aVar.h(remoteActionCompat.f1840e, 5);
        remoteActionCompat.f1841f = aVar.h(remoteActionCompat.f1841f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1836a, 1);
        aVar.D(remoteActionCompat.f1837b, 2);
        aVar.D(remoteActionCompat.f1838c, 3);
        aVar.H(remoteActionCompat.f1839d, 4);
        aVar.z(remoteActionCompat.f1840e, 5);
        aVar.z(remoteActionCompat.f1841f, 6);
    }
}
