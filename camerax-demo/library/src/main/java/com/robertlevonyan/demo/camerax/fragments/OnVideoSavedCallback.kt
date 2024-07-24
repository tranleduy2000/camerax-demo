package com.robertlevonyan.demo.camerax.fragments

import androidx.camera.video.OutputResults

interface OnVideoSavedCallback {
    fun onVideoSaved(outputResults: OutputResults)

    fun onError(error: Int, cause: Throwable?)

}