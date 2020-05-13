
package com.raywenderlich.android.creatures.app

import android.app.Application
import com.raywenderlich.android.creatures.model.CreatureStore


class CreaturesApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    // Initialize CreatureStore
    //test
    CreatureStore.loadCreatures(this)
    CreatureStore.loadFoods(this)
  }
}