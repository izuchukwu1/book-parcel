package com.tutsplus.code.android.bookparcel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jioke on 9/10/17.
 */

public class Book implements Parcelable {
  // book basics
  private String title;
  private String author;

  // main constructor
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  // getters
  public String getTitle() { return title; }
  public String getAuthor() { return author; }

  // write object values to parcel for storage
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(title);
    dest.writeString(author);
  }

  public Book(Parcel parcel) {
    title = parcel.readString();
    author = parcel.readString();
  }

  public static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>() {

    @Override
    public Book createFromParcel(Parcel parcel) {
      return new Book(parcel);
    }

    @Override
    public Book[] newArray(int size) {
      return new Book[0];
    }
  };

  public int describeContents() {
    return hashCode();
  }
}
