package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements x.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f540e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f551p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f559x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f561z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f547l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f552q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f553r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f554s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f555t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f556u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<g> f557v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f558w = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f560y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<g> f541f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<g> f542g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f543h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<g> f544i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<g> f545j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f546k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f536a = context;
        this.f537b = context.getResources();
        b0(true);
    }

    private static int B(int i8) {
        int i9 = ((-65536) & i8) >> 16;
        if (i9 >= 0) {
            int[] iArr = A;
            if (i9 < iArr.length) {
                return (i8 & 65535) | (iArr[i9] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i8, boolean z7) {
        if (i8 < 0 || i8 >= this.f541f.size()) {
            return;
        }
        this.f541f.remove(i8);
        if (z7) {
            K(true);
        }
    }

    private void W(int i8, CharSequence charSequence, int i9, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f551p = view;
            this.f549n = null;
            this.f550o = null;
        } else {
            if (i8 > 0) {
                this.f549n = resourcesC.getText(i8);
            } else if (charSequence != null) {
                this.f549n = charSequence;
            }
            if (i9 > 0) {
                this.f550o = androidx.core.content.a.e(u(), i9);
            } else if (drawable != null) {
                this.f550o = drawable;
            }
            this.f551p = null;
        }
        K(false);
    }

    private void b0(boolean z7) {
        this.f539d = z7 && this.f537b.getConfiguration().keyboard != 1 && b1.b(ViewConfiguration.get(this.f536a), this.f536a);
    }

    private g g(int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        return new g(this, i8, i9, i10, i11, charSequence, i12);
    }

    private void i(boolean z7) {
        if (this.f558w.isEmpty()) {
            return;
        }
        d0();
        for (WeakReference<j> weakReference : this.f558w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f558w.remove(weakReference);
            } else {
                jVar.d(z7);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f558w.isEmpty()) {
            return false;
        }
        boolean zK = jVar != null ? jVar.k(mVar) : false;
        for (WeakReference<j> weakReference : this.f558w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null) {
                this.f558w.remove(weakReference);
            } else if (!zK) {
                zK = jVar2.k(mVar);
            }
        }
        return zK;
    }

    private static int n(ArrayList<g> arrayList, int i8) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i8) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f555t;
    }

    Resources C() {
        return this.f537b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (!this.f543h) {
            return this.f542g;
        }
        this.f542g.clear();
        int size = this.f541f.size();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = this.f541f.get(i8);
            if (gVar.isVisible()) {
                this.f542g.add(gVar);
            }
        }
        this.f543h = false;
        this.f546k = true;
        return this.f542g;
    }

    public boolean F() {
        return this.f560y;
    }

    boolean G() {
        return this.f538c;
    }

    public boolean H() {
        return this.f539d;
    }

    void I(g gVar) {
        this.f546k = true;
        K(true);
    }

    void J(g gVar) {
        this.f543h = true;
        K(true);
    }

    public void K(boolean z7) {
        if (this.f552q) {
            this.f553r = true;
            if (z7) {
                this.f554s = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f543h = true;
            this.f546k = true;
        }
        i(z7);
    }

    public boolean L(MenuItem menuItem, int i8) {
        return M(menuItem, null, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[PHI: r1
  0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.k()
            androidx.core.view.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.m r7 = (androidx.appcompat.view.menu.m) r7
            if (r4 == 0) goto L63
            r2.f(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.M(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public void O(j jVar) {
        for (WeakReference<j> weakReference : this.f558w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f558w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i9 = bundle.getInt("android:menu:expandedactionview");
        if (i9 <= 0 || (menuItemFindItem = findItem(i9)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f540e = aVar;
    }

    public e S(int i8) {
        this.f547l = i8;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f541f.size();
        d0();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = this.f541f.get(i8);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    protected e U(int i8) {
        W(0, null, i8, null, null);
        return this;
    }

    protected e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected e X(int i8) {
        W(i8, null, 0, null, null);
        return this;
    }

    protected e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i8, int i9, int i10, CharSequence charSequence) {
        int iB = B(i10);
        g gVarG = g(i8, i9, i10, iB, charSequence, this.f547l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f548m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f541f;
        arrayList.add(n(arrayList, iB), gVarG);
        K(true);
        return gVarG;
    }

    public void a0(boolean z7) {
        this.f561z = z7;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8) {
        return a(0, 0, 0, this.f537b.getString(i8));
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, int i11) {
        return a(i8, i9, i10, this.f537b.getString(i11));
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return a(i8, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i8, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        PackageManager packageManager = this.f536a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i11 & 1) == 0) {
            removeGroup(i8);
        }
        for (int i13 = 0; i13 < size; i13++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i14 < 0 ? intent : intentArr[i14]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i8, i9, i10, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8) {
        return addSubMenu(0, 0, 0, this.f537b.getString(i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return addSubMenu(i8, i9, i10, this.f537b.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        g gVar = (g) a(i8, i9, i10, charSequence);
        m mVar = new m(this.f536a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f536a);
    }

    public void c(j jVar, Context context) {
        this.f558w.add(new WeakReference<>(jVar));
        jVar.i(context, this);
        this.f546k = true;
    }

    public void c0() {
        this.f552q = false;
        if (this.f553r) {
            this.f553r = false;
            K(this.f554s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f559x;
        if (gVar != null) {
            f(gVar);
        }
        this.f541f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f550o = null;
        this.f549n = null;
        this.f551p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f540e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f552q) {
            return;
        }
        this.f552q = true;
        this.f553r = false;
        this.f554s = false;
    }

    public final void e(boolean z7) {
        if (this.f556u) {
            return;
        }
        this.f556u = true;
        for (WeakReference<j> weakReference : this.f558w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f558w.remove(weakReference);
            } else {
                jVar.c(this, z7);
            }
        }
        this.f556u = false;
    }

    public boolean f(g gVar) {
        boolean zF = false;
        if (!this.f558w.isEmpty() && this.f559x == gVar) {
            d0();
            for (WeakReference<j> weakReference : this.f558w) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zF = jVar.f(this, gVar);
                    if (zF) {
                        break;
                    }
                } else {
                    this.f558w.remove(weakReference);
                }
            }
            c0();
            if (zF) {
                this.f559x = null;
            }
        }
        return zF;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i8) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = this.f541f.get(i9);
            if (gVar.getItemId() == i8) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i8)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i8) {
        return this.f541f.get(i8);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f540e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f561z) {
            return true;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f541f.get(i8).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return p(i8, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean zG = false;
        if (this.f558w.isEmpty()) {
            return false;
        }
        d0();
        for (WeakReference<j> weakReference : this.f558w) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zG = jVar.g(this, gVar);
                if (zG) {
                    break;
                }
            } else {
                this.f558w.remove(weakReference);
            }
        }
        c0();
        if (zG) {
            this.f559x = gVar;
        }
        return zG;
    }

    public int l(int i8) {
        return m(i8, 0);
    }

    public int m(int i8, int i9) {
        int size = size();
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < size) {
            if (this.f541f.get(i9).getGroupId() == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public int o(int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.f541f.get(i9).getItemId() == i8) {
                return i9;
            }
        }
        return -1;
    }

    g p(int i8, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f557v;
        arrayList.clear();
        q(arrayList, i8, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zG = G();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = arrayList.get(i9);
            char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i8 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i8, int i9) {
        return L(findItem(i8), i9);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        g gVarP = p(i8, keyEvent);
        boolean zL = gVarP != null ? L(gVarP, i9) : false;
        if ((i9 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(List<g> list, int i8, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i8 == 67) {
            int size = this.f541f.size();
            for (int i9 = 0; i9 < size; i9++) {
                g gVar = this.f541f.get(i9);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i8, keyEvent);
                }
                char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zG ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i8 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> arrayListE = E();
        if (this.f546k) {
            boolean zE = false;
            for (WeakReference<j> weakReference : this.f558w) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    this.f558w.remove(weakReference);
                } else {
                    zE |= jVar.e();
                }
            }
            if (zE) {
                this.f544i.clear();
                this.f545j.clear();
                int size = arrayListE.size();
                for (int i8 = 0; i8 < size; i8++) {
                    g gVar = arrayListE.get(i8);
                    (gVar.l() ? this.f544i : this.f545j).add(gVar);
                }
            } else {
                this.f544i.clear();
                this.f545j.clear();
                this.f545j.addAll(E());
            }
            this.f546k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i8) {
        int iL = l(i8);
        if (iL >= 0) {
            int size = this.f541f.size() - iL;
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (i9 >= size || this.f541f.get(iL).getGroupId() != i8) {
                    break;
                }
                N(iL, false);
                i9 = i10;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i8) {
        N(o(i8), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f544i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i8, boolean z7, boolean z8) {
        int size = this.f541f.size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = this.f541f.get(i9);
            if (gVar.getGroupId() == i8) {
                gVar.t(z8);
                gVar.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f560y = z7;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i8, boolean z7) {
        int size = this.f541f.size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = this.f541f.get(i9);
            if (gVar.getGroupId() == i8) {
                gVar.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i8, boolean z7) {
        int size = this.f541f.size();
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = this.f541f.get(i9);
            if (gVar.getGroupId() == i8 && gVar.y(z7)) {
                z8 = true;
            }
        }
        if (z8) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f538c = z7;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f541f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f536a;
    }

    public g v() {
        return this.f559x;
    }

    public Drawable w() {
        return this.f550o;
    }

    public CharSequence x() {
        return this.f549n;
    }

    public View y() {
        return this.f551p;
    }

    public ArrayList<g> z() {
        r();
        return this.f545j;
    }
}
