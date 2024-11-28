package com.voice.transcription.json;
import com.voice.transcription.chat.Role;

public record Message(Role role, String content) {
}