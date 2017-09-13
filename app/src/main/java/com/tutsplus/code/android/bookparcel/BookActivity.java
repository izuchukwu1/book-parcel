package com.tutsplus.code.android.bookparcel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_book);

    TextView mBkTitle = (TextView) findViewById(R.id.bk_title);
    TextView mBkAuthor = (TextView) findViewById(R.id.bk_author);

    Intent intent = getIntent();
    Book book = intent.getParcelableExtra("Book");

    mBkTitle.setText("Title:" + book.getTitle());
    mBkAuthor.setText("Author:" + book.getAuthor());

  }
}
