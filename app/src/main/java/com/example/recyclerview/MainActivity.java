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

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // เปิดใช้งาน Edge-to-Edge UI
        setContentView(R.layout.activity_main); // กำหนด layout ของ MainActivity

        recyclerView = findViewById(R.id.my_recycler_view); // เชื่อม RecyclerView กับ layout
        recyclerView.setHasFixedSize(true); // กำหนดว่า RecyclerView มีขนาดคงที่
        layoutManager = new LinearLayoutManager(this); // กำหนด LayoutManager แบบ Linear
        recyclerView.setLayoutManager(layoutManager); // ตั้งค่า LayoutManager ให้กับ RecyclerView

        // สร้างรายการสินค้าภายใน ArrayList<Product> ที่ชื่อว่า products
        List<Product> products = new ArrayList<Product>();

        // เพิ่มสินค้าชิ้นแรกในรายการ
        Product product1 = new Product();
        product1.setProduct_name("ตู้เย็น"); // กำหนดชื่อสินค้า
        product1.setProduct_image("https://worldtech.asia/cdn/shop/files/WT-RF138_SIL.jpg?v=1724734204"); // URL รูปภาพสินค้า
        product1.setProduct_price("7,500"); // กำหนดราคาสินค้า
        products.add(product1); // เพิ่มสินค้าเข้าในรายการ

        // เพิ่มสินค้าชิ้นที่สองในรายการ
        Product product2 = new Product();
        product2.setProduct_name("ทีวี"); // กำหนดชื่อสินค้า
        product2.setProduct_image("https://res.cloudinary.com/sharp-consumer-eu/image/fetch/w_3000,f_auto/https://s3.infra.brandquad.io/accounts-media/SHRP/DAM/origin/b3460ec0-6a8a-11ea-9a43-8a541dae4315.jpg"); // URL รูปภาพสินค้า
        product2.setProduct_price("12,000"); // กำหนดราคาสินค้า
        products.add(product2); // เพิ่มสินค้าเข้าในรายการ

        // ส่งข้อมูลรายการสินค้าทั้งหมดไปที่ Adapter เพื่อให้ RecyclerView แสดงผล
        mAdapter = new MyAdapter(products, this);
        recyclerView.setAdapter(mAdapter); // ตั้งค่า Adapter ให้กับ RecyclerView

    }
}
