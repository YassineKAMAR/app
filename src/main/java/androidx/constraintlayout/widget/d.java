package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f1474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f1475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1476c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1477d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray<a> f1478e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray<e> f1479f = new SparseArray<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f1481b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f1483d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f1482c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.U6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == k.V6) {
                    this.f1480a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1480a);
                } else if (index == k.W6) {
                    this.f1482c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1482c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1482c);
                    context.getResources().getResourceName(this.f1482c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1483d = eVar;
                        eVar.e(context, this.f1482c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f1481b.add(bVar);
        }

        public int b(float f8, float f9) {
            for (int i8 = 0; i8 < this.f1481b.size(); i8++) {
                if (this.f1481b.get(i8).a(f8, f9)) {
                    return i8;
                }
            }
            return -1;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f1484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f1485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f1486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f1487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e f1489f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1484a = Float.NaN;
            this.f1485b = Float.NaN;
            this.f1486c = Float.NaN;
            this.f1487d = Float.NaN;
            this.f1488e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f1775s7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == k.t7) {
                    this.f1488e = typedArrayObtainStyledAttributes.getResourceId(index, this.f1488e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1488e);
                    context.getResources().getResourceName(this.f1488e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1489f = eVar;
                        eVar.e(context, this.f1488e);
                    }
                } else if (index == k.u7) {
                    this.f1487d = typedArrayObtainStyledAttributes.getDimension(index, this.f1487d);
                } else if (index == k.v7) {
                    this.f1485b = typedArrayObtainStyledAttributes.getDimension(index, this.f1485b);
                } else if (index == k.w7) {
                    this.f1486c = typedArrayObtainStyledAttributes.getDimension(index, this.f1486c);
                } else if (index == k.x7) {
                    this.f1484a = typedArrayObtainStyledAttributes.getDimension(index, this.f1484a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f8, float f9) {
            if (!Float.isNaN(this.f1484a) && f8 < this.f1484a) {
                return false;
            }
            if (!Float.isNaN(this.f1485b) && f9 < this.f1485b) {
                return false;
            }
            if (Float.isNaN(this.f1486c) || f8 <= this.f1486c) {
                return Float.isNaN(this.f1487d) || f9 <= this.f1487d;
            }
            return false;
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i8) {
        this.f1474a = constraintLayout;
        a(context, i8);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        Ld:
            r2 = 1
            if (r1 == r2) goto L8c
            if (r1 == 0) goto L7b
            r3 = 2
            if (r1 == r3) goto L17
            goto L7e
        L17:
            java.lang.String r1 = r10.getName()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r4 = -1
            int r5 = r1.hashCode()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L4d;
                case 80204913: goto L43;
                case 1382829617: goto L3a;
                case 1657696882: goto L30;
                case 1901439077: goto L26;
                default: goto L25;
            }     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        L25:
            goto L57
        L26:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = 3
            goto L58
        L30:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = 0
            goto L58
        L3a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            goto L58
        L43:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = 2
            goto L58
        L4d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L57
            r2 = 4
            goto L58
        L57:
            r2 = -1
        L58:
            if (r2 == r3) goto L6e
            if (r2 == r7) goto L63
            if (r2 == r6) goto L5f
            goto L7e
        L5f:
            r8.b(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L63:
            androidx.constraintlayout.widget.d$b r1 = new androidx.constraintlayout.widget.d$b     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            if (r0 == 0) goto L7e
            r0.a(r1)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L6e:
            androidx.constraintlayout.widget.d$a r0 = new androidx.constraintlayout.widget.d$a     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            android.util.SparseArray<androidx.constraintlayout.widget.d$a> r1 = r8.f1478e     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            int r2 = r0.f1480a     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            r1.put(r2, r0)     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7e
        L7b:
            r10.getName()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
        L7e:
            int r1 = r10.next()     // Catch: java.io.IOException -> L83 org.xmlpull.v1.XmlPullParserException -> L88
            goto Ld
        L83:
            r9 = move-exception
            r9.printStackTrace()
            goto L8c
        L88:
            r9 = move-exception
            r9.printStackTrace()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            String attributeName = xmlPullParser.getAttributeName(i8);
            String attributeValue = xmlPullParser.getAttributeValue(i8);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.k(context, xmlPullParser);
                this.f1479f.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(g gVar) {
    }

    public void d(int i8, float f8, float f9) {
        int iB;
        int i9 = this.f1476c;
        if (i9 == i8) {
            a aVarValueAt = i8 == -1 ? this.f1478e.valueAt(0) : this.f1478e.get(i9);
            int i10 = this.f1477d;
            if ((i10 == -1 || !aVarValueAt.f1481b.get(i10).a(f8, f9)) && this.f1477d != (iB = aVarValueAt.b(f8, f9))) {
                e eVar = iB == -1 ? this.f1475b : aVarValueAt.f1481b.get(iB).f1489f;
                if (iB != -1) {
                    int i11 = aVarValueAt.f1481b.get(iB).f1488e;
                }
                if (eVar == null) {
                    return;
                }
                this.f1477d = iB;
                eVar.c(this.f1474a);
                return;
            }
            return;
        }
        this.f1476c = i8;
        a aVar = this.f1478e.get(i8);
        int iB2 = aVar.b(f8, f9);
        e eVar2 = iB2 == -1 ? aVar.f1483d : aVar.f1481b.get(iB2).f1489f;
        if (iB2 != -1) {
            int i12 = aVar.f1481b.get(iB2).f1488e;
        }
        if (eVar2 != null) {
            this.f1477d = iB2;
            eVar2.c(this.f1474a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i8 + ", dim =" + f8 + ", " + f9);
    }
}
