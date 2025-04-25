package com.saucelabs.mydemoapp.android.databinding;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlaceOrderBindingImpl extends FragmentPlaceOrderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.checkoutSV, 1);
        sViewsWithIds.put(R.id.checkoutTitleTV, 2);
        sViewsWithIds.put(R.id.enterShippingAddressTV, 3);
        sViewsWithIds.put(R.id.placeOrderRV, 4);
        sViewsWithIds.put(R.id.itemV, 5);
        sViewsWithIds.put(R.id.addressLL, 6);
        sViewsWithIds.put(R.id.fullNameTV, 7);
        sViewsWithIds.put(R.id.addressTV, 8);
        sViewsWithIds.put(R.id.cityTV, 9);
        sViewsWithIds.put(R.id.countryTV, 10);
        sViewsWithIds.put(R.id.billingLL, 11);
        sViewsWithIds.put(R.id.cardHolderTV, 12);
        sViewsWithIds.put(R.id.cardNumberTV, 13);
        sViewsWithIds.put(R.id.expirationDateTV, 14);
        sViewsWithIds.put(R.id.billingAddressTV, 15);
        sViewsWithIds.put(R.id.billingAddressLL, 16);
        sViewsWithIds.put(R.id.billFullnameTV, 17);
        sViewsWithIds.put(R.id.billaddressTV, 18);
        sViewsWithIds.put(R.id.billingCityAndStateTV, 19);
        sViewsWithIds.put(R.id.billingZipAndCountryTV, 20);
        sViewsWithIds.put(R.id.item2V, 21);
        sViewsWithIds.put(R.id.dhlTV, 22);
        sViewsWithIds.put(R.id.amountTV, 23);
        sViewsWithIds.put(R.id.arrivalTV, 24);
        sViewsWithIds.put(R.id.socialLL, 25);
        sViewsWithIds.put(R.id.twitterIV, 26);
        sViewsWithIds.put(R.id.FacebookIV, 27);
        sViewsWithIds.put(R.id.LinkedInIV, 28);
        sViewsWithIds.put(R.id.paymentCV, 29);
        sViewsWithIds.put(R.id.totalLL, 30);
        sViewsWithIds.put(R.id.totalTextTV, 31);
        sViewsWithIds.put(R.id.itemNumberTV, 32);
        sViewsWithIds.put(R.id.totalAmountTV, 33);
        sViewsWithIds.put(R.id.paymentBtn, 34);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlaceOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private FragmentPlaceOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[19]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (androidx.core.widget.NestedScrollView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[21]
            , (android.widget.TextView) bindings[32]
            , (android.view.View) bindings[5]
            , (android.widget.Button) bindings[34]
            , (androidx.cardview.widget.CardView) bindings[29]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.TextView) bindings[33]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.TextView) bindings[31]
            , (android.widget.ImageView) bindings[26]
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