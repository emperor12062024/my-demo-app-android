package com.saucelabs.mydemoapp.android.databinding;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SortDialogBindingImpl extends SortDialogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sortTV, 1);
        sViewsWithIds.put(R.id.nameAscCL, 2);
        sViewsWithIds.put(R.id.tickNameAscIV, 3);
        sViewsWithIds.put(R.id.menuNameAscIV, 4);
        sViewsWithIds.put(R.id.nameDesCL, 5);
        sViewsWithIds.put(R.id.tickNameDesIV, 6);
        sViewsWithIds.put(R.id.menuNameDesIV, 7);
        sViewsWithIds.put(R.id.priceAscCL, 8);
        sViewsWithIds.put(R.id.tickPriceAscIV, 9);
        sViewsWithIds.put(R.id.menuPriceAscIV, 10);
        sViewsWithIds.put(R.id.priceDesCL, 11);
        sViewsWithIds.put(R.id.tickPriceDscIV, 12);
        sViewsWithIds.put(R.id.menuPriceDscIV, 13);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SortDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private SortDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[12]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
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