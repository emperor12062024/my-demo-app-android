package com.saucelabs.mydemoapp.android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.saucelabs.mydemoapp.android.databinding.ActivityDebugCrashBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.ActivityDebugFeedbackBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.ActivityMainBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.ActivitySplashBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.ActivityVirtualUsbBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.DialogReviewBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentAboutBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentBiometricBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentCartBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentCheckoutBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentCheckoutCompleteBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentCheckoutInfoBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentDrawingBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentLocationBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentLoginBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentPlaceOrderBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentProductCatalogBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentProductDetailBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentQrBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentWebAddressBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.FragmentWebViewBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.ItemColorBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.ItemMyCartBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.ItemProductsBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.MenuHeaderLayoutBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.MenuItemBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.NavigationLayoutBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.RattingLayoutBindingImpl;
import com.saucelabs.mydemoapp.android.databinding.SortDialogBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDEBUGCRASH = 1;

  private static final int LAYOUT_ACTIVITYDEBUGFEEDBACK = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYSPLASH = 4;

  private static final int LAYOUT_ACTIVITYVIRTUALUSB = 5;

  private static final int LAYOUT_DIALOGREVIEW = 6;

  private static final int LAYOUT_FRAGMENTABOUT = 7;

  private static final int LAYOUT_FRAGMENTBIOMETRIC = 8;

  private static final int LAYOUT_FRAGMENTCART = 9;

  private static final int LAYOUT_FRAGMENTCHECKOUT = 10;

  private static final int LAYOUT_FRAGMENTCHECKOUTCOMPLETE = 11;

  private static final int LAYOUT_FRAGMENTCHECKOUTINFO = 12;

  private static final int LAYOUT_FRAGMENTDRAWING = 13;

  private static final int LAYOUT_FRAGMENTLOCATION = 14;

  private static final int LAYOUT_FRAGMENTLOGIN = 15;

  private static final int LAYOUT_FRAGMENTPLACEORDER = 16;

  private static final int LAYOUT_FRAGMENTPRODUCTCATALOG = 17;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAIL = 18;

  private static final int LAYOUT_FRAGMENTQR = 19;

  private static final int LAYOUT_FRAGMENTWEBADDRESS = 20;

  private static final int LAYOUT_FRAGMENTWEBVIEW = 21;

  private static final int LAYOUT_ITEMCOLOR = 22;

  private static final int LAYOUT_ITEMMYCART = 23;

  private static final int LAYOUT_ITEMPRODUCTS = 24;

  private static final int LAYOUT_MENUHEADERLAYOUT = 25;

  private static final int LAYOUT_MENUITEM = 26;

  private static final int LAYOUT_NAVIGATIONLAYOUT = 27;

  private static final int LAYOUT_RATTINGLAYOUT = 28;

  private static final int LAYOUT_SORTDIALOG = 29;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(29);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.activity_debug_crash, LAYOUT_ACTIVITYDEBUGCRASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.activity_debug_feedback, LAYOUT_ACTIVITYDEBUGFEEDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.activity_virtual_usb, LAYOUT_ACTIVITYVIRTUALUSB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.dialog_review, LAYOUT_DIALOGREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_biometric, LAYOUT_FRAGMENTBIOMETRIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_checkout, LAYOUT_FRAGMENTCHECKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_checkout_complete, LAYOUT_FRAGMENTCHECKOUTCOMPLETE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_checkout_info, LAYOUT_FRAGMENTCHECKOUTINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_drawing, LAYOUT_FRAGMENTDRAWING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_location, LAYOUT_FRAGMENTLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_place_order, LAYOUT_FRAGMENTPLACEORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_product_catalog, LAYOUT_FRAGMENTPRODUCTCATALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_product_detail, LAYOUT_FRAGMENTPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_qr, LAYOUT_FRAGMENTQR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_web_address, LAYOUT_FRAGMENTWEBADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.fragment_web_view, LAYOUT_FRAGMENTWEBVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.item_color, LAYOUT_ITEMCOLOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.item_my_cart, LAYOUT_ITEMMYCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.item_products, LAYOUT_ITEMPRODUCTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.menu_header_layout, LAYOUT_MENUHEADERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.menu_item, LAYOUT_MENUITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.navigation_layout, LAYOUT_NAVIGATIONLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.ratting_layout, LAYOUT_RATTINGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saucelabs.mydemoapp.android.R.layout.sort_dialog, LAYOUT_SORTDIALOG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDEBUGCRASH: {
          if ("layout/activity_debug_crash_0".equals(tag)) {
            return new ActivityDebugCrashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_debug_crash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDEBUGFEEDBACK: {
          if ("layout/activity_debug_feedback_0".equals(tag)) {
            return new ActivityDebugFeedbackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_debug_feedback is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVIRTUALUSB: {
          if ("layout/activity_virtual_usb_0".equals(tag)) {
            return new ActivityVirtualUsbBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_virtual_usb is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGREVIEW: {
          if ("layout/dialog_review_0".equals(tag)) {
            return new DialogReviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_review is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBIOMETRIC: {
          if ("layout/fragment_biometric_0".equals(tag)) {
            return new FragmentBiometricBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_biometric is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKOUT: {
          if ("layout/fragment_checkout_0".equals(tag)) {
            return new FragmentCheckoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_checkout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKOUTCOMPLETE: {
          if ("layout/fragment_checkout_complete_0".equals(tag)) {
            return new FragmentCheckoutCompleteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_checkout_complete is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKOUTINFO: {
          if ("layout/fragment_checkout_info_0".equals(tag)) {
            return new FragmentCheckoutInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_checkout_info is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDRAWING: {
          if ("layout/fragment_drawing_0".equals(tag)) {
            return new FragmentDrawingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_drawing is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOCATION: {
          if ("layout/fragment_location_0".equals(tag)) {
            return new FragmentLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_location is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACEORDER: {
          if ("layout/fragment_place_order_0".equals(tag)) {
            return new FragmentPlaceOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_order is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTCATALOG: {
          if ("layout/fragment_product_catalog_0".equals(tag)) {
            return new FragmentProductCatalogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_catalog is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTDETAIL: {
          if ("layout/fragment_product_detail_0".equals(tag)) {
            return new FragmentProductDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTQR: {
          if ("layout/fragment_qr_0".equals(tag)) {
            return new FragmentQrBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_qr is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWEBADDRESS: {
          if ("layout/fragment_web_address_0".equals(tag)) {
            return new FragmentWebAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_web_address is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWEBVIEW: {
          if ("layout/fragment_web_view_0".equals(tag)) {
            return new FragmentWebViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_web_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOLOR: {
          if ("layout/item_color_0".equals(tag)) {
            return new ItemColorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_color is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMYCART: {
          if ("layout/item_my_cart_0".equals(tag)) {
            return new ItemMyCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_my_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPRODUCTS: {
          if ("layout/item_products_0".equals(tag)) {
            return new ItemProductsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_products is invalid. Received: " + tag);
        }
        case  LAYOUT_MENUHEADERLAYOUT: {
          if ("layout/menu_header_layout_0".equals(tag)) {
            return new MenuHeaderLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for menu_header_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_MENUITEM: {
          if ("layout/menu_item_0".equals(tag)) {
            return new MenuItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for menu_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVIGATIONLAYOUT: {
          if ("layout/navigation_layout_0".equals(tag)) {
            return new NavigationLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for navigation_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_RATTINGLAYOUT: {
          if ("layout/ratting_layout_0".equals(tag)) {
            return new RattingLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for ratting_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_SORTDIALOG: {
          if ("layout/sort_dialog_0".equals(tag)) {
            return new SortDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sort_dialog is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.github.gcacace.signaturepad.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(29);

    static {
      sKeys.put("layout/activity_debug_crash_0", com.saucelabs.mydemoapp.android.R.layout.activity_debug_crash);
      sKeys.put("layout/activity_debug_feedback_0", com.saucelabs.mydemoapp.android.R.layout.activity_debug_feedback);
      sKeys.put("layout/activity_main_0", com.saucelabs.mydemoapp.android.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", com.saucelabs.mydemoapp.android.R.layout.activity_splash);
      sKeys.put("layout/activity_virtual_usb_0", com.saucelabs.mydemoapp.android.R.layout.activity_virtual_usb);
      sKeys.put("layout/dialog_review_0", com.saucelabs.mydemoapp.android.R.layout.dialog_review);
      sKeys.put("layout/fragment_about_0", com.saucelabs.mydemoapp.android.R.layout.fragment_about);
      sKeys.put("layout/fragment_biometric_0", com.saucelabs.mydemoapp.android.R.layout.fragment_biometric);
      sKeys.put("layout/fragment_cart_0", com.saucelabs.mydemoapp.android.R.layout.fragment_cart);
      sKeys.put("layout/fragment_checkout_0", com.saucelabs.mydemoapp.android.R.layout.fragment_checkout);
      sKeys.put("layout/fragment_checkout_complete_0", com.saucelabs.mydemoapp.android.R.layout.fragment_checkout_complete);
      sKeys.put("layout/fragment_checkout_info_0", com.saucelabs.mydemoapp.android.R.layout.fragment_checkout_info);
      sKeys.put("layout/fragment_drawing_0", com.saucelabs.mydemoapp.android.R.layout.fragment_drawing);
      sKeys.put("layout/fragment_location_0", com.saucelabs.mydemoapp.android.R.layout.fragment_location);
      sKeys.put("layout/fragment_login_0", com.saucelabs.mydemoapp.android.R.layout.fragment_login);
      sKeys.put("layout/fragment_place_order_0", com.saucelabs.mydemoapp.android.R.layout.fragment_place_order);
      sKeys.put("layout/fragment_product_catalog_0", com.saucelabs.mydemoapp.android.R.layout.fragment_product_catalog);
      sKeys.put("layout/fragment_product_detail_0", com.saucelabs.mydemoapp.android.R.layout.fragment_product_detail);
      sKeys.put("layout/fragment_qr_0", com.saucelabs.mydemoapp.android.R.layout.fragment_qr);
      sKeys.put("layout/fragment_web_address_0", com.saucelabs.mydemoapp.android.R.layout.fragment_web_address);
      sKeys.put("layout/fragment_web_view_0", com.saucelabs.mydemoapp.android.R.layout.fragment_web_view);
      sKeys.put("layout/item_color_0", com.saucelabs.mydemoapp.android.R.layout.item_color);
      sKeys.put("layout/item_my_cart_0", com.saucelabs.mydemoapp.android.R.layout.item_my_cart);
      sKeys.put("layout/item_products_0", com.saucelabs.mydemoapp.android.R.layout.item_products);
      sKeys.put("layout/menu_header_layout_0", com.saucelabs.mydemoapp.android.R.layout.menu_header_layout);
      sKeys.put("layout/menu_item_0", com.saucelabs.mydemoapp.android.R.layout.menu_item);
      sKeys.put("layout/navigation_layout_0", com.saucelabs.mydemoapp.android.R.layout.navigation_layout);
      sKeys.put("layout/ratting_layout_0", com.saucelabs.mydemoapp.android.R.layout.ratting_layout);
      sKeys.put("layout/sort_dialog_0", com.saucelabs.mydemoapp.android.R.layout.sort_dialog);
    }
  }
}
