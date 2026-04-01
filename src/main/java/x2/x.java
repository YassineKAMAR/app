package x2;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class x extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakReference f27291c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f27292b;

    x(byte[] bArr) {
        super(bArr);
        this.f27292b = f27291c;
    }

    @Override // x2.v
    final byte[] k3() {
        byte[] bArrQ3;
        synchronized (this) {
            bArrQ3 = (byte[]) this.f27292b.get();
            if (bArrQ3 == null) {
                bArrQ3 = q3();
                this.f27292b = new WeakReference(bArrQ3);
            }
        }
        return bArrQ3;
    }

    protected abstract byte[] q3();
}
