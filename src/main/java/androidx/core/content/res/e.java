package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    static class a {
        static int a(TypedArray typedArray, int i8) {
            return typedArray.getType(i8);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f1967a;

        public c(d[] dVarArr) {
            this.f1967a = dVarArr;
        }

        public d[] a() {
            return this.f1967a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f1970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f1971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f1972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f1973f;

        public d(String str, int i8, boolean z7, String str2, int i9, int i10) {
            this.f1968a = str;
            this.f1969b = i8;
            this.f1970c = z7;
            this.f1971d = str2;
            this.f1972e = i9;
            this.f1973f = i10;
        }

        public String a() {
            return this.f1968a;
        }

        public int b() {
            return this.f1973f;
        }

        public int c() {
            return this.f1972e;
        }

        public String d() {
            return this.f1971d;
        }

        public int e() {
            return this.f1969b;
        }

        public boolean f() {
            return this.f1970c;
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    public static final class C0022e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.provider.e f1974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f1977d;

        public C0022e(androidx.core.provider.e eVar, int i8, int i9, String str) {
            this.f1974a = eVar;
            this.f1976c = i8;
            this.f1975b = i9;
            this.f1977d = str;
        }

        public int a() {
            return this.f1976c;
        }

        public androidx.core.provider.e b() {
            return this.f1974a;
        }

        public String c() {
            return this.f1977d;
        }

        public int d() {
            return this.f1975b;
        }
    }

    private static int a(TypedArray typedArray, int i8) {
        return a.a(typedArray, i8);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i8) {
        if (i8 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i8);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i9 = 0; i9 < typedArrayObtainTypedArray.length(); i9++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i9, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i8)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), w.c.f27023h);
        String string = typedArrayObtainAttributes.getString(w.c.f27024i);
        String string2 = typedArrayObtainAttributes.getString(w.c.f27028m);
        String string3 = typedArrayObtainAttributes.getString(w.c.f27029n);
        int resourceId = typedArrayObtainAttributes.getResourceId(w.c.f27025j, 0);
        int integer = typedArrayObtainAttributes.getInteger(w.c.f27026k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(w.c.f27027l, 500);
        String string4 = typedArrayObtainAttributes.getString(w.c.f27030o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0022e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), w.c.f27031p);
        int i8 = w.c.f27040y;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = w.c.f27033r;
        }
        int i9 = typedArrayObtainAttributes.getInt(i8, RCHTTPStatusCodes.BAD_REQUEST);
        int i10 = w.c.f27038w;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = w.c.f27034s;
        }
        boolean z7 = 1 == typedArrayObtainAttributes.getInt(i10, 0);
        int i11 = w.c.f27041z;
        if (!typedArrayObtainAttributes.hasValue(i11)) {
            i11 = w.c.f27035t;
        }
        int i12 = w.c.f27039x;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = w.c.f27036u;
        }
        String string = typedArrayObtainAttributes.getString(i12);
        int i13 = typedArrayObtainAttributes.getInt(i11, 0);
        int i14 = w.c.f27037v;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = w.c.f27032q;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i14, 0);
        String string2 = typedArrayObtainAttributes.getString(i14);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i9, z7, string, i13, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i8 = 1;
        while (i8 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i8++;
            } else if (next == 3) {
                i8--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
