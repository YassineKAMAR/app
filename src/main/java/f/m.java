package f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static m f21571d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f21573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21574c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f21575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f21576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f21577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f21578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f21579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f21580f;

        a() {
        }
    }

    m(Context context, LocationManager locationManager) {
        this.f21572a = context;
        this.f21573b = locationManager;
    }

    static m a(Context context) {
        if (f21571d == null) {
            Context applicationContext = context.getApplicationContext();
            f21571d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f21571d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = androidx.core.content.k.b(this.f21572a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.k.b(this.f21572a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f21573b.isProviderEnabled(str)) {
                return this.f21573b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e8) {
            Log.d("TwilightManager", "Failed to get last known location", e8);
            return null;
        }
    }

    private boolean e() {
        return this.f21574c.f21580f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j8;
        a aVar = this.f21574c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        l lVarB = l.b();
        lVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j9 = lVarB.f21568a;
        lVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z7 = lVarB.f21570c == 1;
        long j10 = lVarB.f21569b;
        long j11 = lVarB.f21568a;
        boolean z8 = z7;
        lVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j12 = lVarB.f21569b;
        if (j10 == -1 || j11 == -1) {
            j8 = 43200000 + jCurrentTimeMillis;
        } else {
            j8 = (jCurrentTimeMillis > j11 ? 0 + j12 : jCurrentTimeMillis > j10 ? 0 + j11 : 0 + j10) + 60000;
        }
        aVar.f21575a = z8;
        aVar.f21576b = j9;
        aVar.f21577c = j10;
        aVar.f21578d = j11;
        aVar.f21579e = j12;
        aVar.f21580f = j8;
    }

    boolean d() {
        a aVar = this.f21574c;
        if (e()) {
            return aVar.f21575a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f21575a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i8 = Calendar.getInstance().get(11);
        return i8 < 6 || i8 >= 22;
    }
}
