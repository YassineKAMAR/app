package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.p;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class q implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f1931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.d f1932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f1933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f1934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Bundle> f1935f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f1936g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f1938i;

    static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setPriority(i8);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z7) {
            return builder.setUsesChronometer(z7);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z7) {
            return builder.setShowWhen(z7);
        }
    }

    static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i8, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z7) {
            return builder.setGroupSummary(z7);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z7) {
            return builder.setLocalOnly(z7);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i8) {
            return builder.setColor(i8);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i8) {
            return builder.setVisibility(i8);
        }
    }

    static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAllowGeneratedReplies(z7);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setBadgeIconType(i8);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z7) {
            return builder.setColorized(z7);
        }

        static Notification.Builder d(Notification.Builder builder, int i8) {
            return builder.setGroupAlertBehavior(i8);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j8) {
            return builder.setTimeoutAfter(j8);
        }
    }

    static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i8) {
            return builder.setSemanticAction(i8);
        }
    }

    static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z7) {
            return builder.setAllowSystemGeneratedContextualActions(z7);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z7) {
            return builder.setContextual(z7);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAuthenticationRequired(z7);
        }

        static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setForegroundServiceBehavior(i8);
        }
    }

    q(p.d dVar) {
        int i8;
        Object obj;
        this.f1932c = dVar;
        Context context = dVar.f1888a;
        this.f1930a = context;
        this.f1931b = Build.VERSION.SDK_INT >= 26 ? h.a(context, dVar.K) : new Notification.Builder(dVar.f1888a);
        Notification notification = dVar.R;
        this.f1931b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f1896i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1892e).setContentText(dVar.f1893f).setContentInfo(dVar.f1898k).setContentIntent(dVar.f1894g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f1895h, (notification.flags & 128) != 0).setLargeIcon(dVar.f1897j).setNumber(dVar.f1899l).setProgress(dVar.f1907t, dVar.f1908u, dVar.f1909v);
        a.b(a.d(a.c(this.f1931b, dVar.f1904q), dVar.f1902o), dVar.f1900m);
        Iterator<p.a> it = dVar.f1889b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = dVar.D;
        if (bundle != null) {
            this.f1936g.putAll(bundle);
        }
        int i9 = Build.VERSION.SDK_INT;
        this.f1933d = dVar.H;
        this.f1934e = dVar.I;
        b.a(this.f1931b, dVar.f1901n);
        d.i(this.f1931b, dVar.f1913z);
        d.g(this.f1931b, dVar.f1910w);
        d.j(this.f1931b, dVar.f1912y);
        d.h(this.f1931b, dVar.f1911x);
        this.f1937h = dVar.O;
        e.b(this.f1931b, dVar.C);
        e.c(this.f1931b, dVar.E);
        e.f(this.f1931b, dVar.F);
        e.d(this.f1931b, dVar.G);
        e.e(this.f1931b, notification.sound, notification.audioAttributes);
        List listE = i9 < 28 ? e(f(dVar.f1890c), dVar.U) : dVar.U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                e.a(this.f1931b, (String) it2.next());
            }
        }
        this.f1938i = dVar.J;
        if (dVar.f1891d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i10 = 0; i10 < dVar.f1891d.size(); i10++) {
                bundle4.putBundle(Integer.toString(i10), l0.a(dVar.f1891d.get(i10)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1936g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && (obj = dVar.T) != null) {
            f.b(this.f1931b, obj);
        }
        if (i11 >= 24) {
            c.a(this.f1931b, dVar.D);
            g.e(this.f1931b, dVar.f1906s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                g.c(this.f1931b, remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                g.b(this.f1931b, remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                g.d(this.f1931b, remoteViews3);
            }
        }
        if (i11 >= 26) {
            h.b(this.f1931b, dVar.L);
            h.e(this.f1931b, dVar.f1905r);
            h.f(this.f1931b, dVar.M);
            h.g(this.f1931b, dVar.N);
            h.d(this.f1931b, dVar.O);
            if (dVar.B) {
                h.c(this.f1931b, dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.f1931b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator<p0> it3 = dVar.f1890c.iterator();
            while (it3.hasNext()) {
                i.a(this.f1931b, it3.next().h());
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            j.a(this.f1931b, dVar.Q);
            j.b(this.f1931b, p.c.a(null));
        }
        if (i12 >= 31 && (i8 = dVar.P) != 0) {
            k.b(this.f1931b, i8);
        }
        if (dVar.S) {
            if (this.f1932c.f1911x) {
                this.f1937h = 2;
            } else {
                this.f1937h = 1;
            }
            this.f1931b.setVibrate(null);
            this.f1931b.setSound(null);
            int i13 = notification.defaults & (-2) & (-3);
            notification.defaults = i13;
            this.f1931b.setDefaults(i13);
            if (i12 >= 26) {
                if (TextUtils.isEmpty(this.f1932c.f1910w)) {
                    d.g(this.f1931b, "silent");
                }
                h.d(this.f1931b, this.f1937h);
            }
        }
    }

    private void b(p.a aVar) {
        int i8 = Build.VERSION.SDK_INT;
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = i8 >= 23 ? f.a(iconCompatD != null ? iconCompatD.o() : null, aVar.h(), aVar.a()) : d.e(iconCompatD != null ? iconCompatD.h() : 0, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : q0.b(aVar.e())) {
                d.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 24) {
            g.a(builderA, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i9 >= 28) {
            i.b(builderA, aVar.f());
        }
        if (i9 >= 29) {
            j.c(builderA, aVar.j());
        }
        if (i9 >= 31) {
            k.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(builderA, bundle);
        d.a(this.f1931b, d.d(builderA));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        p.b bVar = new p.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<p0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<p0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.o
    public Notification.Builder a() {
        return this.f1931b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        p.e eVar = this.f1932c.f1903p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews remoteViewsE = eVar != null ? eVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null || (remoteViewsE = this.f1932c.H) != null) {
            notificationD.contentView = remoteViewsE;
        }
        if (eVar != null && (remoteViewsD = eVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (eVar != null && (remoteViewsF = this.f1932c.f1903p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (eVar != null && (bundleA = p.a(notificationD)) != null) {
            eVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            return a.a(this.f1931b);
        }
        if (i8 >= 24) {
            Notification notificationA = a.a(this.f1931b);
            if (this.f1937h != 0) {
                if (d.f(notificationA) != null && (notificationA.flags & 512) != 0 && this.f1937h == 2) {
                    g(notificationA);
                }
                if (d.f(notificationA) != null && (notificationA.flags & 512) == 0 && this.f1937h == 1) {
                    g(notificationA);
                }
            }
            return notificationA;
        }
        c.a(this.f1931b, this.f1936g);
        Notification notificationA2 = a.a(this.f1931b);
        RemoteViews remoteViews = this.f1933d;
        if (remoteViews != null) {
            notificationA2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f1934e;
        if (remoteViews2 != null) {
            notificationA2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f1938i;
        if (remoteViews3 != null) {
            notificationA2.headsUpContentView = remoteViews3;
        }
        if (this.f1937h != 0) {
            if (d.f(notificationA2) != null && (notificationA2.flags & 512) != 0 && this.f1937h == 2) {
                g(notificationA2);
            }
            if (d.f(notificationA2) != null && (notificationA2.flags & 512) == 0 && this.f1937h == 1) {
                g(notificationA2);
            }
        }
        return notificationA2;
    }
}
