package f;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.v;
import androidx.core.view.e0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f21550b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f21551c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f21552d = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p.h<String, Constructor<? extends View>> f21553e = new p.h<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f21554a = new Object[2];

    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f21555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f21556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f21557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f21558d;

        public a(View view, String str) {
            this.f21555a = view;
            this.f21556b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f21556b, View.class)) != null) {
                        this.f21557c = method;
                        this.f21558d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f21555a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f21555a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f21556b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f21555a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f21557c == null) {
                a(this.f21555a.getContext());
            }
            try {
                this.f21557c.invoke(this.f21558d, view);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("Could not execute method for android:onClick", e9);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && e0.t(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f21551c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) {
        String str3;
        p.h<String, Constructor<? extends View>> hVar = f21553e;
        Constructor<? extends View> constructor = hVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f21550b);
            hVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f21554a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f21554a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i8 = 0;
            while (true) {
                String[] strArr = f21552d;
                if (i8 >= strArr.length) {
                    return null;
                }
                View viewR = r(context, str, strArr[i8]);
                if (viewR != null) {
                    return viewR;
                }
                i8++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f21554a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z7, boolean z8) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.A3, 0, 0);
        int resourceId = z7 ? typedArrayObtainStyledAttributes.getResourceId(e.j.B3, 0) : 0;
        if (z8 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(e.j.C3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof j.d) && ((j.d) context).c() == resourceId) ? context : new j.d(context, resourceId) : context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected AppCompatButton c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.f d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.j f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.j(context, attributeSet);
    }

    protected androidx.appcompat.widget.l g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.l(context, attributeSet);
    }

    protected androidx.appcompat.widget.n h(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.n(context, attributeSet);
    }

    protected o i(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    protected r j(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    protected s k(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected t l(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected v m(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected androidx.appcompat.widget.e0 n(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.e0(context, attributeSet);
    }

    protected k0 o(Context context, AttributeSet attributeSet) {
        return new k0(context, attributeSet);
    }

    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z7, boolean z8, boolean z9, boolean z10) {
        Context context2;
        View viewK;
        context2 = (!z7 || view == null) ? context : view.getContext();
        if (z8 || z9) {
            context2 = t(context2, attributeSet, z8, z9);
        }
        if (z10) {
            context2 = i1.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewK = k(context2, attributeSet);
                u(viewK, str);
                break;
            case "CheckedTextView":
                viewK = e(context2, attributeSet);
                u(viewK, str);
                break;
            case "MultiAutoCompleteTextView":
                viewK = i(context2, attributeSet);
                u(viewK, str);
                break;
            case "TextView":
                viewK = n(context2, attributeSet);
                u(viewK, str);
                break;
            case "ImageButton":
                viewK = g(context2, attributeSet);
                u(viewK, str);
                break;
            case "SeekBar":
                viewK = l(context2, attributeSet);
                u(viewK, str);
                break;
            case "Spinner":
                viewK = m(context2, attributeSet);
                u(viewK, str);
                break;
            case "RadioButton":
                viewK = j(context2, attributeSet);
                u(viewK, str);
                break;
            case "ToggleButton":
                viewK = o(context2, attributeSet);
                u(viewK, str);
                break;
            case "ImageView":
                viewK = h(context2, attributeSet);
                u(viewK, str);
                break;
            case "AutoCompleteTextView":
                viewK = b(context2, attributeSet);
                u(viewK, str);
                break;
            case "CheckBox":
                viewK = d(context2, attributeSet);
                u(viewK, str);
                break;
            case "EditText":
                viewK = f(context2, attributeSet);
                u(viewK, str);
                break;
            case "Button":
                viewK = c(context2, attributeSet);
                u(viewK, str);
                break;
            default:
                viewK = p(context2, str, attributeSet);
                break;
        }
        if (viewK == null && context != context2) {
            viewK = s(context2, str, attributeSet);
        }
        if (viewK != null) {
            a(viewK, attributeSet);
        }
        return viewK;
    }
}
