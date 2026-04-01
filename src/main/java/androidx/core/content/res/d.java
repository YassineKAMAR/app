package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f1964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f1965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1966c;

    private d(Shader shader, ColorStateList colorStateList, int i8) {
        this.f1964a = shader;
        this.f1965b = colorStateList;
        this.f1966c = i8;
    }

    private static d a(Resources resources, int i8, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i8);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i8) {
        return new d(null, null, i8);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i8, Resources.Theme theme) {
        try {
            return a(resources, i8, theme);
        } catch (Exception e8) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e8);
            return null;
        }
    }

    public int e() {
        return this.f1966c;
    }

    public Shader f() {
        return this.f1964a;
    }

    public boolean h() {
        return this.f1964a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f1964a == null && (colorStateList = this.f1965b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f1965b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1966c) {
                this.f1966c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i8) {
        this.f1966c = i8;
    }

    public boolean l() {
        return h() || this.f1966c != 0;
    }
}
