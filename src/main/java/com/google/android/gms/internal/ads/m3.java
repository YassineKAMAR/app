package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f11139a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f11140b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f11141c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.i3 a(java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m3.a(java.lang.String):com.google.android.gms.internal.ads.i3");
    }

    private static jb3 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        gb3 gb3Var = new gb3();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (o03.c(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strA = o03.a(xmlPullParser, strConcat2);
                String strA2 = o03.a(xmlPullParser, strConcat3);
                String strA3 = o03.a(xmlPullParser, strConcat4);
                String strA4 = o03.a(xmlPullParser, strConcat5);
                if (strA == null || strA2 == null) {
                    return jb3.z();
                }
                gb3Var.g(new h3(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!o03.b(xmlPullParser, str.concat(":Directory")));
        return gb3Var.j();
    }
}
