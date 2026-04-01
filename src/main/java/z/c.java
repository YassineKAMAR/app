package z;

import android.annotation.NonNull;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.d;

/* JADX INFO: loaded from: classes.dex */
public class c implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f27568d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f27569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PrecomputedText f27571c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f27572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f27573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f27575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f27576e;

        /* JADX INFO: renamed from: z.c$a$a, reason: collision with other inner class name */
        public static class C0197a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f27577a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f27578b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f27579c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f27580d;

            public C0197a(TextPaint textPaint) {
                this.f27577a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f27579c = 1;
                    this.f27580d = 1;
                } else {
                    this.f27580d = 0;
                    this.f27579c = 0;
                }
                this.f27578b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f27577a, this.f27578b, this.f27579c, this.f27580d);
            }

            public C0197a b(int i8) {
                this.f27579c = i8;
                return this;
            }

            public C0197a c(int i8) {
                this.f27580d = i8;
                return this;
            }

            public C0197a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f27578b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f27572a = params.getTextPaint();
            this.f27573b = params.getTextDirection();
            this.f27574c = params.getBreakStrategy();
            this.f27575d = params.getHyphenationFrequency();
            this.f27576e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i8, int i9) {
            this.f27576e = Build.VERSION.SDK_INT >= 29 ? new Object(textPaint) { // from class: android.text.PrecomputedText.Params.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                public /* synthetic */ Builder(@NonNull TextPaint textPaint2) {
                }

                @NonNull
                public native /* synthetic */ Params build();

                public native /* synthetic */ Builder setBreakStrategy(int i10);

                public native /* synthetic */ Builder setHyphenationFrequency(int i10);

                public native /* synthetic */ Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic2);
            }.setBreakStrategy(i8).setHyphenationFrequency(i9).setTextDirection(textDirectionHeuristic).build() : null;
            this.f27572a = textPaint2;
            this.f27573b = textDirectionHeuristic;
            this.f27574c = i8;
            this.f27575d = i9;
        }

        public boolean a(a aVar) {
            int i8 = Build.VERSION.SDK_INT;
            if ((i8 >= 23 && (this.f27574c != aVar.b() || this.f27575d != aVar.c())) || this.f27572a.getTextSize() != aVar.e().getTextSize() || this.f27572a.getTextScaleX() != aVar.e().getTextScaleX() || this.f27572a.getTextSkewX() != aVar.e().getTextSkewX() || this.f27572a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f27572a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f27572a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i8 >= 24) {
                if (!this.f27572a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f27572a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f27572a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f27572a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f27574c;
        }

        public int c() {
            return this.f27575d;
        }

        public TextDirectionHeuristic d() {
            return this.f27573b;
        }

        public TextPaint e() {
            return this.f27572a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f27573b == aVar.d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? d.b(Float.valueOf(this.f27572a.getTextSize()), Float.valueOf(this.f27572a.getTextScaleX()), Float.valueOf(this.f27572a.getTextSkewX()), Float.valueOf(this.f27572a.getLetterSpacing()), Integer.valueOf(this.f27572a.getFlags()), this.f27572a.getTextLocales(), this.f27572a.getTypeface(), Boolean.valueOf(this.f27572a.isElegantTextHeight()), this.f27573b, Integer.valueOf(this.f27574c), Integer.valueOf(this.f27575d)) : d.b(Float.valueOf(this.f27572a.getTextSize()), Float.valueOf(this.f27572a.getTextScaleX()), Float.valueOf(this.f27572a.getTextSkewX()), Float.valueOf(this.f27572a.getLetterSpacing()), Integer.valueOf(this.f27572a.getFlags()), this.f27572a.getTextLocale(), this.f27572a.getTypeface(), Boolean.valueOf(this.f27572a.isElegantTextHeight()), this.f27573b, Integer.valueOf(this.f27574c), Integer.valueOf(this.f27575d));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f27572a.getTextSize());
            sb2.append(", textScaleX=" + this.f27572a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f27572a.getTextSkewX());
            int i8 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f27572a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f27572a.isElegantTextHeight());
            if (i8 >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f27572a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f27572a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f27572a.getTypeface());
            if (i8 >= 26) {
                sb2.append(", variationSettings=" + this.f27572a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f27573b);
            sb2.append(", breakStrategy=" + this.f27574c);
            sb2.append(", hyphenationFrequency=" + this.f27575d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a a() {
        return this.f27570b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f27569a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i8) {
        return this.f27569a.charAt(i8);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f27569a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f27569a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f27569a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i8, int i9, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f27571c.getSpans(i8, i9, cls) : (T[]) this.f27569a.getSpans(i8, i9, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f27569a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i8, int i9, Class cls) {
        return this.f27569a.nextSpanTransition(i8, i9, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27571c.removeSpan(obj);
        } else {
            this.f27569a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i8, int i9, int i10) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27571c.setSpan(obj, i8, i9, i10);
        } else {
            this.f27569a.setSpan(obj, i8, i9, i10);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        return this.f27569a.subSequence(i8, i9);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f27569a.toString();
    }
}
