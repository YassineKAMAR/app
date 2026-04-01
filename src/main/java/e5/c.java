package e5;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import e6.k;
import e6.m;
import f6.o;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import n6.j;
import w6.v;
import w6.w;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f21392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dev.fluttercommunity.plus.share.a f21393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f21394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f21395e;

    static final class a extends r implements p6.a<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21396a = new a();

        a() {
            super(0);
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 23 ? 33554432 : 0);
        }
    }

    static final class b extends r implements p6.a<String> {
        b() {
            super(0);
        }

        @Override // p6.a
        public final String invoke() {
            return c.this.e().getPackageName() + ".flutter.share_provider";
        }
    }

    public c(Context context, Activity activity, dev.fluttercommunity.plus.share.a manager) {
        q.f(context, "context");
        q.f(manager, "manager");
        this.f21391a = context;
        this.f21392b = activity;
        this.f21393c = manager;
        this.f21394d = m.b(new b());
        this.f21395e = m.b(a.f21396a);
    }

    private final void b() {
        File fileI = i();
        File[] fileArrListFiles = fileI.listFiles();
        if (fileI.exists()) {
            boolean z7 = true;
            if (fileArrListFiles != null) {
                if (!(fileArrListFiles.length == 0)) {
                    z7 = false;
                }
            }
            if (z7) {
                return;
            }
            q.c(fileArrListFiles);
            for (File file : fileArrListFiles) {
                file.delete();
            }
            fileI.delete();
        }
    }

    private final File c(File file) {
        File fileI = i();
        if (!fileI.exists()) {
            fileI.mkdirs();
        }
        File file2 = new File(fileI, file.getName());
        j.d(file, file2, true, 0, 4, null);
        return file2;
    }

    private final boolean d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            q.c(canonicalPath);
            String canonicalPath2 = i().getCanonicalPath();
            q.e(canonicalPath2, "getCanonicalPath(...)");
            return v.u(canonicalPath, canonicalPath2, false, 2, null);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context e() {
        Activity activity = this.f21392b;
        if (activity == null) {
            return this.f21391a;
        }
        q.c(activity);
        return activity;
    }

    private final int f() {
        return ((Number) this.f21395e.getValue()).intValue();
    }

    private final String g(String str) {
        if (str == null || !w.z(str, "/", false, 2, null)) {
            return "*";
        }
        String strSubstring = str.substring(0, w.K(str, "/", 0, false, 6, null));
        q.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String h() {
        return (String) this.f21394d.getValue();
    }

    private final File i() {
        return new File(e().getCacheDir(), "share_plus");
    }

    private final ArrayList<Uri> j(List<String> list) throws IOException {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (d(file)) {
                throw new IOException("Shared file can not be located in '" + i().getCanonicalPath() + '\'');
            }
            arrayList.add(androidx.core.content.j.f(e(), h(), c(file)));
        }
        return arrayList;
    }

    private final String k(List<String> list) {
        int i8 = 1;
        if (list != null ? list.isEmpty() : true) {
            return "*/*";
        }
        q.c(list);
        if (list.size() == 1) {
            return (String) f6.w.z(list);
        }
        String str = (String) f6.w.z(list);
        int iF = o.f(list);
        if (1 <= iF) {
            while (true) {
                if (!q.b(str, list.get(i8))) {
                    if (!q.b(g(str), g(list.get(i8)))) {
                        return "*/*";
                    }
                    str = g(list.get(i8)) + "/*";
                }
                if (i8 == iF) {
                    break;
                }
                i8++;
            }
        }
        return str;
    }

    private final void o(Intent intent, boolean z7) {
        Activity activity = this.f21392b;
        if (activity == null) {
            intent.addFlags(268435456);
            if (z7) {
                this.f21393c.d();
            }
            this.f21391a.startActivity(intent);
            return;
        }
        q.c(activity);
        if (z7) {
            activity.startActivityForResult(intent, 22643);
        } else {
            activity.startActivity(intent);
        }
    }

    public final void l(Activity activity) {
        this.f21392b = activity;
    }

    public final void m(String text, String str, boolean z7) {
        q.f(text, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", text);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        Intent intentCreateChooser = z7 ? Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f21391a, 0, new Intent(this.f21391a, (Class<?>) SharePlusPendingIntent.class), 134217728 | f()).getIntentSender()) : Intent.createChooser(intent, null);
        q.c(intentCreateChooser);
        o(intentCreateChooser, z7);
    }

    public final void n(List<String> paths, List<String> list, String str, String str2, boolean z7) throws IOException {
        q.f(paths, "paths");
        b();
        ArrayList<Uri> arrayListJ = j(paths);
        Intent intent = new Intent();
        if (arrayListJ.isEmpty()) {
            if (!(str == null || v.p(str))) {
                m(str, str2, z7);
                return;
            }
        }
        if (arrayListJ.size() == 1) {
            String str3 = !(list == null || list.isEmpty()) ? (String) f6.w.z(list) : "*/*";
            intent.setAction("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) f6.w.z(arrayListJ));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType(k(list));
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayListJ);
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent.addFlags(1);
        Intent intentCreateChooser = z7 ? Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f21391a, 0, new Intent(this.f21391a, (Class<?>) SharePlusPendingIntent.class), 134217728 | f()).getIntentSender()) : Intent.createChooser(intent, null);
        List<ResolveInfo> listQueryIntentActivities = e().getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
        q.e(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str4 = ((ResolveInfo) it.next()).activityInfo.packageName;
            Iterator<T> it2 = arrayListJ.iterator();
            while (it2.hasNext()) {
                e().grantUriPermission(str4, (Uri) it2.next(), 3);
            }
        }
        q.c(intentCreateChooser);
        o(intentCreateChooser, z7);
    }
}
