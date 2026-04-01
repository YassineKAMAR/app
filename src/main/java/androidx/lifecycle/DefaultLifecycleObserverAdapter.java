package androidx.lifecycle;

import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultLifecycleObserver f2611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f2612b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2613a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f2613a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, g gVar) {
        kotlin.jvm.internal.q.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2611a = defaultLifecycleObserver;
        this.f2612b = gVar;
    }

    @Override // androidx.lifecycle.g
    public void a(i source, d.a event) {
        kotlin.jvm.internal.q.f(source, "source");
        kotlin.jvm.internal.q.f(event, "event");
        switch (a.f2613a[event.ordinal()]) {
            case 1:
                this.f2611a.onCreate(source);
                break;
            case 2:
                this.f2611a.onStart(source);
                break;
            case 3:
                this.f2611a.onResume(source);
                break;
            case 4:
                this.f2611a.onPause(source);
                break;
            case 5:
                this.f2611a.onStop(source);
                break;
            case 6:
                this.f2611a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f2612b;
        if (gVar != null) {
            gVar.a(source, event);
        }
    }
}
