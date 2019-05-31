package sg.edu.rp.soi.p07_demoarrayandarraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);

        items = new String[3];
        items[0] = "Apple";
        items[1] = "Ball";
        items[2] = "Cat";

        String data = "";
        for (int i = 0; i < items.length; i++){
            data = data + items[i] + "\n";
        }
        tvResult.setText(data);

    }
}
