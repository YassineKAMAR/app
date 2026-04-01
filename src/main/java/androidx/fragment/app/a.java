package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import com.revenuecat.purchases_flutter.R;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends n implements j.k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final j f2389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f2390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f2391u = -1;

    public a(j jVar) {
        this.f2389s = jVar;
    }

    private static boolean r(n.a aVar) {
        Fragment fragment = aVar.f2539b;
        return (fragment == null || !fragment.f2352k || fragment.G == null || fragment.f2367z || fragment.f2366y || !fragment.R()) ? false : true;
    }

    @Override // androidx.fragment.app.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.H) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2527h) {
            return true;
        }
        this.f2389s.j(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public int d() {
        return i(false);
    }

    @Override // androidx.fragment.app.n
    public int e() {
        return i(true);
    }

    @Override // androidx.fragment.app.n
    void f(int i8, Fragment fragment, String str, int i9) {
        super.f(i8, fragment, str, i9);
        fragment.f2359r = this.f2389s;
    }

    @Override // androidx.fragment.app.n
    public n g(Fragment fragment) {
        j jVar = fragment.f2359r;
        if (jVar == null || jVar == this.f2389s) {
            return super.g(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void h(int i8) {
        if (this.f2527h) {
            if (j.H) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i8);
            }
            int size = this.f2520a.size();
            for (int i9 = 0; i9 < size; i9++) {
                n.a aVar = this.f2520a.get(i9);
                Fragment fragment = aVar.f2539b;
                if (fragment != null) {
                    fragment.f2358q += i8;
                    if (j.H) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2539b + " to " + aVar.f2539b.f2358q);
                    }
                }
            }
        }
    }

    int i(boolean z7) {
        if (this.f2390t) {
            throw new IllegalStateException("commit already called");
        }
        if (j.H) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new androidx.core.util.c("FragmentManager"));
            j("  ", printWriter);
            printWriter.close();
        }
        this.f2390t = true;
        this.f2391u = this.f2527h ? this.f2389s.m(this) : -1;
        this.f2389s.h0(this, z7);
        return this.f2391u;
    }

    public void j(String str, PrintWriter printWriter) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2529j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2391u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2390t);
            if (this.f2525f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2525f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f2526g));
            }
            if (this.f2521b != 0 || this.f2522c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2521b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2522c));
            }
            if (this.f2523d != 0 || this.f2524e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2523d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2524e));
            }
            if (this.f2530k != 0 || this.f2531l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2530k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2531l);
            }
            if (this.f2532m != 0 || this.f2533n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2532m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2533n);
            }
        }
        if (this.f2520a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2520a.size();
        for (int i8 = 0; i8 < size; i8++) {
            n.a aVar = this.f2520a.get(i8);
            switch (aVar.f2538a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2538a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i8);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2539b);
            if (z7) {
                if (aVar.f2540c != 0 || aVar.f2541d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2540c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2541d));
                }
                if (aVar.f2542e != 0 || aVar.f2543f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2542e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2543f));
                }
            }
        }
    }

    void l() {
        int size = this.f2520a.size();
        for (int i8 = 0; i8 < size; i8++) {
            n.a aVar = this.f2520a.get(i8);
            Fragment fragment = aVar.f2539b;
            if (fragment != null) {
                fragment.k1(this.f2525f, this.f2526g);
            }
            switch (aVar.f2538a) {
                case 1:
                    fragment.j1(aVar.f2540c);
                    this.f2389s.k(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2538a);
                case 3:
                    fragment.j1(aVar.f2541d);
                    this.f2389s.X0(fragment);
                    break;
                case 4:
                    fragment.j1(aVar.f2541d);
                    this.f2389s.B0(fragment);
                    break;
                case 5:
                    fragment.j1(aVar.f2540c);
                    this.f2389s.k1(fragment);
                    break;
                case 6:
                    fragment.j1(aVar.f2541d);
                    this.f2389s.w(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f2540c);
                    this.f2389s.p(fragment);
                    break;
                case 8:
                    this.f2389s.j1(fragment);
                    break;
                case 9:
                    this.f2389s.j1(null);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    this.f2389s.i1(fragment, aVar.f2545h);
                    break;
            }
            if (!this.f2536q && aVar.f2538a != 1 && fragment != null) {
                this.f2389s.N0(fragment);
            }
        }
        if (this.f2536q) {
            return;
        }
        j jVar = this.f2389s;
        jVar.O0(jVar.f2452p, true);
    }

    void m(boolean z7) {
        for (int size = this.f2520a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f2520a.get(size);
            Fragment fragment = aVar.f2539b;
            if (fragment != null) {
                fragment.k1(j.c1(this.f2525f), this.f2526g);
            }
            switch (aVar.f2538a) {
                case 1:
                    fragment.j1(aVar.f2543f);
                    this.f2389s.X0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2538a);
                case 3:
                    fragment.j1(aVar.f2542e);
                    this.f2389s.k(fragment, false);
                    break;
                case 4:
                    fragment.j1(aVar.f2542e);
                    this.f2389s.k1(fragment);
                    break;
                case 5:
                    fragment.j1(aVar.f2543f);
                    this.f2389s.B0(fragment);
                    break;
                case 6:
                    fragment.j1(aVar.f2542e);
                    this.f2389s.p(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f2543f);
                    this.f2389s.w(fragment);
                    break;
                case 8:
                    this.f2389s.j1(null);
                    break;
                case 9:
                    this.f2389s.j1(fragment);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    this.f2389s.i1(fragment, aVar.f2544g);
                    break;
            }
            if (!this.f2536q && aVar.f2538a != 3 && fragment != null) {
                this.f2389s.N0(fragment);
            }
        }
        if (this.f2536q || !z7) {
            return;
        }
        j jVar = this.f2389s;
        jVar.O0(jVar.f2452p, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment n(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.n$a> r5 = r0.f2520a
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.fragment.app.n$a> r5 = r0.f2520a
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.n$a r5 = (androidx.fragment.app.n.a) r5
            int r6 = r5.f2538a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.fragment.app.n$a> r6 = r0.f2520a
            androidx.fragment.app.n$a r7 = new androidx.fragment.app.n$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f2539b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f2539b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f2539b
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.fragment.app.n$a> r3 = r0.f2520a
            androidx.fragment.app.n$a r6 = new androidx.fragment.app.n$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f2539b
            int r9 = r6.f2364w
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.f2364w
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.fragment.app.n$a> r3 = r0.f2520a
            androidx.fragment.app.n$a r15 = new androidx.fragment.app.n$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.fragment.app.n$a r15 = new androidx.fragment.app.n$a
            r15.<init>(r10, r14)
            int r2 = r5.f2540c
            r15.f2540c = r2
            int r2 = r5.f2542e
            r15.f2542e = r2
            int r2 = r5.f2541d
            r15.f2541d = r2
            int r2 = r5.f2543f
            r15.f2543f = r2
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r0.f2520a
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r0.f2520a
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f2538a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f2539b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.n(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String o() {
        return this.f2529j;
    }

    boolean p(int i8) {
        int size = this.f2520a.size();
        for (int i9 = 0; i9 < size; i9++) {
            Fragment fragment = this.f2520a.get(i9).f2539b;
            int i10 = fragment != null ? fragment.f2364w : 0;
            if (i10 != 0 && i10 == i8) {
                return true;
            }
        }
        return false;
    }

    boolean q(ArrayList<a> arrayList, int i8, int i9) {
        if (i9 == i8) {
            return false;
        }
        int size = this.f2520a.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f2520a.get(i11).f2539b;
            int i12 = fragment != null ? fragment.f2364w : 0;
            if (i12 != 0 && i12 != i10) {
                for (int i13 = i8; i13 < i9; i13++) {
                    a aVar = arrayList.get(i13);
                    int size2 = aVar.f2520a.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        Fragment fragment2 = aVar.f2520a.get(i14).f2539b;
                        if ((fragment2 != null ? fragment2.f2364w : 0) == i12) {
                            return true;
                        }
                    }
                }
                i10 = i12;
            }
        }
        return false;
    }

    boolean s() {
        for (int i8 = 0; i8 < this.f2520a.size(); i8++) {
            if (r(this.f2520a.get(i8))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (this.f2537r != null) {
            for (int i8 = 0; i8 < this.f2537r.size(); i8++) {
                this.f2537r.get(i8).run();
            }
            this.f2537r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2391u >= 0) {
            sb.append(" #");
            sb.append(this.f2391u);
        }
        if (this.f2529j != null) {
            sb.append(" ");
            sb.append(this.f2529j);
        }
        sb.append("}");
        return sb.toString();
    }

    void u(Fragment.f fVar) {
        for (int i8 = 0; i8 < this.f2520a.size(); i8++) {
            n.a aVar = this.f2520a.get(i8);
            if (r(aVar)) {
                aVar.f2539b.l1(fVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment v(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.n$a> r0 = r5.f2520a
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r5.f2520a
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.n$a r2 = (androidx.fragment.app.n.a) r2
            int r3 = r2.f2538a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.d$b r3 = r2.f2544g
            r2.f2545h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f2539b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f2539b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f2539b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.v(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }
}
