package com.example.recyclerview;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.model.Product;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  RecyclerView recyclerView;
    private  RecyclerView.Adapter mAdapter;
    private  RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Product 2 อย่างไว้ใน ArrayList<Product> ชื่อว่า products
        //
        List<Product> products = new ArrayList<Product>();
        Product product = new Product();
        product.setProduct_name("ตู้เย็น");
        product.setProduct_image("https://worldtech.asia/cdn/shop/files/WT-RF138_SIL.jpg?v=1724734204");
        product.setProduct_price("7,500");
        products.add(product);

        Product product2 = new Product();
        product2.setProduct_name("ทีวี");
        product2.setProduct_image("https://res.cloudinary.com/sharp-consumer-eu/image/fetch/w_3000,f_auto/https://s3.infra.brandquad.io/accounts-media/SHRP/DAM/origin/b3460ec0-6a8a-11ea-9a43-8a541dae4315.jpg");
        product2.setProduct_price("12,000");
        products.add(product2);


        // ส่ง products ไปให้ MyAdapter
        //
        mAdapter =  new MyAdapter(products, this);
        recyclerView.setAdapter(mAdapter);

    }
}
