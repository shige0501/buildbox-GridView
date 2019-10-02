package net.buildbox.sample.buildbox_gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // グリッドビューに表示するテキスト一覧
        val countries = arrayOf("日本", "中国", "イギリス", "アメリカ", "オランダ", "オーストラリア",
            "スイス", "ドイツ", "メキシコ", "スウェーデン", "アイルランド", "フランス", "イタリア")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        val gridView: GridView = findViewById(R.id.grid_view)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, _, position, _ ->
            Toast.makeText(this, "${adapterView.getItemAtPosition(position)} が選択されました",
                Toast.LENGTH_SHORT).show()
        }
    }
}
