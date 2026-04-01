package y5;

import android.content.Context;
import android.util.Log;
import com.revenuecat.purchases_flutter.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l5.a;
import y5.a;

/* JADX INFO: loaded from: classes.dex */
public class j implements l5.a, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27468a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27469a;

        static {
            int[] iArr = new int[a.c.values().length];
            f27469a = iArr;
            try {
                iArr[a.c.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27469a[a.c.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27469a[a.c.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27469a[a.c.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27469a[a.c.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27469a[a.c.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27469a[a.c.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27469a[a.c.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27469a[a.c.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27469a[a.c.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27469a[a.c.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private String h() {
        return b6.b.d(this.f27468a);
    }

    private String i() {
        return b6.b.c(this.f27468a);
    }

    private List<String> j() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f27468a.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> k(a.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f27468a.getExternalFilesDirs(n(cVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String l() {
        File externalFilesDir = this.f27468a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String m() {
        return this.f27468a.getCacheDir().getPath();
    }

    private String n(a.c cVar) {
        switch (a.f27469a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case R.styleable.GradientColor_android_endX /* 10 */:
                return "dcim";
            case R.styleable.GradientColor_android_endY /* 11 */:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    private void o(s5.c cVar, Context context) {
        try {
            i.i(cVar, this);
        } catch (Exception e8) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e8);
        }
        this.f27468a = context;
    }

    @Override // y5.a.b
    public List<String> a() {
        return j();
    }

    @Override // y5.a.b
    public List<String> b(a.c cVar) {
        return k(cVar);
    }

    @Override // y5.a.b
    public String c() {
        return l();
    }

    @Override // y5.a.b
    public String d() {
        return m();
    }

    @Override // y5.a.b
    public String e() {
        return this.f27468a.getCacheDir().getPath();
    }

    @Override // y5.a.b
    public String f() {
        return i();
    }

    @Override // y5.a.b
    public String g() {
        return h();
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        o(bVar.b(), bVar.a());
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        i.i(bVar.b(), null);
    }
}
