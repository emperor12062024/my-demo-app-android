package com.saucelabs.mydemoapp.android.databinding;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutInfoBindingImpl extends FragmentCheckoutInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.checkoutTitleTV, 1);
        sViewsWithIds.put(R.id.enterShippingAddressTV, 2);
        sViewsWithIds.put(R.id.fullNameTV, 3);
        sViewsWithIds.put(R.id.fullNameRL, 4);
        sViewsWithIds.put(R.id.fullNameET, 5);
        sViewsWithIds.put(R.id.fullNameErrorIV, 6);
        sViewsWithIds.put(R.id.fullNameErrorTV, 7);
        sViewsWithIds.put(R.id.address1TV, 8);
        sViewsWithIds.put(R.id.address1RL, 9);
        sViewsWithIds.put(R.id.address1ET, 10);
        sViewsWithIds.put(R.id.address1ErrorIV, 11);
        sViewsWithIds.put(R.id.address1ErrorTV, 12);
        sViewsWithIds.put(R.id.address2TV, 13);
        sViewsWithIds.put(R.id.address2RL, 14);
        sViewsWithIds.put(R.id.address2ET, 15);
        sViewsWithIds.put(R.id.address2ErrorIV, 16);
        sViewsWithIds.put(R.id.address2ErrorTV, 17);
        sViewsWithIds.put(R.id.cityTV, 18);
        sViewsWithIds.put(R.id.cityRL, 19);
        sViewsWithIds.put(R.id.cityET, 20);
        sViewsWithIds.put(R.id.cityIV, 21);
        sViewsWithIds.put(R.id.cityErrorTV, 22);
        sViewsWithIds.put(R.id.zipTV, 23);
        sViewsWithIds.put(R.id.zipRL, 24);
        sViewsWithIds.put(R.id.zipET, 25);
        sViewsWithIds.put(R.id.zipIV, 26);
        sViewsWithIds.put(R.id.zipErrorTV, 27);
        sViewsWithIds.put(R.id.stateTV, 28);
        sViewsWithIds.put(R.id.stateRL, 29);
        sViewsWithIds.put(R.id.stateET, 30);
        sViewsWithIds.put(R.id.stateIV, 31);
        sViewsWithIds.put(R.id.stateErrorTV, 32);
        sViewsWithIds.put(R.id.countryTV, 33);
        sViewsWithIds.put(R.id.countryRL, 34);
        sViewsWithIds.put(R.id.countryET, 35);
        sViewsWithIds.put(R.id.countryIV, 36);
        sViewsWithIds.put(R.id.countryErrorTV, 37);
        sViewsWithIds.put(R.id.paymentCV, 38);
        sViewsWithIds.put(R.id.paymentBtn, 39);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 40, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.EditText) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[20]
            , (android.widget.TextView) bindings[22]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.TextView) bindings[18]
            , (android.widget.EditText) bindings[35]
            , (android.widget.TextView) bindings[37]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.RelativeLayout) bindings[34]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[39]
            , (androidx.cardview.widget.CardView) bindings[38]
            , (android.widget.EditText) bindings[30]
            , (android.widget.TextView) bindings[32]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.RelativeLayout) bindings[29]
            , (android.widget.TextView) bindings[28]
            , (android.widget.EditText) bindings[25]
            , (android.widget.TextView) bindings[27]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.RelativeLayout) bindings[24]
            , (android.widget.TextView) bindings[23]
            );
        this.checkoutSV.setTag(null);
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