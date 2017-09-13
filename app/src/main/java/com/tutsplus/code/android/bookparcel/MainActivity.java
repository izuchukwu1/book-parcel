package com.tutsplus.code.android.bookparcel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final EditText mBkTitle = (EditText) findViewById(R.id.title);
    final EditText mBkAuthor = (EditText) findViewById(R.id.author);

    Button button = (Button) findViewById(R.id.submit_button);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        Book book = new Book(mBkTitle.getText().toString(),
                mBkAuthor.getText().toString());

        Intent intent = new Intent(MainActivity.this, BookActivity.class);
        intent.putExtra("Book", book);
        startActivity(intent);
      }
    });
  }
}
