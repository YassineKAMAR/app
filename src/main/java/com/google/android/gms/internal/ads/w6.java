package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String[] f16646a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static tc0 a(dq2 dq2Var) {
        String str;
        String str2;
        int iL = dq2Var.l() + dq2Var.o();
        int iO = dq2Var.o();
        int i8 = (iO >> 24) & 255;
        tc0 h4Var = null;
        try {
            if (i8 == 169 || i8 == 253) {
                int i9 = iO & 16777215;
                if (i9 == 6516084) {
                    int iO2 = dq2Var.o();
                    if (dq2Var.o() == 1684108385) {
                        dq2Var.h(8);
                        String strG = dq2Var.G(iO2 - 16);
                        h4Var = new h4("und", strG, strG);
                    } else {
                        pf2.f("MetadataUtil", "Failed to parse comment attribute: ".concat(g6.b(iO)));
                    }
                    return h4Var;
                }
                if (i9 == 7233901 || i9 == 7631467) {
                    return e(iO, "TIT2", dq2Var);
                }
                if (i9 == 6516589 || i9 == 7828084) {
                    return e(iO, "TCOM", dq2Var);
                }
                if (i9 == 6578553) {
                    return e(iO, "TDRC", dq2Var);
                }
                if (i9 == 4280916) {
                    return e(iO, "TPE1", dq2Var);
                }
                if (i9 == 7630703) {
                    return e(iO, "TSSE", dq2Var);
                }
                if (i9 == 6384738) {
                    return e(iO, "TALB", dq2Var);
                }
                if (i9 == 7108978) {
                    return e(iO, "USLT", dq2Var);
                }
                if (i9 == 6776174) {
                    return e(iO, "TCON", dq2Var);
                }
                if (i9 == 6779504) {
                    return e(iO, "TIT1", dq2Var);
                }
            } else {
                if (iO == 1735291493) {
                    int iB = b(dq2Var);
                    String str3 = (iB <= 0 || iB > 192) ? null : f16646a[iB - 1];
                    if (str3 != null) {
                        h4Var = new w4("TCON", null, jb3.A(str3));
                    } else {
                        pf2.f("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return h4Var;
                }
                if (iO == 1684632427) {
                    return d(1684632427, "TPOS", dq2Var);
                }
                if (iO == 1953655662) {
                    return d(1953655662, "TRCK", dq2Var);
                }
                if (iO == 1953329263) {
                    return c(1953329263, "TBPM", dq2Var, true, false);
                }
                if (iO == 1668311404) {
                    return c(1668311404, "TCMP", dq2Var, true, true);
                }
                if (iO == 1668249202) {
                    int iO3 = dq2Var.o();
                    if (dq2Var.o() == 1684108385) {
                        int iO4 = dq2Var.o() & 16777215;
                        if (iO4 == 13) {
                            str2 = "image/jpeg";
                        } else if (iO4 == 14) {
                            str2 = "image/png";
                            iO4 = 14;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            dq2Var.h(4);
                            int i10 = iO3 - 16;
                            byte[] bArr = new byte[i10];
                            dq2Var.c(bArr, 0, i10);
                            h4Var = new y3(str2, null, 3, bArr);
                            return h4Var;
                        }
                        str = "Unrecognized cover art flags: " + iO4;
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    pf2.f("MetadataUtil", str);
                    return h4Var;
                }
                if (iO == 1631670868) {
                    return e(1631670868, "TPE2", dq2Var);
                }
                if (iO == 1936682605) {
                    return e(1936682605, "TSOT", dq2Var);
                }
                if (iO == 1936679276) {
                    return e(1936679276, "TSO2", dq2Var);
                }
                if (iO == 1936679282) {
                    return e(1936679282, "TSOA", dq2Var);
                }
                if (iO == 1936679265) {
                    return e(1936679265, "TSOP", dq2Var);
                }
                if (iO == 1936679791) {
                    return e(1936679791, "TSOC", dq2Var);
                }
                if (iO == 1920233063) {
                    return c(1920233063, "ITUNESADVISORY", dq2Var, false, false);
                }
                if (iO == 1885823344) {
                    return c(1885823344, "ITUNESGAPLESS", dq2Var, false, true);
                }
                if (iO == 1936683886) {
                    return e(1936683886, "TVSHOWSORT", dq2Var);
                }
                if (iO == 1953919848) {
                    return e(1953919848, "TVSHOW", dq2Var);
                }
                if (iO == 757935405) {
                    String strG2 = null;
                    String strG3 = null;
                    int i11 = -1;
                    int i12 = -1;
                    while (dq2Var.l() < iL) {
                        int iL2 = dq2Var.l();
                        int iO5 = dq2Var.o();
                        int iO6 = dq2Var.o();
                        dq2Var.h(4);
                        if (iO6 == 1835360622) {
                            strG2 = dq2Var.G(iO5 - 12);
                        } else {
                            int i13 = iO5 - 12;
                            if (iO6 == 1851878757) {
                                strG3 = dq2Var.G(i13);
                            } else {
                                if (iO6 == 1684108385) {
                                    i12 = iO5;
                                }
                                if (iO6 == 1684108385) {
                                    i11 = iL2;
                                }
                                dq2Var.h(i13);
                            }
                        }
                    }
                    if (strG2 != null && strG3 != null && i11 != -1) {
                        dq2Var.g(i11);
                        dq2Var.h(16);
                        h4Var = new q4(strG2, strG3, dq2Var.G(i12 - 16));
                    }
                    return h4Var;
                }
            }
            pf2.b("MetadataUtil", "Skipped unknown metadata entry: " + g6.b(iO));
            return null;
        } finally {
            dq2Var.g(iL);
        }
    }

    private static int b(dq2 dq2Var) {
        dq2Var.h(4);
        if (dq2Var.o() == 1684108385) {
            dq2Var.h(8);
            return dq2Var.u();
        }
        pf2.f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static o4 c(int i8, String str, dq2 dq2Var, boolean z7, boolean z8) {
        int iB = b(dq2Var);
        if (z8) {
            iB = Math.min(1, iB);
        }
        if (iB >= 0) {
            return z7 ? new w4(str, null, jb3.A(Integer.toString(iB))) : new h4("und", str, Integer.toString(iB));
        }
        pf2.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(g6.b(i8)));
        return null;
    }

    private static w4 d(int i8, String str, dq2 dq2Var) {
        int iO = dq2Var.o();
        if (dq2Var.o() == 1684108385 && iO >= 22) {
            dq2Var.h(10);
            int iY = dq2Var.y();
            if (iY > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iY);
                String string = sb.toString();
                int iY2 = dq2Var.y();
                if (iY2 > 0) {
                    string = string + "/" + iY2;
                }
                return new w4(str, null, jb3.A(string));
            }
        }
        pf2.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(g6.b(i8)));
        return null;
    }

    private static w4 e(int i8, String str, dq2 dq2Var) {
        int iO = dq2Var.o();
        if (dq2Var.o() == 1684108385) {
            dq2Var.h(8);
            return new w4(str, null, jb3.A(dq2Var.G(iO - 16)));
        }
        pf2.f("MetadataUtil", "Failed to parse text attribute: ".concat(g6.b(i8)));
        return null;
    }
}
