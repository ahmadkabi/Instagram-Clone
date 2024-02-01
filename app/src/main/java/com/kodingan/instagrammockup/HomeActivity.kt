package com.kodingan.instagrammockup

import android.graphics.Typeface.BOLD
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kodingan.instagrammockup.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buildLikedText()
        buildCaption()
    }

    private fun buildLikedText() {
        val builder = SpannableStringBuilder("Liked by ")

        val omameSpannable = SpannableString("omame_munchkin ")
        val othersSpannable = SpannableString("2.462 others")

        omameSpannable.setSpan(
            StyleSpan(BOLD), 0, omameSpannable.length, 0
        )
        othersSpannable.setSpan(
            StyleSpan(BOLD), 0, othersSpannable.length, 0
        )

        builder.append(omameSpannable)
        builder.append("and ")
        builder.append(othersSpannable)

        binding.txLiked.setText(builder, TextView.BufferType.SPANNABLE)

    }

    private fun buildCaption() {
        val builder = SpannableStringBuilder("")

        val pisco = SpannableString("pisco_cat ")

        pisco.setSpan(
            StyleSpan(BOLD), 0, pisco.length, 0
        )

        builder.append(pisco)
        builder.append("When you are eating your French fries in peace.... Your girlfriend be like")

        binding.txCaption.setText(builder, TextView.BufferType.SPANNABLE)

    }

}