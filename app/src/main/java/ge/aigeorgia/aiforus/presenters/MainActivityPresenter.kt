package ge.aigeorgia.aiforus.presenters

import android.graphics.Bitmap
import ge.aigeorgia.aiforus.activities.MainActivity

class MainActivityPresenter(mainActivity: MainActivity) {
    private var mainActivity = mainActivity
    private var bitmaps  = ArrayList<Bitmap>()
    private var shown = 0

    fun nextImage(){
        if(shown >= bitmaps.size!!){
            mainActivity.showEmptyImage()
        } else {
            mainActivity.showImage(bitmaps?.get(shown++)!!)
        }
    }

    fun addImage(bitmap : Bitmap){
        bitmaps.add(bitmap)
    }

}