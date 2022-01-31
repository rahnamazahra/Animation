package com.example.animation

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var animatorAlpha:Animator?=null
    var animationDrawable:AnimationDrawable?=null
    var animatorScale:Animator?=null
    var animatorTransient:Animator?=null
    var animatecodealpha:ObjectAnimator?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        animatorAlpha=AnimatorInflater.loadAnimator(this,R.animator.alpha)
//        animatorAlpha?.apply {
//            startDelay=1000
//            setTarget(title_txt)
//            start()
//        }


//        animatorAlpha=AnimatorInflater.loadAnimator(this,R.animator.rotation)
//        animatorAlpha?.apply {
//            setTarget(title_txt)
//            start()
//        }

//        animatorScale=AnimatorInflater.loadAnimator(this,R.animator.scale)
//        animatorScale?.apply {
//            setTarget(title_txt)
//            start()
//        }

//        animatorTransient=AnimatorInflater.loadAnimator(this,R.animator.translation)
//        animatorTransient?.apply {
//            setTarget(title_txt)
//            start()
//        }

        animatecodealpha=ObjectAnimator.ofFloat(title_txt,"alpha",1f,0f)
        animatecodealpha?.apply {
            duration=1000
            repeatCount=ValueAnimator.INFINITE
            repeatMode=ValueAnimator.REVERSE
            start()
        }

        img.setBackgroundResource(R.drawable.animationdrawble)
        animationDrawable=img.background as AnimationDrawable
        animationDrawable!!.start()
    }
}