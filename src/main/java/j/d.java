package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f23813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f23814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f23815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f23816e;

    public d() {
        super(null);
    }

    public d(Context context, int i8) {
        super(context);
        this.f23812a = i8;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f23813b = theme;
    }

    private Resources b() {
        if (this.f23816e == null) {
            Configuration configuration = this.f23815d;
            this.f23816e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f23816e;
    }

    private void d() {
        boolean z7 = this.f23813b == null;
        if (z7) {
            this.f23813b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f23813b.setTo(theme);
            }
        }
        e(this.f23813b, this.f23812a, z7);
    }

    public void a(Configuration configuration) {
        if (this.f23816e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f23815d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f23815d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f23812a;
    }

    protected void e(Resources.Theme theme, int i8, boolean z7) {
        theme.applyStyle(i8, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f23814c == null) {
            this.f23814c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f23814c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f23813b;
        if (theme != null) {
            return theme;
        }
        if (this.f23812a == 0) {
            this.f23812a = e.i.f21221d;
        }
        d();
        return this.f23813b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        if (this.f23812a != i8) {
            this.f23812a = i8;
            d();
        }
    }
}
