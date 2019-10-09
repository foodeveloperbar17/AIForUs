package ge.aigeorgia.aiforus.activities

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import ge.aigeorgia.aiforus.R
import ge.aigeorgia.aiforus.presenters.MainActivityPresenter

class MainActivity : AppCompatActivity() {

    private var mainImage: ImageView? = null
    private var searchEditText: EditText? = null
    private var scoreEditText: EditText? = null
    private var searchButton: Button? = null
    private var submitButton: Button? = null
    private var skipButton: Button? = null

    private val mainActivityPresenter = MainActivityPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        initUIActions()
    }

    private fun initUI() {
        mainImage = findViewById(R.id.main_image_id)
        searchEditText = findViewById(R.id.search_edit_text_id)
        scoreEditText = findViewById(R.id.scores_edit_text_id)
        searchButton = findViewById(R.id.search_button_id)
        submitButton = findViewById(R.id.submit_button_id)
        skipButton = findViewById(R.id.skip_button_id)
    }

    private fun initUIActions(){
        searchButton?.setOnClickListener {
            var query = searchEditText?.text.toString()
            /////////// search with query
        }

        skipButton?.setOnClickListener {
            mainActivityPresenter.nextImage()
        }
    }

    fun showImage(bitmap: Bitmap) {
        mainImage?.setImageBitmap(bitmap)
    }

    fun showEmptyImage() {
        mainImage?.setImageResource(R.drawable.ic_launcher_background)
    }

}
