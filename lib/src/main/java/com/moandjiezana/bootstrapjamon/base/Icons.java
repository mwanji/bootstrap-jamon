package com.moandjiezana.bootstrapjamon.base;

public enum Icons {
  glass, music, search, envelope, heart, star, star_empty, user, film, th_large, th, th_list, ok, remove, zoom_in, zoom_out, off, signal, cog, trash, home, file, time, road, download_alt, download, upload, inbox, play_circle, repeat,
  refresh, list_alt, lock, flag, headphones, volume_off, volume_down, volume_up, qrcode, barcode, tag, tags, book, bookmark, print, camera, font, bold, italic, text_height, text_width, align_left, align_center, align_right, align_justify, list, indent_left, indent_right, facetime_video, picture,
  pencil, map_marker, adjust, tint, edit, share, check, move, step_backward, fast_backward, play, pause, stop, forward, fast_forward, step_forward, eject, chevron_left, chevron_right, plus_sign, minus_sign, remove_sign, ok_sign, question_sign, info_sign, screenshot, remove_circle, ok_circle, ban_circle,
  arrow_left, arrow_right, arrow_up, arrow_down, share_alt, resize_full, resize_small, plus, minus, asterisk, exclamation_sign, gift, leaf, fire, eye_open, eye_close, warning_sign, plane, calendar, random, comment, magnet, chevron_up, chevron_down, retweet, shopping_cart, folder_close, folder_open, resize_vertical, resize_horizontal;
  
  public String toString() {
    return "icon-" + name().replace('_', '-');
  };
}