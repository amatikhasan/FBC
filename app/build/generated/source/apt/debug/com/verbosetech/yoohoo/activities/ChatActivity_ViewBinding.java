// Generated code from Butter Knife. Do not modify!
package com.verbosetech.yoohoo.activities;

import android.annotation.SuppressLint;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.vanniktech.emoji.EmojiEditText;
import com.verbosetech.yoohoo.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatActivity_ViewBinding implements Unbinder {
  private ChatActivity target;

  private View view2131230791;

  private View view2131230922;

  private View view2131230758;

  private View view2131230998;

  private View view2131230770;

  private View view2131230775;

  private View view2131230768;

  private View view2131230771;

  private View view2131230767;

  private View view2131230772;

  private View view2131230769;

  @UiThread
  public ChatActivity_ViewBinding(ChatActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  @SuppressLint("ClickableViewAccessibility")
  public ChatActivity_ViewBinding(final ChatActivity target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.chatToolbar, "field 'toolbar'", Toolbar.class);
    view = Utils.findRequiredView(source, R.id.chatToolbarContent, "field 'toolbarContent' and method 'onViewClicked'");
    target.toolbarContent = Utils.castView(view, R.id.chatToolbarContent, "field 'toolbarContent'", RelativeLayout.class);
    view2131230791 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.selectedCount = Utils.findRequiredViewAsType(source, R.id.selectedCount, "field 'selectedCount'", TextView.class);
    target.addAttachmentLayout = Utils.findRequiredViewAsType(source, R.id.add_attachment_layout, "field 'addAttachmentLayout'", TableLayout.class);
    target.usersImage = Utils.findRequiredViewAsType(source, R.id.users_image, "field 'usersImage'", CircleImageView.class);
    target.status = Utils.findRequiredViewAsType(source, R.id.emotion, "field 'status'", TextView.class);
    target.userName = Utils.findRequiredViewAsType(source, R.id.user_name, "field 'userName'", TextView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.new_message, "field 'newMessage' and method 'onNewMessageTouched'");
    target.newMessage = Utils.castView(view, R.id.new_message, "field 'newMessage'", EmojiEditText.class);
    view2131230922 = view;
    view.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View p0, MotionEvent p1) {
        return target.onNewMessageTouched();
      }
    });
    view = Utils.findRequiredView(source, R.id.add_attachment, "field 'addAttachment' and method 'onViewClicked'");
    target.addAttachment = Utils.castView(view, R.id.add_attachment, "field 'addAttachment'", ImageView.class);
    view2131230758 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.send, "field 'sendMessage' and method 'onViewClicked'");
    target.sendMessage = Utils.castView(view, R.id.send, "field 'sendMessage'", ImageView.class);
    view2131230998 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.sendContainer = Utils.findRequiredViewAsType(source, R.id.sendContainer, "field 'sendContainer'", LinearLayout.class);
    target.rootView = Utils.findRequiredViewAsType(source, R.id.rootView, "field 'rootView'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.attachment_emoji, "field 'attachment_emoji' and method 'onAttachmentClicked'");
    target.attachment_emoji = Utils.castView(view, R.id.attachment_emoji, "field 'attachment_emoji'", ImageView.class);
    view2131230770 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAttachmentClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.back_button, "method 'onViewClicked'");
    view2131230775 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.attachment_contact, "method 'onAttachmentClicked'");
    view2131230768 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAttachmentClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.attachment_gallery, "method 'onAttachmentClicked'");
    view2131230771 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAttachmentClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.attachment_audio, "method 'onAttachmentClicked'");
    view2131230767 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAttachmentClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.attachment_location, "method 'onAttachmentClicked'");
    view2131230772 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAttachmentClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.attachment_document, "method 'onAttachmentClicked'");
    view2131230769 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAttachmentClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.toolbarContent = null;
    target.selectedCount = null;
    target.addAttachmentLayout = null;
    target.usersImage = null;
    target.status = null;
    target.userName = null;
    target.recyclerView = null;
    target.newMessage = null;
    target.addAttachment = null;
    target.sendMessage = null;
    target.sendContainer = null;
    target.rootView = null;
    target.attachment_emoji = null;

    view2131230791.setOnClickListener(null);
    view2131230791 = null;
    view2131230922.setOnTouchListener(null);
    view2131230922 = null;
    view2131230758.setOnClickListener(null);
    view2131230758 = null;
    view2131230998.setOnClickListener(null);
    view2131230998 = null;
    view2131230770.setOnClickListener(null);
    view2131230770 = null;
    view2131230775.setOnClickListener(null);
    view2131230775 = null;
    view2131230768.setOnClickListener(null);
    view2131230768 = null;
    view2131230771.setOnClickListener(null);
    view2131230771 = null;
    view2131230767.setOnClickListener(null);
    view2131230767 = null;
    view2131230772.setOnClickListener(null);
    view2131230772 = null;
    view2131230769.setOnClickListener(null);
    view2131230769 = null;
  }
}
