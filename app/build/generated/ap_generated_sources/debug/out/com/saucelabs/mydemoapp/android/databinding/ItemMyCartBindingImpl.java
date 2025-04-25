package com.saucelabs.mydemoapp.android.databinding;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyCartBindingImpl extends ItemMyCartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(1, 
            new String[] {"ratting_layout"},
            new int[] {2},
            new int[] {com.saucelabs.mydemoapp.android.R.layout.ratting_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.productIV, 3);
        sViewsWithIds.put(R.id.titleTV, 4);
        sViewsWithIds.put(R.id.priceTV, 5);
        sViewsWithIds.put(R.id.colorTitleTV, 6);
        sViewsWithIds.put(R.id.colorIV, 7);
        sViewsWithIds.put(R.id.addToCartLL, 8);
        sViewsWithIds.put(R.id.minusIV, 9);
        sViewsWithIds.put(R.id.noTV, 10);
        sViewsWithIds.put(R.id.plusIV, 11);
        sViewsWithIds.put(R.id.removeBt, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemMyCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (com.saucelabs.mydemoapp.android.databinding.RattingLayoutBinding) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            );
        this.infoCL.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.rattingV);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        rattingV.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (rattingV.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rattingV.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRattingV((com.saucelabs.mydemoapp.android.databinding.RattingLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRattingV(com.saucelabs.mydemoapp.android.databinding.RattingLayoutBinding RattingV, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        executeBindingsOn(rattingV);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rattingV
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}