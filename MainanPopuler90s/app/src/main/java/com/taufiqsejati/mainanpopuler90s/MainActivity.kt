package com.taufiqsejati.mainanpopuler90s

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup.MarginLayoutParams
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rvMainan: RecyclerView
    private var list: ArrayList<Mainan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMainan = findViewById(R.id.rv_mainan)
        rvMainan.setHasFixedSize(true)

        list.addAll(MainanData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
    private fun showRecyclerList() {
        rvMainan.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListMainanAdapter(list)
        rvMainan.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListMainanAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Mainan) {
                showSelectedMainan(data)
            }
        })
    }
    private fun showSelectedMainan(mainan: Mainan) {
//        Toast.makeText(this, "Kamu memilih " + mainan.title, Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_TITLE, mainan.title)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_SUBTITLE, mainan.subtitle)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_PHOTO, mainan.photo)
        startActivity(moveWithDataIntent)
    }
}