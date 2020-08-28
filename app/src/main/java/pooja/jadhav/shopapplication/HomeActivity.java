package pooja.jadhav.shopapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private FloatingActionButton fab_btn;
    private FirebaseAuth mAuth;
    private RecyclerView recyclerView;
    private TextView totalsumResult;
    //Globar variable..

    private String type;
    private int amount;
    private String note;
    private String post_key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
}