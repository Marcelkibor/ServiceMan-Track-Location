// Generated by view binder compiler. Do not edit!
package com.example.petvet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.petvet.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ClientSelectServiceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout FrameContent;

  @NonNull
  public final FrameLayout FramePhoto;

  @NonNull
  public final MaterialButton btRequest;

  @NonNull
  public final EditText edAge;

  @NonNull
  public final EditText edIssue;

  @NonNull
  public final FrameLayout headerFrame;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView servicePhoto;

  @NonNull
  public final Spinner spCategory;

  @NonNull
  public final Spinner spServices;

  @NonNull
  public final Spinner spSex;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvAge2;

  @NonNull
  public final TextView tvAge3;

  @NonNull
  public final TextView tvAge4;

  @NonNull
  public final CardView tvCardHeader;

  @NonNull
  public final TextView tvCategory2;

  @NonNull
  public final TextView tvDocName;

  @NonNull
  public final TextView tvHeader2;

  @NonNull
  public final TextView tvSex2;

  private ClientSelectServiceBinding(@NonNull ConstraintLayout rootView,
      @NonNull FrameLayout FrameContent, @NonNull FrameLayout FramePhoto,
      @NonNull MaterialButton btRequest, @NonNull EditText edAge, @NonNull EditText edIssue,
      @NonNull FrameLayout headerFrame, @NonNull ImageView imageView,
      @NonNull ImageView servicePhoto, @NonNull Spinner spCategory, @NonNull Spinner spServices,
      @NonNull Spinner spSex, @NonNull TextView textView3, @NonNull TextView tvAge,
      @NonNull TextView tvAge2, @NonNull TextView tvAge3, @NonNull TextView tvAge4,
      @NonNull CardView tvCardHeader, @NonNull TextView tvCategory2, @NonNull TextView tvDocName,
      @NonNull TextView tvHeader2, @NonNull TextView tvSex2) {
    this.rootView = rootView;
    this.FrameContent = FrameContent;
    this.FramePhoto = FramePhoto;
    this.btRequest = btRequest;
    this.edAge = edAge;
    this.edIssue = edIssue;
    this.headerFrame = headerFrame;
    this.imageView = imageView;
    this.servicePhoto = servicePhoto;
    this.spCategory = spCategory;
    this.spServices = spServices;
    this.spSex = spSex;
    this.textView3 = textView3;
    this.tvAge = tvAge;
    this.tvAge2 = tvAge2;
    this.tvAge3 = tvAge3;
    this.tvAge4 = tvAge4;
    this.tvCardHeader = tvCardHeader;
    this.tvCategory2 = tvCategory2;
    this.tvDocName = tvDocName;
    this.tvHeader2 = tvHeader2;
    this.tvSex2 = tvSex2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ClientSelectServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ClientSelectServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.client_select_service, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ClientSelectServiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.FrameContent;
      FrameLayout FrameContent = ViewBindings.findChildViewById(rootView, id);
      if (FrameContent == null) {
        break missingId;
      }

      id = R.id.FramePhoto;
      FrameLayout FramePhoto = ViewBindings.findChildViewById(rootView, id);
      if (FramePhoto == null) {
        break missingId;
      }

      id = R.id.btRequest;
      MaterialButton btRequest = ViewBindings.findChildViewById(rootView, id);
      if (btRequest == null) {
        break missingId;
      }

      id = R.id.edAge;
      EditText edAge = ViewBindings.findChildViewById(rootView, id);
      if (edAge == null) {
        break missingId;
      }

      id = R.id.edIssue;
      EditText edIssue = ViewBindings.findChildViewById(rootView, id);
      if (edIssue == null) {
        break missingId;
      }

      id = R.id.headerFrame;
      FrameLayout headerFrame = ViewBindings.findChildViewById(rootView, id);
      if (headerFrame == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.servicePhoto;
      ImageView servicePhoto = ViewBindings.findChildViewById(rootView, id);
      if (servicePhoto == null) {
        break missingId;
      }

      id = R.id.spCategory;
      Spinner spCategory = ViewBindings.findChildViewById(rootView, id);
      if (spCategory == null) {
        break missingId;
      }

      id = R.id.spServices;
      Spinner spServices = ViewBindings.findChildViewById(rootView, id);
      if (spServices == null) {
        break missingId;
      }

      id = R.id.spSex;
      Spinner spSex = ViewBindings.findChildViewById(rootView, id);
      if (spSex == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.tvAge;
      TextView tvAge = ViewBindings.findChildViewById(rootView, id);
      if (tvAge == null) {
        break missingId;
      }

      id = R.id.tvAge2;
      TextView tvAge2 = ViewBindings.findChildViewById(rootView, id);
      if (tvAge2 == null) {
        break missingId;
      }

      id = R.id.tvAge3;
      TextView tvAge3 = ViewBindings.findChildViewById(rootView, id);
      if (tvAge3 == null) {
        break missingId;
      }

      id = R.id.tvAge4;
      TextView tvAge4 = ViewBindings.findChildViewById(rootView, id);
      if (tvAge4 == null) {
        break missingId;
      }

      id = R.id.tvCardHeader;
      CardView tvCardHeader = ViewBindings.findChildViewById(rootView, id);
      if (tvCardHeader == null) {
        break missingId;
      }

      id = R.id.tvCategory2;
      TextView tvCategory2 = ViewBindings.findChildViewById(rootView, id);
      if (tvCategory2 == null) {
        break missingId;
      }

      id = R.id.tvDocName;
      TextView tvDocName = ViewBindings.findChildViewById(rootView, id);
      if (tvDocName == null) {
        break missingId;
      }

      id = R.id.tvHeader2;
      TextView tvHeader2 = ViewBindings.findChildViewById(rootView, id);
      if (tvHeader2 == null) {
        break missingId;
      }

      id = R.id.tvSex2;
      TextView tvSex2 = ViewBindings.findChildViewById(rootView, id);
      if (tvSex2 == null) {
        break missingId;
      }

      return new ClientSelectServiceBinding((ConstraintLayout) rootView, FrameContent, FramePhoto,
          btRequest, edAge, edIssue, headerFrame, imageView, servicePhoto, spCategory, spServices,
          spSex, textView3, tvAge, tvAge2, tvAge3, tvAge4, tvCardHeader, tvCategory2, tvDocName,
          tvHeader2, tvSex2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}