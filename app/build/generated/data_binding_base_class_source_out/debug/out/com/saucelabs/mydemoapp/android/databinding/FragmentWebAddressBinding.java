// Generated by data binding compiler. Do not edit!
package com.saucelabs.mydemoapp.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.saucelabs.mydemoapp.android.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentWebAddressBinding extends ViewDataBinding {
  @NonNull
  public final TextView enterTV;

  @NonNull
  public final Button goBtn;

  @NonNull
  public final EditText urlET;

  @NonNull
  public final ImageView urlErrorIV;

  @NonNull
  public final TextView urlErrorTV;

  @NonNull
  public final RelativeLayout urlRL;

  @NonNull
  public final TextView urlTV;

  @NonNull
  public final TextView webViewTV;

  protected FragmentWebAddressBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView enterTV, Button goBtn, EditText urlET, ImageView urlErrorIV, TextView urlErrorTV,
      RelativeLayout urlRL, TextView urlTV, TextView webViewTV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.enterTV = enterTV;
    this.goBtn = goBtn;
    this.urlET = urlET;
    this.urlErrorIV = urlErrorIV;
    this.urlErrorTV = urlErrorTV;
    this.urlRL = urlRL;
    this.urlTV = urlTV;
    this.webViewTV = webViewTV;
  }

  @NonNull
  public static FragmentWebAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_web_address, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWebAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentWebAddressBinding>inflateInternal(inflater, R.layout.fragment_web_address, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWebAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_web_address, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWebAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentWebAddressBinding>inflateInternal(inflater, R.layout.fragment_web_address, null, false, component);
  }

  public static FragmentWebAddressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentWebAddressBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentWebAddressBinding)bind(component, view, R.layout.fragment_web_address);
  }
}
