package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
class f1 extends b0.c implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SearchView f936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SearchableInfo f937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f944t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f945u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f946v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f948x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f949y;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f954e;

        public a(View view) {
            this.f950a = (TextView) view.findViewById(R.id.text1);
            this.f951b = (TextView) view.findViewById(R.id.text2);
            this.f952c = (ImageView) view.findViewById(R.id.icon1);
            this.f953d = (ImageView) view.findViewById(R.id.icon2);
            this.f954e = (ImageView) view.findViewById(e.f.f21176q);
        }
    }

    public f1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f941q = false;
        this.f942r = 1;
        this.f944t = -1;
        this.f945u = -1;
        this.f946v = -1;
        this.f947w = -1;
        this.f948x = -1;
        this.f949y = -1;
        this.f936l = searchView;
        this.f937m = searchableInfo;
        this.f940p = searchView.getSuggestionCommitIconResId();
        this.f938n = context;
        this.f939o = weakHashMap;
    }

    private Drawable B(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i8 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f938n.getPackageName() + "/" + i8;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableE = androidx.core.content.a.e(this.f938n, i8);
            J(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableZ = z(Uri.parse(str));
            J(str, drawableZ);
            return drawableZ;
        }
    }

    private Drawable C(Cursor cursor) {
        int i8 = this.f947w;
        if (i8 == -1) {
            return null;
        }
        Drawable drawableB = B(cursor.getString(i8));
        return drawableB != null ? drawableB : q();
    }

    private Drawable D(Cursor cursor) {
        int i8 = this.f948x;
        if (i8 == -1) {
            return null;
        }
        return B(cursor.getString(i8));
    }

    private static String F(Cursor cursor, int i8) {
        if (i8 == -1) {
            return null;
        }
        try {
            return cursor.getString(i8);
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e8);
            return null;
        }
    }

    private void H(ImageView imageView, Drawable drawable, int i8) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i8);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void I(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void J(String str, Drawable drawable) {
        if (drawable != null) {
            this.f939o.put(str, drawable.getConstantState());
        }
    }

    private void K(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = this.f939o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f943s == null) {
            TypedValue typedValue = new TypedValue();
            this.f3257d.getTheme().resolveAttribute(e.a.J, typedValue, true);
            this.f943s = this.f3257d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f943s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        String string;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f3257d.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e8) {
            string = e8.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        string = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", string);
        return null;
    }

    private Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f939o.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f939o.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = this.f939o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f938n.getResources());
    }

    public static String p(Cursor cursor, String str) {
        return F(cursor, cursor.getColumnIndex(str));
    }

    private Drawable q() {
        Drawable drawableM = m(this.f937m.getSearchActivity());
        return drawableM != null ? drawableM : this.f3257d.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable z(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return A(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f938n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e8) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e8);
                }
            }
        } catch (FileNotFoundException e9) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
        return null;
    }

    Drawable A(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f3257d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor E(SearchableInfo searchableInfo, String str, int i8) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i8 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i8));
        }
        return this.f3257d.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void G(int i8) {
        this.f942r = i8;
    }

    @Override // b0.a, b0.b.a
    public void a(Cursor cursor) {
        if (this.f941q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f944t = cursor.getColumnIndex("suggest_text_1");
                this.f945u = cursor.getColumnIndex("suggest_text_2");
                this.f946v = cursor.getColumnIndex("suggest_text_2_url");
                this.f947w = cursor.getColumnIndex("suggest_icon_1");
                this.f948x = cursor.getColumnIndex("suggest_icon_2");
                this.f949y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e8);
        }
    }

    @Override // b0.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f936l.getVisibility() == 0 && this.f936l.getWindowVisibility() == 0) {
            try {
                Cursor cursorE = E(this.f937m, string, 50);
                if (cursorE != null) {
                    cursorE.getCount();
                    return cursorE;
                }
            } catch (RuntimeException e8) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e8);
            }
        }
        return null;
    }

    @Override // b0.a, b0.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strP;
        String strP2;
        if (cursor == null) {
            return null;
        }
        String strP3 = p(cursor, "suggest_intent_query");
        if (strP3 != null) {
            return strP3;
        }
        if (this.f937m.shouldRewriteQueryFromData() && (strP2 = p(cursor, "suggest_intent_data")) != null) {
            return strP2;
        }
        if (!this.f937m.shouldRewriteQueryFromText() || (strP = p(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strP;
    }

    @Override // b0.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i8 = this.f949y;
        int i9 = i8 != -1 ? cursor.getInt(i8) : 0;
        if (aVar.f950a != null) {
            I(aVar.f950a, F(cursor, this.f944t));
        }
        if (aVar.f951b != null) {
            String strF = F(cursor, this.f946v);
            CharSequence charSequenceK = strF != null ? k(strF) : F(cursor, this.f945u);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f950a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f950a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f950a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f950a.setMaxLines(1);
                }
            }
            I(aVar.f951b, charSequenceK);
        }
        ImageView imageView = aVar.f952c;
        if (imageView != null) {
            H(imageView, C(cursor), 4);
        }
        ImageView imageView2 = aVar.f953d;
        if (imageView2 != null) {
            H(imageView2, D(cursor), 8);
        }
        int i10 = this.f942r;
        if (i10 != 2 && (i10 != 1 || (i9 & 1) == 0)) {
            aVar.f954e.setVisibility(8);
            return;
        }
        aVar.f954e.setVisibility(0);
        aVar.f954e.setTag(aVar.f950a.getText());
        aVar.f954e.setOnClickListener(this);
    }

    @Override // b0.c, b0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(e.f.f21176q)).setImageResource(this.f940p);
        return viewG;
    }

    @Override // b0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i8, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View viewF = f(this.f3257d, this.f3256c, viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f950a.setText(e8.toString());
            }
            return viewF;
        }
    }

    @Override // b0.a, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i8, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View viewG = g(this.f3257d, this.f3256c, viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f950a.setText(e8.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        K(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        K(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f936l.Q((CharSequence) tag);
        }
    }
}
