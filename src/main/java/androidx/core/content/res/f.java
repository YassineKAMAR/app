package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class f {

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f1978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f1979b;

        a(int i8, int i9) {
            this.f1978a = new int[]{i8, i9};
            this.f1979b = new float[]{0.0f, 1.0f};
        }

        a(int i8, int i9, int i10) {
            this.f1978a = new int[]{i8, i9, i10};
            this.f1979b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f1978a = new int[size];
            this.f1979b = new float[size];
            for (int i8 = 0; i8 < size; i8++) {
                this.f1978a[i8] = list.get(i8).intValue();
                this.f1979b[i8] = list2.get(i8).floatValue();
            }
        }
    }

    private static a a(a aVar, int i8, int i9, boolean z7, int i10) {
        return aVar != null ? aVar : z7 ? new a(i8, i10, i9) : new a(i8, i9);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayK = n.k(resources, theme, attributeSet, w.c.A);
        float f8 = n.f(typedArrayK, xmlPullParser, "startX", w.c.J, 0.0f);
        float f9 = n.f(typedArrayK, xmlPullParser, "startY", w.c.K, 0.0f);
        float f10 = n.f(typedArrayK, xmlPullParser, "endX", w.c.L, 0.0f);
        float f11 = n.f(typedArrayK, xmlPullParser, "endY", w.c.M, 0.0f);
        float f12 = n.f(typedArrayK, xmlPullParser, "centerX", w.c.E, 0.0f);
        float f13 = n.f(typedArrayK, xmlPullParser, "centerY", w.c.F, 0.0f);
        int iG = n.g(typedArrayK, xmlPullParser, "type", w.c.D, 0);
        int iB = n.b(typedArrayK, xmlPullParser, "startColor", w.c.B, 0);
        boolean zJ = n.j(xmlPullParser, "centerColor");
        int iB2 = n.b(typedArrayK, xmlPullParser, "centerColor", w.c.I, 0);
        int iB3 = n.b(typedArrayK, xmlPullParser, "endColor", w.c.C, 0);
        int iG2 = n.g(typedArrayK, xmlPullParser, "tileMode", w.c.H, 0);
        float f14 = n.f(typedArrayK, xmlPullParser, "gradientRadius", w.c.G, 0.0f);
        typedArrayK.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zJ, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f8, f9, f10, f11, aVarA.f1978a, aVarA.f1979b, d(iG2)) : new SweepGradient(f12, f13, aVarA.f1978a, aVarA.f1979b);
        }
        if (f14 > 0.0f) {
            return new RadialGradient(f12, f13, f14, aVarA.f1978a, aVarA.f1979b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new androidx.core.content.res.f.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = w.c.N
            android.content.res.TypedArray r3 = androidx.core.content.res.n.k(r9, r12, r11, r3)
            int r5 = w.c.O
            boolean r6 = r3.hasValue(r5)
            int r7 = w.c.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i8) {
        return i8 != 1 ? i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
