package com.vann.historical.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.vann.historical.R
import com.vann.historical.adapter.ListBuildingAdapter
import com.vann.historical.model.Building
import com.vann.historical.model.BuildingsData
import kotlinx.android.synthetic.main.activity_main.*
import com.vann.historical.ui.DetailsActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var list: ArrayList<Building> = arrayListOf()
    private lateinit var listBuildingAdapter: ListBuildingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showListBuilding()

        val btnMoveActivityProfile: ImageButton = findViewById(R.id.btn_profile)
        btnMoveActivityProfile.setOnClickListener(this)
        setListClickAction()
    }
    private fun showListBuilding() {
        list.addAll(BuildingsData.listBuilding)
        listBuildingAdapter = ListBuildingAdapter(list)
        rv_building.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = listBuildingAdapter
            setHasFixedSize(true)
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_profile -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun setListClickAction() {
        listBuildingAdapter.setOnItemClickCallback(object :
            ListBuildingAdapter.OnItemClickCallback {
            override fun onItemClick(data: Building) {
                val detailIntent = Intent(this@MainActivity, DetailsActivity::class.java).apply {
                    putExtra(DetailsActivity.EXTRA_NAME, data.name)
                    putExtra(DetailsActivity.EXTRA_LOCATION, data.location)
                    putExtra(DetailsActivity.EXTRA_PHOTO, data.photo.toString())
                    putExtra(DetailsActivity.EXTRA_DESCRIPTION, data.description)
                }
                startActivity(detailIntent)
            }
        })
    }
}


