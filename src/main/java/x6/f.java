package x6;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
class f extends e {
    public static final d d(char c8, boolean z7) {
        if (!z7) {
            if (c8 == 'D') {
                return d.f27337h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c8);
        }
        if (c8 == 'H') {
            return d.f27336g;
        }
        if (c8 == 'M') {
            return d.f27335f;
        }
        if (c8 == 'S') {
            return d.f27334e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c8);
    }

    public static final d e(String shortName) {
        q.f(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return d.f27332c;
                                }
                            } else if (shortName.equals("ns")) {
                                return d.f27331b;
                            }
                        } else if (shortName.equals("ms")) {
                            return d.f27333d;
                        }
                    } else if (shortName.equals("s")) {
                        return d.f27334e;
                    }
                } else if (shortName.equals("m")) {
                    return d.f27335f;
                }
            } else if (shortName.equals("h")) {
                return d.f27336g;
            }
        } else if (shortName.equals("d")) {
            return d.f27337h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
