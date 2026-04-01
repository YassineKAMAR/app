package i3;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f22549a = c.class.getClassLoader();

    private c() {
    }

    public static void a(Parcel parcel, boolean z7) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
