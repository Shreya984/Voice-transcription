package com.voice.transcription.json;
import java.util.List;

public record ChatRequest(
        String model,
        List<Message> messages,
        double temperature
) {}