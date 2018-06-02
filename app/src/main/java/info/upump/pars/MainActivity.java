package info.upump.pars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewById = findViewById(R.id.text);

        ReaderItem readerItem = new ReaderHTML("item.html", this);
        Reader reader = new Reader(this, readerItem);
        try {
            reader.startReader();
            reader.writeInDb();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        viewById.setText(String.valueOf(reader.getSiseResult()+1));
    }
}
