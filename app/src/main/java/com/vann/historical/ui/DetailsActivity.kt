package com.vann.historical.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.vann.historical.R
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.item_cardview_buildings.*
import kotlinx.android.synthetic.main.item_cardview_buildings.view.*

class DetailsActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_PHOTO = "extra_PHOTO"
        const val EXTRA_DESCRIPTION = "extra_description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        showBuildingDetail()
    }

    private fun showBuildingDetail() {
        tv_building_name_detail.setText(intent.getStringExtra(EXTRA_NAME))
        tv_building_location_detail.setText(intent.getStringExtra(EXTRA_LOCATION))
        iv_building.setImageResource(intent.getStringExtra(EXTRA_PHOTO).toInt())
        //Glide.with(this).load(intent.getStringExtra(EXTRA_PHOTO)).into(iv_building)
        tv_building_description_detail.setText(intent.getStringExtra(EXTRA_DESCRIPTION))
    }
}
