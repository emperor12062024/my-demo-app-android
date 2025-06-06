package com.saucelabs.mydemoapp.android.databinding;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCartBindingImpl extends FragmentCartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.noItemCL, 1);
        sViewsWithIds.put(R.id.noItemTitleTV, 2);
        sViewsWithIds.put(R.id.cartInfoLL, 3);
        sViewsWithIds.put(R.id.shoppingBt, 4);
        sViewsWithIds.put(R.id.cartCL, 5);
        sViewsWithIds.put(R.id.scrollView, 6);
        sViewsWithIds.put(R.id.productTV, 7);
        sViewsWithIds.put(R.id.productRV, 8);
        sViewsWithIds.put(R.id.socialLL, 9);
        sViewsWithIds.put(R.id.twitterIV, 10);
        sViewsWithIds.put(R.id.FacebookIV, 11);
        sViewsWithIds.put(R.id.LinkedInIV, 12);
        sViewsWithIds.put(R.id.bottomCV, 13);
        sViewsWithIds.put(R.id.bottomLL, 14);
        sViewsWithIds.put(R.id.itemsTV, 15);
        sViewsWithIds.put(R.id.totalPriceTV, 16);
        sViewsWithIds.put(R.id.cartBt, 17);
        sViewsWithIds.put(R.id.leftGuideline, 18);
        sViewsWithIds.put(R.id.rightGuideline, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.Button) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.TextView) bindings[15]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[19]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (android.widget.Button) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ImageView) bindings[10]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
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