package b3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private static void A(Parcel parcel, int i8, int i9) {
        int iW = w(parcel, i8);
        if (iW == i9) {
            return;
        }
        throw new a("Expected size " + i9 + " got " + iW + " (0x" + Integer.toHexString(iW) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iW);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iW);
        return bArrCreateByteArray;
    }

    public static int[] c(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iW);
        return iArrCreateIntArray;
    }

    public static ArrayList<Integer> d(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iW);
        return arrayList;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iW);
        return tCreateFromParcel;
    }

    public static String f(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iW);
        return string;
    }

    public static String[] g(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iW);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return tArr;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Parcel parcel, int i8) {
        if (parcel.dataPosition() == i8) {
            return;
        }
        throw new a("Overread allowed size end=" + i8, parcel);
    }

    public static int l(int i8) {
        return (char) i8;
    }

    public static boolean m(Parcel parcel, int i8) {
        A(parcel, i8, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        if (iW == 0) {
            return null;
        }
        z(parcel, i8, iW, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double o(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        if (iW == 0) {
            return null;
        }
        z(parcel, i8, iW, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(Parcel parcel, int i8) {
        A(parcel, i8, 4);
        return parcel.readFloat();
    }

    public static Float q(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        if (iW == 0) {
            return null;
        }
        z(parcel, i8, iW, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int r(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder s(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iW);
        return strongBinder;
    }

    public static int t(Parcel parcel, int i8) {
        A(parcel, i8, 4);
        return parcel.readInt();
    }

    public static long u(Parcel parcel, int i8) {
        A(parcel, i8, 8);
        return parcel.readLong();
    }

    public static Long v(Parcel parcel, int i8) {
        int iW = w(parcel, i8);
        if (iW == 0) {
            return null;
        }
        z(parcel, i8, iW, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int w(Parcel parcel, int i8) {
        return (i8 & (-65536)) != -65536 ? (char) (i8 >> 16) : parcel.readInt();
    }

    public static void x(Parcel parcel, int i8) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i8));
    }

    public static int y(Parcel parcel) {
        int iR = r(parcel);
        int iW = w(parcel, iR);
        int iL = l(iR);
        int iDataPosition = parcel.dataPosition();
        if (iL != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iR))), parcel);
        }
        int i8 = iW + iDataPosition;
        if (i8 >= iDataPosition && i8 <= parcel.dataSize()) {
            return i8;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i8, parcel);
    }

    private static void z(Parcel parcel, int i8, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        throw new a("Expected size " + i10 + " got " + i9 + " (0x" + Integer.toHexString(i9) + ")", parcel);
    }
}
