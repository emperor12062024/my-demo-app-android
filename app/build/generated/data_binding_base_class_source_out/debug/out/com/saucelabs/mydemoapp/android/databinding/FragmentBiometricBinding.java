// Generated by data binding compiler. Do not edit!
package com.saucelabs.mydemoapp.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.saucelabs.mydemoapp.android.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBiometricBinding extends ViewDataBinding {
  @NonNull
  public final TextView bioMetricDemoInfoTV;

  @NonNull
  public final TextView bioMetricInfoTV;

  @NonNull
  public final Switch bioMetricSw;

  @NonNull
  public final TextView bioMetricTV;

  protected FragmentBiometricBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView bioMetricDemoInfoTV, TextView bioMetricInfoTV, Switch bioMetricSw,
      TextView bioMetricTV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bioMetricDemoInfoTV = bioMetricDemoInfoTV;
    this.bioMetricInfoTV = bioMetricInfoTV;
    this.bioMetricSw = bioMetricSw;
    this.bioMetricTV = bioMetricTV;
  }

  @NonNull
  public static FragmentBiometricBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_biometric, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBiometricBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBiometricBinding>inflateInternal(inflater, R.layout.fragment_biometric, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBiometricBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_biometric, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBiometricBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBiometricBinding>inflateInternal(inflater, R.layout.fragment_biometric, null, false, component);
  }

  public static FragmentBiometricBinding bind(@NonNull View view) {
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
  public static FragmentBiometricBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBiometricBinding)bind(component, view, R.layout.fragment_biometric);
  }
}
