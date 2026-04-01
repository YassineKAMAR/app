package x2;

import a3.n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends b3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f27240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f27242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f27239e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new n();

    public b(int i8) {
        this(i8, null, null);
    }

    b(int i8, int i9, PendingIntent pendingIntent, String str) {
        this.f27240a = i8;
        this.f27241b = i9;
        this.f27242c = pendingIntent;
        this.f27243d = str;
    }

    public b(int i8, PendingIntent pendingIntent) {
        this(i8, pendingIntent, null);
    }

    public b(int i8, PendingIntent pendingIntent, String str) {
        this(1, i8, pendingIntent, str);
    }

    static String v(int i8) {
        if (i8 == 99) {
            return "UNFINISHED";
        }
        if (i8 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i8) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case R.styleable.GradientColor_android_endX /* 10 */:
                return "DEVELOPER_ERROR";
            case R.styleable.GradientColor_android_endY /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i8) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case com.amazon.c.a.a.c.f4052g /* 16 */:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i8 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27241b == bVar.f27241b && a3.n.a(this.f27242c, bVar.f27242c) && a3.n.a(this.f27243d, bVar.f27243d);
    }

    public int g() {
        return this.f27241b;
    }

    public int hashCode() {
        return a3.n.b(Integer.valueOf(this.f27241b), this.f27242c, this.f27243d);
    }

    public String i() {
        return this.f27243d;
    }

    public PendingIntent n() {
        return this.f27242c;
    }

    public boolean p() {
        return (this.f27241b == 0 || this.f27242c == null) ? false : true;
    }

    public String toString() {
        n.a aVarC = a3.n.c(this);
        aVarC.a("statusCode", v(this.f27241b));
        aVarC.a("resolution", this.f27242c);
        aVarC.a("message", this.f27243d);
        return aVarC.toString();
    }

    public boolean u() {
        return this.f27241b == 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f27240a);
        b3.c.k(parcel, 2, g());
        b3.c.p(parcel, 3, n(), i8, false);
        b3.c.q(parcel, 4, i(), false);
        b3.c.b(parcel, iA);
    }
}
