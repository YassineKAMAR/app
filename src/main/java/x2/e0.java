package x2;

import a3.q1;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends b3.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f27259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f27261d;

    e0(String str, IBinder iBinder, boolean z7, boolean z8) {
        this.f27258a = str;
        w wVar = null;
        if (iBinder != null) {
            try {
                g3.a aVarP = q1.v0(iBinder).p();
                byte[] bArr = aVarP == null ? null : (byte[]) g3.b.H0(aVarP);
                if (bArr != null) {
                    wVar = new w(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e8) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e8);
            }
        }
        this.f27259b = wVar;
        this.f27260c = z7;
        this.f27261d = z8;
    }

    e0(String str, v vVar, boolean z7, boolean z8) {
        this.f27258a = str;
        this.f27259b = vVar;
        this.f27260c = z7;
        this.f27261d = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, this.f27258a, false);
        v vVar = this.f27259b;
        if (vVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            vVar = null;
        }
        b3.c.j(parcel, 2, vVar, false);
        b3.c.c(parcel, 3, this.f27260c);
        b3.c.c(parcel, 4, this.f27261d);
        b3.c.b(parcel, iA);
    }
}
