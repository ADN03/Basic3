package adni.adni_gumilang.com.basic3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //TODO inisialisasi
    //inisialisasi ArrayList
    private List kontentList = new ArrayList<>();
    //inisialisasi Array Adapter
    private ArrayAdapter adapter = null;
    //inisialisasi/deklarasi Variable ListView
    private ListView listView;

    //Inisialisasi/deklarasi komponen2 yg lain
    private EditText inputData;
    private Button saveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Findviewnya
        listView = findViewById(R.id.list_data);
        inputData = findViewById(R.id.input_data);
        saveData = findViewById(R.id.save_data);

        //Mengatur ArrayAdapter untuk ditampilkan di ListView
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, kontentList);
        listView.setAdapter(adapter);

        //Menyimpan data Array dan menampilkannya
        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Konten myKonten = new Konten();
                myKonten.setData(inputData.getText().toString());
                adapter.add(myKonten);
                Toast.makeText(getApplicationContext(), "Data Tersimpan", Toast.LENGTH_LONG).show();
            }
        });


    }
}
