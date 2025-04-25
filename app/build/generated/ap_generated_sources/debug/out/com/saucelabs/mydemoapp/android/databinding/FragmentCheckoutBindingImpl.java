package com.saucelabs.mydemoapp.android.databinding;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.checkoutSV, 1);
        sViewsWithIds.put(R.id.enterPaymentTitleTV, 2);
        sViewsWithIds.put(R.id.enterPaymentMethodTV, 3);
        sViewsWithIds.put(R.id.paymentDetailsTV, 4);
        sViewsWithIds.put(R.id.cardTV, 5);
        sViewsWithIds.put(R.id.mastercardIV, 6);
        sViewsWithIds.put(R.id.visaIV, 7);
        sViewsWithIds.put(R.id.itemV, 8);
        sViewsWithIds.put(R.id.nameTV, 9);
        sViewsWithIds.put(R.id.nameRL, 10);
        sViewsWithIds.put(R.id.nameET, 11);
        sViewsWithIds.put(R.id.nameErrorIV, 12);
        sViewsWithIds.put(R.id.nameErrorTV, 13);
        sViewsWithIds.put(R.id.cardNumberTV, 14);
        sViewsWithIds.put(R.id.cardNumberRL, 15);
        sViewsWithIds.put(R.id.cardNumberET, 16);
        sViewsWithIds.put(R.id.cardNumberErrorIV, 17);
        sViewsWithIds.put(R.id.cardNumberErrorTV, 18);
        sViewsWithIds.put(R.id.expirationDateTV, 19);
        sViewsWithIds.put(R.id.expirationDateRL, 20);
        sViewsWithIds.put(R.id.expirationDateET, 21);
        sViewsWithIds.put(R.id.expirationDateIV, 22);
        sViewsWithIds.put(R.id.expirationDateErrorTV, 23);
        sViewsWithIds.put(R.id.securityCodeTV, 24);
        sViewsWithIds.put(R.id.questionIV, 25);
        sViewsWithIds.put(R.id.securityCodeRL, 26);
        sViewsWithIds.put(R.id.securityCodeET, 27);
        sViewsWithIds.put(R.id.securityCodeIV, 28);
        sViewsWithIds.put(R.id.securityCodeErrorTV, 29);
        sViewsWithIds.put(R.id.billingAddressCB, 30);
        sViewsWithIds.put(R.id.checkoutInfoCL, 31);
        sViewsWithIds.put(R.id.fullNameTV, 32);
        sViewsWithIds.put(R.id.fullNameRL, 33);
        sViewsWithIds.put(R.id.fullNameET, 34);
        sViewsWithIds.put(R.id.fullNameErrorIV, 35);
        sViewsWithIds.put(R.id.fullNameErrorTV, 36);
        sViewsWithIds.put(R.id.address1TV, 37);
        sViewsWithIds.put(R.id.address1RL, 38);
        sViewsWithIds.put(R.id.address1ET, 39);
        sViewsWithIds.put(R.id.address1ErrorIV, 40);
        sViewsWithIds.put(R.id.address1ErrorTV, 41);
        sViewsWithIds.put(R.id.address2TV, 42);
        sViewsWithIds.put(R.id.address2RL, 43);
        sViewsWithIds.put(R.id.address2ET, 44);
        sViewsWithIds.put(R.id.address2ErrorIV, 45);
        sViewsWithIds.put(R.id.address2ErrorTV, 46);
        sViewsWithIds.put(R.id.cityTV, 47);
        sViewsWithIds.put(R.id.cityRL, 48);
        sViewsWithIds.put(R.id.cityET, 49);
        sViewsWithIds.put(R.id.cityIV, 50);
        sViewsWithIds.put(R.id.cityErrorTV, 51);
        sViewsWithIds.put(R.id.stateTV, 52);
        sViewsWithIds.put(R.id.stateRL, 53);
        sViewsWithIds.put(R.id.stateET, 54);
        sViewsWithIds.put(R.id.stateIV, 55);
        sViewsWithIds.put(R.id.stateErrorTV, 56);
        sViewsWithIds.put(R.id.zipTV, 57);
        sViewsWithIds.put(R.id.zipRL, 58);
        sViewsWithIds.put(R.id.zipET, 59);
        sViewsWithIds.put(R.id.zipIV, 60);
        sViewsWithIds.put(R.id.zipErrorTV, 61);
        sViewsWithIds.put(R.id.countryTV, 62);
        sViewsWithIds.put(R.id.countryRL, 63);
        sViewsWithIds.put(R.id.countryET, 64);
        sViewsWithIds.put(R.id.countryIV, 65);
        sViewsWithIds.put(R.id.countryErrorTV, 66);
        sViewsWithIds.put(R.id.paymentCV, 67);
        sViewsWithIds.put(R.id.paymentBtn, 68);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 69, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[39]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.TextView) bindings[41]
            , (android.widget.RelativeLayout) bindings[38]
            , (android.widget.TextView) bindings[37]
            , (android.widget.EditText) bindings[44]
            , (android.widget.ImageView) bindings[45]
            , (android.widget.TextView) bindings[46]
            , (android.widget.RelativeLayout) bindings[43]
            , (android.widget.TextView) bindings[42]
            , (android.widget.CheckBox) bindings[30]
            , (com.uphyca.creditcardedittext.CreditCardNumberEditText) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[31]
            , (androidx.core.widget.NestedScrollView) bindings[1]
            , (android.widget.EditText) bindings[49]
            , (android.widget.TextView) bindings[51]
            , (android.widget.ImageView) bindings[50]
            , (android.widget.RelativeLayout) bindings[48]
            , (android.widget.TextView) bindings[47]
            , (android.widget.EditText) bindings[64]
            , (android.widget.TextView) bindings[66]
            , (android.widget.ImageView) bindings[65]
            , (android.widget.RelativeLayout) bindings[63]
            , (android.widget.TextView) bindings[62]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (com.uphyca.creditcardedittext.CreditCardDateEditText) bindings[21]
            , (android.widget.TextView) bindings[23]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.RelativeLayout) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.widget.EditText) bindings[34]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.TextView) bindings[36]
            , (android.widget.RelativeLayout) bindings[33]
            , (android.widget.TextView) bindings[32]
            , (android.view.View) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.EditText) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.Button) bindings[68]
            , (androidx.cardview.widget.CardView) bindings[67]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.EditText) bindings[27]
            , (android.widget.TextView) bindings[29]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.RelativeLayout) bindings[26]
            , (android.widget.TextView) bindings[24]
            , (android.widget.EditText) bindings[54]
            , (android.widget.TextView) bindings[56]
            , (android.widget.ImageView) bindings[55]
            , (android.widget.RelativeLayout) bindings[53]
            , (android.widget.TextView) bindings[52]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.EditText) bindings[59]
            , (android.widget.TextView) bindings[61]
            , (android.widget.ImageView) bindings[60]
            , (android.widget.RelativeLayout) bindings[58]
            , (android.widget.TextView) bindings[57]
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