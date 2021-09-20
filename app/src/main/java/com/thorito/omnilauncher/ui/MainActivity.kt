package com.thorito.omnilauncher.ui

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thorito.omnilauncher.R
import com.thorito.omnilauncher.adapters.GroupRecyclerViewAdapter
import com.thorito.omnilauncher.models.GroupModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewGroup: RecyclerView
    private lateinit var adapterGroup: GroupRecyclerViewAdapter
    private var listGroup = mutableListOf<GroupModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initModeImmersive()
        setContentView(R.layout.activity_main)

        loadGroup()
        setGroupAdapter()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            initModeImmersive()
        }
    }

    private fun loadGroup() {
        listGroup.add(GroupModel(id = 1, title = "Canales TV", subtitle = "Disponible canales con subtítulos con la modalidad PREMIUM"))
        listGroup.add(GroupModel(id = 2, title = "Mis contactos", subtitle = null))
        listGroup.add(GroupModel(id = 3, title = "Fotos", subtitle = "Fotos de Grecia 2020"))
        listGroup.add(GroupModel(id = 4, title = "Ajustes", subtitle = "Apartado de configuración de OMNI"))
        listGroup.add(GroupModel(id = 5, title = "Canales TV", subtitle = "Disponible canales con subtítulos con la modalidad PREMIUM"))
        listGroup.add(GroupModel(id = 6, title = "Mis contactos", subtitle = null))
        listGroup.add(GroupModel(id = 7, title = "Fotos", subtitle = "Fotos de Grecia 2020"))
        listGroup.add(GroupModel(id = 8, title = "Ajustes", subtitle = "Apartado de configuración de OMNI"))
        listGroup.add(GroupModel(id = 9, title = "Canales TV", subtitle = "Disponible canales con subtítulos con la modalidad PREMIUM"))
        listGroup.add(GroupModel(id = 10, title = "Mis contactos", subtitle = null))
        listGroup.add(GroupModel(id = 11, title = "Fotos", subtitle = "Fotos de Grecia 2020"))
        listGroup.add(GroupModel(id = 12, title = "Ajustes", subtitle = "Apartado de configuración de OMNI"))
    }

    private fun setGroupAdapter() {
        recyclerViewGroup = findViewById(R.id.group_recyclerview)
        recyclerViewGroup.setHasFixedSize(true)

        adapterGroup = GroupRecyclerViewAdapter(listGroup)
        recyclerViewGroup.layoutManager = LinearLayoutManager(this)

        recyclerViewGroup.adapter = adapterGroup
    }

    private fun initModeImmersive() {

        @Suppress("DEPRECATION")
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}