package hokudai.kazusasa.BMCounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        countText = findViewById(R.id.countText);
        Button incrementBtn = findViewById(R.id.incrementButton);
        Button decrementBtn = findViewById(R.id.decrementButton);
        Button resetBtn = findViewById(R.id.resetButton);
        
        incrementBtn.setOnClickListener(v -> {
            count++;
            countText.setText(String.valueOf(count));
        });
        
        decrementBtn.setOnClickListener(v -> {
            if (count > 0) {
                count--;
                countText.setText(String.valueOf(count));
            }
        });
        
        resetBtn.setOnClickListener(v -> {
            count = 0;
            countText.setText(String.valueOf(count));
        });
    }
}
