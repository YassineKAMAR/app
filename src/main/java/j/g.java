package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.n0;
import androidx.core.view.u;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class<?>[] f23830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class<?>[] f23831f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f23832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f23833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f23834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f23835d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f23836c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f23837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f23838b;

        public a(Object obj, String str) {
            this.f23837a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f23838b = cls.getMethod(str, f23836c);
            } catch (Exception e8) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e8);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f23838b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f23838b.invoke(this.f23837a, menuItem)).booleanValue();
                }
                this.f23838b.invoke(this.f23837a, menuItem);
                return true;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f23839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f23844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f23845g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f23846h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f23847i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f23848j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f23849k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f23850l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f23851m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f23852n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f23853o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f23854p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f23855q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f23856r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f23857s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f23858t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f23859u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f23860v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f23861w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f23862x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f23863y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f23864z;

        public b(Menu menu) {
            this.f23839a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f23834c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e8) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z7 = false;
            menuItem.setChecked(this.f23857s).setVisible(this.f23858t).setEnabled(this.f23859u).setCheckable(this.f23856r >= 1).setTitleCondensed(this.f23850l).setIcon(this.f23851m);
            int i8 = this.f23860v;
            if (i8 >= 0) {
                menuItem.setShowAsAction(i8);
            }
            if (this.f23864z != null) {
                if (g.this.f23834c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f23864z));
            }
            if (this.f23856r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof k.c) {
                    ((k.c) menuItem).h(true);
                }
            }
            String str = this.f23862x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f23830e, g.this.f23832a));
                z7 = true;
            }
            int i9 = this.f23861w;
            if (i9 > 0) {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i9);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                u.a(menuItem, bVar);
            }
            u.c(menuItem, this.B);
            u.g(menuItem, this.C);
            u.b(menuItem, this.f23852n, this.f23853o);
            u.f(menuItem, this.f23854p, this.f23855q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                u.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                u.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f23846h = true;
            i(this.f23839a.add(this.f23840b, this.f23847i, this.f23848j, this.f23849k));
        }

        public SubMenu b() {
            this.f23846h = true;
            SubMenu subMenuAddSubMenu = this.f23839a.addSubMenu(this.f23840b, this.f23847i, this.f23848j, this.f23849k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f23846h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f23834c.obtainStyledAttributes(attributeSet, e.j.f21309r1);
            this.f23840b = typedArrayObtainStyledAttributes.getResourceId(e.j.f21319t1, 0);
            this.f23841c = typedArrayObtainStyledAttributes.getInt(e.j.f21329v1, 0);
            this.f23842d = typedArrayObtainStyledAttributes.getInt(e.j.f21334w1, 0);
            this.f23843e = typedArrayObtainStyledAttributes.getInt(e.j.f21339x1, 0);
            this.f23844f = typedArrayObtainStyledAttributes.getBoolean(e.j.f21324u1, true);
            this.f23845g = typedArrayObtainStyledAttributes.getBoolean(e.j.f21314s1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            l1 l1VarT = l1.t(g.this.f23834c, attributeSet, e.j.f21344y1);
            this.f23847i = l1VarT.m(e.j.B1, 0);
            this.f23848j = (l1VarT.j(e.j.E1, this.f23841c) & (-65536)) | (l1VarT.j(e.j.F1, this.f23842d) & 65535);
            this.f23849k = l1VarT.o(e.j.G1);
            this.f23850l = l1VarT.o(e.j.H1);
            this.f23851m = l1VarT.m(e.j.f21349z1, 0);
            this.f23852n = c(l1VarT.n(e.j.I1));
            this.f23853o = l1VarT.j(e.j.P1, 4096);
            this.f23854p = c(l1VarT.n(e.j.J1));
            this.f23855q = l1VarT.j(e.j.T1, 4096);
            int i8 = e.j.K1;
            this.f23856r = l1VarT.r(i8) ? l1VarT.a(i8, false) : this.f23843e;
            this.f23857s = l1VarT.a(e.j.C1, false);
            this.f23858t = l1VarT.a(e.j.D1, this.f23844f);
            this.f23859u = l1VarT.a(e.j.A1, this.f23845g);
            this.f23860v = l1VarT.j(e.j.U1, -1);
            this.f23864z = l1VarT.n(e.j.L1);
            this.f23861w = l1VarT.m(e.j.M1, 0);
            this.f23862x = l1VarT.n(e.j.O1);
            String strN = l1VarT.n(e.j.N1);
            this.f23863y = strN;
            boolean z7 = strN != null;
            if (z7 && this.f23861w == 0 && this.f23862x == null) {
                this.A = (androidx.core.view.b) e(strN, g.f23831f, g.this.f23833b);
            } else {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = l1VarT.o(e.j.Q1);
            this.C = l1VarT.o(e.j.V1);
            int i9 = e.j.S1;
            if (l1VarT.r(i9)) {
                this.E = n0.d(l1VarT.j(i9, -1), this.E);
            } else {
                this.E = null;
            }
            int i10 = e.j.R1;
            if (l1VarT.r(i10)) {
                this.D = l1VarT.c(i10);
            } else {
                this.D = null;
            }
            l1VarT.v();
            this.f23846h = false;
        }

        public void h() {
            this.f23840b = 0;
            this.f23841c = 0;
            this.f23842d = 0;
            this.f23843e = 0;
            this.f23844f = true;
            this.f23845g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f23830e = clsArr;
        f23831f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f23834c = context;
        Object[] objArr = {context};
        this.f23832a = objArr;
        this.f23833b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z8 && name2.equals(str)) {
                        str = null;
                        z8 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z7 = true;
                    }
                }
            } else if (!z8) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z8 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f23835d == null) {
            this.f23835d = a(this.f23834c);
        }
        return this.f23835d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i8, Menu menu) {
        if (!(menu instanceof x.a)) {
            super.inflate(i8, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f23834c.getResources().getLayout(i8);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e8) {
                    throw new InflateException("Error inflating menu XML", e8);
                }
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
