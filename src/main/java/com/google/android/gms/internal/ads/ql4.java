package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class ql4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f13562a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap f13563b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13564c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13565d = 0;

    public static int a() {
        int i8;
        int iMax = f13564c;
        if (iMax == -1) {
            rk4 rk4VarC = c("video/avc", false, false);
            if (rk4VarC != null) {
                int iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : rk4VarC.h()) {
                    int i9 = codecProfileLevel.level;
                    if (i9 != 1 && i9 != 2) {
                        switch (i9) {
                            case 8:
                            case com.amazon.c.a.a.c.f4052g /* 16 */:
                            case com.amazon.c.a.a.c.f4053h /* 32 */:
                                i8 = 101376;
                                break;
                            case 64:
                                i8 = 202752;
                                break;
                            case 128:
                            case 256:
                                i8 = 414720;
                                break;
                            case 512:
                                i8 = 921600;
                                break;
                            case 1024:
                                i8 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i8 = 2097152;
                                break;
                            case 8192:
                                i8 = 2228224;
                                break;
                            case 16384:
                                i8 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i8 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i8 = 35651584;
                                break;
                            default:
                                i8 = -1;
                                break;
                        }
                    } else {
                        i8 = 25344;
                    }
                    iMax2 = Math.max(i8, iMax2);
                }
                iMax = Math.max(iMax2, nz2.f12300a >= 21 ? 345600 : 172800);
            } else {
                iMax = 0;
            }
            f13564c = iMax;
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a5 A[Catch: NumberFormatException -> 0x023a, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x023a, blocks: (B:149:0x024a, B:151:0x025c, B:162:0x0278, B:178:0x02a5), top: B:499:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(com.google.android.gms.internal.ads.nb r17) {
        /*
            Method dump skipped, instruction units count: 2336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ql4.b(com.google.android.gms.internal.ads.nb):android.util.Pair");
    }

    public static rk4 c(String str, boolean z7, boolean z8) {
        List listG = g(str, false, false);
        if (listG.isEmpty()) {
            return null;
        }
        return (rk4) listG.get(0);
    }

    public static rk4 d() {
        return c("audio/raw", false, false);
    }

    public static String e(nb nbVar) {
        Pair pairB;
        if ("audio/eac3-joc".equals(nbVar.f11793l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(nbVar.f11793l) || (pairB = b(nbVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List f(zk4 zk4Var, nb nbVar, boolean z7, boolean z8) {
        String strE = e(nbVar);
        return strE == null ? jb3.z() : g(strE, z7, z8);
    }

    public static synchronized List g(String str, boolean z7, boolean z8) {
        el4 el4Var = new el4(str, z7, z8);
        HashMap map = f13563b;
        List list = (List) map.get(el4Var);
        if (list != null) {
            return list;
        }
        int i8 = nz2.f12300a;
        ArrayList arrayListJ = j(el4Var, i8 >= 21 ? new kl4(z7, z8) : new jl4(null));
        if (z7 && arrayListJ.isEmpty() && i8 >= 21 && i8 <= 23) {
            arrayListJ = j(el4Var, new jl4(null));
            if (!arrayListJ.isEmpty()) {
                pf2.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((rk4) arrayListJ.get(0)).f14176a);
            }
        }
        if ("audio/raw".equals(str)) {
            if (i8 < 26 && nz2.f12301b.equals("R9") && arrayListJ.size() == 1 && ((rk4) arrayListJ.get(0)).f14176a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListJ.add(rk4.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            k(arrayListJ, new ll4() { // from class: com.google.android.gms.internal.ads.bl4
                @Override // com.google.android.gms.internal.ads.ll4
                public final int a(Object obj) {
                    int i9 = ql4.f13565d;
                    String str2 = ((rk4) obj).f14176a;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (nz2.f12300a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (i8 < 21 && arrayListJ.size() > 1) {
            String str2 = ((rk4) arrayListJ.get(0)).f14176a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                k(arrayListJ, new ll4() { // from class: com.google.android.gms.internal.ads.cl4
                    @Override // com.google.android.gms.internal.ads.ll4
                    public final int a(Object obj) {
                        int i9 = ql4.f13565d;
                        return ((rk4) obj).f14176a.startsWith("OMX.google") ? 1 : 0;
                    }
                });
            }
        }
        if (i8 < 32 && arrayListJ.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((rk4) arrayListJ.get(0)).f14176a)) {
            arrayListJ.add((rk4) arrayListJ.remove(0));
        }
        jb3 jb3VarX = jb3.x(arrayListJ);
        map.put(el4Var, jb3VarX);
        return jb3VarX;
    }

    public static List h(zk4 zk4Var, nb nbVar, boolean z7, boolean z8) {
        List listG = g(nbVar.f11793l, z7, z8);
        List listF = f(zk4Var, nbVar, z7, z8);
        gb3 gb3Var = new gb3();
        gb3Var.i(listG);
        gb3Var.i(listF);
        return gb3Var.j();
    }

    public static List i(List list, final nb nbVar) {
        ArrayList arrayList = new ArrayList(list);
        k(arrayList, new ll4() { // from class: com.google.android.gms.internal.ads.dl4
            @Override // com.google.android.gms.internal.ads.ll4
            public final int a(Object obj) {
                int i8 = ql4.f13565d;
                return ((rk4) obj).d(nbVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e7 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0201 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b0 A[Catch: Exception -> 0x02ff, TRY_ENTER, TryCatch #0 {Exception -> 0x02ff, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0034, B:14:0x0042, B:18:0x004c, B:20:0x0054, B:22:0x005c, B:24:0x0064, B:26:0x006c, B:28:0x0074, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bc, B:48:0x00c4, B:50:0x00cc, B:52:0x00d4, B:56:0x00e2, B:58:0x00ea, B:60:0x00f2, B:62:0x00fc, B:64:0x0104, B:66:0x010a, B:68:0x0112, B:71:0x011c, B:73:0x0124, B:77:0x0130, B:79:0x0138, B:81:0x0140, B:83:0x0148, B:172:0x02a8, B:175:0x02b0, B:177:0x02b6, B:178:0x02d0, B:179:0x02f3, B:86:0x0151, B:87:0x0154, B:89:0x015c, B:92:0x0167, B:94:0x016f, B:97:0x017a, B:99:0x0182, B:102:0x018d, B:104:0x0195, B:107:0x01a0, B:109:0x01a8), top: B:185:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList j(com.google.android.gms.internal.ads.el4 r27, com.google.android.gms.internal.ads.hl4 r28) throws com.google.android.gms.internal.ads.gl4 {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ql4.j(com.google.android.gms.internal.ads.el4, com.google.android.gms.internal.ads.hl4):java.util.ArrayList");
    }

    private static void k(List list, final ll4 ll4Var) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.al4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i8 = ql4.f13565d;
                ll4 ll4Var2 = ll4Var;
                return ll4Var2.a(obj2) - ll4Var2.a(obj);
            }
        });
    }

    private static boolean l(MediaCodecInfo mediaCodecInfo, String str) {
        if (nz2.f12300a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (xg0.f(str)) {
            return true;
        }
        String strA = r73.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        if (strA.startsWith("omx.google.") || strA.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strA.startsWith("omx.sec.") && strA.contains(".sw.")) || strA.equals("omx.qcom.video.decoder.hevcswvdec") || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
            return true;
        }
        return (strA.startsWith("omx.") || strA.startsWith("c2.")) ? false : true;
    }
}
