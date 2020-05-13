

package com.raywenderlich.android.creatures.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.raywenderlich.android.creatures.R
import com.raywenderlich.android.creatures.model.CreatureStore
import kotlinx.android.synthetic.main.fragment_all.*


class AllFragment : Fragment() {

  private val adapterCreature = CreatureAdapter(CreatureStore.getCreature())

  companion object {
    fun newInstance(): AllFragment {
      return AllFragment()
    }
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.fragment_all, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    with(creatureRecyclerView){
      layoutManager = LinearLayoutManager(activity)
      adapter = adapterCreature
    }
  }


}