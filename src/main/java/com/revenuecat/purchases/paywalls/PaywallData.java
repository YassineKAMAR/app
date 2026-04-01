package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.utils.LocaleExtensionsKt;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import e6.r;
import e6.x;
import f6.o;
import f6.w;
import i7.b;
import i7.h;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k7.f;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l7.d;
import m7.b2;
import m7.g2;
import m7.q1;
import m7.w0;

/* JADX INFO: loaded from: classes.dex */
@h
public final class PaywallData {
    public static final Companion Companion = new Companion(null);
    private final URL assetBaseURL;
    private final Configuration config;
    private final Map<String, LocalizedConfiguration> localization;
    private final int revision;
    private final String templateName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PaywallData> serializer() {
            return PaywallData$$serializer.INSTANCE;
        }
    }

    @h
    public static final class Configuration {
        public static final Companion Companion = new Companion(null);
        private final boolean blurredBackgroundImage;
        private final ColorInformation colors;
        private final String defaultPackage;
        private final boolean displayRestorePurchases;
        private final Images imagesWebp;
        private final Images legacyImages;
        private final List<String> packageIds;
        private final URL privacyURL;
        private final URL termsOfServiceURL;

        @h
        public static final class ColorInformation {
            public static final Companion Companion = new Companion(null);
            private final Colors dark;
            private final Colors light;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<ColorInformation> serializer() {
                    return PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ ColorInformation(int i8, Colors colors, Colors colors2, b2 b2Var) {
                if (1 != (i8 & 1)) {
                    q1.a(i8, 1, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                }
                this.light = colors;
                if ((i8 & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public ColorInformation(Colors light, Colors colors) {
                q.f(light, "light");
                this.light = light;
                this.dark = colors;
            }

            public /* synthetic */ ColorInformation(Colors colors, Colors colors2, int i8, j jVar) {
                this(colors, (i8 & 2) != 0 ? null : colors2);
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, Colors colors, Colors colors2, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    colors = colorInformation.light;
                }
                if ((i8 & 2) != 0) {
                    colors2 = colorInformation.dark;
                }
                return colorInformation.copy(colors, colors2);
            }

            public static final void write$Self(ColorInformation self, d output, f serialDesc) {
                q.f(self, "self");
                q.f(output, "output");
                q.f(serialDesc, "serialDesc");
                PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
                output.l(serialDesc, 0, paywallData$Configuration$Colors$$serializer, self.light);
                if (output.A(serialDesc, 1) || self.dark != null) {
                    output.f(serialDesc, 1, paywallData$Configuration$Colors$$serializer, self.dark);
                }
            }

            public final Colors component1() {
                return this.light;
            }

            public final Colors component2() {
                return this.dark;
            }

            public final ColorInformation copy(Colors light, Colors colors) {
                q.f(light, "light");
                return new ColorInformation(light, colors);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return q.b(this.light, colorInformation.light) && q.b(this.dark, colorInformation.dark);
            }

            public final Colors getDark() {
                return this.dark;
            }

            public final Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int iHashCode = this.light.hashCode() * 31;
                Colors colors = this.dark;
                return iHashCode + (colors == null ? 0 : colors.hashCode());
            }

            public String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }
        }

        @h
        public static final class Colors {
            public static final Companion Companion = new Companion(null);
            private final PaywallColor accent1;
            private final PaywallColor accent2;
            private final PaywallColor accent3;
            private final PaywallColor background;
            private final PaywallColor callToActionBackground;
            private final PaywallColor callToActionForeground;
            private final PaywallColor callToActionSecondaryBackground;
            private final PaywallColor text1;
            private final PaywallColor text2;
            private final PaywallColor text3;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Colors> serializer() {
                    return PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Colors(int i8, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor2, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor3, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor4, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor5, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor6, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor7, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor8, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor9, @h(with = PaywallColor.Serializer.class) PaywallColor paywallColor10, b2 b2Var) {
                if (51 != (i8 & 51)) {
                    q1.a(i8, 51, PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i8 & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i8 & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i8 & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i8 & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i8 & 256) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i8 & 512) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
            }

            public Colors(PaywallColor background, PaywallColor text1, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor callToActionBackground, PaywallColor callToActionForeground, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6) {
                q.f(background, "background");
                q.f(text1, "text1");
                q.f(callToActionBackground, "callToActionBackground");
                q.f(callToActionForeground, "callToActionForeground");
                this.background = background;
                this.text1 = text1;
                this.text2 = paywallColor;
                this.text3 = paywallColor2;
                this.callToActionBackground = callToActionBackground;
                this.callToActionForeground = callToActionForeground;
                this.callToActionSecondaryBackground = paywallColor3;
                this.accent1 = paywallColor4;
                this.accent2 = paywallColor5;
                this.accent3 = paywallColor6;
            }

            public /* synthetic */ Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, int i8, j jVar) {
                this(paywallColor, paywallColor2, (i8 & 4) != 0 ? null : paywallColor3, (i8 & 8) != 0 ? null : paywallColor4, paywallColor5, paywallColor6, (i8 & 64) != 0 ? null : paywallColor7, (i8 & 128) != 0 ? null : paywallColor8, (i8 & 256) != 0 ? null : paywallColor9, (i8 & 512) != 0 ? null : paywallColor10);
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent1$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent2$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent3$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText1$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText2$annotations() {
            }

            @h(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText3$annotations() {
            }

            public static final void write$Self(Colors self, d output, f serialDesc) {
                q.f(self, "self");
                q.f(output, "output");
                q.f(serialDesc, "serialDesc");
                PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
                output.l(serialDesc, 0, serializer, self.background);
                output.l(serialDesc, 1, serializer, self.text1);
                if (output.A(serialDesc, 2) || self.text2 != null) {
                    output.f(serialDesc, 2, serializer, self.text2);
                }
                if (output.A(serialDesc, 3) || self.text3 != null) {
                    output.f(serialDesc, 3, serializer, self.text3);
                }
                output.l(serialDesc, 4, serializer, self.callToActionBackground);
                output.l(serialDesc, 5, serializer, self.callToActionForeground);
                if (output.A(serialDesc, 6) || self.callToActionSecondaryBackground != null) {
                    output.f(serialDesc, 6, serializer, self.callToActionSecondaryBackground);
                }
                if (output.A(serialDesc, 7) || self.accent1 != null) {
                    output.f(serialDesc, 7, serializer, self.accent1);
                }
                if (output.A(serialDesc, 8) || self.accent2 != null) {
                    output.f(serialDesc, 8, serializer, self.accent2);
                }
                if (output.A(serialDesc, 9) || self.accent3 != null) {
                    output.f(serialDesc, 9, serializer, self.accent3);
                }
            }

            public final PaywallColor component1() {
                return this.background;
            }

            public final PaywallColor component10() {
                return this.accent3;
            }

            public final PaywallColor component2() {
                return this.text1;
            }

            public final PaywallColor component3() {
                return this.text2;
            }

            public final PaywallColor component4() {
                return this.text3;
            }

            public final PaywallColor component5() {
                return this.callToActionBackground;
            }

            public final PaywallColor component6() {
                return this.callToActionForeground;
            }

            public final PaywallColor component7() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor component8() {
                return this.accent1;
            }

            public final PaywallColor component9() {
                return this.accent2;
            }

            public final Colors copy(PaywallColor background, PaywallColor text1, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor callToActionBackground, PaywallColor callToActionForeground, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6) {
                q.f(background, "background");
                q.f(text1, "text1");
                q.f(callToActionBackground, "callToActionBackground");
                q.f(callToActionForeground, "callToActionForeground");
                return new Colors(background, text1, paywallColor, paywallColor2, callToActionBackground, callToActionForeground, paywallColor3, paywallColor4, paywallColor5, paywallColor6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) obj;
                return q.b(this.background, colors.background) && q.b(this.text1, colors.text1) && q.b(this.text2, colors.text2) && q.b(this.text3, colors.text3) && q.b(this.callToActionBackground, colors.callToActionBackground) && q.b(this.callToActionForeground, colors.callToActionForeground) && q.b(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && q.b(this.accent1, colors.accent1) && q.b(this.accent2, colors.accent2) && q.b(this.accent3, colors.accent3);
            }

            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            public final PaywallColor getBackground() {
                return this.background;
            }

            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor getText1() {
                return this.text1;
            }

            public final PaywallColor getText2() {
                return this.text2;
            }

            public final PaywallColor getText3() {
                return this.text3;
            }

            public int hashCode() {
                int iHashCode = ((this.background.hashCode() * 31) + this.text1.hashCode()) * 31;
                PaywallColor paywallColor = this.text2;
                int iHashCode2 = (iHashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                PaywallColor paywallColor2 = this.text3;
                int iHashCode3 = (((((iHashCode2 + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31) + this.callToActionBackground.hashCode()) * 31) + this.callToActionForeground.hashCode()) * 31;
                PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int iHashCode4 = (iHashCode3 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.accent1;
                int iHashCode5 = (iHashCode4 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.accent2;
                int iHashCode6 = (iHashCode5 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                PaywallColor paywallColor6 = this.accent3;
                return iHashCode6 + (paywallColor6 != null ? paywallColor6.hashCode() : 0);
            }

            public String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ", callToActionBackground=" + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ')';
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Configuration> serializer() {
                return PaywallData$Configuration$$serializer.INSTANCE;
            }
        }

        @h
        public static final class Images {
            public static final Companion Companion = new Companion(null);
            private final String background;
            private final String header;
            private final String icon;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Images> serializer() {
                    return PaywallData$Configuration$Images$$serializer.INSTANCE;
                }
            }

            public Images() {
                this((String) null, (String) null, (String) null, 7, (j) null);
            }

            public /* synthetic */ Images(int i8, @h(with = EmptyStringToNullSerializer.class) String str, @h(with = EmptyStringToNullSerializer.class) String str2, @h(with = EmptyStringToNullSerializer.class) String str3, b2 b2Var) {
                if ((i8 & 0) != 0) {
                    q1.a(i8, 0, PaywallData$Configuration$Images$$serializer.INSTANCE.getDescriptor());
                }
                if ((i8 & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i8 & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i8 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public Images(String str, String str2, String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            public /* synthetic */ Images(String str, String str2, String str3, int i8, j jVar) {
                this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    str = images.header;
                }
                if ((i8 & 2) != 0) {
                    str2 = images.background;
                }
                if ((i8 & 4) != 0) {
                    str3 = images.icon;
                }
                return images.copy(str, str2, str3);
            }

            @h(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @h(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getHeader$annotations() {
            }

            @h(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getIcon$annotations() {
            }

            public static final void write$Self(Images self, d output, f serialDesc) {
                q.f(self, "self");
                q.f(output, "output");
                q.f(serialDesc, "serialDesc");
                if (output.A(serialDesc, 0) || self.header != null) {
                    output.f(serialDesc, 0, EmptyStringToNullSerializer.INSTANCE, self.header);
                }
                if (output.A(serialDesc, 1) || self.background != null) {
                    output.f(serialDesc, 1, EmptyStringToNullSerializer.INSTANCE, self.background);
                }
                if (output.A(serialDesc, 2) || self.icon != null) {
                    output.f(serialDesc, 2, EmptyStringToNullSerializer.INSTANCE, self.icon);
                }
            }

            public final String component1() {
                return this.header;
            }

            public final String component2() {
                return this.background;
            }

            public final String component3() {
                return this.icon;
            }

            public final Images copy(String str, String str2, String str3) {
                return new Images(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                return q.b(this.header, images.header) && q.b(this.background, images.background) && q.b(this.icon, images.icon);
            }

            public final List<String> getAll$purchases_defaultsRelease() {
                return o.i(this.header, this.background, this.icon);
            }

            public final String getBackground() {
                return this.background;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                String str = this.header;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.background;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Images(header=" + this.header + ", background=" + this.background + ", icon=" + this.icon + ')';
            }
        }

        public /* synthetic */ Configuration(int i8, List list, String str, Images images, Images images2, boolean z7, boolean z8, @h(with = OptionalURLSerializer.class) URL url, @h(with = OptionalURLSerializer.class) URL url2, ColorInformation colorInformation, b2 b2Var) {
            if (257 != (i8 & 257)) {
                q1.a(i8, 257, PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
            }
            this.packageIds = list;
            if ((i8 & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i8 & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i8 & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i8 & 16) == 0) {
                this.blurredBackgroundImage = false;
            } else {
                this.blurredBackgroundImage = z7;
            }
            if ((i8 & 32) == 0) {
                this.displayRestorePurchases = true;
            } else {
                this.displayRestorePurchases = z8;
            }
            if ((i8 & 64) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i8 & 128) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(List<String> packageIds, String str, Images images, ColorInformation colors, boolean z7, boolean z8, URL url, URL url2) {
            this(packageIds, str, images, (Images) null, z7, z8, url, url2, colors, 8, (j) null);
            q.f(packageIds, "packageIds");
            q.f(images, "images");
            q.f(colors, "colors");
        }

        public /* synthetic */ Configuration(List list, String str, Images images, ColorInformation colorInformation, boolean z7, boolean z8, URL url, URL url2, int i8, j jVar) {
            this(list, (i8 & 2) != 0 ? null : str, images, colorInformation, (i8 & 16) != 0 ? false : z7, (i8 & 32) != 0 ? true : z8, (i8 & 64) != 0 ? null : url, (i8 & 128) != 0 ? null : url2);
        }

        public Configuration(List<String> packageIds, String str, Images images, Images images2, boolean z7, boolean z8, URL url, URL url2, ColorInformation colors) {
            q.f(packageIds, "packageIds");
            q.f(colors, "colors");
            this.packageIds = packageIds;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.blurredBackgroundImage = z7;
            this.displayRestorePurchases = z8;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colors;
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Images images2, boolean z7, boolean z8, URL url, URL url2, ColorInformation colorInformation, int i8, j jVar) {
            this(list, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : images, (i8 & 8) != 0 ? null : images2, (i8 & 16) != 0 ? false : z7, (i8 & 32) != 0 ? true : z8, (i8 & 64) != 0 ? null : url, (i8 & 128) != 0 ? null : url2, colorInformation);
        }

        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        public static /* synthetic */ void getImagesWebp$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getLegacyImages$purchases_defaultsRelease$annotations() {
        }

        public static /* synthetic */ void getPackageIds$annotations() {
        }

        @h(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        @h(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        public static final void write$Self(Configuration self, d output, f serialDesc) {
            q.f(self, "self");
            q.f(output, "output");
            q.f(serialDesc, "serialDesc");
            g2 g2Var = g2.f24923a;
            output.l(serialDesc, 0, new m7.f(g2Var), self.packageIds);
            if (output.A(serialDesc, 1) || self.defaultPackage != null) {
                output.f(serialDesc, 1, g2Var, self.defaultPackage);
            }
            if (output.A(serialDesc, 2) || self.imagesWebp != null) {
                output.f(serialDesc, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, self.imagesWebp);
            }
            if (output.A(serialDesc, 3) || self.legacyImages != null) {
                output.f(serialDesc, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, self.legacyImages);
            }
            if (output.A(serialDesc, 4) || self.blurredBackgroundImage) {
                output.C(serialDesc, 4, self.blurredBackgroundImage);
            }
            if (output.A(serialDesc, 5) || !self.displayRestorePurchases) {
                output.C(serialDesc, 5, self.displayRestorePurchases);
            }
            if (output.A(serialDesc, 6) || self.termsOfServiceURL != null) {
                output.f(serialDesc, 6, OptionalURLSerializer.INSTANCE, self.termsOfServiceURL);
            }
            if (output.A(serialDesc, 7) || self.privacyURL != null) {
                output.f(serialDesc, 7, OptionalURLSerializer.INSTANCE, self.privacyURL);
            }
            output.l(serialDesc, 8, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, self.colors);
        }

        public final List<String> component1() {
            return this.packageIds;
        }

        public final String component2() {
            return this.defaultPackage;
        }

        public final Images component3$purchases_defaultsRelease() {
            return this.imagesWebp;
        }

        public final Images component4$purchases_defaultsRelease() {
            return this.legacyImages;
        }

        public final boolean component5() {
            return this.blurredBackgroundImage;
        }

        public final boolean component6() {
            return this.displayRestorePurchases;
        }

        public final URL component7() {
            return this.termsOfServiceURL;
        }

        public final URL component8() {
            return this.privacyURL;
        }

        public final ColorInformation component9() {
            return this.colors;
        }

        public final Configuration copy(List<String> packageIds, String str, Images images, Images images2, boolean z7, boolean z8, URL url, URL url2, ColorInformation colors) {
            q.f(packageIds, "packageIds");
            q.f(colors, "colors");
            return new Configuration(packageIds, str, images, images2, z7, z8, url, url2, colors);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return q.b(this.packageIds, configuration.packageIds) && q.b(this.defaultPackage, configuration.defaultPackage) && q.b(this.imagesWebp, configuration.imagesWebp) && q.b(this.legacyImages, configuration.legacyImages) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && q.b(this.termsOfServiceURL, configuration.termsOfServiceURL) && q.b(this.privacyURL, configuration.privacyURL) && q.b(this.colors, configuration.colors);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final ColorInformation getColors() {
            return this.colors;
        }

        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final Images getImages() {
            String header;
            String background;
            String icon;
            Images images = this.imagesWebp;
            String icon2 = null;
            if (images == null || (header = images.getHeader()) == null) {
                Images images2 = this.legacyImages;
                header = images2 != null ? images2.getHeader() : null;
            }
            Images images3 = this.imagesWebp;
            if (images3 == null || (background = images3.getBackground()) == null) {
                Images images4 = this.legacyImages;
                background = images4 != null ? images4.getBackground() : null;
            }
            Images images5 = this.imagesWebp;
            if (images5 == null || (icon = images5.getIcon()) == null) {
                Images images6 = this.legacyImages;
                if (images6 != null) {
                    icon2 = images6.getIcon();
                }
            } else {
                icon2 = icon;
            }
            return new Images(header, background, icon2);
        }

        public final Images getImagesWebp$purchases_defaultsRelease() {
            return this.imagesWebp;
        }

        public final Images getLegacyImages$purchases_defaultsRelease() {
            return this.legacyImages;
        }

        public final List<String> getPackageIds() {
            return this.packageIds;
        }

        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public int hashCode() {
            int iHashCode = this.packageIds.hashCode() * 31;
            String str = this.defaultPackage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Images images = this.imagesWebp;
            int iHashCode3 = (iHashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            Images images2 = this.legacyImages;
            int iHashCode4 = (iHashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            boolean z7 = this.blurredBackgroundImage;
            ?? r12 = z7;
            if (z7) {
                r12 = 1;
            }
            int i8 = (iHashCode4 + r12) * 31;
            boolean z8 = this.displayRestorePurchases;
            int i9 = (i8 + (z8 ? 1 : z8)) * 31;
            URL url = this.termsOfServiceURL;
            int iHashCode5 = (i9 + (url == null ? 0 : url.hashCode())) * 31;
            URL url2 = this.privacyURL;
            return ((iHashCode5 + (url2 != null ? url2.hashCode() : 0)) * 31) + this.colors.hashCode();
        }

        public String toString() {
            return "Configuration(packageIds=" + this.packageIds + ", defaultPackage=" + this.defaultPackage + ", imagesWebp=" + this.imagesWebp + ", legacyImages=" + this.legacyImages + ", blurredBackgroundImage=" + this.blurredBackgroundImage + ", displayRestorePurchases=" + this.displayRestorePurchases + ", termsOfServiceURL=" + this.termsOfServiceURL + ", privacyURL=" + this.privacyURL + ", colors=" + this.colors + ')';
        }
    }

    @h
    public static final class LocalizedConfiguration {
        public static final Companion Companion = new Companion(null);
        private final String callToAction;
        private final String callToActionWithIntroOffer;
        private final String callToActionWithMultipleIntroOffers;
        private final List<Feature> features;
        private final String offerDetails;
        private final String offerDetailsWithIntroOffer;
        private final String offerDetailsWithMultipleIntroOffers;
        private final String offerName;
        private final String subtitle;
        private final String title;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<LocalizedConfiguration> serializer() {
                return PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }
        }

        @h
        public static final class Feature {
            public static final Companion Companion = new Companion(null);
            private final String content;
            private final String iconID;
            private final String title;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Feature> serializer() {
                    return PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Feature(int i8, String str, String str2, String str3, b2 b2Var) {
                if (1 != (i8 & 1)) {
                    q1.a(i8, 1, PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                if ((i8 & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i8 & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public Feature(String title, String str, String str2) {
                q.f(title, "title");
                this.title = title;
                this.content = str;
                this.iconID = str2;
            }

            public /* synthetic */ Feature(String str, String str2, String str3, int i8, j jVar) {
                this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, String str3, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    str = feature.title;
                }
                if ((i8 & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i8 & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            public static /* synthetic */ void getIconID$annotations() {
            }

            public static final void write$Self(Feature self, d output, f serialDesc) {
                q.f(self, "self");
                q.f(output, "output");
                q.f(serialDesc, "serialDesc");
                output.g(serialDesc, 0, self.title);
                if (output.A(serialDesc, 1) || self.content != null) {
                    output.f(serialDesc, 1, g2.f24923a, self.content);
                }
                if (output.A(serialDesc, 2) || self.iconID != null) {
                    output.f(serialDesc, 2, g2.f24923a, self.iconID);
                }
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.content;
            }

            public final String component3() {
                return this.iconID;
            }

            public final Feature copy(String title, String str, String str2) {
                q.f(title, "title");
                return new Feature(title, str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Feature)) {
                    return false;
                }
                Feature feature = (Feature) obj;
                return q.b(this.title, feature.title) && q.b(this.content, feature.content) && q.b(this.iconID, feature.iconID);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIconID() {
                return this.iconID;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.content;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconID;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Feature(title=" + this.title + ", content=" + this.content + ", iconID=" + this.iconID + ')';
            }
        }

        public /* synthetic */ LocalizedConfiguration(int i8, String str, @h(with = EmptyStringToNullSerializer.class) String str2, String str3, @h(with = EmptyStringToNullSerializer.class) String str4, @h(with = EmptyStringToNullSerializer.class) String str5, @h(with = EmptyStringToNullSerializer.class) String str6, @h(with = EmptyStringToNullSerializer.class) String str7, @h(with = EmptyStringToNullSerializer.class) String str8, @h(with = EmptyStringToNullSerializer.class) String str9, List list, b2 b2Var) {
            if (5 != (i8 & 5)) {
                q1.a(i8, 5, PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            if ((i8 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i8 & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i8 & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i8 & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i8 & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i8 & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i8 & 256) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            if ((i8 & 512) == 0) {
                this.features = o.d();
            } else {
                this.features = list;
            }
        }

        public LocalizedConfiguration(String title, String str, String callToAction, String str2, String str3, String str4, String str5, String str6, String str7, List<Feature> features) {
            q.f(title, "title");
            q.f(callToAction, "callToAction");
            q.f(features, "features");
            this.title = title;
            this.subtitle = str;
            this.callToAction = callToAction;
            this.callToActionWithIntroOffer = str2;
            this.callToActionWithMultipleIntroOffers = str3;
            this.offerDetails = str4;
            this.offerDetailsWithIntroOffer = str5;
            this.offerDetailsWithMultipleIntroOffers = str6;
            this.offerName = str7;
            this.features = features;
        }

        public /* synthetic */ LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i8, j jVar) {
            this(str, (i8 & 2) != 0 ? null : str2, str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6, (i8 & 64) != 0 ? null : str7, (i8 & 128) != 0 ? null : str8, (i8 & 256) != 0 ? null : str9, (i8 & 512) != 0 ? o.d() : list);
        }

        public static /* synthetic */ void getCallToAction$annotations() {
        }

        @h(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        @h(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        @h(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        @h(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        @h(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        @h(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferName$annotations() {
        }

        @h(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static final void write$Self(LocalizedConfiguration self, d output, f serialDesc) {
            q.f(self, "self");
            q.f(output, "output");
            q.f(serialDesc, "serialDesc");
            output.g(serialDesc, 0, self.title);
            if (output.A(serialDesc, 1) || self.subtitle != null) {
                output.f(serialDesc, 1, EmptyStringToNullSerializer.INSTANCE, self.subtitle);
            }
            output.g(serialDesc, 2, self.callToAction);
            if (output.A(serialDesc, 3) || self.callToActionWithIntroOffer != null) {
                output.f(serialDesc, 3, EmptyStringToNullSerializer.INSTANCE, self.callToActionWithIntroOffer);
            }
            if (output.A(serialDesc, 4) || self.callToActionWithMultipleIntroOffers != null) {
                output.f(serialDesc, 4, EmptyStringToNullSerializer.INSTANCE, self.callToActionWithMultipleIntroOffers);
            }
            if (output.A(serialDesc, 5) || self.offerDetails != null) {
                output.f(serialDesc, 5, EmptyStringToNullSerializer.INSTANCE, self.offerDetails);
            }
            if (output.A(serialDesc, 6) || self.offerDetailsWithIntroOffer != null) {
                output.f(serialDesc, 6, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithIntroOffer);
            }
            if (output.A(serialDesc, 7) || self.offerDetailsWithMultipleIntroOffers != null) {
                output.f(serialDesc, 7, EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithMultipleIntroOffers);
            }
            if (output.A(serialDesc, 8) || self.offerName != null) {
                output.f(serialDesc, 8, EmptyStringToNullSerializer.INSTANCE, self.offerName);
            }
            if (output.A(serialDesc, 9) || !q.b(self.features, o.d())) {
                output.l(serialDesc, 9, new m7.f(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE), self.features);
            }
        }

        public final String component1() {
            return this.title;
        }

        public final List<Feature> component10() {
            return this.features;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String component3() {
            return this.callToAction;
        }

        public final String component4() {
            return this.callToActionWithIntroOffer;
        }

        public final String component5() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final String component6() {
            return this.offerDetails;
        }

        public final String component7() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String component8() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String component9() {
            return this.offerName;
        }

        public final LocalizedConfiguration copy(String title, String str, String callToAction, String str2, String str3, String str4, String str5, String str6, String str7, List<Feature> features) {
            q.f(title, "title");
            q.f(callToAction, "callToAction");
            q.f(features, "features");
            return new LocalizedConfiguration(title, str, callToAction, str2, str3, str4, str5, str6, str7, features);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedConfiguration)) {
                return false;
            }
            LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) obj;
            return q.b(this.title, localizedConfiguration.title) && q.b(this.subtitle, localizedConfiguration.subtitle) && q.b(this.callToAction, localizedConfiguration.callToAction) && q.b(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && q.b(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && q.b(this.offerDetails, localizedConfiguration.offerDetails) && q.b(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && q.b(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && q.b(this.offerName, localizedConfiguration.offerName) && q.b(this.features, localizedConfiguration.features);
        }

        public final String getCallToAction() {
            return this.callToAction;
        }

        public final String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        public final String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final List<Feature> getFeatures() {
            return this.features;
        }

        public final String getOfferDetails() {
            return this.offerDetails;
        }

        public final String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.callToAction.hashCode()) * 31;
            String str2 = this.callToActionWithIntroOffer;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.callToActionWithMultipleIntroOffers;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.offerDetails;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.offerDetailsWithIntroOffer;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.offerDetailsWithMultipleIntroOffers;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.offerName;
            return ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.features.hashCode();
        }

        public String toString() {
            return "LocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerName=" + this.offerName + ", features=" + this.features + ')';
        }
    }

    public /* synthetic */ PaywallData(int i8, String str, Configuration configuration, @h(with = URLSerializer.class) URL url, int i9, Map map, b2 b2Var) {
        if (23 != (i8 & 23)) {
            q1.a(i8, 23, PaywallData$$serializer.INSTANCE.getDescriptor());
        }
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i8 & 8) == 0) {
            this.revision = 0;
        } else {
            this.revision = i9;
        }
        this.localization = map;
    }

    public PaywallData(String templateName, Configuration config, URL assetBaseURL, int i8, Map<String, LocalizedConfiguration> localization) {
        q.f(templateName, "templateName");
        q.f(config, "config");
        q.f(assetBaseURL, "assetBaseURL");
        q.f(localization, "localization");
        this.templateName = templateName;
        this.config = config;
        this.assetBaseURL = assetBaseURL;
        this.revision = i8;
        this.localization = localization;
    }

    public /* synthetic */ PaywallData(String str, Configuration configuration, URL url, int i8, Map map, int i9, j jVar) {
        this(str, configuration, url, (i9 & 8) != 0 ? 0 : i8, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallData copy$default(PaywallData paywallData, String str, Configuration configuration, URL url, int i8, Map map, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = paywallData.templateName;
        }
        if ((i9 & 2) != 0) {
            configuration = paywallData.config;
        }
        Configuration configuration2 = configuration;
        if ((i9 & 4) != 0) {
            url = paywallData.assetBaseURL;
        }
        URL url2 = url;
        if ((i9 & 8) != 0) {
            i8 = paywallData.revision;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            map = paywallData.localization;
        }
        return paywallData.copy(str, configuration2, url2, i10, map);
    }

    @h(with = URLSerializer.class)
    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    private final r<Locale, LocalizedConfiguration> getFallbackLocalizedConfiguration() {
        Map.Entry entry = (Map.Entry) w.y(this.localization.entrySet());
        return x.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
    }

    public static /* synthetic */ void getLocalization$purchases_defaultsRelease$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static final void write$Self(PaywallData self, d output, f serialDesc) {
        q.f(self, "self");
        q.f(output, "output");
        q.f(serialDesc, "serialDesc");
        output.g(serialDesc, 0, self.templateName);
        output.l(serialDesc, 1, PaywallData$Configuration$$serializer.INSTANCE, self.config);
        output.l(serialDesc, 2, URLSerializer.INSTANCE, self.assetBaseURL);
        if (output.A(serialDesc, 3) || self.revision != 0) {
            output.D(serialDesc, 3, self.revision);
        }
        output.l(serialDesc, 4, new w0(g2.f24923a, PaywallData$LocalizedConfiguration$$serializer.INSTANCE), self.localization);
    }

    public final String component1() {
        return this.templateName;
    }

    public final Configuration component2() {
        return this.config;
    }

    public final URL component3() {
        return this.assetBaseURL;
    }

    public final int component4() {
        return this.revision;
    }

    public final Map<String, LocalizedConfiguration> component5$purchases_defaultsRelease() {
        return this.localization;
    }

    public final LocalizedConfiguration configForLocale(Locale requiredLocale) {
        Object next;
        q.f(requiredLocale, "requiredLocale");
        LocalizedConfiguration localizedConfiguration = this.localization.get(requiredLocale.toString());
        if (localizedConfiguration != null) {
            return localizedConfiguration;
        }
        Iterator<T> it = this.localization.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(requiredLocale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) next).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (LocalizedConfiguration) entry.getValue();
        }
        return null;
    }

    public final PaywallData copy(String templateName, Configuration config, URL assetBaseURL, int i8, Map<String, LocalizedConfiguration> localization) {
        q.f(templateName, "templateName");
        q.f(config, "config");
        q.f(assetBaseURL, "assetBaseURL");
        q.f(localization, "localization");
        return new PaywallData(templateName, config, assetBaseURL, i8, localization);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) obj;
        return q.b(this.templateName, paywallData.templateName) && q.b(this.config, paywallData.config) && q.b(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && q.b(this.localization, paywallData.localization);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final Map<String, LocalizedConfiguration> getLocalization$purchases_defaultsRelease() {
        return this.localization;
    }

    public final r<Locale, LocalizedConfiguration> getLocalizedConfiguration() {
        Locale localeConvertToCorrectlyFormattedLocale;
        LocalizedConfiguration localizedConfigurationConfigForLocale;
        androidx.core.os.f fVarD = androidx.core.os.f.d();
        q.e(fVarD, "getDefault()");
        int iE = fVarD.e();
        for (int i8 = 0; i8 < iE; i8++) {
            Locale localeC = fVarD.c(i8);
            if (localeC != null && (localizedConfigurationConfigForLocale = configForLocale((localeConvertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(localeC)))) != null) {
                return x.a(localeConvertToCorrectlyFormattedLocale, localizedConfigurationConfigForLocale);
            }
        }
        return getFallbackLocalizedConfiguration();
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return (((((((this.templateName.hashCode() * 31) + this.config.hashCode()) * 31) + this.assetBaseURL.hashCode()) * 31) + this.revision) * 31) + this.localization.hashCode();
    }

    public String toString() {
        return "PaywallData(templateName=" + this.templateName + ", config=" + this.config + ", assetBaseURL=" + this.assetBaseURL + ", revision=" + this.revision + ", localization=" + this.localization + ')';
    }
}
