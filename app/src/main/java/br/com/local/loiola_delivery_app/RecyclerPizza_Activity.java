package br.com.local.loiola_delivery_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerPizza_Activity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[],s3[];
    int images [] = {R.drawable.pizzademussarela, R.drawable.pizzademarguerita, R.drawable.pizzaquatroqueijos,
    R.drawable.pizzadebacon, R.drawable.pizzadecalabresa, R.drawable.pizzabaiana,
    R.drawable.pizzaamericana, R.drawable.pizzadebauru, R.drawable.pizzaportuguesa,
    R.drawable.pizzadepeperoni, R.drawable.pizzadelombo, R.drawable.pizzadeperu, R.drawable.pizzanordestina,
    R.drawable.pizzadeatum, R.drawable.pizzadecamarao, R.drawable.pizzadeescarola, R.drawable.pizzadebrocolis,
    R.drawable.pizzadepalmito, R.drawable.pizzadefrangocomcatupiry, R.drawable.modadacasa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_pizza);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.NomePizzas);
        s2 = getResources().getStringArray(R.array.DescricaoPizzas);
        s3 = getResources().getStringArray(R.array.ValoresPizzas);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}