package b3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static int a(Parcel parcel) {
        return v(parcel, 20293);
    }

    public static void b(Parcel parcel, int i8) {
        w(parcel, i8);
    }

    public static void c(Parcel parcel, int i8, boolean z7) {
        x(parcel, i8, 4);
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i8, Boolean bool, boolean z7) {
        if (bool != null) {
            x(parcel, i8, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z7) {
            x(parcel, i8, 0);
        }
    }

    public static void e(Parcel parcel, int i8, Bundle bundle, boolean z7) {
        if (bundle == null) {
            if (z7) {
                x(parcel, i8, 0);
            }
        } else {
            int iV = v(parcel, i8);
            parcel.writeBundle(bundle);
            w(parcel, iV);
        }
    }

    public static void f(Parcel parcel, int i8, byte[] bArr, boolean z7) {
        if (bArr == null) {
            if (z7) {
                x(parcel, i8, 0);
            }
        } else {
            int iV = v(parcel, i8);
            parcel.writeByteArray(bArr);
            w(parcel, iV);
        }
    }

    public static void g(Parcel parcel, int i8, Double d8, boolean z7) {
        if (d8 != null) {
            x(parcel, i8, 8);
            parcel.writeDouble(d8.doubleValue());
        } else if (z7) {
            x(parcel, i8, 0);
        }
    }

    public static void h(Parcel parcel, int i8, float f8) {
        x(parcel, i8, 4);
        parcel.writeFloat(f8);
    }

    public static void i(Parcel parcel, int i8, Float f8, boolean z7) {
        if (f8 != null) {
            x(parcel, i8, 4);
            parcel.writeFloat(f8.floatValue());
        } else if (z7) {
            x(parcel, i8, 0);
        }
    }

    public static void j(Parcel parcel, int i8, IBinder iBinder, boolean z7) {
        if (iBinder == null) {
            if (z7) {
                x(parcel, i8, 0);
            }
        } else {
            int iV = v(parcel, i8);
            parcel.writeStrongBinder(iBinder);
            w(parcel, iV);
        }
    }

    public static void k(Parcel parcel, int i8, int i9) {
        x(parcel, i8, 4);
        parcel.writeInt(i9);
    }

    public static void l(Parcel parcel, int i8, int[] iArr, boolean z7) {
        if (iArr == null) {
            if (z7) {
                x(parcel, i8, 0);
            }
        } else {
            int iV = v(parcel, i8);
            parcel.writeIntArray(iArr);
            w(parcel, iV);
        }
    }

    public static void m(Parcel parcel, int i8, List<Integer> list, boolean z7) {
        if (list == null) {
            if (z7) {
                x(parcel, i8, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(list.get(i9).intValue());
        }
        w(parcel, iV);
    }

    public static void n(Parcel parcel, int i8, long j8) {
        x(parcel, i8, 8);
        parcel.writeLong(j8);
    }

    public static void o(Parcel parcel, int i8, Long l8, boolean z7) {
        if (l8 != null) {
            x(parcel, i8, 8);
            parcel.writeLong(l8.longValue());
        } else if (z7) {
            x(parcel, i8, 0);
        }
    }

    public static void p(Parcel parcel, int i8, Parcelable parcelable, int i9, boolean z7) {
        if (parcelable == null) {
            if (z7) {
                x(parcel, i8, 0);
            }
        } else {
            int iV = v(parcel, i8);
            parcelable.writeToParcel(parcel, i9);
            w(parcel, iV);
        }
    }

    public static void q(Parcel parcel, int i8, String str, boolean z7) {
        if (str == null) {
            if (z7) {
                x(parcel, i8, 0);
            }
        } else {
            int iV = v(parcel, i8);
            parcel.writeString(str);
            w(parcel, iV);
        }
    }

    public static void r(Parcel parcel, int i8, String[] strArr, boolean z7) {
        if (strArr == null) {
            if (z7) {
                x(parcel, i8, 0);
            }
        } else {
            int iV = v(parcel, i8);
            parcel.writeStringArray(strArr);
            w(parcel, iV);
        }
    }

    public static void s(Parcel parcel, int i8, List<String> list, boolean z7) {
        if (list == null) {
            if (z7) {
                x(parcel, i8, 0);
            }
        } else {
            int iV = v(parcel, i8);
            parcel.writeStringList(list);
            w(parcel, iV);
        }
    }

    public static <T extends Parcelable> void t(Parcel parcel, int i8, T[] tArr, int i9, boolean z7) {
        if (tArr == null) {
            if (z7) {
                x(parcel, i8, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i8);
        parcel.writeInt(tArr.length);
        for (T t7 : tArr) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, t7, i9);
            }
        }
        w(parcel, iV);
    }

    public static <T extends Parcelable> void u(Parcel parcel, int i8, List<T> list, boolean z7) {
        if (list == null) {
            if (z7) {
                x(parcel, i8, 0);
                return;
            }
            return;
        }
        int iV = v(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            T t7 = list.get(i9);
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, t7, 0);
            }
        }
        w(parcel, iV);
    }

    private static int v(Parcel parcel, int i8) {
        parcel.writeInt(i8 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void w(Parcel parcel, int i8) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i8 - 4);
        parcel.writeInt(iDataPosition - i8);
        parcel.setDataPosition(iDataPosition);
    }

    private static void x(Parcel parcel, int i8, int i9) {
        parcel.writeInt(i8 | (i9 << 16));
    }

    private static void y(Parcel parcel, Parcelable parcelable, int i8) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i8);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
