package com.saucelabs.mydemoapp.android.databinding;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"menu_header_layout"},
            new int[] {3},
            new int[] {com.saucelabs.mydemoapp.android.R.layout.menu_header_layout});
        sIncludes.setIncludes(2, 
            new String[] {"navigation_layout"},
            new int[] {4},
            new int[] {com.saucelabs.mydemoapp.android.R.layout.navigation_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragment_container, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.FrameLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            , (com.saucelabs.mydemoapp.android.databinding.NavigationLayoutBinding) bindings[4]
            , (android.widget.FrameLayout) bindings[5]
            , (com.saucelabs.mydemoapp.android.databinding.MenuHeaderLayoutBinding) bindings[3]
            );
        this.container.setTag(null);
        setContainedBinding(this.drawerMenu);
        setContainedBinding(this.header);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.FrameLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        header.invalidateAll();
        drawerMenu.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (header.hasPendingBindings()) {
            return true;
        }
        if (drawerMenu.hasPendingBindings()) {
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
        header.setLifecycleOwner(lifecycleOwner);
        drawerMenu.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHeader((com.saucelabs.mydemoapp.android.databinding.MenuHeaderLayoutBinding) object, fieldId);
            case 1 :
                return onChangeDrawerMenu((com.saucelabs.mydemoapp.android.databinding.NavigationLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHeader(com.saucelabs.mydemoapp.android.databinding.MenuHeaderLayoutBinding Header, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDrawerMenu(com.saucelabs.mydemoapp.android.databinding.NavigationLayoutBinding DrawerMenu, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        executeBindingsOn(header);
        executeBindingsOn(drawerMenu);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): header
        flag 1 (0x2L): drawerMenu
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}