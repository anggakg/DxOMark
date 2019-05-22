package picodiploma.dicoding.dxomark;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import picodiploma.dicoding.dxomark.Smartphone;

import java.util.ArrayList;

public class DetailSmartphoneAct extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra name";

    ImageView photo_detail;
    TextView release,weight,operating_system,storage,inch,dimension,megapixel,pixel,chipset,cpu,gpu,
            main_camera,video,sensor,battery;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_smartphone);

        photo_detail = findViewById(R.id.photo_detail);

        release = findViewById(R.id.release);
        weight = findViewById(R.id.weight);
        operating_system = findViewById(R.id.operating_system);
        storage = findViewById(R.id.storage);
        inch = findViewById(R.id.inch);
        dimension = findViewById(R.id.dimension);
        megapixel = findViewById(R.id.megapixel);
        pixel = findViewById(R.id.pixel);
        chipset = findViewById(R.id.chipset);
        cpu = findViewById(R.id.cpu);
        gpu = findViewById(R.id.gpu);
        main_camera = findViewById(R.id.main_camera);
        video = findViewById(R.id.video);
        sensor = findViewById(R.id.sensor);
        battery = findViewById(R.id.battery);

        String brand = getIntent().getStringExtra(EXTRA_NAME);
        getSupportActionBar().setTitle(brand);

        reference = FirebaseDatabase.getInstance().getReference().child("Smartphone").child(brand);
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Glide.with(DetailSmartphoneAct.this).load(dataSnapshot.child("photo_detail").getValue().toString()).into(photo_detail);
                release.setText(dataSnapshot.child("release").getValue().toString());
                weight.setText(dataSnapshot.child("weight").getValue().toString());
                operating_system.setText(dataSnapshot.child("operating_system").getValue().toString());
                storage.setText(dataSnapshot.child("storage").getValue().toString());
                inch.setText(dataSnapshot.child("inch").getValue().toString());
                dimension.setText(dataSnapshot.child("dimension").getValue().toString());
                megapixel.setText(dataSnapshot.child("megapixel").getValue().toString());
                pixel.setText(dataSnapshot.child("pixel").getValue().toString());
                chipset.setText(dataSnapshot.child("chipset").getValue().toString());
                cpu.setText(dataSnapshot.child("cpu").getValue().toString());
                gpu.setText(dataSnapshot.child("gpu").getValue().toString());
                main_camera.setText(dataSnapshot.child("main_camera").getValue().toString());
                video.setText(dataSnapshot.child("video").getValue().toString());
                sensor.setText(dataSnapshot.child("sensor").getValue().toString());
                battery.setText(dataSnapshot.child("battery").getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
