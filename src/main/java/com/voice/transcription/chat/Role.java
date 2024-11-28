package com.voice.transcription.chat;
import com.google.gson.annotations.SerializedName;

public enum Role {
    @SerializedName("user")
    USER,

    @SerializedName("system")
    SYSTEM,

    @SerializedName("assistant")
    ASSISTANT
}