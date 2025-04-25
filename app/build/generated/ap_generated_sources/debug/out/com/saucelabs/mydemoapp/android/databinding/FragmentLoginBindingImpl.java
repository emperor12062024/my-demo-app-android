package com.saucelabs.mydemoapp.android.databinding;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loginTV, 1);
        sViewsWithIds.put(R.id.selectTextTV, 2);
        sViewsWithIds.put(R.id.usernameTV, 3);
        sViewsWithIds.put(R.id.nameRL, 4);
        sViewsWithIds.put(R.id.nameET, 5);
        sViewsWithIds.put(R.id.usernameErrorIV, 6);
        sViewsWithIds.put(R.id.nameErrorTV, 7);
        sViewsWithIds.put(R.id.passwordTV, 8);
        sViewsWithIds.put(R.id.passwordRL, 9);
        sViewsWithIds.put(R.id.passwordET, 10);
        sViewsWithIds.put(R.id.passwordErrorIV, 11);
        sViewsWithIds.put(R.id.passwordErrorTV, 12);
        sViewsWithIds.put(R.id.buttonLL, 13);
        sViewsWithIds.put(R.id.bioMetricIB, 14);
        sViewsWithIds.put(R.id.loginBtn, 15);
        sViewsWithIds.put(R.id.savedNamesTV, 16);
        sViewsWithIds.put(R.id.savedPasswordTV, 17);
        sViewsWithIds.put(R.id.username1TV, 18);
        sViewsWithIds.put(R.id.password1TV, 19);
        sViewsWithIds.put(R.id.username2TV, 20);
        sViewsWithIds.put(R.id.password2TV, 21);
        sViewsWithIds.put(R.id.username3TV, 22);
        sViewsWithIds.put(R.id.password3TV, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[14]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.Button) bindings[15]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[23]
            , (android.widget.EditText) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[22]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}