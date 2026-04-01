package j2;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List f24045b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f24044a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f24046c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        Object obj = f24046c;
        synchronized (obj) {
            Map map = f24044a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    if (f24045b == null) {
                        f24045b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f24045b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap map2 = new HashMap();
                            map2.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            map2.put("profileLevels", arrayList2);
                            int i8 = Build.VERSION.SDK_INT;
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            map2.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                            map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            map2.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                            map2.put("widths", b(videoCapabilities.getSupportedWidths()));
                            map2.put("heights", b(videoCapabilities.getSupportedHeights()));
                            if (i8 >= 23) {
                                map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(map2);
                        }
                    }
                    f24044a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e8) {
                HashMap map3 = new HashMap();
                map3.put("error", e8.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                f24044a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    private static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
